Feature: Dashboard page Functionality
@TRKDW-1203 @regression
  Scenario: TRKDW-1203 Verify the history all section for the created applications
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and click on history icon
    And user navigates to History page and selects profile with "Draft" status and name "xAjDW test test"
    Then user verify the Application Status History
    | ExpectedText         | 
    | Status: Draft        |
    | Updated On: 04/02/2025 11:51 |