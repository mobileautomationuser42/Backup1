
Feature: Cancellation feature.

  @TRKDW-1275 @regression  
  Scenario: TRKDW-1275 Verify the Cancel Reason for Cancel EP before entry
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 Then user select worker profile with Active status "ADHAM HAIKAL" and clicked on Cancel Residency
     And user selects the cancellation reason on cancel residency screen as "Sponsor Request"
     
  @TRKDW-1276 @regression  
  Scenario: TRKDW-1276 Verify the Cancel Reason for Cancel EP after entry
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 Then user select worker profile with Active status "ADHAM HAIKAL" and clicked on Cancel Residency
     And user selects the cancellation reason on cancel residency screen as "Sponsor Request","Death Case in UAE" and "Health Reasons"
     
  @TRKDW-1277 @regression
  Scenario: TRKDW-1277 Verify the Cancel Reason for Cancel residency inside country
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 Then user select worker profile with Active status "ADHAM HAIKAL" and clicked on Cancel Residency
     And user selects the cancellation reason on cancel residency screen as "Sponsor Request","Death Case in UAE" and "Health Reasons"
     
  @TRKDW-1278 @regression
  Scenario: TRKDW-1278 Verify the Cancel Reason for Cancel residency outside country
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 Then user select worker profile with Active status "ABDALLA SHAHIN" and clicked on Cancel Residency
     And user selects the cancellation reason on cancel residency screen as "Death Abroad","Out of Country and Res Expiry","Out of Country and Send Passport" and "Person is outside for more than 6 months"