@Contracting
Feature: Contracting information page.
 
  @TRKDW-227 @regression
  Scenario: TRKDW-227 - Verify the fields in the 'Contracting Information' sections
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
		 Then user naviagtes to other page and verifying below elements
		  |   PersonalType   |
		  |   MediatorType   |
		  |  MediatorAddress |  
		  
	@TRKDW-229 @regression
  Scenario: TRKDW-229 - Validate the fields in the 'Contracting Information' sections
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

  @TRKDW-230 @regression
  Scenario: TRKDW-230 - Verify the mandatory fields in the 'Contracting Information' sections
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
		 Then user verify continue button is enabled on other details page
		 
	@TRKDW-231 @regression
  Scenario: TRKDW-231 - Verify the entered field value persist in the 'Contracting Information' sections
     
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
		 When user clicks on continue button on other details page
		 Then user navigates to residency page and clicks on back button
		 And user clicks on save and exit button
		  When user navigates to dashboard page and verify user profile as "Draft"
#		 When user navigates to dashboard page and verify user profile as draft
		 Then user navigates to domestic worker page and clicks on EDIT button
		 And user navigates to details page and verify values are still present 
		  	  
	
