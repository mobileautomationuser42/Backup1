Feature: Document upload Page and signature.

  @TRKDW-239 @regression
  Scenario: TRKDW-239 - Verify the Digital Signature screen
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
		 And user naviagtes to documents page and verifying elements
		 When user clicks on Sign button 
		 Then user navigates to digital signature screen  

  @TRKDW-244 @regression
  Scenario: TRKDW-244 - Verify the Sponsor returned to previous screen upon clicking the back button from 'Digital Signature' screen
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
		 And user naviagtes to documents page and verifying elements
		 When user clicks on Sign button 
		 Then user navigates to digital signature screen  
		 And user clicks on back button then user should navigates to document page

  @TRKDW-241 @regression
  Scenario: TRKDW-241 - Verify the Sponsor is able to view or reset the signature
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
		 And user naviagtes to documents page and verifying elements	 
		 When user clicks on Sign button 
		 Then user sign the signature
		 And user clicks on clear button
     Then user verify that signature screen should get cleared
     When user is again sign and click the checkbox
     And click on confirm button then user should navigates to documents page
     Then user verify the message on documents page "Signature Updated Successfully!"
     And user clicks on view button and navigates to signature screen
    
	@TRKDW-234 @regression
  Scenario: TRKDW-234 - Verify the Sponsor Signature section in document screen
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
		 And user naviagtes to documents page and verifying signature section elements
		 
		 @TRKDW-237 @regression
  Scenario: TRKDW-237 Verify the sponsor able to proceed without uploading the mandatory documents
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
	   And user navigates to the document upload page without uploading mandatory documents
     Then user verify the message on documents page "Signature will be used in labour contract" 
     When user selects the checkbox 
     Then user should not be able to proceed to the next step and "Continue" button should be disable
     
     @TRKDW-236 @regression
  Scenario: TRKDW-236 Verify the sponsor is able to remove the attached documents
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
    When user selects the checkbox 
    Then user verify document name should be displayed with remove icon 
    Then user verify "Continue" button should be enabled
    When user clicks on remove icon and the document should be removed
    And user verify attach icons should be displayed
    Then user verify "Continue" button should remain disabled until the mandatory documents and E-Sign are completed
    When user uploads a different document in the same place
    Then user verify document name should be displayed with remove icon 
    Then user verify the document uploaded should be the same as the one viewed
     
     @TRKDW-243 @regression
  Scenario: TRKDW-243 - Verify the Sponsor is able to edit the Signature
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
		 And user naviagtes to documents page and verifying elements	 
		 When user clicks on Sign button 
		 Then user sign the signature
		 And user clicks on clear button
     Then user verify that signature screen should get cleared
     When user is again sign and click the checkbox
     And click on confirm button then user should navigates to documents page
     Then user verify the message on documents page "Signature Updated Successfully!"
     And user clicks on view button and navigates to signature screen
	   Then user sign the signature
     And user click on "Confirm" button then user should navigates to documents page
     And click on confirm button then user should navigates to documents page
     Then user verify the message on documents page "Signature Updated Successfully!"
     
     #And user clicks on view button and navigates to signature screen
    
#	 When user should be able to view the edited signature and an image
     
	   