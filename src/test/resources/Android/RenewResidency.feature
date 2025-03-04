Feature: Renewal of Residency


 @TRKDW-1104 @regression
  Scenario: TRKDW-1104 Verify WPP stepper for a sponsor with WPP quota for Renew flow
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 Then user navigates to dashboard page and selects profile with "Expired | Residency" status and name "ABDALLA SHAHIN"
		 When user click on "Renew Residency"
		 Then user verify stepper status as "Quota Available" and "VIEW" should be enabled
		 And user click on "VIEW" button and view policy number
		 When user click on View button and download the receipt and click on the back arrow

 @TRKDW-609 
  Scenario: TRKDW-609 Verify the 'Renewal of Residency and Medical Test' in Renew Residency bundle for Sponsor with WPP quota
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 Then user navigates to dashboard page and selects profile with "Expired | Residency" status and name "EMAD IBRAHIM"
		 When user click on "Renew Residency"
#		 And user click on "START" button which container contains "Not Started" status
		 Then user click on "EDIT" button
		 And user validating second section for renew residency 
		  | Emirate (Birth) | City (Birth)   |
		 	|   DUBAI         |     DUBAI    |
		 Then user validating third section for renew residency 
	    | Religion  | Faith |  MaritalStatus | PreviousNationality | Education | EducationCountry |
		 	|  ISLAM    | SUNNI |   MARRIED      |        INDIA        |   MASTER  |     NEPAL        |
	 And user validating fourth section for renew residency
		  | MothersName | FirstLanguage |  
		 	|    MAAN     |   ENGLISH     | 
		 Then user click on "Continue" button 
		 And user redirects to passport details page and validating below elements for inside country renew residency
		 	| PassportNumber  | PassportType  | IssueDate   | ExpiryDate |  PlaceOfIssue | CountryofIssue | CountryOfIssueGov | 
		 	| ABC242340939227 |    Normal     |  01/05/2021 | 18/12/2025 |    Mumbai     |      INDIA     |      INDIA        | 
		 Then user clicks on Continue button on passport details page 
     And user redirects to address details page and validates below elements in outside UAE section 
		  | Permanent Country |    City    |  Abroad Address  |  Abroad mobile no  |
		  |      INDIA        |   Mumbai   |       test       |    005544332211    | 
		 Then user redirects to address details page and validates below mandatory elements in inside UAE section
		  |  Emirate    |   City   |   Area    |   Street  |   Building   |  Floor  |  ApartmentNo |   MakaniNo  | 
		  |   DUBAI     |   DUBAI  |  ABUKADRA |    test   |     test     |    1    |      111     |  (Optional) | 
		 And user clicks on checkbox of disclaimer
		 When user clicks on continue button on address page
		 Then user redirects to salary details page and validating below elements  
		  |  BasicSalary  |   
		  |   10000       |   
		 And user verify that salary field should be read only
		 Then user verify continue button is enabled on salary details page
		 When user clicks on continue button on salary page
     Then user navigates to residency duration page and verify field
     |Residency Years|
     |1 Year Residency|
     |2 Year Residency|
		 Then user click on "Continue" button
		 Then user selects the fitness center based on urgency type then fill the  details
     Then user click on "Continue" button
		 And user navigates to summary page and user click the checkbox of acknowledge message
		 Then user clicks on continue button on summary page 
		 And user navigates to document upload page and uploading the mandatory documents for renew residency
     And user clicks on checkbox of disclaimer
 	   Then user click on "Continue" button 
     Then user naviagtes to DHA payment page and click on pay button 
     And user verify status of stepper as "Pending Medical Test" and "VIEW" button should be present
   
    @TRKDW-623
  Scenario: TRKDW-623 Verify the 'Renewal of Residency and Medical Test' stepper with status 'Not Started'
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 Then user navigates to dashboard page and selects profile with "Expired | Residency" status and name "ADHAM HAIKAL"
		 When user click on "Renew Residency"
		Then user verify stepper status as "Not Started" and "START" should be enabled
	
	
	@TRKDW-624 
  Scenario: TRKDW-624 Verify the 'Initiate Renewal Process and Apply for Medical Test' stepper with status 'Draft'
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 Then user navigates to dashboard page and selects profile with "Expired | Residency" status and name "ABDUL RAHMAN ALZAHRANI"
		 When user click on "Renew Residency"
#		 And user click on "START" button which container contains "Not Started" status
		 Then user click on "EDIT" button
		 And user validating second section for renew residency 
		  | Emirate (Birth) | City (Birth)   |
		 	|   DUBAI         |     DUBAI    |
		 Then user validating third section for renew residency 
	    | Religion  | Faith |  MaritalStatus | PreviousNationality | Education | EducationCountry |
		 	|  ISLAM    | SUNNI |   MARRIED      |        INDIA        |   MASTER  |     NEPAL        |
	 And user validating fourth section for renew residency
		  | MothersName | FirstLanguage |  
		 	|    MAAN     |   ENGLISH     | 
	Then user clicks on save and exit button on passport details page
	When user opens the same application then its status should be "Draft"
	
	
	
	
	
	
   
   #trail purpose
    @TRKDW-666 
  Scenario: TRKDW-666 Verify the 'Renewal of Residency and Medical Test' in Renew Residency bundle for Sponsor with WPP quota
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 Then user navigates to dashboard page and selects profile with "Expired | Residency" status and name "EMAD IBRAHIM"
		 When user click on "Renew Residency"
		 Then user click on "PAY" button
		 Then user naviagtes to DHA payment page and click on pay button 
     And user verify status of stepper as "Pending Medical Test" and "VIEW" button should be present
     And user update user 
    

    