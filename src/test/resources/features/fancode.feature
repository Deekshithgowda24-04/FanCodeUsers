Feature: To verify at least 50% of all FanCode city users have todos task completed 

  Scenario: All the users of City `FanCode` should have more than half of their todos task completed.
		Given User has the todo tasks
		And User belongs to the city FanCode
		Then User Completed task percentage should be greater than 50%
