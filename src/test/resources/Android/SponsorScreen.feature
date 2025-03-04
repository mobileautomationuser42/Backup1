Feature: Sponsor functionality

  @TRKDW-134 @regression
  Scenario: TRKDW-134 Verify the Sponsor with WPP is able to sponsor a domestic worker
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 Then user verify the quota status should be "Available"
		 And user clicks on New Application button
		 When user selects the Outside the UAE radio button
		 And user clicks on Continue button  
		 Then user clicks on Start button    
		 And user redirects to personal details page and validating first section  
		 	| First Name  | Middle Name | Last Name   |
		 	|  abc        |   test      |   test      |
  
  #@TRKDW-135
  #Scenario: TRKDW-135 Verify the Sponsor without WPP policy is able to sponsor a domestic worker.
     #Given user logged into DubaiNow application
#		 When user clicks on Residency tab and click on domestic worker
#		 Then user verify the quota status should be "Unavailable"
#		 And user clicks on New Application button
#		 When user selects the Outside the UAE radio button
#		 And user clicks on Continue button 
#		 Then user verify the "Quota Not Available" status and "Purchase" button should be present on screen
		 
	@TRKDW-401 @regression
  Scenario: TRKDW-401 Verify the UI components in the sponsor dashboard
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 And user validates the UI components presents on sponsor screen
#	
#	@TRKDW-1063
  #Scenario: TRKDW-1063 Verify the WPP Quota Status when sponsor doesn't have the WPP Quota
     #Given user logged into DubaiNow application
#		 When user clicks on Residency tab and click on domestic worker
#		 Then user verify the quota status should be "Unavailable"
#		 
	@TRKDW-1062 @regression
  Scenario: TRKDW-1062 Verify the WPP Quota Status when sponsor has the WPP Quota
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 Then user verify the quota status should be "Available"
#		 
#	@TRKDW-1202
  #Scenario: TRKDW-1202 Verify the blank history and WPP purchase screen when no record are there
     #Given user logged into DubaiNow application
#		 When user clicks on Residency tab and click on domestic worker
#		 Then user verify the "No Dependent to Show" label should be present if there no applications created
