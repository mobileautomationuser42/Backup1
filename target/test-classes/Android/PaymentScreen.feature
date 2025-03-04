Feature: Payment functionality.

  @TRKDW-136 @regression
  Scenario: TRKDW-136 Verify the sponsor able to view/download the payment receipt of WPP from DWB upon making the payment
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
     And user then open the same application and can view the payment receipt
     
  @TRKDW-263 @regression
  Scenario: TRKDW-263 Verify the New - Entry Permit Payment screen
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
     Then user naviagtes to payment page and verify the amount on payment page
     
  @TRKDW-265 @regression
  Scenario: TRKDW-265 Verify the New Entry Permit Stepper after successful payment
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
     When user opens the same application then its status should be "Entry Permit Pending Approval"
     
  