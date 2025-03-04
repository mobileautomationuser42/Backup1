
Feature: Change Status Functionality.

  @TRKDW-336 
  Scenario: TRKDW-336 Verify the Change Status Stepper with status 'Ready to Pay - Change Status'
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Active | Entry permit" status and name "ABDUL RAHMAN HASSAN"
    And user selects New Residency 
    #When user verify the Change Status Stepper should be "Not Started"
    #Then user clicks on Start button on stepper
    When user verify the Change Status Stepper should be "Ready to Pay - Change Status"
    
  @TRKDW-338 
  Scenario: TRKDW-338 Verify the Change Status Stepper with status 'Change Status Pending Approval'
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Active | Entry permit" status and name "MOHAMED BEN AHMED"
    And user selects New Residency 
    #When user verify the Change Status Stepper should be "Not Started"
    #Then user clicks on Start button on stepper
    When user verify the Change Status Stepper should be "Change Status Pending Approval"
    
  @TRKDW-339 
  Scenario: TRKDW-339 Verify the Change Status Stepper with status 'Change Status Rejected'
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Active | Entry permit" status and name "HASSAN ALABRI"
    And user selects New Residency 
    #When user verify the Change Status Stepper should be "Not Started"
    #Then user clicks on Start button on stepper
    #And user fill the data if pending and clicks on Continue buttton
    #Then user naviagtes to payment page and click on pay button
    When user verify the Change Status Stepper should be "Change Status Rejected"
    
  @TRKDW-341 
  Scenario: TRKDW-341 Verify the Change Status Stepper with status 'Change Status Issued'
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Active | Entry permit" status and name "MOHAMED ABDUL RAHMAN"
    And user selects New Residency 
    #When user verify the Change Status Stepper should be "Not Started"
    #Then user clicks on Start button on stepper
    #And user fill the data if pending and clicks on Continue buttton
    #Then user naviagtes to payment page and click on pay button
    When user verify the Change Status Stepper should be "Change Status Issued"
    
    @TRKDW-1019 @regression 
  Scenario: TRKDW-1019 Verify the New Residency block with Status "Manage Domestic Worker screen"
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Expired | Residency" status and name "FAHAD MUSTAFA"
    When user naviagtes to Domestic Worker screen and Verify button is unclickable
    #And user selects New Residency 
    #When user verify the Change Status Stepper should be "Not Started"
    #Then user clicks on Start button on stepper
    #And user fill the data if pending and clicks on Continue buttton
    #Then user naviagtes to payment page and click on pay button
      #When user verify the Change Status Stepper should be "Change Status Issued"
    
  @TRKDW-270 @regression 
  Scenario: TRKDW-270 Verify the subsequent stepper is enabled upon New Work Entry Permit Approval for worker Inside the country (Change Status)
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Active | Entry permit" status and name "MOHAMED ABDUL RAHMAN"
    And user selects New Residency 
    When user verify the Change Status Stepper should be "Change Status Pending Approval"
    When user verify that "Change Status" should be enabled
    
    
    @TRKDW-271 
  Scenario: TRKDW-271 Verify the subsequent stepper is enabled upon New Work Entry Permit Approval for worker Inside the country (Exit & Reenter)
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Active | Entry permit" status and name "TAREK AHMED"
    And user selects New Residency 
     When user verify that "Exit and re-enter UAE" should be enabled
     
   
    
    