package dWStepDefinitions;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;

import com.google.common.collect.ImmutableMap;

import Utilities.AndroidUtilities;
import Utilities.AssertionsUtils;
import Utilities.SeleniumUtils;
import Utilities.WaitUtilities;
import dWPageRepo.AddressDetailsPage;
import dWPageRepo.ApplicationPage;
import dWPageRepo.CommonElements;
import dWPageRepo.DWFunctionLibrary;
import dWPageRepo.DashboardPage;
import dWPageRepo.DigitalSignaturePage;
import dWPageRepo.DocumentsPage;
import dWPageRepo.DomesticWorkerPage;
import dWPageRepo.HistoryPage;
import dWPageRepo.LanguagePage;
import dWPageRepo.OtherDetailsPage;
import dWPageRepo.PassportDetailsPage;
import dWPageRepo.PaymentPage;
import dWPageRepo.PersonalDetailsPage;
import dWPageRepo.ResidencyPage;
import dWPageRepo.SalaryDetailsPage;
import dWPageRepo.SearchWorkerPage;
import dWPageRepo.SummaryPage;
import dwManagement.DWManager;
import io.appium.java_client.AppiumBy;
import io.cucumber.core.internal.com.fasterxml.jackson.core.exc.StreamReadException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.DatabindException;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class StepDefinitions extends DWManager {

	WaitUtilities wait;
	DWFunctionLibrary be;
	AssertionsUtils assertions;
	LanguagePage languagepage = new LanguagePage();
	AndroidUtilities androidUtilities;
	SeleniumUtils su;

	@Before
	public void beforeScenario() throws IOException {
		setUp();
		be = new DWFunctionLibrary(driver);
		assertions = new AssertionsUtils(driver);
		wait = new WaitUtilities(driver);
		androidUtilities = new AndroidUtilities(driver);
	}

    @After
	public void afterScenario() {
		tearDown();
	}

	@Given("the user is on the Introduction page")
	public void the_user_is_on_the_introduction_page() {

	}

	@When("the user clicks on the {string} button")
	public void the_user_clicks_on_the_button(String string) {
		be.ClickOnEnglishButton();
		be.ClickOnQAButton();
	}

	@When("the user clicks on {string} button")
	public void the_user_clicks_on_button(String string) {
		be.ClickOnSkipButton();
	}

	@Then("the user clicks on {string} tab")
	public void the_user_clicks_on_tab(String string) {
		be.ClickOnSignInWithUAEPASSButton();
	}

	@Then("the user clicks on Confirm button")
	public void the_user_clicks_on_confirm_button() {
		be.ClickOnConfirmButton();
	}

	@When("the user enter pin and sign in to Dubai now application")
	public void the_user_enter_pin_and_sign_in_to_dubai_now_application() {
		be.enterPinforUAEPass();
		assertions.assertElementDisplayed(DashboardPage.ProfileLabel);
	}

	@Given("user logged into DubaiNow application")
	public void user_logged_into_dubai_now_application() {
		be.SignIn();
	}

	@When("user clicks on Residency tab and click on domestic worker")
	public void user_clicks_on_residency_tab_and_click_on_domestic_worker() {
		be.ClickOnResidency();
		be.ClickOnDomesticWorker();
	}

	@Then("user clicks on New Application button")
	public void user_clicks_on_new_application_button() {
		be.ClickOnNewApplicationButton();
	}

	@Then("user verifying below elements are present on application page")
	public void user_verifying_below_elements_are_present_on_application_page(DataTable elements) {
		be.AssertingElementsOnApplicationPage(elements);
	}

	@When("user selects the Outside the UAE radio button")
	public void user_selects_the_outside_the_uae_radio_button() {
		be.ClickOnOutsideTheUAERadioButton();
	}

	@When("user clicks on Continue button")
	public void user_clicks_on_continue_button() {
		be.ClickOnContinueButton();
	}

	@Then("user clicks on Start button")
	public void user_clicks_on_start_button() {
		be.ClickOnStartButton();
		be.ClickOnEnterWorkerDetailsManuallyButton();
	}

	@Then("user redirects to personal details page and verifying first section containing below elements")
	public void user_redirects_to_personal_details_page_and_verifying_first_section_containing_below_elements(
			DataTable dataTable) {
		be.AssertingElementsOnPersonalDetailsPageFirstSection(dataTable);
	}

	@Given("verifying second section containing below elements")
	public void verifying_second_section_containing_below_elements(DataTable dataTable) {
		be.AssertingElementsOnPersonalDetailsPageSecondSection(dataTable);
	}

	@Then("verifying third section containing below elements")
	public void verifying_third_section_containing_below_elements(DataTable dataTable) {
		be.AssertingElementsOnPersonalDetailsPageThirdSection(dataTable);
	}

	@Then("verifying fourth section containing below elements")
	public void verifying_fourth_section_containing_below_elements(DataTable dataTable) {
		be.AssertingElementsOnPersonalDetailsPageFourthSection(dataTable);
	}

	@Then("user redirects to personal details page and validating first section")
	public void user_redirects_to_personal_details_page_and_validating_first_section(DataTable dataTable) {
		be.EnterDataIntoFirstSectionofPersonalDetails(dataTable);
	}

	@Then("user validating second section")
	public void user_validating_second_section(DataTable dataTable) {
		be.EnterDataIntoSecondSectionofPersonalDetails(dataTable);
	}

	@Then("user validating third section")
	public void user_validating_third_section(DataTable dataTable) {
		be.EnterDataIntoThirdSectionofPersonalDetails(dataTable);
	}

	@Then("user validating fourth section")
	public void user_validating_fourth_section(io.cucumber.datatable.DataTable dataTable) {
		be.EnterDataIntoFourthSectionofPersonalDetails(dataTable);
	}

	@Then("user redirects to personal details page and validating mandatory fields in first section")
	public void user_redirects_to_personal_details_page_and_validating_mandatory_fields_in_first_section(
			DataTable dataTable) {
		be.EnterDataIntoFirstSectionofPersonalDetailsOnlyMandatoryData(dataTable);
	}

	@Then("user verify continue button is enabled on personal details page")
	public void user_verify_continue_button_is_enabled() {
		assertions.assertElementEnabled(PersonalDetailsPage.ContinueButton);
	}

	@When("user clicks on Back button")
	public void user_clicks_on_back_button() {
		be.ClickOnBackButton();
	}

	@Then("user clicks on Continue button on personal details page")
	public void user_clicks_on_continue_button_on_personal_details_page() {
		be.ClickOnContinueButton();
	}

	@Then("user verify {string} is not displayed when Outside the UAE is selected")
	public void user_verify_is_not_displayed_when_outside_the_uae_is_selected(String que) {
		assertions.assertElementNotPresent(ApplicationPage.WhatDoYouPreferText);
	}

	@Then("user navigates to stepper screen")
	public void user_navigates_to_stepper_screen() {
		assertions.assertElementPresent(DomesticWorkerPage.StartButton);
	}

	@When("user selects the Inside the UAE radio button")
	public void user_selects_the_inside_the_uae_radio_button() {
		be.ClickOnInsideTheUAERadioButton();
	}

	@Then("user verify {string} is displayed when Inside the UAE is selected")
	public void user_verify_is_displayed_when_inside_the_uae_is_selected(String string) {
		assertions.assertElementDisplayed(ApplicationPage.WhatDoYouPreferText);
	}

	@Then("user verify that it contains two radio buttons")
	public void user_verify_that_it_contains_two_radio_buttons(DataTable dataTable) {
		assertions.assertElementDisplayed(ApplicationPage.ChangeStatusRadioButton);
		assertions.assertElementDisplayed(ApplicationPage.ExitAndRenterUAERadioButton);
	}

	@Then("user redirects to passport details page and verifying below elements")
	public void user_redirects_to_passport_details_page_and_verifying_below_elements(DataTable dataTable) {
		be.AssertingElementsOnPassportDetailsPage(dataTable);
	}

	@Given("user redirects to passport details page and validating below elements")
	public void user_redirects_to_passport_details_page_and_validating_below_elements(DataTable dataTable) {
		be.EnterDataIntoPassportDetails(dataTable);
	}

	@Then("user verify continue button is enabled on passport details page")
	public void user_verify_continue_button_is_enabled_on_passport_details_page() {
		assertions.assertElementEnabled(PassportDetailsPage.ContinueButton);
	}

	@Then("user clicks on save and exit button on passport details page")
	public void user_clicks_on_save_and_exit_button_on_passport_details_page() {
		be.ClickSaveAndExitButton();
	}
	@When("user navigates to dashboard page and verify user profile as {string}")
	public void user_navigates_to_dashboard_page_and_verify_user_profile_as(String status) {
		//be.ClickOnApplicantProfileButton();
		be.VerifyProfileOnDashboardPage(status);
	}
	@Then("user delete the application")
	public void user_delete_the_application() {
		be.ClickDeleteApplicationButton();
	}

	// Draft Application Step def.
	@Then("user selects applicant profile on dashboard page")
	public void user_selects_applicant_profile_on_dashboard_page() {
		be.ClickOnApplicantProfileButton();
	}

	@Then("user clicks on EDIT button")
	public void user_clicks_on_edit_button() {
		be.ClickOnEditButton();
	}

	@Then("user always navigates to personal details page")
	public void user_always_navigates_to_personal_details_page() {
		assertions.assertElementDisplayed(PersonalDetailsPage.PersonalDetailsText);
	}

	// Address
	@Given("user redirects to address details page and verifying below elements in outside UAE section")
	public void user_redirects_to_address_details_page_and_verifying_below_elements_in_outside_uae_section(
			DataTable dataTable) {
		be.AssertingElementsOnAddressDetailsPageOutsideUAE(dataTable);
		androidUtilities.swipeUp(AppiumBy.xpath("//android.widget.ScrollView/android.widget.LinearLayout"));
	}

	@Then("user redirects to address details page and verifying below elements in inside UAE section")
	public void user_redirects_to_address_details_page_and_verifying_below_elements_in_inside_uae_section(
			DataTable dataTable) {
		be.AssertingElementsOnAddressDetailsPageInsideUAE(dataTable);
		androidUtilities.swipeUp(AppiumBy.xpath("//android.widget.ScrollView/android.widget.LinearLayout"));
	}

	@Then("user clicks on Continue button on passport details page")
	public void user_clicks_on_continue_button_on_passport_details_page() {
		be.ClickOnContinueButton();
	}

	@Then("user redirects to address details page and validates below elements in outside UAE section")
	public void user_redirects_to_address_details_page_and_validates_below_elements_in_outside_uae_section(
			DataTable dataTable) {
		be.EnterDataIntoOutsideTheUAESectionInAddressDetails(dataTable);
	}

	@Then("user redirects to address details page and validates below elements in inside UAE section")
	public void user_redirects_to_address_details_page_and_validates_below_elements_in_inside_uae_section(
			DataTable dataTable) {
		be.EnterDataIntoInsideTheUAESectionInAddressDetails(dataTable);
	}

	@Then("user redirects to address details page and validates below mandatory elements in inside UAE section")
	public void user_redirects_to_address_details_page_and_validates_below_mandatory_elements_in_inside_uae_section(
			io.cucumber.datatable.DataTable dataTable) {
		be.EnterDataIntoInsideTheUAESectionOnlyMandatoryDataInAddressDetails(dataTable);
	}

	@Then("user clicks on checkbox of disclaimer")
	public void user_clicks_on_checkbox_of_disclaimer() {
		be.ClickOnCheckboxForAddressDisclaimer();
	}

	@Then("user verify continue button is enabled on address details page")
	public void user_verify_continue_button_is_enabled_on_address_details_page() {
		assertions.assertElementEnabled(AddressDetailsPage.ContinueButton);
	}

	@Given("user verify the disclaimer {string} should be present on screen")
	public void user_verify_the_disclaimer_should_be_present_on_screen(String message) {
		be.VerifyDisclaimerMessageOnAddressPage(message);
	}

	@When("user clicks on continue button on address page")
	public void user_clicks_on_continue_button_on_address_page() {
		be.ClickOnContinueButton();
	}

	@Then("user naviagtes to salary page and clicks on back button")
	public void user_naviagtes_to_salary_page_and_clicks_on_back_button() {
		be.ClickOnBackButton();
	}

	@Then("user clicks on save and exit button on address details page")
	public void user_clicks_on_save_and_exit_button_on_address_details_page() {
		be.ClickSaveAndExitButton();
	}

	@Given("user redirects to salary details page and verifying below elements")
	public void user_redirects_to_salary_details_page_and_verifying_below_elements(DataTable dataTable) {
		be.AssertingElementsOnSalaryDetailsPage(dataTable);
	}

	@Then("user redirects to salary details page and validating below elements")
	public void user_redirects_to_salary_details_page_and_validating_below_elements(DataTable dataTable) {
		be.EnterDataIntoSalaryDetails(dataTable);
	}

	@Then("user verify that salary field should be read only")
	public void user_verify_that_salary_field_should_be_read_only() {
		be.AssertingSalaryIsReadOnlyField();
	}

	@Then("user verify continue button is enabled on salary details page")
	public void user_verify_continue_button_is_enabled_on_salary_details_page() {
		wait.waitForElementClickable(SalaryDetailsPage.ContinueButton, Duration.ofSeconds(30));
		assertions.assertElementEnabled(SalaryDetailsPage.ContinueButton);
	}

	@When("user clicks on continue button on salary page")
	public void user_clicks_on_continue_button_on_salary_page() {
		be.ClickOnContinueButton();
	}

	@Then("user naviagtes to other page and clicks on back button")
	public void user_naviagtes_to_other_page_and_clicks_on_back_button() {
		be.ClickOnBackButton();
	}

	@Then("user clicks on save and exit button on salary details page")
	public void user_clicks_on_save_and_exit_button_on_salary_details_page() {
		be.ClickSaveAndExitButton();
	}

	@Then("user navigates to domestic worker page and clicks on EDIT button")
	public void user_navigates_to_domestic_worker_page_and_clicks_on_edit_button() {
		be.ClickOnEditButton();
	}

	@Then("user navigates to details page and clicks on continue button")
	public void user_navigates_to_details_page_and_clicks_on_continue_button() {
		be.NavigateTo();
	}

	@Then("user at the end navigates to salary page and verify values are still present there")
	public void user_at_the_end_navigates_to_salary_page_and_verify_values_are_still_present_there() {
		//wait.waitForElementVisible(SalaryDetailsPage.BasicSalaryField, Duration.ofSeconds(60));
		wait.waitForElementVisible(SalaryDetailsPage.BasicSalaryValue, Duration.ofSeconds(60));
	}

	@Then("user navigates to dashboard page and selects profile with {string} status")
	public void user_navigates_to_dashboard_page_and_selects_profile_with_status(String status) throws InterruptedException {
		be.SelectsProfileWithStatus(status);
	}

	@Then("user user then verify the {string} status on stepper screen")
	public void user_user_then_verify_the_status_on_stepper_screen(String status) {
		be.VerifyStatusFromStepperScreenn(status, DomesticWorkerPage.PayButton);
	}

	@Then("user naviagtes to other page and verifying below elements")
	public void user_naviagtes_to_other_page_and_verifying_below_elements(DataTable dataTable) {
		be.AssertingElementsOnOtherDetailsPage(dataTable);
	}

	@Then("user naviagtes to other page and validating below elements")
	public void user_naviagtes_to_other_page_and_validating_below_elements(DataTable dataTable) {
		be.EnterDataIntoOtherDetailsPage(dataTable);
	}

	@Then("user clicks on continue button on other details page")
	public void user_clicks_on_continue_button_on_other_details_page() {
		be.ClickOnContinueButton();
	}

	@Then("user naviagtes to residency section and verifying below elements")
	public void user_naviagtes_to_residency_section_and_verifying_below_elements(DataTable dataTable) {
		be.AssertingElementsOnResidencyPage(dataTable);
	}

	@Then("user naviagtes to residency section and validating below elements")
	public void user_naviagtes_to_residency_section_and_validating_below_elements(DataTable dataTable) {
		be.EnteringDataIntoResidencyPage(dataTable);
	}

	@Then("user clicks on continue button on residency section page")
	public void user_clicks_on_continue_button_on_residency_section_page() {
		be.ClickOnContinueButton();
	}

	@When("user navigates to summary page and click on back button")
	public void user_navigates_to_summary_page_and_click_on_back_button() {
		be.ClickOnBackButton();
	}

	@Then("user navigates back to residency section and click on save and exit button")
	public void user_navigates_back_to_residency_section_and_click_on_save_and_exit_button() {
		be.ClickSaveAndExitButton();
	}

	@Then("user navigates to dashboard page and click the same application with draft status")
	public void user_navigates_to_dashboard_page_and_click_the_same_application_with_draft_status() {

	}

	@Then("user open the application and go to residency page and check value still persists")
	public void user_open_the_application_and_go_to_residency_page_and_check_value_still_persists() {

	}

	@Then("user navigates to dashboard page and selects profile with {string} status and Id {string}")
	public void user_navigates_to_dashboard_page_and_selects_profile_with_status_and_id(String status, String id) {
		be.selectProfileWithStatusAndId(status, id);
	}

	@Then("user always navigates to summary details page")
	public void user_always_navigates_to_summary_details_page() {
		wait.sleepInSeconds(12);
		assertions.assertTextEquals(SummaryPage.SummaryTitle, "Summary");
	}

	@Then("user verify continue button is enabled on other details page")
	public void user_verify_continue_button_is_enabled_on_other_details_page() {
		wait.waitForElementClickable(OtherDetailsPage.ContinueButton, Duration.ofSeconds(30));
		assertions.assertElementEnabled(OtherDetailsPage.ContinueButton);
	}

	@Then("user navigates to summary page and user click the checkbox of acknowledge message")
	public void user_navigates_to_summary_page_and_user_click_the_checkbox_of_acknowledge_message() {
		wait.waitForTextToBePresent(CommonElements.PageTitle, "Review Details", Duration.ofSeconds(60));  
	    wait.waitForElementPresent(CommonElements.SwipeUp, Duration.ofSeconds(30)); 
	    for (int i = 0; i < 15; i++) {
	        androidUtilities.swipeUp(CommonElements.SwipeUp);
	    } 
	    be.ClickOnCheckboxForAddressDisclaimer();
	}


	@Given("user navigates to document upload page and uploading the mandatory documents")
	public void user_navigates_to_document_upload_page_and_uploading_the_mandatory_documents() {
		be.UploadDocument();
	}

	@Then("user clicks on continue button on summary page")
	public void user_clicks_on_continue_button_on_summary_page() {
		be.ClickOnContinueButton();
	}

	@Then("user verify the quota status should be {string}")
	public void user_verify_the_quota_status_should_be(String status) {
		assertions.assertContainsText(DashboardPage.WPPQuotaStatus, status);
	}

	@Then("user verify the {string} status and {string} button should be present on screen")
	public void user_verify_the_status_and_button_should_be_present_on_screen(String status, String button) {
		assertions.assertContainsText(DomesticWorkerPage.QuotaNotAvailableText, status);
		wait.waitForElementClickable(DomesticWorkerPage.PurchaseButton, Duration.ofSeconds(60));
		assertions.assertElementPresent(DomesticWorkerPage.PurchaseButton);
	}

	@When("user should be able to refresh the stepper without any error")
	public void user_should_be_able_to_refresh_the_stepper_without_any_error() {
		be.RefreshStepperScreen();
	}

	@When("user validates the UI components presents on sponsor screen")
	public void user_validates_the_ui_components_presents_on_sponsor_screen() {
		be.AssertingElementsOnSponsorPage();
	}

	@Then("user clicks on WPP Quota")
	public void user_clicks_on_wpp_quota() {
		be.ClickOnWPPQuota();
	}

	@Then("user navigates to policy details page and validate the components")
	public void user_navigates_to_policy_details_page_and_validate_the_components() {
		be.AssertingElementsOnWPPSummaryScreen();
	}

	@Then("user verify the {string} label should be present if there no applications created")
	public void user_verify_the_label_should_be_present_if_there_no_applications_created(String string) {
		assertions.assertElementPresent(DashboardPage.NoDependenttoShowLabel);
	}

	@Then("user navigates to residency page and clicks on back button")
	public void user_navigates_to_residency_page_and_clicks_on_back_button() {
		wait.waitForElementPresent(ResidencyPage.ResidencyPageTitle, Duration.ofSeconds(60));
		be.ClickOnBackButton();
	}

	@Then("user clicks on save and exit button")
	public void user_clicks_on_save_and_exit_button() {
		be.ClickSaveAndExitButton();
	}

	@Given("user navigates to details page and verify values are still present")
	public void user_navigates_to_details_page_and_verify_values_are_still_present() {
		be.NavigatesToAddtionalInformationPage();
	}

	@Then("user naviagtes to documents page and verifying elements")
	public void user_naviagtes_to_documents_page_and_verifying_elements() {
		be.AssertingElementsOnDocumentsScreen();
	}

	@When("user clicks on Sign button")
	public void user_clicks_on_sign_button() {
		be.ClickOnSignButton();
	}

	@Then("user navigates to digital signature screen")
	public void user_navigates_to_digital_signature_screen() {
		be.AssertingElementsOnDigitalSignatureScreen();
	}

	@Then("user clicks on back button then user should navigates to document page")
	public void user_clicks_on_back_button_then_user_should_navigates_to_document_page() {
		be.ClickOnBackButton();
		be.AssertingElementsOnDocumentsScreen();
	}

	@Then("user sign the signature")
	public void user_sign_the_signature() {
		be.SignatureScreenVerification();
	}

	@Given("user clicks on clear button")
	public void user_clicks_on_clear_button() {
		be.ClickOnClearButton();
	}

	@Then("user verify that signature screen should get cleared")
	public void user_verify_that_signature_screen_should_get_cleared() {
		be.ClearSignatureScreen();
	}

	@When("user is again sign and click the checkbox")
	public void user_is_again_sign_and_click_the_checkbox() {
		be.Signature();
	}

	@When("click on confirm button then user should navigates to documents page")
	public void click_on_confirm_button_then_user_should_navigates_to_documents_page() {
		// be.AssertingElementsOnDocumentsScreen();
	}

	@Then("user verify the message on documents page {string}")
	public void user_verify_the_message_on_documents_page(String message) {
		assertions.assertContainsText(DocumentsPage.SignatureUpdatedSuccessfully, message);
	}

	@Then("user clicks on view button and navigates to signature screen")
	public void user_clicks_on_view_button_and_navigates_to_signature_screen() {
		be.ClickOnViewButton();
	}

	@Given("user naviagtes to documents page and verifying signature section elements")
	public void user_naviagtes_to_documents_page_and_verifying_signature_section_elements() {
		be.AssertingDigitalSignatureSection();
	}

	@Then("user verify the summary screen should be read only")
	public void user_verify_the_summary_screen_should_be_read_only() {

	}

	@When("user clicks on edit button in personal details section")
	public void user_clicks_on_edit_button_in_personal_details_section() {
		be.ClickOnEditButtonOnSummaryScreen();
	}

	@Then("user change the first name to test and save it")
	public void user_change_the_first_name_to_test_and_save_it() {
		be.ChangeFirstNameOnPersonalDetailsPage();
		be.ClickSaveAndExitButton();
	}

	@When("user selects the checkbox and clicks on confirm button")
	public void user_selects_the_checkbox_and_clicks_on_confirm_button() {
		be.ClickOnCheckboxAndThenConfirmButton();
	}

	@Then("user naviagtes to payment page")
	public void user_naviagtes_to_payment_page() {
		// be.Payment();
	}

	@Given("user clicks on back button and then clicks on save and exit button")
	public void user_clicks_on_back_button_and_then_clicks_on_save_and_exit_button() {
		be.ClickOnBackButton();
		be.ClickSaveAndExitButton();
	}

	@When("user opens the same application then its status should be {string}")
	public void user_opens_the_same_application_then_its_status_should_be(String status) {
		be.VerifyProfileOnDashboardPage(status);
	}

	@Then("user clicks on Start button on stepper screen")
	public void user_clicks_on_start_button_on_stepper_screen() {
		be.ClickOnStartButton();
	}

	@When("user clicks on Emirates Id")
	public void user_clicks_on_emirates_id() {
		be.ClickOnEmiratesIDRadioButton();
	}

	@Then("user veirifies fields presents under Emirates ID")
	public void user_veirifies_fields_presents_under_emirates_id() {
		be.AssertingFieldsUnderEmiratesId();
	}

	@When("user clicks on Unified No")
	public void user_clicks_on_unified_no() {
		be.ClickOnUnifiedIDRadioButton();
	}

	@Then("user veirifies fields presents under Unified No")
	public void user_veirifies_fields_presents_under_unified_no() {
		be.AssertingFieldsUnderUnifiedNo();
	}

	@Then("user verify that search button is disabled")
	public void user_verify_that_search_button_is_disabled() {
		assertions.assertElementDisabled(SearchWorkerPage.SearchButton);
	}

	@When("user clicks on Enter Worker Details Manually button")
	public void user_clicks_on_enter_worker_details_manually_button() {
		be.ClickOnEnterWorkerDetailsManuallyButton();
	}

	@When("user should navigates to personal details page")
	public void user_should_navigates_to_personal_details_page() {
		assertions.assertElementPresent(PersonalDetailsPage.PersonalDetailsText);
	}

	@When("user enter the values into fields under Emirates Id")
	public void user_enter_the_values_into_fields_under_emirates_id(DataTable dataTable) {
		be.EnterDataUnderEmirateID(dataTable);
	}

	@Then("user clicks on search button")
	public void user_clicks_on_search_button() {
		be.ClickOnSearchButton();
	}

	@Then("user should able to get a {string} screen")
	public void user_should_able_to_get_a_screen(String string) {
		assertions.assertElementPresent(SearchWorkerPage.NoProfileFoundLabel);
	}

	@Then("user enter the values into fields under Unified No")
	public void user_enter_the_values_into_fields_under_unified_no(DataTable dataTable) {
		be.EnterDataUnderUnfiedNo(dataTable);
	}

	@Then("user should be able to see the personal details page and applicant details")
	public void user_should_be_able_to_see_the_personal_details_page_and_applicant_details(DataTable dataTable) {
		be.AssertingApplicantDetailsUsingUnifiedId(dataTable);
	}

	@Then("user naviagtes to payment page and click on pay button")
	public void user_naviagtes_to_payment_page_and_click_on_pay_button() {
		be.Payment();
	}

	@Then("user verify the below steppers for worker outside the country")
	public void user_verify_the_below_steppers_for_worker_outside_the_country(List<String> steppers) {
		be.AssertingElementsOnStepperScreenFromDifferentCountry(steppers);
	}

	@Then("user verify the below steppers for worker inside the country - change status")
	public void user_verify_the_below_steppers_for_worker_inside_the_country_change_status(List<String> steppers) {
		be.AssertingElementsOnStepperScreenFromDifferentCountry(steppers);
	}

	@Then("user verify the below steppers for worker inside the country - Exit and Renter")
	public void user_verify_the_below_steppers_for_worker_inside_the_country_exit_and_renter(List<String> steppers) {
		be.AssertingElementsOnStepperScreenFromDifferentCountry(steppers);
	}

	@When("user selects the Inside the UAE radio button and selects Change status")
	public void user_selects_the_inside_the_uae_radio_button_and_selects_change_status() {
		be.ClickOnInsideTheUAERadioButton();
		be.ClickOnChangeStatusRadioButton();
	}

	@When("user selects the Inside the UAE radio button and selects Exit and Reenter")
	public void user_selects_the_inside_the_uae_radio_button_and_selects_exit_and_reenter() {
		be.ClickOnInsideTheUAERadioButton();
		be.ClickOnExitRadioButton();
	}

	@When("user clicks on back button on document page and then its redirects to domestic page and again click on back button")
	public void user_clicks_on_back_button_on_document_page_and_then_its_redirects_to_domestic_page_and_again_click_on_back_button() {
		wait.sleepInSeconds(10);
		be.ClickOnBackButton();
		be.ClickOnBackButton();
	}

	@Then("user should not be able to delete the application with status {string}")
	public void user_should_not_be_able_to_delete_the_application_with_status(String status) {
		be.VerifyDeleteButtonIsNotPresentForPaidApplications(status);
	}

	@Given("user verify that the application was deleted from the dashboard and from the history as well.")
	public void user_verify_that_the_application_was_deleted_from_the_dashboard_and_from_the_history_as_well() {
		be.VerifyApplicationDeletedFromDashboardAndHistory();
	}

	@Given("user then open the same application and can view the payment receipt")
	public void user_then_open_the_same_application_and_can_view_the_payment_receipt() {
		be.ViewThePaymentReceipt();
	}

	@Then("user naviagtes to payment page and verify the amount on payment page")
	public void user_naviagtes_to_payment_page_and_verify_the_amount_on_payment_page() {
		wait.waitForTextToBePresent(CommonElements.PageTitle, "Service Fees", Duration.ofSeconds(60));
		assertions.assertContainsText(CommonElements.PageTitle, "Service Fees");
		assertions.assertContainsText(PaymentPage.EntryPermitFees, "Entry Permit Fees");
		assertions.assertElementPresent(PaymentPage.PayButton);
	}

	@Given("user verify the new field added in passport screen")
	public void user_verify_the_new_field_added_in_passport_screen() {
		be.VerifyNewlyAddedFieldsOnPassportScreen();
	}

	@Given("user verify new added Immediately option present on residency page")
	public void user_verify_new_added_immediately_option_present_on_page() {
		be.VerifyNewlyAddedFieldsOnResidencyScreen();
	}

	@Then("user redirected to dashboard page and application should be present on the dashboard page as well on history page")
	public void user_redirected_to_dashboard_page_and_application_should_be_present_on_the_dashboard_page_as_well_on_history_page() {
		be.VerifyNewlyCreatedApplicationsPresentOnDashboardAndHistoryScreen();
	}

	@Given("user redirects to passport details page and enter below info")
	public void user_redirects_to_passport_details_page_and_enter_below_info(
			io.cucumber.datatable.DataTable dataTable) {
		be.EnterDataIntoPassportDetailsForValidatingPlaceOfIssue(dataTable);
	}

	@Given("user then validate place of issue validation message for max character insertion")
	public void user_then_validate_place_of_issue_validation_message_for_max_character_insertion() {
		wait.waitForTextToBePresent(CommonElements.PageTitle, "Passport Details", Duration.ofSeconds(60));
		wait.waitForTextToBePresent(CommonElements.CharacterValidationMessage,
				"Passport Place of issuance field length should not exceed 50 characters", Duration.ofSeconds(60));
		assertions.assertContainsText(CommonElements.CharacterValidationMessage,
				"Passport Place of issuance field length should not exceed 50 characters");
	}

	@Given("user redirects to address details page and enter below elements in outside UAE section")
	public void user_redirects_to_address_details_page_and_enter_below_elements_in_outside_uae_section(
			io.cucumber.datatable.DataTable dataTable) {
		be.EnterDataIntoOutsideTheUAESectionInAddressDetailsForValidation(dataTable);
	}

	@Then("user select worker profile with Active status and clicked on Cancel Residency")
	public void user_select_worker_profile_with_active_status_and_clicked_on_cancel_residency() {
		be.SelectProfileForCancellation();
	}

	@Given("user selects the cancellation reason on cancel residency screen as {string}")
	public void user_selects_the_cancellation_reason_on_cancel_residency_screen_as(String reason) {
		be.SelectReasonForCancellation(reason);
	}
	@Given("user selects the cancellation reason on cancel residency screen as {string},{string} and {string}")
	public void user_selects_the_cancellation_reason_on_cancel_residency_screen_as_and(String string, String string2, String string3) {
	    be.VerifyCancelReasons(string, string2, string3);
	}
	@Then("user select worker profile with Active status {string} and clicked on Cancel Residency")
	public void user_select_worker_profile_with_active_status_and_clicked_on_cancel_residency(String string) {
	    be.SelectProfileForCancellation(string);
	}
	@And("user selects the cancellation reason on cancel residency screen as {string},{string},{string} and {string}")
	public void user_selects_the_cancellation_reason_on_cancel_residency_screen_as_and(String string, String string2, String string3, String string4) {
	    be.VerifyCancelReasons(string, string2, string3, string4);
	}
	@Then("user redirects to personal details page and validating first section for inside country")
	public void user_redirects_to_personal_details_page_and_validating_first_section_for_inside_country(io.cucumber.datatable.DataTable dataTable) {
	    be.EnterStaticDataIntoFirstSectionofPersonalDetails(dataTable);
	} 

	@Then("user redirects to passport details page and validating below elements for inside country")
	public void user_redirects_to_passport_details_page_and_validating_below_elements_for_inside_country(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    be.EnterStaticDataIntoPassportDetails(dataTable);
	}
	@Then("user navigates to dashboard page and selects profile with {string} status and name {string}")
	public void user_navigates_to_dashboard_page_and_selects_profile_with_status_and_name(String status, String name) {
	     be.SelectProfileWithStatusAndName(status,name);
	}
	@Given("user selects New Residency")
	public void user_selects_new_residency() {
	     be.ClickOnNewResidency();
	}

	@When("user verify the Change Status Stepper should be {string}")
	public void user_verify_the_change_status_stepper_should_be(String status) {
	     be.StepperStatusVerification(status,false);
	}

	@Then("user clicks on Start button on stepper")
	public void user_clicks_on_start_button_on_stepper() {
	     be.ClickOnStartButton();
	}
	@Then("user fill the data if pending and clicks on Continue buttton")
	public void user_fill_the_data_if_pending_and_clicks_on_continue_buttton() {
	     be.FillPendingDataForChangeStatusOnReviewScreen();
	}
	@When("user verify the Medical Test- DAHC Stepper should be {string}")
	public void user_verify_the_medical_test_dahc_stepper_should_be(String status) {
		 be.StepperStatusVerification(status,true);
	}
	@Given("user verify the elements on Medical screen")
	public void user_verify_the_elements_on_medical_screen() {
	     be.VerifyMedicalScreen();
	}
	@Then("user selects the fitness center based on urgency type then it should be visible in list")
	public void user_selects_the_fitness_center_based_on_urgency_type_then_it_should_be_visible_in_list() {
	     be.VerifyMedicalFitnessCentersScreen();
	}
	@Given("user selects first fitness center then again should be able to change center")
	public void user_selects_first_fitness_center_then_again_should_be_able_to_change_center() {
	     be.VerifyMedicalFitnessCentersCanChange();
	}
	@Then("user enters the value on medical screen and click save and exit button")
	public void user_enters_the_value_on_medical_screen_and_click_save_and_exit_button() {
	    be.EnterDataForMedicalScreen();
	    be.ClickSaveAndExitButton();
	}
	@Then("user open the same application and values in medical test section should be there with {string} status and name {string}")
	public void user_open_the_same_application_and_values_in_medical_test_section_should_be_there_with_status_and_name(String string, String string2) {
	     be.OpenSameApplicationForDataVerification(string, string2);
	}
	@Then("user click on {string} button which container contains {string} status")
	public void user_click_on_button_which_container_contains_status(String button, String status) {
	     be.ClickOnButtonWithStatus(status,button);
	}
	@Given("user verify the medical test screen elements")
	public void user_verify_the_medical_test_screen_elements() {
	     be.VerifyMedicalTestScreen();
	}
	@Then("user enters the value on medical screen and click on continue button")
	public void user_enters_the_value_on_medical_screen_and_click_on_continue_button() {
		  be.EnterDataForMedicalScreen();
		  be.ClickOnContinueButton();
	}
	@Given("user verify that medical certificate and payment receipt should be present with {string} button")
	public void user_verify_that_medical_certificate_and_payment_receipt_should_be_present_with_button(String button) {
		be.VerifyButtonWithMessage("Medical Certificate",button);
		be.VerifyButtonWithMessage("Payment Receipt",button);
	}
	@Then("user verify stepper status as {string} and {string} should be enabled")
	public void user_verify_stepper_status_as_and_should_be_enabled(String status, String button) {
		be.VerifyStatusOnStepperAndButton(status,button);
	}
	@Given("user verify status of stepper as {string} and {string} button should be present")
	public void user_verify_status_of_stepper_as_and_button_should_be_present(String status, String button) {
		be.VerifyStatusOnStepperAndButton(status,button);
	}
	@Then("user navigates back to Dashboard page and open the same application using {string}")
	public void user_navigates_back_to_dashboard_page_and_open_the_same_application(String status) {
	    be.OpenSameApplicationFromDashboard(status);
	}
	@When("user naviagtes to Domestic Worker screen and Verify button is unclickable")
	public void user_naviagtes_to_Domestic_Worker_screenand_clicks_on_back_button() throws InterruptedException {
		be.ClickOnResidencyButton(); 
	}
	@Then("user verify the {string} stepper should not be enabled for a worker whose medical result is unfit")
	public void user_verify_the_stepper_should_not_be_enabled_for_a_worker_whose_medical_result_is_unfit(String status) {
	     be.VerifyStepperIsDisabled(status);
	}

    @When("user clicks on view button and navigates to Entry Permit")
	public void user_clicks_on_view_button_and_navigates_to_Entry_Permit_screen() {
	be.ClickOnViewButtonDomesticWorker();
	}
	
    @Then("user verify EP view screen should contain the AppNumber mohreref and status")
    public void user_verify_ep_view_screen_should_contain_the_app_number_mohreref_and_status() {
       be.VerifyEntryPermitPage();
    }

    @When("user verify that {string} should be enabled")
    public void user_verify_that_should_be_enabled(String status) { 
    	be.VerifyStepperIsEnabled(status);
    }
    
    @Then("User should  able to validate error Message {string}")
    public void user_should_able_to_validate_erroe_message(String string) {
        be.VerifyErrorMessage(string);
    }

    @Then("user redirects to passport details page and enter Passport validity less than six month")
    public void user_redirects_to_passport_details_page_and_enter_passport_validity_less_than_six_month(io.cucumber.datatable.DataTable dataTable) {
      be.EnterExpiryDateLessThan180DaysIntoPassportDetails(dataTable);
    }

    @Then("user  verify EP view screen should contain the Entry PermitNo Issue Date and Expiry Date")
    public void user_verify_ep_view_screen_should_contain_the_entry_permit_no_issue_date_and_expiry_date() {
       be.VerifyAllEntryPermitPage();
    }
    
    @Then("user verify the forms that be downloaded")
    public void user_verify_the_forms_that_be_downloaded() throws IOException, InterruptedException {
       be.VerifyWorkerContractDownloadedForms();
       be.VerifyPaymentReceiptDownloadedForms();	
    }
    
    @Then("user verify New Work Entry Permit Stepper should be with status {string}")
    public void user_verify_new_work_entry_permit_stepper_should_be_with_status(String string) {
    	be.VerifyStepperIsEnabled(string);
    
    }
    
    @When("user verify payment details mentioned in the payment receipt should be same as the payment made")
    public void user_verify_payment_details_mentioned_in_the_payment_receipt_should_be_same_as_the_payment_made() throws IOException, InterruptedException {
    	be.VerifyPdfPayment();
    }
    @Then("user verify the alignment of the view button")
    public void user_verify_the_alignment_of_the_view_button() {
        be.VerifyViewButtonsAlignment();
        
    }
    @Then("user verify the {string} application status in the stepper should be displayed in red")
    public void user_verify_the_rejected_application_status_in_the_stepper_should_be_displayed_in_red(String text) throws IOException, InterruptedException{
       be.VerifyColorForRedConfig(text);
    }
    @Then("user verify the {string} status in the Dashboard should be displayed in green")
    public void user_verify_the_active_entry_permit_status_in_the_dashboard_should_be_displayed_in_green(String text) throws IOException, InterruptedException {
       be.VerifyColorForGreenConfig(text);
    }
   
    @Then("user verify the {string} option should be displayed in red color")
    public void user_verify_the_option_should_be_displayed_in_red_color(String text) throws StreamReadException, DatabindException, IOException, InterruptedException  {
       be.VerifyColorForDarkRedConfig(text);
    }
    @Then("user verify the {string} and not started status should be in blue")
    public void user_verify_the_draft_and_not_started_status_should_be_in_blue(String text) throws IOException, InterruptedException {
     be.VerifyColorForBlueConfig(text);
    }
    @Then("user verify the {string} status should be displayed in Orange")
    public void user_verify_the_status_should_be_displayed_in_orange(String string) throws IOException, InterruptedException {
       be.VerifyColorForOrangeConfig(string);
    }

    @Then("user navigates to the document upload page without uploading mandatory documents")
    public void user_navigates_to_the_document_upload_page_without_uploading_mandatory_documents() {
      be.AssertingElementsOnDocumentsScreen();
    }
    @When("user selects the checkbox")
    public void user_selects_the_checkbox() {
       be.ClickOnCheckboxAndVerifyButton();
    }
    @Then("user should not be able to proceed to the next step and {string} button should be disable")
    public void user_should_not_be_able_to_proceed_to_the_next_step_and_button_should_be_disable(String button) {
        be.VerifyButton(button);
    }
    @When("user verify the Content of Payment receipt")
    public void user_verify_the_content_of_payment_receipt() throws IOException, InterruptedException {
        be.VerifyPdfPayment();
    }
    @Then("user navigates to dashboard page and click on history icon")
    public void user_navigates_to_dashboard_page_and_click_on_history_icon() {
       be.ClickOnHistoryicon();
    }
    @Then("user navigates to History page and selects profile with {string} status and name {string}")
    public void user_navigates_to_history_page_and_selects_profile_with_status_and_name(String status, String name) {
        be.SelectHistoryProfileWithStatusAndName(status, name);
    }
    @Then("user verify the Application Status History")
    public void user_verify_the_application_status_history(DataTable dataTable) {
    be.VerifyHistoryScreen(dataTable);
    }

    @Then("user verify document name should be displayed with remove icon")
    public void user_verify_document_name_should_be_displayed_with_remove_icon() {
       be.VerifyDoccumentsRemoveIcon();
    }
   @Then("user verify {string} button should be enabled")
   public void user_verify_button_should_be_enabled(String button) {
   be.VerifyEnabledButton(button);
   }
   @When("user clicks on remove icon and the document should be removed")
   public void user_clicks_on_remove_icon_and_the_document_should_be_removed() {
   be.ClickOnDoccumentsRemoveIcon();
   
   }
   @When("user verify attach icons should be displayed")
   public void user_verify_attach_icons_should_be_displayed() {
   be.VerifyAttachButton();
   }
   @Then("user verify {string} button should remain disabled until the mandatory documents and E-Sign are completed")
   public void user_verify_button_should_remain_disabled_until_the_mandatory_documents_and_e_sign_are_completed(String button) {
   be.VerifyDoccumentsDisabledButton(button);
   }
   @When("user uploads a different document in the same place")
   public void user_uploads_a_different_document_in_the_same_place() {
   be.UploadDocument();
   }
   @Then("user click on {string} button")
   public void user_click_on_button(String button) {
   be.ClickOnButton(button);
   }
   @Then("user verify the document uploaded should be the same as the one viewed")
   public void user_verify_the_document_uploaded_should_be_the_same_as_the_one_viewed() {
       be.VerifyDocuments();
   }
   @Then("user click on {string} button then user should navigates to documents page")
   public void user_click_on_button_then_user_should_navigates_to_documents_page(String button) {
	  be.ClickOnButton(button);
   }
   @When("user click on {string}")
   public void user_click_on(String button) {
       be.ClickOnoptions(button);
   }
   @Then("user click on {string} button and view policy number")
   public void user_click_on_button_and_view_policy_number(String button) {
	   be.ClickOnButton(button);
	   be.VerifyPolicyNo();
   }
   @When("user click on View button and download the receipt and click on the back arrow")
   public void user_click_on_view_button_and_download_the_receipt_and_click_on_the_back_arrow() throws IOException, InterruptedException {
       be.DownloadInsuranceReceipt();
   }
   @When("user validating second section for renew residency")
   public void user_validating_second_section_for_renew_residency(DataTable dataTable) {
      be.EnterRenewDataIntoSecondSectionofPersonalDetails(dataTable);
   }
   @Then("user validating third section for renew residency")
   public void user_validating_third_section_for_renew_residency(DataTable dataTable) {
      be.EnterRenewEnterDataIntoThirdSectionofPersonalDetails(dataTable);
   }
   @Then("user validating fourth section for renew residency")
   public void user_validating_fourth_section_for_renew_residency(io.cucumber.datatable.DataTable dataTable) {
      be.EnterRenewEnterDataIntoFourthSectionofPersonalDetails(dataTable);
   }
   @Then("user redirects to passport details page and validating below elements for inside country renew residency")
   public void user_redirects_to_passport_details_page_and_validating_below_elements_for_inside_country_renew_residency(DataTable dataTable) {
       be.EnterRenewStaticDataIntoPassportDetails(dataTable);
   }
   @Then("user navigates to residency duration page and verify field")
   public void user_navigates_to_residency_duration_page_and_verify_field(DataTable dataTable) {
	   be.VerifyResidencyDuration(dataTable);
   }
   @Then("user selects the fitness center based on urgency type then fill the  details")
   public void user_selects_the_fitness_center_based_on_urgency_type_then_fill_the_details() {
       be.EnterRenewResidencyDataForMedicalScreen();
   }
   @Then("user navigates to document upload page and uploading the mandatory documents for renew residency")
   public void user_navigates_to_document_upload_page_and_uploading_the_mandatory_documents_for_renew_residency() {
       be.UploadDocumentRenewResidency();
   }
   @Then("user naviagtes to DHA payment page and click on pay button")
   public void user_naviagtes_to_dha_payment_page_and_click_on_pay_button() {
      be.DHAPayment();
   }
   @AfterStep
	public void addScreenShot(Scenario scenario) {
		if (scenario.isFailed()) {
			// Check if the driver supports taking screenshots
			if (driver instanceof TakesScreenshot) {
				TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
 
				// Check if getBddType() returns null
				if (scenario.getName() != null) {
					String scenarioName = scenario.getName();
					byte[] screenshot = screenshotDriver.getScreenshotAs(OutputType.BYTES);
					scenario.attach(screenshot, "image/png", scenarioName);
				} else {
					System.out.println("Scenario name is null. Cannot attach screenshot.");
				}
			} else {
				System.out.println("Driver does not support taking screenshots");
			}
		}
	}
}
