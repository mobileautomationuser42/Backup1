Feature: Different status verification from stepper screen
   
  @TRKDW-414 @regression
  Scenario: TRKDW-414 Verify the navigation of ready to pay application from stepper after save & exit
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
#		Then user navigates to dashboard page and selects profile with "In progress"
		Then user navigates to dashboard page and selects profile with "In progress" status and name "nmxza test test"
		And user user then verify the "Ready to Pay - EP" status on stepper screen 
		
	@TRKDW-1259 @regression
  Scenario: TRKDW-1259 Verify the navigation of In Progress entry permit application from stepper
    Given user logged into DubaiNow application
		When user clicks on Residency tab and click on domestic worker
		Then user navigates to dashboard page and selects profile with "In progress" status and Id "DW-131818"
		And user clicks on EDIT button
	  Then user always navigates to summary details page
	  And user navigates to summary page and user click the checkbox of acknowledge message
		Then user clicks on continue button on summary page
#		And user navigates to document upload page and uploading the mandatory documents
		
	@TRKDW-879 @regression
  Scenario: TRKDW-879 Verify Refresh in the Stepper screen
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 And user clicks on New Application button
		 When user selects the Outside the UAE radio button
		 And user clicks on Continue button 
		 When user should be able to refresh the stepper without any error

  @TRKDW-259 @regression
  Scenario: TRKDW-259 - Verify the application status is 'Ready to Pay'
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
		 Then user naviagtes to other page and validating below elements
		  |  PersonalType   |  MediatorType  | MediatorAddress |  
		  |  from a friend  |   Instagram    |      test       |
		 Then user clicks on continue button on other details page
		 And user naviagtes to residency section and validating below elements
		  | NoOfYears |  Applyformedicaltest |
		  |     1     |      After5Days      |
		 Then user clicks on continue button on residency section page
		 And user navigates to summary page and user click the checkbox of acknowledge message
		 Then user clicks on continue button on summary page 
		 And user navigates to document upload page and uploading the mandatory documents
		 When user clicks on Sign button  
     When user is again sign and click the checkbox
     And click on confirm button then user should navigates to documents page
     Then user verify the message on documents page "Signature Updated Successfully!" 
     When user selects the checkbox and clicks on confirm button
     Then user naviagtes to payment page 
     And user clicks on back button and then clicks on save and exit button
     When user opens the same application then its status should be "Ready to Pay - EP"
     
  @TRKDW-374 @regression
  Scenario: TRKDW-374 Verify the English & Arabic of the Steppers for a Worker outside Country
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 Then user clicks on New Application button
		 And user verifying below elements are present on application page 
		  | Is the Domestic Worker Inside the Country? |
		  | Inside the UAE                             |
		  | Outside the UAE                            |
		 When user selects the Outside the UAE radio button
		 And user clicks on Continue button 
		 Then user verify the below steppers for worker outside the country
		  | New Work Entry Permit |
		  | Travel to UAE         |
		  | Medical Test- DAHC    |
		  | Emirates Id           |
		  | Get Residency         | 
		  
  @TRKDW-373 @regression
  Scenario: TRKDW-373 Verify the English & Arabic of the Steppers for a Worker inside Country (Change Status)
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 Then user clicks on New Application button
		 And user verifying below elements are present on application page 
		  | Is the Domestic Worker Inside the Country? |
		  | Inside the UAE                             |
		  | Outside the UAE                            |
		 When user selects the Inside the UAE radio button and selects Change status
		 And user clicks on Continue button 
		 Then user verify the below steppers for worker inside the country - change status
		  | New Work Entry Permit |
		  | Change Status         |
		  | Medical Test- DAHC    |
		  | Emirates Id           |
		  | Get Residency         | 
		  
  @TRKDW-375 @regression
  Scenario: TRKDW-375 Verify the English & Arabic of the Steppers for a Worker inside Country (Exit & Reenter)
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 Then user clicks on New Application button
		 And user verifying below elements are present on application page 
		  | Is the Domestic Worker Inside the Country? |
		  | Inside the UAE                             |
		  | Outside the UAE                            |
		 When user selects the Inside the UAE radio button and selects Exit and Reenter
		 And user clicks on Continue button 
		 Then user verify the below steppers for worker inside the country - Exit and Renter
		  | New Work Entry Permit |
		  | Exit and re-enter UAE |
		  | Medical Test- DAHC    |
		  | Emirates Id           |
		  | Get Residency         | 
		  
	@TRKDW-998 @regression
  Scenario: TRKDW-998 Verify the Sponsor is able to delete the Entry Permit Draft Application
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
		 	|  AAY        |   test      |   test      |
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
		 	|   ABC123        |    Normal     |  05 April 2024 | 05 December 2026 |    Mumbai     |      INDIA     |      INDIA        | 
		 Then user clicks on save and exit button on passport details page 
		 When user opens the same application then its status should be "Draft"
		 Then user delete the application 
		 
	@TRKDW-1012 @regression
  Scenario: TRKDW-1012 Verify the Sponsor is able to delete the Mohre submitted Entry Permit and the WPP is unlinked
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
		 Then user naviagtes to other page and validating below elements
		  |  PersonalType   |  MediatorType  | MediatorAddress |  
		  |  from a friend  |   Instagram    |      test       |
		 Then user clicks on continue button on other details page
		 And user naviagtes to residency section and validating below elements
		  | NoOfYears |  Applyformedicaltest |
		  |     1     |      After5Days      |
		 Then user clicks on continue button on residency section page
		 And user navigates to summary page and user click the checkbox of acknowledge message
		 Then user clicks on continue button on summary page  
		 When user clicks on back button on document page and then its redirects to domestic page and again click on back button
		 When user opens the same application then its status should be "Draft - EP"
  	 Then user delete the application 
  	 
  @TRKDW-1013 @regression
  Scenario: TRKDW-1013 Verify the Sponsor is able to delete the Entry Permit with status ready to pay and the WPP is unlinked
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
		 Then user naviagtes to other page and validating below elements
		  |  PersonalType   |  MediatorType  | MediatorAddress |  
		  |  from a friend  |   Instagram    |      test       |
		 Then user clicks on continue button on other details page
		 And user naviagtes to residency section and validating below elements
		  | NoOfYears |  Applyformedicaltest |
		  |     1     |      After5Days      |
		 Then user clicks on continue button on residency section page
		 And user navigates to summary page and user click the checkbox of acknowledge message
		 Then user clicks on continue button on summary page 
		 And user navigates to document upload page and uploading the mandatory documents
		 When user clicks on Sign button  
     When user is again sign and click the checkbox
     And click on confirm button then user should navigates to documents page
     Then user verify the message on documents page "Signature Updated Successfully!" 
     When user selects the checkbox and clicks on confirm button
     Then user naviagtes to payment page 
     And user clicks on back button and then clicks on save and exit button
     When user opens the same application then its status should be "Ready to Pay - EP" 
  	 Then user delete the application 
  	 
  @TRKDW-1014 @regression
  Scenario: TRKDW-1014 Verify the Sponsor is able to delete the paid Entry Permit Application
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
		 Then user naviagtes to other page and validating below elements
		  |  PersonalType   |  MediatorType  | MediatorAddress |  
		  |  from a friend  |   Instagram    |      test       |
		 Then user clicks on continue button on other details page
		 And user naviagtes to residency section and validating below elements
		  | NoOfYears |  Applyformedicaltest |
		  |     1     |      After5Days      |
		 Then user clicks on continue button on residency section page
		 And user navigates to summary page and user click the checkbox of acknowledge message
		 Then user clicks on continue button on summary page 
		 And user navigates to document upload page and uploading the mandatory documents
		 When user clicks on Sign button  
     When user is again sign and click the checkbox
     And click on confirm button then user should navigates to documents page
     Then user verify the message on documents page "Signature Updated Successfully!" 
     When user selects the checkbox and clicks on confirm button 
     Then user naviagtes to payment page and click on pay button 
   	 Then user should not be able to delete the application with status "Entry Permit Pending Approval"
  	 
  @TRKDW-1197 @regression
  Scenario: TRKDW-1197 Verify the user is able to delete EP before submitting to Mohre and also verify whether is removed from dashboard and history after delete
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
		 	|  AAY        |   test      |   test      |
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
		 	|   ABC123        |    Normal     |  05 April 2024 | 05 December 2026 |    Mumbai     |      INDIA     |      INDIA        | 
		 Then user clicks on save and exit button on passport details page 
		 When user opens the same application then its status should be "Draft"
		 Then user delete the application 
		 And user verify that the application was deleted from the dashboard and from the history as well.
		 
	@TRKDW-322 @regression
	Scenario: TRKDW-322 Verify the New Work Entry Permit Stepper with status 'Not Started'
     Given user logged into DubaiNow application
		 When user clicks on Residency tab and click on domestic worker
		 Then user clicks on New Application button
		 And user verifying below elements are present on application page 
		  | Is the Domestic Worker Inside the Country? |
		  | Inside the UAE                             |
		  | Outside the UAE                            |
		 When user selects the Outside the UAE radio button
		 And user clicks on Continue button 
		 Then user verify stepper status as "Not Started" and "START" should be enabled
  	 
  @TRKDW-324 @regression
  Scenario: TRKDW-324 Verify the New Work Entry Permit Stepper with status 'Draft - EP'
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
  	 Then user clicks on save and exit button on passport details page 
		 When user opens the same application then its status should be "Draft"
		 And user verify status of stepper as "Draft - EP" and "EDIT" button should be present 
		 
  @TRKDW-325 @regression
  Scenario: TRKDW-325 Verify the New Work Entry Permit Stepper with status 'Ready to Pay - EP'
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
		 Then user naviagtes to other page and validating below elements
		  |  PersonalType   |  MediatorType  | MediatorAddress |  
		  |  from a friend  |   Instagram    |      test       |
		 Then user clicks on continue button on other details page
		 And user naviagtes to residency section and validating below elements
		  | NoOfYears |  Applyformedicaltest |
		  |     1     |      After5Days      |
		 Then user clicks on continue button on residency section page
		 And user navigates to summary page and user click the checkbox of acknowledge message
		 Then user clicks on continue button on summary page 
		 And user navigates to document upload page and uploading the mandatory documents
		 When user clicks on Sign button  
     When user is again sign and click the checkbox
     And click on confirm button then user should navigates to documents page
     Then user verify the message on documents page "Signature Updated Successfully!" 
     When user selects the checkbox and clicks on confirm button
     Then user naviagtes to payment page 
     Then user clicks on save and exit button on passport details page 
     When user opens the same application then its status should be "Ready to Pay - EP" 
     And user verify status of stepper as "Ready to Pay - EP" and "PAY" button should be present
    
  @TRKDW-327 @regression
  Scenario: TRKDW-327 Verify the New Work Entry Permit Stepper with status 'Entry Permit Pending Approval'
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
		 Then user naviagtes to other page and validating below elements
		  |  PersonalType   |  MediatorType  | MediatorAddress |  
		  |  from a friend  |   Instagram    |      test       |
		 Then user clicks on continue button on other details page
		 And user naviagtes to residency section and validating below elements
		  | NoOfYears |  Applyformedicaltest |
		  |     1     |      After5Days      |
		 Then user clicks on continue button on residency section page
		 And user navigates to summary page and user click the checkbox of acknowledge message
		 Then user clicks on continue button on summary page 
		 And user navigates to document upload page and uploading the mandatory documents
		 When user clicks on Sign button  
     When user is again sign and click the checkbox
     And click on confirm button then user should navigates to documents page
     Then user verify the message on documents page "Signature Updated Successfully!" 
     When user selects the checkbox and clicks on confirm button 
     Then user naviagtes to payment page and click on pay button 
     #And user verify status of stepper as "Entery Permit Pending Approval" and "VIEW" button should be present
     Then user navigates back to Dashboard page and open the same application using "applicant name"
     And user verify status of stepper as "Entry Permit Pending Approval" and "VIEW" button should be present 
