package stepdefinition;

import org.testng.annotations.Test;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import java.util.List;
import java.util.stream.Collectors;

public class FanCodeUsersTest {

    private List<User> fanCodeUsers;

    @Test
    public void verifyFanCodeUsersTodosCompletionPercentage() {
        givenUserHasTheTodoTasks();
        andUserBelongsToTheCityFanCode();
        thenUserCompletedTaskPercentageShouldBeGreaterThan50();
    }

    // Step definitions
    @Given("User has the todo tasks")
    private void givenUserHasTheTodoTasks() {
        Response usersResponse = APIUtils.getUsers();
        fanCodeUsers = usersResponse.jsonPath().getList(".", User.class);
    }

    @And("User belongs to the city FanCode")
    private void andUserBelongsToTheCityFanCode() {
        fanCodeUsers = fanCodeUsers.stream()
                .filter(user -> isFanCodeCity(user.getLat(), user.getLng()))
                .collect(Collectors.toList());
    }

    @Then("User Completed task percentage should be greater than 50%")
    private void thenUserCompletedTaskPercentageShouldBeGreaterThan50() {
        long fanCodeUsersCount = fanCodeUsers.size();

        long fanCodeUsersWithOver50PercentTodosCount = fanCodeUsers.stream()
                .filter(this::hasOver50PercentTodosCompleted)
                .count();

        // Assert that at least 50% of FanCode city users have todos completed
        assert fanCodeUsersCount > 0;
        assert (double) fanCodeUsersWithOver50PercentTodosCount / fanCodeUsersCount > 0.5;
    }

    private boolean isFanCodeCity(double lat, double lng) {
        return (lat >= -40 && lat <= 5) && (lng >= 5 && lng <= 100);
    }

    private boolean hasOver50PercentTodosCompleted(User user) {
        Response todosResponse = APIUtils.getTodosByUserId(user.getId());
        List<Todo> todos = todosResponse.jsonPath().getList(".", Todo.class);

        long totalTodos = todos.size();
        long completedTodos = todos.stream().filter(Todo::isCompleted).count();

        return ((double) completedTodos / totalTodos) > 0.5;
    }
}

