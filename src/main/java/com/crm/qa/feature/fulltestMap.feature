Feature: flight portal full test 
# with tables

@SmokeTest  @RegresstionTest
Scenario: 
	Given home page is loaded with origin and destination_ok 
		|origin	   | destination |
		| yyz	   |  BLR        |
		| asc	   |  reg        |
	When homepage title is verified ok 
	Then round trip journey is selected ok 
	Then one adult is selected ok 
	Then economy is selected ok 
	Then origin is entered as YYZ ok 
	Then destination is entered as BLR ok 
	Then departure date is selcted ok 
	Then Arrival date is selected ok 
	And Search button is clicked ok 
	
	@SmokeTest
	Scenario: 
	Given home page is loaded with origin and destination_ok 
		|origin	   | destination |
		| yyz	   |  BLR        |
		| asc	   |  reg        |
	When homepage title is verified ok 
	Then round trip journey is selected ok 
	Then one adult is selected ok 
	Then economy is selected ok 
	Then origin is entered as YYZ ok 
	Then destination is entered as BLR ok 
	Then departure date is selcted ok 
	Then Arrival date is selected ok 
	And Search button is clicked ok 
	
  			