 Feature: Verify Address details sections.
 
  @TRKDW-213 @regression @address
  Scenario: TRKDW-213 - Verify the fields present in the 'Address Details' sections
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
		 Then user clicks on Continue button on personal details page 
		 And user redirects to address details page and verifying below elements in outside UAE section
		  | Permanent Country |
		  |   City            |
		  | Abroad Address    |
		  | Abroad mobile no  |
		 Then user redirects to address details page and verifying below elements in inside UAE section
		  |  Emirate    |
		  |   City      |
		  | Area        |
		  | Street      |
		  | Building    |
		  | Floor       |
		  | ApartmentNo |
		  | MakaniNo    |
 
  @TRKDW-215 @regression @address
  Scenario: TRKDW-215 - Validate the fields present in the 'Address Details' sections
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
		  |      INDIA        |   Mumbai   |       test       |    5544332211      | 
		 Then user redirects to address details page and validates below elements in inside UAE section
		  |  Emirate    |   City   |   Area    |   Street  |   Building   |  Floor  |  ApartmentNo |   MakaniNo  | 
		  |   DUBAI     |   DUBAI  |  ABUKADRA |    test   |     test     |    1    |      111     |       1     | 
		    
	@TRKDW-216 @regression @address
  Scenario: TRKDW-216 - Verify the mandatory fields present in the 'Address Details' sections
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
		  |      INDIA        |   Mumbai   |       test       |    5544332211      | 
		 Then user redirects to address details page and validates below mandatory elements in inside UAE section
		  |  Emirate    |   City   |   Area    |   Street  |   Building   |  Floor  |  ApartmentNo |   MakaniNo  | 
		  |   DUBAI     |   DUBAI  |  ABUKADRA |    test   |     test     |    1    |      111     |  (Optional) | 
		 And user clicks on checkbox of disclaimer
		 Then user verify continue button is enabled on address details page 
		 
	@TRKDW-217 @regression @address
  Scenario: TRKDW-217 - Verify the disclaimer in the 'Address Details' sections
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
		  |      INDIA        |   Mumbai   |       test       |    5544332211      | 
		 Then user redirects to address details page and validates below mandatory elements in inside UAE section
		  |  Emirate    |   City   |   Area    |   Street  |   Building   |  Floor  |  ApartmentNo |   MakaniNo  | 
		  |   DUBAI     |   DUBAI  |  ABUKADRA |    test   |     test     |    1    |      111     |  (Optional) | 
		 And user verify the disclaimer "I hereby declare that the provided information is accurate to the best of my knowledge" should be present on screen
		 
	@TRKDW-218 @regression @address
  Scenario: TRKDW-218 - Verify the entered field value persist in the 'Address Details' sections
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
		 Then user naviagtes to salary page and clicks on back button
		 Then user clicks on save and exit button on address details page 
		 When user navigates to dashboard page and verify user profile as "Draft"
		 Then user delete the application 
		 
	@TRKDW-14800
  Scenario: TRKDW-14800 - Verify the mandatory fields present in the 'Address Details' sections
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
		 And user redirects to address details page and enter below elements in outside UAE section
		  | Permanent Country |    City    |  Abroad Address  |  Abroad mobile no  |
		  |      INDIA        |   Mumbai   |       test       |    5544332211      | 
#		 Then user redirects to address details page and validates below mandatory elements in inside UAE section
#		  |  Emirate    |   City   |   Area    |   Street  |   Building   |  Floor  |  ApartmentNo |   MakaniNo  | 
#		  |   DUBAI     |   DUBAI  |  ABUKADRA |    test   |     test     |    1    |      111     |  (Optional) |  
	 