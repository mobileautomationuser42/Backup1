
 Feature: Stepper Color Functionality.


  @TRKDW-1025 @regression
  Scenario: TRKDW-1025 Verify the status color in the stepper for Approved\Active\Issued in Green
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Active | Entry permit" status and name "EBUCL TEST TEST"
		Then user verify the "Active | Entry permit" status in the Dashboard should be displayed in green
   
  @TRKDW-1026 @regression
  Scenario: TRKDW-1026 Verify the status color in the stepper for Rejected and Canceled always in Red
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Rejected" status and name "raja test test"
    Then user verify the "Rejected" application status in the stepper should be displayed in red
    
   @TRKDW-1027 @regression
  Scenario: TRKDW-1027 Verify the status color in the stepper for Not Started, Draft  always Blue
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Draft" status and name "unNKD test test"
    Then user verify the "Draft" and not started status should be in blue
   
   @TRKDW-1028 @regression
  Scenario: TRKDW-1028 Verify the status color in the stepper for and Visit Required, More Document inprogress and ready to Pay are in Orange
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "In progress" status and name "nmxza test test"
    #Then user verify the "Visit Required - Entry Permit" status should be displayed in Orange
   Then user verify the "Ready to Pay - EP" status should be displayed in Orange
   
  @TRKDW-1017 @regression
  Scenario: TRKDW-1017 Verify the Cancel Visa link is added in Manage Domestic Worker screen with red color
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Active | Entry permit" status and name "ROSLY TEST TEST"
    Then user verify the "Cancel Visa" option should be displayed in red color
   
  @TRKDW-1018 @regression
  Scenario: TRKDW-1018 Verify the Cancel Residency in Manage Domestic Worker screen is red color
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Active | Entry permit" status and name "PKBNM TEST TEST"
    Then user verify the "Cancel Residency" option should be displayed in red color
   
   
   