Feature: Draft application 
  
  @TRKDW-413  @regression
  Scenario: TRKDW-413 Verify the navigation of draft entry permit application from stepper
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
#		 When user navigates to dashboard page and verify user profile as "Draft"
     Then user navigates to dashboard page and selects profile with "Draft" status and name "RDhnn test test"
		 Then user navigates to domestic worker page and clicks on EDIT button
		 And user navigates to details page and verify values are still present 
		 
  @TRKDW-1199 @regression
  Scenario: TRKDW-1199 - Create an entry permit and verify it is listed in dashboard and history
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 Then user clicks on New Application button
		 And user verifying below elements are present on application page 
		  | Is the Domestic Worker Inside the Country? |
		  | Inside the UAE                             |
		  | Outside the UAE                            |
		 When user selects the Outside the UAE radio button
		 And user clicks on Continue button 
		 Then user clicks on Start button
		 Then user redirects to personal details page and validating first section  
		 	| First Name  | Middle Name | Last Name   |
		 	|  abc        |   test      |   test      |
		 And user validating second section  
		 	| Nationality  | Job  | Gender   | Date of Birth | Place of Birth | Country of Birth |
		 	|   INDIA      | COOK |  Male    | 05 April 2006 |   Mumbai       |   INDIA          |
		 Then user validating third section
		  | Religion  | Faith |  MaritalStatus | PreviousNationality | Education | EducationCountry |
		 	|  ISLAM    | SUNNI |   MARRIED      |        INDIA        |   MASTER  |     INDIA        |
		 And user validating fourth section
		  | MothersName | FirstLanguage |  
		 	|    test     |   ENGLISH     | 
		 Then user clicks on Continue button on personal details page 
		 And user redirects to passport details page and validating below elements 
		 	| PassportNumber  | PassportType  |    IssueDate   |   ExpiryDate     |  PlaceOfIssue | CountryofIssue | CountryOfIssueGov | 
		 	|   ABC123        |    Normal     |  05 April 2006 | 05 December 2006 |    Mumbai     |      INDIA     |      INDIA        |  
		 And user clicks on save and exit button
     Then user redirected to dashboard page and application should be present on the dashboard page as well on history page
