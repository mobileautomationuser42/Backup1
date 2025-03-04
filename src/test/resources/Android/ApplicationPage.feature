 Feature: Questions present on Application page  

  @TRKDW-123 @regression
  Scenario: TRKDW-123 Verify the 'Is Domestic Worker inside the Country' section
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 Then user clicks on New Application button
		 And user verifying below elements are present on application page 
		  | Is the Domestic Worker Inside the Country? |
		  | Inside the UAE                             |
		  | Outside the UAE                            |
		  
  @TRKDW-149 @regression
  Scenario: TRKDW-149 Verify a new question 'What do you prefer?' is not displayed when Outside the UAE is selected
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 Then user clicks on New Application button
		 And user verifying below elements are present on application page 
		  | Is the Domestic Worker Inside the Country? |
		  | Inside the UAE                             |
		  | Outside the UAE                            |
		 When user selects the Outside the UAE radio button
		 Then user verify 'What do you prefer?' is not displayed when Outside the UAE is selected
		 And user clicks on Continue button 
		 Then user navigates to stepper screen 
		 
	@TRKDW-148 @regression
  Scenario: TRKDW-148 Verify a new question 'What do you prefer?' displayed when Inside the UAE is selected
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 Then user clicks on New Application button
		 And user verifying below elements are present on application page 
		  | Is the Domestic Worker Inside the Country? |
		  | Inside the UAE                             |
		  | Outside the UAE                            |
		 When user selects the Inside the UAE radio button
		 Then user verify 'What do you prefer?' is displayed when Inside the UAE is selected
		 And user verify that it contains two radio buttons 
		  |     Change Status     |
		  | Exit and re-enter UAE |
 
		  