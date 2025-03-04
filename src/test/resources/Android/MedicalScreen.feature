@Medical
 Feature: Medical Screen Functionality.

  @TRKDW-249 @regression 
  Scenario: TRKDW-249 Verify the fields in the Medical Test Application
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Active | Entry permit" status and name "ZNXMD TEST TEST"
    And user selects New Residency 
    When user verify the Medical Test- DAHC Stepper should be "Not Started"
    Then user clicks on Start button on stepper 
    And user verify the elements on Medical screen
    
  @TRKDW-251 @regression 
  Scenario: TRKDW-251 Verify the Fitness Center field in the Medical Test section
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Active | Entry permit" status and name "ZNXMD TEST TEST"
    And user selects New Residency 
    When user verify the Medical Test- DAHC Stepper should be "Not Started"
    Then user clicks on Start button on stepper 
    And user verify the elements on Medical screen
    Then user selects the fitness center based on urgency type then it should be visible in list
    And user selects first fitness center and fill the  details 
    
  @TRKDW-252 @regression
  Scenario: TRKDW-252 Verify the selected values for the fields in the Medical Test section persist
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Active | Entry permit" status and name "PKBNM TEST TEST"
    And user selects New Residency 
    When user verify the Medical Test- DAHC Stepper should be "Not Started"
    Then user clicks on Start button on stepper 
    And user verify the elements on Medical screen
    Then user enters the value on medical screen and click save and exit button
    And user open the same application and values in medical test section should be there with "Active | Entry permit" status and name "PKBNM TEST TEST"
    
  @TRKDW-277 @regression 
  Scenario: TRKDW-277 Verify the Medical Stepper upon approval of CS or Exit & Renter
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Active | Entry permit" status and name "ZNXMD TEST TEST"
    And user selects New Residency 
    When user verify the Medical Test- DAHC Stepper should be "Not Started"
    
  @TRKDW-281 @regression
  Scenario: TRKDW-281 Verify the Medical Test application screen for a Domestic Worker after submission
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Active | Entry permit" status and name "ZNSRW TEST TEST"
    And user selects New Residency 
    When user verify the Medical Test- DAHC Stepper should be "Not Started"
    Then user clicks on Start button on stepper 
    And user verify the elements on Medical screen
    Then user enters the value on medical screen and click on continue button
    Then user naviagtes to payment page and completed the payment
    When user verify the Medical Test- DAHC Stepper should be "Pending Medical Test"
    Then user click on "VIEW" button which container contains "Pending Medical Test" status
    And user verify the medical test screen elements 
    
  @TRKDW-282 @regression 
  Scenario: TRKDW-282 Verify the medical test application for worker with Medical test result is FIT
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Active | Entry permit" status and name "ROSLY TEST TEST"
    And user selects New Residency
    When user verify the Medical Test- DAHC Stepper should be "Medical Test Completed"
    Then user click on "VIEW" button which container contains "DAHC medical result is: (FIT)" status 
    And user verify that medical certificate and payment receipt should be present with "View" button
    
  @TRKDW-283 @regression
  Scenario: TRKDW-283 Verify the medical test application for worker with Medical test result is FIT with follow up
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Active | Entry permit" status and name "ZNSRW TEST TEST"
    And user selects New Residency
    When user verify the Medical Test- DAHC Stepper should be "Medical Test Completed"
    Then user click on "VIEW" button which container contains "DAHC medical result is: (FIT)" status 
    And user verify that medical certificate and payment receipt should be present with "View" button
    
  @TRKDW-284 @regression
  Scenario: TRKDW-284 Verify the medical test application for worker with Medical test result is UNFIT
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Active | Entry permit" status and name "YKASU TEST TEST"
    And user selects New Residency
    When user verify the Medical Test- DAHC Stepper should be "Medical Test Completed"
    Then user click on "VIEW" button which container contains "DAHC medical result is: (UnFit)" status 
    And user verify that medical certificate and payment receipt should be present with "View" button
    
  @TRKDW-294 @regression 
  Scenario: TRKDW-294 Verify the Residency stepper for a worker with Medical Result FIT
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Active | Entry permit" status and name "ROSLY TEST TEST"
    And user selects New Residency
    When user verify the Medical Test- DAHC Stepper should be "Medical Test Completed"
    Then user verify the Medical Test- DAHC Stepper should be "DAHC medical result is: (FIT)"   
    And user click on "START" button which container contains "Not Started" status  
    
  @TRKDW-296 @regression 
  Scenario: TRKDW-296 Verify the Residency stepper for a worker with Medical Result is UNFIT
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Active | Entry permit" status and name "YKASU TEST TEST"
    And user selects New Residency
    When user verify the Medical Test- DAHC Stepper should be "DAHC medical result is: (UnFit)"
    And user verify the "Get Residency" stepper should not be enabled for a worker whose medical result is unfit
    
  @TRKDW-1129 @regression 
  Scenario: TRKDW-1129 Verify the renew flow stepper when DW has already medical result UNFIT(Outside)
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Active | Entry permit" status and name "YKASU TEST TEST"
    And user selects New Residency
    When user verify the Medical Test- DAHC Stepper should be "DAHC medical result is: (UnFit)"
    Then user verify the "Emirates ID" stepper should not be enabled for a worker whose medical result is unfit 
    
  @TRKDW-1021 @regression 
  Scenario: TRKDW-1021 Verify the View button in DHA view screen
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "Active | Entry permit" status and name "EBUCL TEST TEST"
    And user selects New Residency
    When user verify the Medical Test- DAHC Stepper should be "Pending Medical Test"
    Then user verify the alignment of the view button
 
      
      
      
  #@TRKDW-1015
  #Scenario: TRKDW-1015 Verify the EIDA stepper is enabled upon completion of DHA with not UNFIT result - Renew Flow
    #Given user logged into DubaiNow application
#		When user clicks on Residency tab and click on domestic worker
#		Then user navigates to dashboard page and selects profile with "Active | Entry permit" status and name "ROSLY TEST TEST"
    #And user selects New Residency
    #When user verify the Medical Test- DAHC Stepper should be "Medical Test Completed"
    #Then user verify the Medical Test- DAHC Stepper should be "DAHC medical result is: (FIT)" 
    #And user click on "START" button which container contains "Not Started" status  
    #When the "Emirates ID" stepper should be enabled for a worker whose medical result is fit
    #Then user verify the "Get Residency" stepper should not be enabled for a worker whose medical result is fit
    