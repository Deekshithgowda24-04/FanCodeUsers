# FanCode Users Todos Completion Percentage Verification

This project automates the verification that more than 50% of users from the FanCode city have completed their todos tasks using API automation with Rest Assured and Cucumber. 

## Project Structure

The project consists of the following components:

- **src/test/java/**: Contains Java source code for test automation.
  - **FanCodeUsersTest.java**: TestNG runner class for executing Cucumber scenarios.
  - **APIUtils.java**: Utility class for making API requests using Rest Assured.
  - **User.java**: POJO class representing user data.
  - **Address.java**: POJO class representing user address data.
  - **Geo.java**: POJO class representing geographical coordinates.
  - **Todo.java**: POJO class representing todo task data.
  
- **src/test/resources/**: Contains feature files for Cucumber scenarios.
  - **fanCodeUsers.feature**: Feature file defining scenarios for verifying todos completion percentage.

## Dependencies

- **Cucumber**: Version 7.18.0
- **TestNG**: Version 7.10.2
- **Rest Assured**: Version 5.4.0
- **Gson**: Version 2.11.0 

## Setup and Running the Project

1. **Clone Repository**:
   ```
   git clone https://github.com/your/repository.git
   cd repository-directory
   ```

2. **Configure Dependencies**:
   - Ensure Maven/Gradle dependencies are correctly configured in your `pom.xml`/`build.gradle`.

3. **Configure TestNG Runner**:
   - Ensure `FanCodeUsersTest.java` is configured correctly as a TestNG runner class.

4. **Run Tests**:
   - Execute `FanCodeUsersTest.java` as a TestNG test to run the Cucumber scenarios.

## Reporting

- **Cucumber HTML Reports**: HTML reports are generated in `target/cucumber-reports` after running tests.

---
