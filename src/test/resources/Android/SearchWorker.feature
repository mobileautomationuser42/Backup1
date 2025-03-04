 @Workersearch
 Feature: Worker search functionality
  
  @TRKDW-150 @regression
  Scenario: TRKDW-150 Verify the search options available in DWB for the sponsor to search the domestic worker
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 Then user clicks on New Application button
		 And user verifying below elements are present on application page 
		  | Is the Domestic Worker Inside the Country? |
		  | Inside the UAE                             |
		  | Outside the UAE                            |
		 When user selects the Outside the UAE radio button
		 And user clicks on Continue button 
		 Then user clicks on Start button on stepper screen
		 When user clicks on Emirates Id
		 Then user veirifies fields presents under Emirates ID
		 When user clicks on Unified No
		 Then user veirifies fields presents under Unified No
		 And user verify that search button is disabled
		 
	@TRKDW-153 @regression
  Scenario: TRKDW-153 Verify the sponsor is able to enter the domestic worker's details manually without searching
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 Then user clicks on New Application button
		 And user verifying below elements are present on application page 
		  | Is the Domestic Worker Inside the Country? |
		  | Inside the UAE                             |
		  | Outside the UAE                            |
		 When user selects the Outside the UAE radio button
		 And user clicks on Continue button 
		 Then user clicks on Start button on stepper screen
		 When user clicks on Enter Worker Details Manually button
     And user should navigates to personal details page
     
  @TRKDW-156 @regression
  Scenario: TRKDW-156 Verify the sponsor is able to enter the domestic worker details manually if 'No Profile Found' upon search.
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 Then user clicks on New Application button
		 And user verifying below elements are present on application page 
		  | Is the Domestic Worker Inside the Country? |
		  | Inside the UAE                             |
		  | Outside the UAE                            |
		 When user selects the Outside the UAE radio button
		 And user clicks on Continue button 
		 Then user clicks on Start button on stepper screen
		 When user clicks on Emirates Id
		 Then user enter the values into fields under Emirates Id
		  | EmirateIdNumber | PassportNo | Nationality | YearofBirth |
		  | 123456321233442 | ABCD12345  |   INDIA     |    1990     |
		 And user clicks on search button
		 Then user should able to get a 'No Profile Found' screen
		 
	@TRKDW-152 @regression
  Scenario: TRKDW-152 Verify the sponsor is able to search with the UDB No of the domestic worker
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 Then user clicks on New Application button
		 And user verifying below elements are present on application page 
		  | Is the Domestic Worker Inside the Country? |
		  | Inside the UAE                             |
		  | Outside the UAE                            |
		 When user selects the Outside the UAE radio button
		 And user clicks on Continue button 
		 Then user clicks on Start button on stepper screen
		 When user clicks on Unified No
		 Then user enter the values into fields under Unified No
		  | UnifiedNumber | PassportNo | Nationality | YearofBirth |
		  |    912344     | 6561290    |   INDIA     |    1961     |
		 And user clicks on search button
		 Then user should be able to see the personal details page and applicant details
		  | First Name  | Middle Name |    Last Name    |
		 	|   PARAMBU   |     RAJ     | MOHAN AVANGATHU |
		 