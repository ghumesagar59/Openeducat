	Feature: Login automation on OpenEduCat
	
	Scenario: Login on openeducat website

Given User is on website login page
And user enters userid
And user enters password
And user clicks on login button
Then login should be successful