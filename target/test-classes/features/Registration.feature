	Feature: Signup form automation on OpenEduCat
	
	Scenario: Fill and submit signup form successfully

Given User is on website signup page
And user enters name
And user enters email
And user enters organization name
And user enters phone
And user enters password
And user enters confirm password
And user enters street
And user enters city
And user enters zip
And user enters tax id
And user clicks on signup button
Then signup should be successful