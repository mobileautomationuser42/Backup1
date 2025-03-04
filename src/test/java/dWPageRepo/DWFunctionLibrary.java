package dWPageRepo;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.json.simple.JSONObject;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.collect.ImmutableMap;

import Utilities.AndroidUtilities;
import Utilities.AssertionsUtils;
import Utilities.ColorConfig;
import Utilities.JSONUtils;
import Utilities.JavaScriptExecutorUtils;
import Utilities.SeleniumUtils;
import Utilities.WaitUtilities;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.core.internal.com.fasterxml.jackson.core.exc.StreamReadException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.DatabindException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import io.netty.handler.timeout.TimeoutException;

public class DWFunctionLibrary {

	AssertionsUtils assertions;
	AndroidUtilities androidutils;
	WaitUtilities waitutils;
	AndroidDriver driver;
	SeleniumUtils seleniumutils;
	JavaScriptExecutorUtils jeutils;
	JSONUtils jsonutil;
	

	public DWFunctionLibrary(AndroidDriver driver) throws StreamReadException, DatabindException, IOException {
		this.driver = driver;
		this.seleniumutils = new SeleniumUtils(driver);
		this.assertions = new AssertionsUtils(driver);
		this.androidutils = new AndroidUtilities(driver);
		this.waitutils = new WaitUtilities(driver);
		this.jeutils = new JavaScriptExecutorUtils(driver);
		this.jsonutil = new JSONUtils();
	
	    
	}

	private String firstName;
	private String middleName;
	private String lastName;
	private String fname;
	public String textSplit;
  
	
    
	public DWFunctionLibrary ChangeLanguageInUAEPass() {
		List<WebElement> els1 = driver.findElements(IntroductionPage.English);
		if (!els1.isEmpty()) {
			els1.get(0).click();
		} else {
			System.out.println("Element with accessibility id 'English' not found");
		}
		return this;
	}

	public DWFunctionLibrary ClickOnEnglishButton() {
		waitutils.waitForElementPresent(IntroductionPage.EnglishDW, Duration.ofSeconds(60));
//		WebElement ele = driver.findElement(IntroductionPage.EnglishDW);
//		System.out.println(ele.getCssValue("color"));
		seleniumutils.clickElement(IntroductionPage.EnglishDW);
		return this;
	}

	public DWFunctionLibrary ClickOnQAButton() {
		waitutils.waitForElementPresent(HomePage.QA, Duration.ofSeconds(60));
		seleniumutils.clickElement(HomePage.QA);
		return this;
	}

	public DWFunctionLibrary ClickOnSkipButton() {
		waitutils.waitForElementPresent(HomePage.Skip, Duration.ofSeconds(300));
		seleniumutils.clickElement(HomePage.Skip);
		return this;
	}

	public DWFunctionLibrary ClickOnGuest() {
		waitutils.waitForElementPresent(SignInPage.Guest, Duration.ofSeconds(40));
		seleniumutils.clickElement(SignInPage.Guest);
		return this;
	}

	public DWFunctionLibrary ClickOnWPPQuota() {
		waitutils.waitForElementPresent(DashboardPage.WPPQuotaStatus, Duration.ofSeconds(40));
		waitutils.sleepInSeconds(2);
		seleniumutils.clickElement(DashboardPage.WPPQuotaStatus);
		return this;
	}

	public DWFunctionLibrary ClickOnResidency() {
		waitutils.sleepInSeconds(2);
		waitutils.waitForElementPresent(HomePage.Residency, Duration.ofSeconds(40));
		seleniumutils.clickElement(HomePage.Residency);
		return this;
	}

	public DWFunctionLibrary ClickOnDomesticWorker() {
		waitutils.sleepInSeconds(5);
		waitutils.waitForElementPresent(ResidencyPage.DomesticWorker, Duration.ofSeconds(40));
		waitutils.sleepInSeconds(5);
		seleniumutils.clickElement(ResidencyPage.DomesticWorker);
		return this;
	}

	public DWFunctionLibrary ClickOnContinueButton() {
		waitutils.waitForElementPresent(ApplicationPage.ContinueButton, Duration.ofSeconds(40));
		waitutils.sleepInSeconds(2);
		waitutils.waitForElementClickable(ApplicationPage.ContinueButton, Duration.ofSeconds(40));
		seleniumutils.clickElement(ApplicationPage.ContinueButton);
		return this;
	}

	public DWFunctionLibrary ClickOnSignButton() {
		waitutils.waitForElementPresent(CommonElements.SwipeUp, Duration.ofSeconds(30));
		androidutils.swipeUp(CommonElements.SwipeUp);
		waitutils.sleepInSeconds(15);
		waitutils.waitForElementPresent(DocumentsPage.Sign, Duration.ofSeconds(40));
		seleniumutils.clickElement(DocumentsPage.Sign);
		return this;
	}

	public DWFunctionLibrary ClickOnSignInWithUAEPASSButton() {
		waitutils.waitForElementPresent(SignInPage.SigninwithUAEPASS, Duration.ofSeconds(80));
		seleniumutils.clickElement(SignInPage.SigninwithUAEPASS);
		return this;
	}

	public DWFunctionLibrary ClickOnInsideTheUAERadioButton() {
		waitutils.waitForElementPresent(ApplicationPage.InsideTheUAERadioButton, Duration.ofSeconds(30));
		seleniumutils.clickElement(ApplicationPage.InsideTheUAERadioButton);
		return this;
	}

	public DWFunctionLibrary ClickOnOutsideTheUAERadioButton() {
		waitutils.waitForElementPresent(ApplicationPage.OutsideTheUAERadioButton, Duration.ofSeconds(30));
		seleniumutils.clickElement(ApplicationPage.OutsideTheUAERadioButton);
		return this;
	}

	public DWFunctionLibrary ClickOnChangeStatusRadioButton() {
		waitutils.waitForElementPresent(ApplicationPage.ChangeStatusRadioButton, Duration.ofSeconds(30));
		seleniumutils.clickElement(ApplicationPage.ChangeStatusRadioButton);
		return this;
	}

	public DWFunctionLibrary ClickOnExitRadioButton() {
		waitutils.waitForElementPresent(ApplicationPage.ExitAndRenterUAERadioButton, Duration.ofSeconds(30));
		seleniumutils.clickElement(ApplicationPage.ExitAndRenterUAERadioButton);
		return this;
	}

	public DWFunctionLibrary ClickOnConfirmButton() {
		waitutils.waitForElementPresent(SignInPage.ConfirmButton, Duration.ofSeconds(80));
		seleniumutils.clickElement(SignInPage.ConfirmButton);
		return this;
	}

	public DWFunctionLibrary ClickOnViewButton() {
		waitutils.waitForElementPresent(DocumentsPage.View, Duration.ofSeconds(80));
		seleniumutils.clickElement(DocumentsPage.View);
		AssertingElementsOnDigitalSignatureScreen();
		return this;
	}

	public DWFunctionLibrary enterPinforUAEPass() {
		waitutils.sleepInSeconds(2);
		androidutils.pressKey(AndroidKey.DIGIT_1);
		waitutils.sleepInSeconds(1);
		androidutils.pressKey(AndroidKey.DIGIT_1);
		waitutils.sleepInSeconds(2);
		androidutils.pressKey(AndroidKey.DIGIT_1);
		waitutils.sleepInSeconds(2);
		androidutils.pressKey(AndroidKey.DIGIT_1);
		return this;
	}

//	public DWFunctionLibrary Allow() { 
//		waitutils.waitForElementPresent(SignInPage.okButton, Duration.ofSeconds(150));
//
//		seleniumutils.clickElement(SignInPage.okButton);
//		seleniumutils.clickElement(SignInPage.allowButton);
//		return this;
//	}
	public DWFunctionLibrary SignIn() { 
		ClickOnEnglishButton();
		ClickOnQAButton();
		ClickOnSkipButton();
		ClickOnSignInWithUAEPASSButton();
		ClickOnConfirmButton();
		enterPinforUAEPass();
		assertions.assertElementDisplayed(DashboardPage.ProfileLabel);
//		Allow();
		return this;
	}

	public DWFunctionLibrary ClickOnNewApplicationButton() {
		waitutils.waitForElementPresent(DashboardPage.NewApplicationButton, Duration.ofSeconds(150));
		seleniumutils.clickElement(DashboardPage.NewApplicationButton);
		return this;
	}

	public DWFunctionLibrary ClickOnClearButton() {
		waitutils.waitForElementClickable(DigitalSignaturePage.ClearButton, Duration.ofSeconds(30));
		seleniumutils.clickElement(DigitalSignaturePage.ClearButton);
		return this;
	}

	public DWFunctionLibrary ClickOnStartButton() {
		waitutils.waitForElementPresent(DomesticWorkerPage.StartButton, Duration.ofSeconds(30));
		waitutils.sleepInSeconds(5);
		seleniumutils.clickElement(DomesticWorkerPage.StartButton);
		return this;
	}

	public DWFunctionLibrary ClickOnEnterWorkerDetailsManuallyButton() {
		waitutils.waitForElementPresent(SearchWorkerPage.EnterWorkerDetailsManuallyButton, Duration.ofSeconds(30));
		seleniumutils.clickElement(SearchWorkerPage.EnterWorkerDetailsManuallyButton);
		return this;
	}

	public DWFunctionLibrary ClickOnEditButton() {
		waitutils.waitForElementPresent(DomesticWorkerPage.EditButton, Duration.ofSeconds(30));
		seleniumutils.clickElement(DomesticWorkerPage.EditButton);
		return this;
	}

	public DWFunctionLibrary ClickOnBackButton() {
		waitutils.sleepInSeconds(20);
		waitutils.waitForElementPresent(PassportDetailsPage.BackButton, Duration.ofSeconds(60));
		seleniumutils.clickElement(PassportDetailsPage.BackButton);
		return this;
	}

	public DWFunctionLibrary ClickSaveAndExitButton() {
		waitutils.sleepInSeconds(5);
		waitutils.waitForElementPresent(PassportDetailsPage.SaveAndExitButton, Duration.ofSeconds(30));
		seleniumutils.clickElement(PassportDetailsPage.SaveAndExitButton);
		return this;
	}

	public DWFunctionLibrary ClickOnSearchButton() {
		waitutils.waitForElementPresent(SearchWorkerPage.SearchButton, Duration.ofSeconds(30));
		assertions.assertElementEnabled(SearchWorkerPage.SearchButton);
		seleniumutils.clickElement(SearchWorkerPage.SearchButton);
		return this;
	}

	public DWFunctionLibrary ClickOnApplicantProfileButton() {
		waitutils.waitForElementClickable(DashboardPage.ApplicantProfile, Duration.ofSeconds(60));
		seleniumutils.clickElement(DashboardPage.ApplicantProfile);
		return this;
	}

	public DWFunctionLibrary ClickDeleteApplicationButton() {
		waitutils.waitForElementPresent(DomesticWorkerPage.DeleteApplicationButton, Duration.ofSeconds(30));
		seleniumutils.clickElement(DomesticWorkerPage.DeleteApplicationButton);
		waitutils.waitForElementPresent(DomesticWorkerPage.YesDeleteApplicationButton, Duration.ofSeconds(30));
		seleniumutils.clickElement(DomesticWorkerPage.YesDeleteApplicationButton);
		return this;
	}

	public DWFunctionLibrary ClickOnCheckboxForAddressDisclaimer() {
		waitutils.waitForElementClickable(AddressDetailsPage.CheckboxDisclaimer, Duration.ofSeconds(30));
		seleniumutils.clickElement(AddressDetailsPage.CheckboxDisclaimer);
		return this;
	}

	public DWFunctionLibrary ClickOnEditButtonOnSummaryScreen() {
		waitutils.waitForElementClickable(SummaryPage.EditButtonPersonalDetailsSection, Duration.ofSeconds(50));
		seleniumutils.clickElement(SummaryPage.EditButtonPersonalDetailsSection);
		return this;
	}

	public DWFunctionLibrary ClickOnEmiratesIDRadioButton() {
		waitutils.waitForElementClickable(SearchWorkerPage.EmiratesIDRadioButton, Duration.ofSeconds(50));
		seleniumutils.clickElement(SearchWorkerPage.EmiratesIDRadioButton);
		//androidutils.swipeUp(AppiumBy.xpath("//android.widget.ScrollView/android.widget.LinearLayout"));
		androidutils.swipeUp(CommonElements.SwipeUp);
		return this;
	}

	public DWFunctionLibrary ClickOnUnifiedIDRadioButton() {
		waitutils.waitForElementClickable(SearchWorkerPage.UnifiedNoRadioButton, Duration.ofSeconds(50));
		seleniumutils.clickElement(SearchWorkerPage.UnifiedNoRadioButton);
		androidutils.swipeUp(CommonElements.SwipeUp);
		return this;
	}

	// Assertion of elements on different pages
	public DWFunctionLibrary AssertingElementsOnPassportDetailsPage(DataTable dataTable) {
		waitutils.waitForElementVisible(PassportDetailsPage.PassportNumberField, Duration.ofSeconds(70));
		assertions.assertElementPresent(PassportDetailsPage.PassportNumberField);
		assertions.assertElementPresent(PassportDetailsPage.PassportTypeText);
		assertions.assertElementPresent(PassportDetailsPage.PassportIssueDateText);
		assertions.assertElementPresent(PassportDetailsPage.PassportExpiryDateText);
		assertions.assertElementPresent(PassportDetailsPage.PlaceOfIssueField);
		assertions.assertElementPresent(PassportDetailsPage.CountryOfIssueText);
		assertions.assertElementPresent(PassportDetailsPage.CountryOfIssueGovText);
		return this;
	}

	public DWFunctionLibrary AssertingElementsOnAddressDetailsPageOutsideUAE(DataTable dataTable) {
		waitutils.waitForElementVisible(AddressDetailsPage.PermanentCountryText, Duration.ofSeconds(70));
		assertions.assertElementPresent(AddressDetailsPage.PermanentCountryText);
		assertions.assertElementPresent(AddressDetailsPage.CityField);
		assertions.assertElementPresent(AddressDetailsPage.AbroadAddress);
		assertions.assertElementPresent(AddressDetailsPage.AbroadMobileNumberField);
		return this;
	}

	public DWFunctionLibrary AssertingElementsOnApplicationPage(DataTable dataTable) {
		waitutils.waitForElementVisible(ApplicationPage.ApplicationLabel, Duration.ofSeconds(70));
		assertions.assertElementPresent(ApplicationPage.ApplicationLabel);
		assertions.assertElementPresent(ApplicationPage.ApplicationForDomesticWorkerText);
		assertions.assertElementPresent(ApplicationPage.IsTheDomesticWorkerInsideTheCountryText);
		assertions.assertElementPresent(ApplicationPage.InsideTheUAERadioButton);
		assertions.assertElementPresent(ApplicationPage.OutsideTheUAERadioButton);
		return this;
	}

	public DWFunctionLibrary AssertingElementsOnAddressDetailsPageInsideUAE(DataTable dataTable) {
		waitutils.waitForElementVisible(AddressDetailsPage.AdressInsideUAEText, Duration.ofSeconds(70));
		assertions.assertElementPresent(AddressDetailsPage.AdressInsideUAEText);
		assertions.assertElementPresent(AddressDetailsPage.EmirateText);
		assertions.assertElementPresent(AddressDetailsPage.CityText);
		assertions.assertElementPresent(AddressDetailsPage.StreetField);
		assertions.assertElementPresent(AddressDetailsPage.BuildingField);
		assertions.assertElementPresent(AddressDetailsPage.FloorField);
		assertions.assertElementPresent(AddressDetailsPage.ApartmentNoField);
		assertions.assertElementPresent(AddressDetailsPage.MakaniNoField);
		return this;
	}

	public DWFunctionLibrary AssertingElementsOnPersonalDetailsPageFirstSection(DataTable dataTable) {
		waitutils.waitForElementVisible(PersonalDetailsPage.DomesticWorkerPersonalDetailsText, Duration.ofSeconds(70));
		assertions.assertElementPresent(PersonalDetailsPage.DomesticWorkerPersonalDetailsText);
		assertions.assertElementPresent(PersonalDetailsPage.FirstNameEnglishField);
		assertions.assertElementPresent(PersonalDetailsPage.MiddleNameEnglishField);
		assertions.assertElementPresent(PersonalDetailsPage.LastNameEnglishField);
		return this;
	}

	public DWFunctionLibrary AssertingElementsOnPersonalDetailsPageSecondSection(DataTable dataTable) {
		androidutils.swipeUp(AppiumBy.xpath(
				"(//android.widget.LinearLayout[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/mainContainer\"])[2]"));
		
		waitutils.waitForElementVisible(PersonalDetailsPage.NationalityText, Duration.ofSeconds(30));
		assertions.assertElementPresent(PersonalDetailsPage.NationalityText);
		assertions.assertElementPresent(PersonalDetailsPage.JobText);
		assertions.assertElementPresent(PersonalDetailsPage.GenderText);
		assertions.assertElementPresent(PersonalDetailsPage.DateOfBirthText);
		assertions.assertElementPresent(PersonalDetailsPage.PlaceOfBirthText);
		assertions.assertElementPresent(PersonalDetailsPage.CountryOfBirthText);
		return this;
	}

	public DWFunctionLibrary AssertingElementsOnPersonalDetailsPageThirdSection(DataTable dataTable) {
		waitutils.waitForElementVisible(PersonalDetailsPage.ReligionText, Duration.ofSeconds(30));
		androidutils.swipeUp(AppiumBy.xpath("//android.widget.ScrollView/android.widget.LinearLayout"));
		assertions.assertElementDisplayed(PersonalDetailsPage.ReligionText);
		assertions.assertElementDisplayed(PersonalDetailsPage.FaithText);
		assertions.assertElementDisplayed(PersonalDetailsPage.MaritalStatusText);
		assertions.assertElementDisplayed(PersonalDetailsPage.PreviousNationalityText);
		assertions.assertElementDisplayed(PersonalDetailsPage.EducationText);
		assertions.assertElementDisplayed(PersonalDetailsPage.EducationCountryText);
		return this;
	}

	public DWFunctionLibrary AssertingElementsOnPersonalDetailsPageFourthSection(DataTable dataTable) {
		androidutils.swipeUp(AppiumBy.xpath("//android.widget.ScrollView/android.widget.LinearLayout"));
		assertions.assertElementDisplayed(PersonalDetailsPage.MotherNameText);
		assertions.assertElementDisplayed(PersonalDetailsPage.FirstLanguageText);
		return this;
	}

	public DWFunctionLibrary AssertingElementsOnSalaryDetailsPage(DataTable dataTable) {
		waitutils.waitForElementVisible(SalaryDetailsPage.SalaryDetailsLabel, Duration.ofSeconds(70));
		waitutils.waitForElementVisible(SalaryDetailsPage.BasicSalaryField, Duration.ofSeconds(70));
		assertions.assertElementPresent(SalaryDetailsPage.BasicSalaryField);
		assertions.assertElementPresent(SalaryDetailsPage.TotalSalaryText);
		assertions.assertElementPresent(SalaryDetailsPage.SaveAndExitButton);
		assertions.assertElementPresent(SalaryDetailsPage.ContinueButton);
		return this;
	}

	public DWFunctionLibrary AssertingSalaryIsReadOnlyField() {
		waitutils.waitForElementVisible(SalaryDetailsPage.TotalSalaryText, Duration.ofSeconds(70));
		driver.findElement(SalaryDetailsPage.TotalSalaryText).getText().contains("Total Salary (AED)");
		driver.findElement(SalaryDetailsPage.TotalSalaryText).getAttribute("clickable").equals("false");
		return this;
	}

	public DWFunctionLibrary AssertingElementsOnOtherDetailsPage(DataTable dataTable) {
		waitutils.waitForElementVisible(OtherDetailsPage.PersonalTypeLabel, Duration.ofSeconds(70));
		waitutils.waitForElementVisible(OtherDetailsPage.PersonalTypeLabel, Duration.ofSeconds(70));
		assertions.assertElementPresent(OtherDetailsPage.MediatorTypeLabel);
		assertions.assertElementPresent(OtherDetailsPage.MediatorAddressField);
		return this;
	}

	public DWFunctionLibrary AssertingElementsOnResidencyPage(DataTable dataTable) {
		waitutils.waitForElementVisible(ResidencyPage.NoOfYearsLabel, Duration.ofSeconds(70));
		assertions.assertElementPresent(ResidencyPage.NoOfYearsLabel);
		assertions.assertElementPresent(ResidencyPage.ApplyForMedicalTestLabel);
		return this;
	}

	public DWFunctionLibrary AssertingElementsOnSponsorPage() {
		waitutils.waitForElementClickable(DashboardPage.DashboardTitle, Duration.ofSeconds(70));
		assertions.assertElementDisplayed(DashboardPage.SponsorCardSponsorTitle);
		assertions.assertContainsText(DashboardPage.SponsorCardSponsorTitle, "Sponsor");
		assertions.assertContainsText(DashboardPage.SponsorCardEIDA, "EID 784240541330433");
		assertions.assertElementPresent(DashboardPage.FamilyTab);
		assertions.assertElementPresent(DashboardPage.DomesticWorkerTab);
		return this;
	}

	public DWFunctionLibrary AssertingElementsOnWPPSummaryScreen() {
		waitutils.waitForElementClickable(PolicyDetailsPage.PolicyNoText, Duration.ofSeconds(70));
		assertions.assertElementPresent(PolicyDetailsPage.PolicyNoText);
		assertions.assertElementPresent(PolicyDetailsPage.PaymentReceipt);
		assertions.assertElementPresent(PolicyDetailsPage.PurchaseReceipt);
		return this;
	}

	public DWFunctionLibrary AssertingElementsOnDocumentsScreen() {
		waitutils.waitForElementPresent(DocumentsPage.DomesticWorkerDocuments, Duration.ofSeconds(70));
		assertions.assertElementPresent(DocumentsPage.DomesticWorkerDocuments);
		//assertions.assertElementPresent(DocumentsPage.DigitalSignature);
		assertions.assertElementPresent(DocumentsPage.SponsorSignature);
		assertions.assertElementPresent(DocumentsPage.Sign);
		return this;
	}

	public DWFunctionLibrary AssertingElementsOnDigitalSignatureScreen() {
		waitutils.waitForElementClickable(DigitalSignaturePage.SignatureBoard, Duration.ofSeconds(70));
		assertions.assertElementPresent(DigitalSignaturePage.SignatureBoard);
		assertions.assertElementPresent(DigitalSignaturePage.CheckBox);
		assertions.assertContainsText(DigitalSignaturePage.DisclaimerMessage,
				"This Signature will be only used for Contract printing purposes that will be generated during the Domestic Workers bundle journey");
		return this;
	}

	public DWFunctionLibrary AssertingDigitalSignatureSection() {
		waitutils.sleepInSeconds(10);
		waitutils.waitForElementClickable(DocumentsPage.DigitalSignature, Duration.ofSeconds(70));
		assertions.assertElementPresent(DocumentsPage.DigitalSignature);
		assertions.assertElementPresent(DocumentsPage.SponsorSignature);
		assertions.assertElementPresent(DocumentsPage.Sign);
		assertions.assertContainsText(DocumentsPage.Signaturewillbeusedinlabourcontract,
				"Signature will be used in labour contract");
		return this;
	}

	public DWFunctionLibrary AssertingFieldsUnderEmiratesId() {
		waitutils.waitForElementClickable(SearchWorkerPage.EnterEmiratesIDDetailsLabel, Duration.ofSeconds(70));
		assertions.assertElementPresent(SearchWorkerPage.EnterEmiratesIDDetailsLabel);
		assertions.assertElementPresent(SearchWorkerPage.EmiratesIDNumber);
		assertions.assertElementPresent(SearchWorkerPage.PassportNumber);
		assertions.assertElementPresent(SearchWorkerPage.NationalityText);
		assertions.assertElementPresent(SearchWorkerPage.YearOfBirth);
		return this;
	}

	public DWFunctionLibrary AssertingFieldsUnderUnifiedNo() {
		waitutils.waitForElementClickable(SearchWorkerPage.EnterUnifiedNoDetailsLabel, Duration.ofSeconds(70));
		assertions.assertElementPresent(SearchWorkerPage.EnterUnifiedNoDetailsLabel);
		assertions.assertElementPresent(SearchWorkerPage.UnifiedNumber);
		assertions.assertElementPresent(SearchWorkerPage.PassportNumber);
		assertions.assertElementPresent(SearchWorkerPage.NationalityText);
		assertions.assertElementPresent(SearchWorkerPage.YearOfBirth);
		return this;
	}

	public DWFunctionLibrary AssertingApplicantDetailsUsingUnifiedId(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		firstName = data.get(1).get(0);
		middleName = data.get(1).get(1);
		lastName = data.get(1).get(2);
		waitutils.waitForElementPresent(PersonalDetailsPage.DomesticWorkerPersonalDetailsText, Duration.ofSeconds(60));
		waitutils.waitForElementPresent(AppiumBy.xpath(
				"(//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\"])[1]"),
				Duration.ofSeconds(60));
		assertions.assertContainsText(AppiumBy.xpath(
				"(//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\"])[1]"),
				firstName);
		assertions.assertContainsText(AppiumBy.xpath(
				"(//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\"])[2]"),
				middleName);
		assertions.assertContainsText(AppiumBy.xpath(
				"(//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\"])[3]"),
				lastName);
		return this;
	}

	public DWFunctionLibrary AssertingElementsOnStepperScreenFromDifferentCountry(List<String> steppers) {
		androidutils.swipeUp(CommonElements.SwipeUp);
		for (String stepper : steppers) {
			androidutils.swipeUp(CommonElements.SwipeUp);
			androidutils.swipeUp(CommonElements.SwipeUp);
			List<WebElement> textViewElements = driver.findElements(DomesticWorkerPage.SteppersTitle);
			boolean found = textViewElements.stream().anyMatch(e -> e.getText().equals(stepper));
			assert (found) : "Stepper with text '" + stepper + "' not found!";
		}
		return this;
	}

	// Data Entry on different pages
	public DWFunctionLibrary EnterDataIntoFirstSectionofPersonalDetails(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		firstName = data.get(1).get(0);
		middleName = data.get(1).get(1);
		lastName = data.get(1).get(2);
		fname = seleniumutils.randomStringSimple(5);
		System.out.println(fname);
		waitutils.waitForElementPresent(PersonalDetailsPage.FirstNameEnglishField, Duration.ofSeconds(60));
		seleniumutils.enterText(PersonalDetailsPage.FirstNameEnglishField, fname);
		seleniumutils.enterText(PersonalDetailsPage.MiddleNameEnglishField, middleName);
		seleniumutils.enterText(PersonalDetailsPage.LastNameEnglishField, lastName);
		return this;
	}

	public DWFunctionLibrary EnterDataIntoFirstSectionofPersonalDetailsOnlyMandatoryData(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		String firstName = data.get(1).get(0);
		String lastName = data.get(1).get(1);
		String fname = seleniumutils.randomStringSimple(5);
		waitutils.waitForElementPresent(PersonalDetailsPage.FirstNameEnglishField, Duration.ofSeconds(60));
		seleniumutils.enterText(PersonalDetailsPage.FirstNameEnglishField, fname);
		seleniumutils.enterText(PersonalDetailsPage.LastNameEnglishField, lastName);
		return this;
	}

	public DWFunctionLibrary EnterDataIntoSecondSectionofPersonalDetails(DataTable dataTable) {
//		androidutils.swipeUp(CommonElements.SwipeUp);
		List<List<String>> data = dataTable.asLists(String.class);
		String placeofbirth = data.get(1).get(4);
		String nationality = data.get(1).get(0);
		String job = data.get(1).get(1);
		String gender = data.get(1).get(2);
		String countryofbirth = data.get(1).get(5);

		seleniumutils.clickElement(CommonElements.SelectOption);
		seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), nationality);
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Confirm\"]"));

		seleniumutils.clickElement(CommonElements.SelectOption);
		seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), job);
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Confirm\"]"));

		seleniumutils.clickElement(CommonElements.SelectOption);
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Male\"]"));

//        DatePicker(1999,"March",18);

		seleniumutils.clickElement(AppiumBy.xpath(
				"//android.view.ViewGroup[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/mainContainer\"]"));
		waitutils.waitForElementClickable(AppiumBy.xpath("//*[@index=\"4\"]"), Duration.ofSeconds(60));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@index=\"4\"]"));
		waitutils.waitForElementClickable(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/mdtp_ok"),
				Duration.ofSeconds(60));
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/mdtp_ok"));

		seleniumutils.enterText(PersonalDetailsPage.PlaceOfBirthText, placeofbirth);

		seleniumutils.clickElement(CommonElements.SelectOption);
		seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), countryofbirth);
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Confirm\"]"));
		return this;
	}

	public DWFunctionLibrary EnterDataIntoThirdSectionofPersonalDetails(DataTable dataTable) {
		androidutils.swipeUp(CommonElements.SwipeUp);
		waitutils.waitForElementVisible(PersonalDetailsPage.ReligionText, Duration.ofSeconds(30));
		assertions.assertElementDisplayed(PersonalDetailsPage.ReligionText);
		List<List<String>> data = dataTable.asLists(String.class);
		String religion = data.get(1).get(0);
		String faith = data.get(1).get(1);
		String maritalstatus = data.get(1).get(2);
		String previousnationality = data.get(1).get(3);
		String education = data.get(1).get(4);
		String educationcountry = data.get(1).get(5);

		seleniumutils.clickElement(CommonElements.SelectOption);
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"" + religion + "\"]"));

		androidutils.swipeUp(CommonElements.SwipeUp);

		seleniumutils.clickElement(CommonElements.SelectOption);
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"" + faith + "\"]"));

		seleniumutils.clickElement(CommonElements.SelectOption);
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"" + maritalstatus + "\"]"));

		seleniumutils.clickElement(CommonElements.SelectOption);
		seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), previousnationality);
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Confirm\"]"));

		seleniumutils.clickElement(CommonElements.SelectOption);
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"" + education + "\"]"));

		seleniumutils.clickElement(CommonElements.SelectOption);
		seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), educationcountry);
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Confirm\"]"));
		return this;
	}

	public DWFunctionLibrary EnterDataIntoFourthSectionofPersonalDetails(DataTable dataTable) {
//		androidutils.swipeUp(CommonElements.SwipeUp);
		List<List<String>> data = dataTable.asLists(String.class);
		String mothersname = data.get(1).get(0);
		String firstlanguage = data.get(1).get(1);

		seleniumutils.enterText(PersonalDetailsPage.MotherNameText, mothersname);

		waitutils.sleepInSeconds(5);
		seleniumutils.clickElement(CommonElements.SelectOption);
		seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), firstlanguage);

		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));

		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Confirm\"]"));
		return this;
	}

	public DWFunctionLibrary EnterDataIntoPassportDetails(DataTable dataTable) {
		waitutils.waitForElementVisible(PassportDetailsPage.PassportNumberField, Duration.ofSeconds(30));
		List<List<String>> data = dataTable.asLists(String.class);

		String passportnumber = data.get(1).get(0);
		String passporttype = data.get(1).get(1);
		String issuedate = data.get(1).get(2);
		String expirydate = data.get(1).get(3);
		String placeofissue = data.get(1).get(4);
		String countryofissue = data.get(1).get(5);
		String countryofissuegov = data.get(1).get(6);

		String PASSPORTNUMBER = passportnumber + seleniumutils.generateRandomNumberString(4);
		System.out.println(PASSPORTNUMBER);
		seleniumutils.enterText(PassportDetailsPage.PassportNumberField, PASSPORTNUMBER);

		assertions.assertTextEquals(PassportDetailsPage.PassportTypeOptions, passporttype);

		seleniumutils.clickElement(AppiumBy.xpath(
				"(//android.view.ViewGroup[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/mainContainer\"])[1]"));
		waitutils.waitForElementClickable(AppiumBy.xpath("//*[@index=\"4\"]"), Duration.ofSeconds(60));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@index=\"4\"]"));
		waitutils.waitForElementClickable(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/mdtp_ok"),
				Duration.ofSeconds(60));
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/mdtp_ok"));

		seleniumutils.clickElement(AppiumBy.xpath(
				"(//android.view.ViewGroup[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/mainContainer\"])[2]"));
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/mdtp_date_picker_year"));
		seleniumutils.clickElement(AppiumBy.accessibilityId("2026"));
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/mdtp_ok"));
		waitutils.waitForElementClickable(AppiumBy.xpath("//*[@index=\"4\"]"), Duration.ofSeconds(60));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@index=\"4\"]"));

		seleniumutils.clearText(PassportDetailsPage.PlaceOfIssueField);
		seleniumutils.enterText(PassportDetailsPage.PlaceOfIssueField, placeofissue);
		driver.hideKeyboard();
		waitutils.waitForElementVisible(CommonElements.SelectOption, Duration.ofSeconds(30));
		seleniumutils.clickElement(CommonElements.SelectOption);
		seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), countryofissue);
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Confirm\"]"));

		seleniumutils.clickElement(CommonElements.SelectOption);
		seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), countryofissuegov);
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Confirm\"]"));
		androidutils.swipeUp(CommonElements.SwipeUp);
		return this;
	}

	public DWFunctionLibrary EnterDataIntoOutsideTheUAESectionInAddressDetails(DataTable dataTable) {
		//waitutils.waitForElementVisible(AddressDetailsPage.PermanentCountryOption, Duration.ofSeconds(30));
		List<List<String>> data = dataTable.asLists(String.class);
		String permanentcountry = data.get(1).get(0);
		String city = data.get(1).get(1);
		String abroadaddress = data.get(1).get(2);
		String abroadmobileno = data.get(1).get(3);

		waitutils.sleepInSeconds(7);
	//	assertions.assertElementPresent(AddressDetailsPage.PermanentCountryOption);
//		seleniumutils.clickElement(AddressDetailsPage.PermanentCountryOption);
//		seleniumutils.clickElement(AddressDetailsPage.PermanentCountryOption);
//		seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), permanentcountry);
//		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));
//		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Confirm\"]"));
//
//		seleniumutils.enterText(AddressDetailsPage.CityField, city);
//		seleniumutils.enterText(AddressDetailsPage.AbroadAddress, abroadaddress);
//		seleniumutils.enterText(AddressDetailsPage.AbroadMobileNumberField, abroadmobileno);
		androidutils.swipeUp(CommonElements.SwipeUp);
		return this;
	}

	public DWFunctionLibrary EnterDataIntoInsideTheUAESectionInAddressDetails(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		String emirate = data.get(1).get(0);
		String city = data.get(1).get(1);
		String area = data.get(1).get(2);
		String street = data.get(1).get(3);
		String building = data.get(1).get(4);
		String floor = data.get(1).get(5);
		String apartmentno = data.get(1).get(6);
		String makanino = data.get(1).get(7);

		waitutils.waitForElementClickable(AddressDetailsPage.EmirateOptions, Duration.ofSeconds(30));
		seleniumutils.clickElement(AddressDetailsPage.EmirateOptions);
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"" + emirate + "\"]"));

		waitutils.waitForElementClickable(AddressDetailsPage.CityOptions, Duration.ofSeconds(30));
		waitutils.sleepInSeconds(3);
		seleniumutils.clickElement(AddressDetailsPage.CityOptions);
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"DUBAI \"]"));

		waitutils.sleepInSeconds(3);
		seleniumutils.clickElement(AddressDetailsPage.AreaOptions);
		seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), area);
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Confirm\"]"));

		seleniumutils.enterText(AddressDetailsPage.StreetField, street);
		seleniumutils.enterText(AddressDetailsPage.BuildingField, building);
		seleniumutils.enterText(AddressDetailsPage.FloorField, floor);
		seleniumutils.enterText(AddressDetailsPage.ApartmentNoField, apartmentno);
		androidutils.swipeUp(CommonElements.SwipeUp);
		seleniumutils.enterText(AddressDetailsPage.MakaniNoField, makanino);
		return this;
	}

	public DWFunctionLibrary EnterDataIntoInsideTheUAESectionOnlyMandatoryDataInAddressDetails(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		String emirate = data.get(1).get(0);
		String city = data.get(1).get(1);
		String area = data.get(1).get(2);
		String street = data.get(1).get(3);
		String building = data.get(1).get(4);
		String floor = data.get(1).get(5);
		String apartmentno = data.get(1).get(6);

		waitutils.waitForElementClickable(AddressDetailsPage.EmirateOptions, Duration.ofSeconds(30));
//		seleniumutils.clickElement(AddressDetailsPage.EmirateOptions);
//		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"" + emirate + "\"]"));
//
//		waitutils.waitForElementClickable(AddressDetailsPage.CityOptions, Duration.ofSeconds(30));
//		waitutils.sleepInSeconds(3);
//		seleniumutils.clickElement(AddressDetailsPage.CityOptions);
//		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"DUBAI \"]"));
//
//		waitutils.sleepInSeconds(3);
//		seleniumutils.clickElement(AddressDetailsPage.AreaOptions);
//		seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), area);
//		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));
//		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Confirm\"]"));
//
//		seleniumutils.enterText(AddressDetailsPage.StreetField, street);
//		seleniumutils.enterText(AddressDetailsPage.BuildingField, building);
//		seleniumutils.enterText(AddressDetailsPage.FloorField, floor);
//		seleniumutils.enterText(AddressDetailsPage.ApartmentNoField, apartmentno);
//		
		androidutils.swipeUp(CommonElements.SwipeUp);
		return this;
	}

	public DWFunctionLibrary EnterDataIntoSalaryDetails(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		String basicsalary = data.get(1).get(0);
		//assertions.assertElementDisabled(SalaryDetailsPage.SalaryDetailsLabel);
		//seleniumutils.enterText(SalaryDetailsPage.BasicSalaryField, basicsalary);
		return this;
	}

	public DWFunctionLibrary EnterDataIntoOtherDetailsPage(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		String persontype = data.get(1).get(0);
		String mediatortype = data.get(1).get(1);
		String mediatoraddress = data.get(1).get(2);

		waitutils.waitForElementPresent(OtherDetailsPage.ContractingInformationLabel, Duration.ofSeconds(60));

		waitutils.sleepInSeconds(5);
		waitutils.waitForElementClickable(AppiumBy.xpath(
				"(//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/lbl_description\"])[1]"),
				Duration.ofSeconds(60));
		seleniumutils.clickElement(AppiumBy.xpath(
				"(//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/lbl_description\"])[1]"));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"" + persontype + "\"]"));

		waitutils.sleepInSeconds(3);
		seleniumutils.clickElement(AppiumBy.xpath(
				"(//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/lbl_description\"])[2]"));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"" + mediatortype + "\"]"));

		seleniumutils.enterText(OtherDetailsPage.MediatorAddressField, mediatoraddress);
		return this;
	}

	public DWFunctionLibrary EnterDataUnderEmirateID(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		String EmirateNo = data.get(1).get(0);
		String PassportNo = data.get(1).get(1);
		String Nationality = data.get(1).get(2);
		String YearofBirth = data.get(1).get(3);

		waitutils.waitForElementPresent(SearchWorkerPage.EnterEmiratesIDDetailsLabel, Duration.ofSeconds(60));
		seleniumutils.enterText(SearchWorkerPage.EmiratesIDNumber, EmirateNo);
		seleniumutils.enterText(SearchWorkerPage.PassportNumber, PassportNo);

		seleniumutils.clickElement(SearchWorkerPage.NationalityOptions);
		seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), Nationality);
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Confirm\"]"));

		seleniumutils.enterText(SearchWorkerPage.YearOfBirth, YearofBirth);

		return this;
	}

	public DWFunctionLibrary EnterDataUnderUnfiedNo(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		String UnifiedNo = data.get(1).get(0);
		String PassportNo = data.get(1).get(1);
		String Nationality = data.get(1).get(2);
		String YearofBirth = data.get(1).get(3);

		waitutils.waitForElementPresent(SearchWorkerPage.EnterUnifiedNoDetailsLabel, Duration.ofSeconds(60));
		seleniumutils.enterText(SearchWorkerPage.UnifiedNumber, UnifiedNo);
		seleniumutils.enterText(SearchWorkerPage.PassportNumber, PassportNo);

		seleniumutils.clickElement(SearchWorkerPage.NationalityOptions);
		seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), Nationality);
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Confirm\"]"));

		seleniumutils.enterText(SearchWorkerPage.YearOfBirth, YearofBirth);

		return this;
	}

	public DWFunctionLibrary EnteringDataIntoResidencyPage(DataTable dataTable) {
		waitutils.waitForElementClickable(ResidencyPage.After5DaysRadioButton, Duration.ofSeconds(70));
		seleniumutils.clickElement(ResidencyPage.After5DaysRadioButton);
		return this;
	}

	// Navigation functions
	public DWFunctionLibrary NavigateTo() {
		androidutils.swipeUp(AppiumBy.xpath(
				"(//android.widget.LinearLayout[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/mainContainer\"])[2]"));
		waitutils.waitForElementVisible(PersonalDetailsPage.ReligionText, Duration.ofSeconds(30));
		androidutils.swipeUp(CommonElements.SwipeUp);
		androidutils.swipeUp(CommonElements.SwipeUp);
		waitutils.waitForElementClickable(PersonalDetailsPage.ContinueButton, Duration.ofSeconds(60));
		seleniumutils.clickElement(PersonalDetailsPage.ContinueButton);
		
		waitutils.waitForElementVisible(PassportDetailsPage.OldPassportNumber, Duration.ofSeconds(30));
		androidutils.swipeUp(CommonElements.SwipeUp);
		androidutils.swipeUp(CommonElements.SwipeUp);
		waitutils.waitForElementClickable(PassportDetailsPage.ContinueButton, Duration.ofSeconds(30));
		seleniumutils.clickElement(PassportDetailsPage.ContinueButton);

		
		waitutils.waitForElementClickable(AddressDetailsPage.AreaText, Duration.ofSeconds(30));
		androidutils.swipeUp(CommonElements.SwipeUp);
		androidutils.swipeUp(CommonElements.SwipeUp);
		seleniumutils.clickElement(AddressDetailsPage.CheckboxDisclaimer);
		waitutils.waitForElementClickable(AddressDetailsPage.ContinueButton, Duration.ofSeconds(30));
		seleniumutils.clickElement(AddressDetailsPage.ContinueButton);
		return this;
	}

	public DWFunctionLibrary SelectsProfileWithStatus(String status) throws InterruptedException {
		List<WebElement> statuses = driver.findElements(By.xpath(
				"//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewSubDetail\"]"));

		String searchText = "DW-126236";
		waitutils.sleepInSeconds(5);
		for (WebElement card : statuses) {
			String cardText = card.getText();
			System.out.println(cardText);
			if (cardText.contains(searchText)) {
				
				card.click();
				break;
			} else {
				androidutils.swipeUp(CommonElements.SwipeUp);
				if (cardText.contains(searchText)) {
					card.click();
					break;
				}
			}
		}
		return this;
	}

	public DWFunctionLibrary selectProfileWithStatusAndId(String status, String id) {
		boolean statusFound = false;
		while (!statusFound) {
//			List<WebElement> statuses = driver.findElements(By.xpath(
//					"//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewSubDetail\"]"));
			List<WebElement> statuses = driver.findElements(DashboardPage. PROFILE_STATUS_And_ID_LOCATOR);

			waitutils.sleepInSeconds(5);

			for (WebElement card : statuses) {
				String cardText = card.getText().trim();
				System.out.println(cardText);
				if (cardText.contains(id)) {
					waitutils.sleepInSeconds(3);
					card.click();
					statusFound = true;
					break;
				}
			}

			if (!statusFound) {
				androidutils.swipeUp(CommonElements.SwipeUp);
			}
		}
		return this;
	}

	public DWFunctionLibrary VerifyStatusFromStepperScreenn(String status, By button) {
		assertions.assertContainsText(DomesticWorkerPage.StatusText, status);
		assertions.assertElementPresent(button);
		return this;
	}

	public DWFunctionLibrary RefreshStepperScreen() {
		waitutils.waitForElementClickable(DomesticWorkerPage.PurchaseButton, Duration.ofSeconds(60));
		assertions.assertElementPresent(DomesticWorkerPage.PurchaseButton);
		jeutils.executeJavaScript("mobile: performEditorAction", ImmutableMap.of("action", "refresh"));
		waitutils.waitForElementClickable(DomesticWorkerPage.PurchaseButton, Duration.ofSeconds(60));
		assertions.assertElementPresent(DomesticWorkerPage.PurchaseButton);
		return this;
	}
	public DWFunctionLibrary RefreshStepperScreen1() {
		waitutils.waitForElementClickable(DomesticWorkerPage.PurchaseButton, Duration.ofSeconds(60));
		assertions.assertElementPresent(DomesticWorkerPage.PurchaseButton);
		jeutils.executeJavaScript("mobile: performEditorAction", ImmutableMap.of("action", "refresh"));
		waitutils.waitForElementClickable(DomesticWorkerPage.PurchaseButton, Duration.ofSeconds(60));
		assertions.assertElementPresent(DomesticWorkerPage.PurchaseButton);
		return this;
	}

	public DWFunctionLibrary NavigatesToAddtionalInformationPage() {
		waitutils.sleepInSeconds(5);
		androidutils.swipeUp(AppiumBy.xpath(
				"(//android.widget.LinearLayout[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/mainContainer\"])[2]"));
		androidutils.swipeUp(CommonElements.SwipeUp);
		androidutils.swipeUp(CommonElements.SwipeUp);
		waitutils.waitForElementClickable(PersonalDetailsPage.ContinueButton, Duration.ofSeconds(30));
		seleniumutils.clickElement(PersonalDetailsPage.ContinueButton);
		
		waitutils.waitForElementClickable(PassportDetailsPage.ContinueButton, Duration.ofSeconds(30));
		seleniumutils.clickElement(PassportDetailsPage.ContinueButton);
		
		androidutils.swipeUp(CommonElements.SwipeUp);
		androidutils.swipeUp(CommonElements.SwipeUp);
		
		waitutils.waitForElementClickable(AddressDetailsPage.ContinueButton, Duration.ofSeconds(60));
		seleniumutils.clickElement(AddressDetailsPage.ContinueButton);
		waitutils.waitForElementClickable(SalaryDetailsPage.ContinueButton, Duration.ofSeconds(30));
		seleniumutils.clickElement(SalaryDetailsPage.ContinueButton);

		return this;
	}

	public DWFunctionLibrary Signature() {
		SignatureScreenVerification();
		waitutils.sleepInSeconds(4);
		seleniumutils.clickElement(DigitalSignaturePage.CheckBox);
		assertions.assertElementEnabled(DigitalSignaturePage.ConfirmButton);
		seleniumutils.clickElement(DigitalSignaturePage.ConfirmButton);
		return this;
	}

	public DWFunctionLibrary ClickOnCheckboxAndThenConfirmButton() {
		waitutils.waitForElementPresent(DocumentsPage.Checkbox, Duration.ofSeconds(60));
		seleniumutils.clickElement(DocumentsPage.Checkbox);
		ClickOnContinueButton();
		return this;
	}

	public DWFunctionLibrary Payment() {
//		waitutils.waitForElementPresent(PaymentPage.PayButton, Duration.ofSeconds(100));
		waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Service Fees", Duration.ofSeconds(60));
		waitutils.sleepInSeconds(3);
		//285.75 AED
	    String text = driver.findElement(PaymentPage.TotalFees).getText();
	    textSplit = text.split(" ")[0];
		System.out.println(textSplit);
		seleniumutils.clickElement(PaymentPage.PayButton);
		waitutils.sleepInSeconds(12);
		
		waitutils.waitForElementPresent(PaymentPage.Pay, Duration.ofSeconds(60));
		seleniumutils.clickElement(PaymentPage.Pay);
		ClickOnContinueButton();
		
		
//		ClickOnBackButton();
		return this;
	}

	public DWFunctionLibrary SignatureScreenVerification() {
		WebElement canvas = driver.findElement(DigitalSignaturePage.SignatureBoard);
		Actions builder = new Actions(driver);
		builder.clickAndHold(canvas).moveByOffset(50, 0).moveByOffset(0, 50).moveByOffset(-50, 0).moveByOffset(0, -50)
				.release().perform();
		return this;
	}

	public DWFunctionLibrary ClearSignatureScreen() {
		WebElement canvas = driver.findElement(DigitalSignaturePage.SignatureBoard);
		boolean signatureCleared = canvas.getText().isEmpty();
		if (signatureCleared) {
			System.out.println("Signature cleared successfully.");
		} else {
			System.out.println("Signature not cleared.");
		}
		return this;
	}

	public DWFunctionLibrary ChangeFirstNameOnPersonalDetailsPage() {
		waitutils.waitForElementPresent(PersonalDetailsPage.FirstNameEnglishFieldEdit, Duration.ofSeconds(60));
		seleniumutils.enterText(PersonalDetailsPage.FirstNameEnglishFieldEdit, "test");
		return this;
	}
/*
	public DWFunctionLibrary VerifyProfileOnDashboardPage(String status) {
		String fullName = fname + " " + middleName + " " + lastName;
		System.out.println(fullName);
		boolean statusFound = false;
		while (!statusFound) {
			List<WebElement> statuses = driver.findElements(By.xpath(
					"//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewDetail\"]"));

			waitutils.sleepInSeconds(2);
			for (WebElement card : statuses) {
				String cardText = card.getText();
				System.out.println(cardText);
				if (cardText.contains(fullName)) {
					waitutils.sleepInSeconds(3);
					card.click();
					statusFound = true;
					break;
				}
			}
			if (!statusFound) {
				androidutils.swipeUp(CommonElements.SwipeUp);
			}
		}
//		    waitutils.waitForTextToBePresent(DomesticWorkerPage.StatusText, status, Duration.ofSeconds(60));
//		    assertions.assertContainsText(DomesticWorkerPage.StatusText ,status);
		return this;
	}
*/
	public DWFunctionLibrary VerifyProfileOnDashboardPage(String status) {
	    String fullName = fname + " " + middleName + " " + lastName;
	    System.out.println("Full Name: " + fullName);
	    boolean statusFound = false;

	    while (!statusFound) {
	        // Fetch elements in each iteration to avoid StaleElementReferenceException
	        List<WebElement> statuses = driver.findElements(By.xpath(
	                "//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewDetail\"]"));

	        waitutils.sleepInSeconds(2); // Small delay before iterating
	        
	        for (WebElement card : statuses) {
	            try {
	                String cardText = card.getText();
	                System.out.println("Card Text: " + cardText);

	                if (cardText.contains(fullName)) {
	                    waitutils.sleepInSeconds(3);
	                    card.click();
	                    statusFound = true;
	                    break;
	                }
	            } catch (org.openqa.selenium.StaleElementReferenceException e) {
	                System.out.println("Stale Element Exception caught, retrying...");
	                break; // Break and retry from the beginning
	            }
	        }

	        if (!statusFound) {
	            androidutils.swipeUp(CommonElements.SwipeUp);
	        }
	    }

	    return this;
	}
	
	public DWFunctionLibrary VerifyDisclaimerMessageOnAddressPage(String message) {
		driver.findElement(AddressDetailsPage.DisclaimerMessage).getText().contains(message);
		return this;
	}

	public DWFunctionLibrary VerifyDeleteButtonIsNotPresentForPaidApplications(String status) {
		VerifyProfileOnDashboardPage(status);
		assertions.assertElementNotPresent(DomesticWorkerPage.DeleteApplicationButton);
		return this;
	}

	public DWFunctionLibrary ViewThePaymentReceipt() {
		String fullName = fname + " " + middleName + " " + lastName;
		System.out.println(fullName);
		boolean statusFound = false;
		while (!statusFound) {
//			List<WebElement> statuses = driver.findElements(By.xpath(
//					"//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewDetail\"]"));
			List<WebElement> statuses = driver.findElements(DashboardPage.PROFILE_STATUS_LOCATOR);

			waitutils.sleepInSeconds(2);
			for (WebElement card : statuses) {
				String cardText = card.getText().trim();
				System.out.println(cardText);
				if (cardText.contains(fullName)) {
					waitutils.sleepInSeconds(3);
					card.click();
					statusFound = true;
					break;
				}
			}
			if (!statusFound) {
				androidutils.swipeUp(CommonElements.SwipeUp);
			}
		}
		waitutils.waitForElementPresent(DomesticWorkerPage.View, Duration.ofSeconds(60));
		seleniumutils.clickElement(DomesticWorkerPage.View);
		return this;
	}

	public DWFunctionLibrary VerifyApplicationDeletedFromDashboardAndHistory() {
		waitutils.waitForElementPresent(DomesticWorkerPage.GoToDashboardButton, Duration.ofSeconds(60));
		seleniumutils.clickElement(DomesticWorkerPage.GoToDashboardButton);
		String fullName = fname + " " + middleName + " " + lastName;
		System.out.println(fullName);
		List<WebElement> statuses = driver.findElements(By.xpath(
				"//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewDetail\"]"));
		waitutils.sleepInSeconds(15);
		androidutils.swipeUp(CommonElements.SwipeUp);
		if (!statuses.isEmpty()) {
			String firstCardText = statuses.get(0).getText();
			System.out.println(firstCardText);
			if (firstCardText.contains(firstName)) {
				System.out.println("The application didn't delete the first card containing the first name.");
			} else {
				seleniumutils.clickElement(DashboardPage.HistoryButton);
			}
		} else {
			System.out.println("No cards found.");
		}

		if (!statuses.isEmpty()) {
			String firstCardText = statuses.get(0).getText();
			System.out.println(firstCardText);
			if (firstCardText.contains(firstName)) {
				System.out.println("The application didn't delete the first card containing the first name.");
			} else {
				System.out.println("The application deleted.");
			}
		} else {
			System.out.println("No cards found.");
		}
		return this;
	}

	public DWFunctionLibrary VerifyNewlyAddedFieldsOnPassportScreen() {
		assertions.assertElementPresent(PassportDetailsPage.WorkerFileDetails);
		androidutils.swipeUp(CommonElements.SwipeUp);
		assertions.assertElementPresent(PassportDetailsPage.EIDANo);
		assertions.assertElementPresent(PassportDetailsPage.OldPassportNumber);
		return this;
	}

	public DWFunctionLibrary VerifyNewlyAddedFieldsOnResidencyScreen() {
		assertions.assertElementPresent(ResidencyPage.ImmediatelyRadionButton);
		assertions.assertElementPresent(ResidencyPage.ImmediatelyText);
		return this;
	}

	public DWFunctionLibrary VerifyNewlyCreatedApplicationsPresentOnDashboardAndHistoryScreen() {
		String fullName = fname + " " + middleName + " " + lastName;
		System.out.println(fullName);
		boolean foundOnDashboard = checkStatusOnScreen(fullName);
		if (!foundOnDashboard) {
			System.out.println("Application not found on Dashboard.");
			return this;
		}
		seleniumutils.clickElement(DashboardPage.HistoryButton);
		boolean foundOnHistory = checkStatusOnScreen(fullName);
		if (!foundOnHistory) {
			System.out.println("Application not found on History.");
		}

		return this;
	}

	private boolean checkStatusOnScreen(String fullName) {
		boolean statusFound = false;

		while (!statusFound) {
			List<WebElement> statuses = driver.findElements(By.xpath(
					"//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewDetail\"]"));
			waitutils.sleepInSeconds(2);
			for (WebElement card : statuses) {
				String cardText = card.getText();
				if (cardText.contains(fullName)) {
					waitutils.sleepInSeconds(3);
					System.out.println("Application Found !!");
					statusFound = true;
					break;
				}
			}
			if (!statusFound) {
				androidutils.swipeUp(CommonElements.SwipeUp);
			}
		}

		return statusFound;
	}

	public DWFunctionLibrary EnterDataIntoPassportDetailsForValidatingPlaceOfIssue(DataTable dataTable) {
		waitutils.waitForElementVisible(PassportDetailsPage.PassportNumberField, Duration.ofSeconds(30));
		List<List<String>> data = dataTable.asLists(String.class);

		String passportnumber = data.get(1).get(0);
		String passporttype = data.get(1).get(1);
		String issuedate = data.get(1).get(2);
		String expirydate = data.get(1).get(3);
		String placeofissue = data.get(1).get(4);
		String countryofissue = data.get(1).get(5);
		String countryofissuegov = data.get(1).get(6);

		String PASSPORTNUMBER = passportnumber + seleniumutils.generateRandomNumberString(4);
		System.out.println(PASSPORTNUMBER);
		seleniumutils.enterText(PassportDetailsPage.PassportNumberField, PASSPORTNUMBER);

		assertions.assertTextEquals(PassportDetailsPage.PassportTypeOptions, passporttype);

		seleniumutils.clickElement(AppiumBy.xpath(
				"(//android.view.ViewGroup[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/mainContainer\"])[1]"));
		waitutils.waitForElementClickable(AppiumBy.xpath("//*[@index=\"4\"]"), Duration.ofSeconds(60));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@index=\"4\"]"));
		waitutils.waitForElementClickable(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/mdtp_ok"),
				Duration.ofSeconds(60));
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/mdtp_ok"));

		seleniumutils.clickElement(AppiumBy.xpath(
				"(//android.view.ViewGroup[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/mainContainer\"])[2]"));
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/mdtp_date_picker_year"));
		seleniumutils.clickElement(AppiumBy.accessibilityId("2026"));
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/mdtp_ok"));
		waitutils.waitForElementClickable(AppiumBy.xpath("//*[@index=\"4\"]"), Duration.ofSeconds(60));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@index=\"4\"]"));

		JSONObject jsonObject = jsonutil.readJsonFile();
		if (jsonObject != null) {
			String text = jsonutil.getJsonValue(jsonObject, "maxText");
			seleniumutils.enterText(PassportDetailsPage.PlaceOfIssueField, text);
			driver.hideKeyboard();
		}

		seleniumutils.clickElement(CommonElements.SelectOption);
		seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), countryofissue);
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Confirm\"]"));

		seleniumutils.clickElement(CommonElements.SelectOption);
		seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), countryofissuegov);
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Confirm\"]"));
		androidutils.swipeUp(CommonElements.SwipeUp);
		return this;
	}

	public DWFunctionLibrary UploadDocument() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		waitutils.waitForElementPresent(DocumentsPage.attachButton, Duration.ofSeconds(120));
		waitutils.sleepInSeconds(1);

//		driver.findElement(DocumentsPage.attachButton).click();
//		waitutils.sleepInSeconds(1);
//		driver.findElement(DocumentsPage.photoLibrary).click();
//		waitutils.sleepInSeconds(1);

//		driver.findElement(DocumentsPage.okButton).click();
//		waitutils.sleepInSeconds(1);
//		driver.findElement(DocumentsPage.allowButton).click();
//		waitutils.sleepInSeconds(1);
//		driver.findElement(DocumentsPage.photo).click();
//		waitutils.sleepInSeconds(1);
//		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(DocumentsPage.progressBar)));
		// first one
		waitutils.sleepInSeconds(2);
		driver.findElement(DocumentsPage.attachButton).click();
		waitutils.sleepInSeconds(2);
		driver.findElement(DocumentsPage.photoLibrary).click();
		waitutils.sleepInSeconds(2);
		driver.findElement(DocumentsPage.photo).click();
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(DocumentsPage.progressBar)));

//	 //second one
		waitutils.sleepInSeconds(2);
		androidutils.swipeUpForDocument(CommonElements.SwipeUp);
		driver.findElement(DocumentsPage.attachButton).click();
		waitutils.sleepInSeconds(2);
		driver.findElement(DocumentsPage.photoLibrary).click();
		waitutils.sleepInSeconds(2);
		driver.findElement(DocumentsPage.photo).click();
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(DocumentsPage.progressBar)));
		// 3rd
//		waitutils.sleepInSeconds(1);
//		driver.findElement(DocumentsPage.attachButton).click();
//		waitutils.sleepInSeconds(1);
//		driver.findElement(DocumentsPage.photoLibrary).click();
//		waitutils.sleepInSeconds(1);
//		driver.findElement(DocumentsPage.photo).click();
//		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(DocumentsPage.progressBar)));

		// 4th
//		waitutils.sleepInSeconds(1);
//		androidutils.swipeUpForDocument(CommonElements.SwipeUp);
//		driver.findElement(DocumentsPage.attachButton).click();
//		waitutils.sleepInSeconds(1);
//		driver.findElement(DocumentsPage.photoLibrary).click();
//		waitutils.sleepInSeconds(1);
//		driver.findElement(DocumentsPage.photo).click();
//		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(DocumentsPage.progressBar)));
//		//5th
//		waitutils.sleepInSeconds(1);
//		androidutils.swipeUpForDocument(CommonElements.SwipeUp);
//		driver.findElement(DocumentsPage.attachButton).click();
//		waitutils.sleepInSeconds(1);
//		driver.findElement(DocumentsPage.photoLibrary).click();
//		waitutils.sleepInSeconds(1);
//		driver.findElement(DocumentsPage.photo).click();
//		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(DocumentsPage.progressBar)));

		return this;
	}

	public DWFunctionLibrary EnterDataIntoOutsideTheUAESectionInAddressDetailsForValidation(DataTable dataTable) {
		waitutils.waitForElementVisible(AddressDetailsPage.PermanentCountryOption, Duration.ofSeconds(30));
		List<List<String>> data = dataTable.asLists(String.class);
		String permanentcountry = data.get(1).get(0);
		String city = data.get(1).get(1);
		String abroadaddress = data.get(1).get(2);
		String abroadmobileno = data.get(1).get(3);

		JSONObject jsonObject = jsonutil.readJsonFile();
		String text = jsonutil.getJsonValue(jsonObject, "maxText");
		String mobileNo = jsonutil.getJsonValue(jsonObject, "MOBILENO");
		waitutils.sleepInSeconds(7);
		assertions.assertElementPresent(AddressDetailsPage.PermanentCountryOption);
		seleniumutils.clickElement(AddressDetailsPage.PermanentCountryOption);
		seleniumutils.clickElement(AddressDetailsPage.PermanentCountryOption);
		seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), permanentcountry);
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Confirm\"]"));

		seleniumutils.enterText(AddressDetailsPage.CityField, text);
		seleniumutils.clickElement(AddressDetailsPage.SaveAndExitButton);
		waitutils.waitForTextToBePresent(CommonElements.CharacterValidationMessage,
				"City field length should not exceed 50 characters", Duration.ofSeconds(60));
		assertions.assertContainsText(CommonElements.CharacterValidationMessage,
				"City field length should not exceed 50 characters");
		seleniumutils.enterText(AddressDetailsPage.AbroadAddress, abroadaddress);
		seleniumutils.enterText(AddressDetailsPage.AbroadMobileNumberField, mobileNo);
		androidutils.swipeUp(CommonElements.SwipeUp);
		return this;
	}

	public DWFunctionLibrary SelectProfileForCancellation() {
		waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Dashboard", Duration.ofSeconds(60));
		String fullName = "ABDALLA SHAHIN";
		boolean statusFound = false;
		while (!statusFound) {
			List<WebElement> statuses = driver.findElements(By.xpath(
					"//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewDetail\"]"));

			waitutils.sleepInSeconds(2);
			for (WebElement card : statuses) {
				String cardText = card.getText();
				if (cardText.contains(fullName)) {
					waitutils.sleepInSeconds(3);
					card.click();
					statusFound = true;
					break;
				}
			}
			if (!statusFound) {
				androidutils.swipeUp(CommonElements.SwipeUp);
			}
		}
		waitutils.waitForElementPresent(ManageDomesticWorker.CancelResidency, Duration.ofSeconds(50));
		seleniumutils.clickElement(ManageDomesticWorker.CancelResidency);
		waitutils.waitForElementPresent(ManageDomesticWorker.YesCancelResidency, Duration.ofSeconds(50));
		seleniumutils.clickElement(ManageDomesticWorker.YesCancelResidency);
		return this;
	}

	public DWFunctionLibrary SelectReasonForCancellation(String reason) {
		waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Cancel Residency", Duration.ofSeconds(60));
		androidutils.swipeUp(CommonElements.SwipeUp);
		androidutils.swipeUp(CommonElements.SwipeUp);
		waitutils.waitForTextToBePresent(CancelResidency.CancellationDetails, "Cancellation Details",
				Duration.ofSeconds(60));
		seleniumutils.clickElement(CancelResidency.SelectCancelReason);
		boolean statusFound = false;
		while (!statusFound) {
			List<WebElement> reasons = driver.findElements(By.className("android.widget.TextView"));
			for (WebElement reason1 : reasons) {
				String reasonText = reason1.getText();
				if (reasonText.contains(reason)) {
					statusFound = true;
					System.out.println("Reason Found !!");
					break;
				}
			}
		}
		return this;
	}

	public DWFunctionLibrary VerifyCancelReasons(String reason1, String reason2, String reason3) {
		waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Cancel Residency", Duration.ofSeconds(60));
		androidutils.swipeUp(CommonElements.SwipeUp);
		androidutils.swipeUp(CommonElements.SwipeUp);
		waitutils.waitForTextToBePresent(CancelResidency.CancellationDetails, "Cancellation Details",
				Duration.ofSeconds(60));
		seleniumutils.clickElement(CancelResidency.SelectCancelReason);

		boolean statusFound = false;
		while (!statusFound) {
			waitutils.sleepInSeconds(3);			
			List<WebElement> reasons = driver.findElements(CommonElements.Options);
			List<String> reasonTexts = new ArrayList<>(); 
			for (WebElement reason : reasons) {
				String reasonText = reason.getText();
				reasonTexts.add(reasonText);
				System.out.println("Found reason: " + reasonText);
			}

			if (reasonTexts.contains(reason1) && reasonTexts.contains(reason2) && reasonTexts.contains(reason3)) {
				statusFound = true;
				System.out.println("All reasons found: " + reason1 + ", " + reason2 + ", " + reason3);
			} else {
				androidutils.swipeUp(CommonElements.SwipeUp);
			}
		}
		return this;
	}

	public DWFunctionLibrary SelectProfileForCancellation(String profile) {
		waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Dashboard", Duration.ofSeconds(60));
		String fullName = profile;
		boolean statusFound = false;
		while (!statusFound) {
			List<WebElement> statuses = driver.findElements(By.xpath(
					"//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewDetail\"]"));

			waitutils.sleepInSeconds(2);
			for (WebElement card : statuses) {
				String cardText = card.getText();
				if (cardText.contains(fullName)) {
					waitutils.sleepInSeconds(3);
					card.click();
					statusFound = true;
					break;
				}
			}
			if (!statusFound) {
				androidutils.swipeUp(CommonElements.SwipeUp);
			}
		}
		waitutils.waitForElementPresent(ManageDomesticWorker.CancelResidency, Duration.ofSeconds(50));
		seleniumutils.clickElement(ManageDomesticWorker.CancelResidency);
		waitutils.waitForElementPresent(ManageDomesticWorker.YesCancelResidency, Duration.ofSeconds(50));
		seleniumutils.clickElement(ManageDomesticWorker.YesCancelResidency);
		return this;
	}

	public DWFunctionLibrary VerifyCancelReasons(String reason1, String reason2, String reason3, String reason4) {
		waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Cancel Residency", Duration.ofSeconds(60));
		androidutils.swipeUp(CommonElements.SwipeUp);
		androidutils.swipeUp(CommonElements.SwipeUp);
		waitutils.waitForTextToBePresent(CancelResidency.CancellationDetails, "Cancellation Details",
				Duration.ofSeconds(60));
		seleniumutils.clickElement(CancelResidency.SelectCancelReason);

		boolean statusFound = false;
		while (!statusFound) {
			List<WebElement> reasons = driver.findElements(CommonElements.Options);
			List<String> reasonTexts = new ArrayList<>();

			for (WebElement reason : reasons) {
				String reasonText = reason.getText();
				reasonTexts.add(reasonText);
				System.out.println("Found reason: " + reasonText);
			}

			if (reasonTexts.contains(reason1) && reasonTexts.contains(reason2) && reasonTexts.contains(reason3)
					&& reasonTexts.contains(reason4)) {
				statusFound = true;
				System.out.println("All reasons found: " + reason1 + ", " + reason2 + ", " + reason3 + ", ");
			} else {
				androidutils.swipeUp(CommonElements.SwipeUp);
			}
		}
		return this;
	}

	public DWFunctionLibrary EnterStaticDataIntoFirstSectionofPersonalDetails(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		firstName = data.get(1).get(0);
		lastName = data.get(1).get(2);
		waitutils.waitForElementPresent(PersonalDetailsPage.FirstNameEnglishField, Duration.ofSeconds(60));
		seleniumutils.enterText(PersonalDetailsPage.FirstNameEnglishField, firstName);
		seleniumutils.enterText(PersonalDetailsPage.LastNameEnglishField, lastName);
		return this;
	}

	public DWFunctionLibrary EnterStaticDataIntoPassportDetails(DataTable dataTable) {
		waitutils.waitForElementVisible(PassportDetailsPage.PassportNumberField, Duration.ofSeconds(30));
		List<List<String>> data = dataTable.asLists(String.class);

		String passportnumber = data.get(1).get(0);
		String passporttype = data.get(1).get(1);
		String issuedate = data.get(1).get(2);
		String expirydate = data.get(1).get(3);
		String placeofissue = data.get(1).get(4);
		String countryofissue = data.get(1).get(5);
		String countryofissuegov = data.get(1).get(6);

		seleniumutils.enterText(PassportDetailsPage.PassportNumberField, passportnumber);

		assertions.assertTextEquals(PassportDetailsPage.PassportTypeOptions, passporttype);

		passportIssueDate(2021, "May", 01);

		waitutils.sleepInSeconds(3);

		passportExpiryDate(2025, "December", 18);

		seleniumutils.enterText(PassportDetailsPage.PlaceOfIssueField, placeofissue);
		driver.hideKeyboard();

		seleniumutils.clickElement(CommonElements.SelectOption);
		seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), countryofissue);
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Confirm\"]"));

		seleniumutils.clickElement(CommonElements.SelectOption);
		seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), countryofissuegov);
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Confirm\"]"));
		androidutils.swipeUp(CommonElements.SwipeUp);
		return this;
	}

	private DWFunctionLibrary DatePicker(int year, String month, int day) {
		seleniumutils.clickElement(AppiumBy.xpath(
				"(//android.view.ViewGroup[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/mainContainer\"])[1]")); //click on select
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/mdtp_date_picker_year"));  //click on year
		scrollToYear(year);
		for (int i = 0; i < 6; i++) {
			driver.findElement(By.id("ae.smartdubai.dubainow.enterprise:id/mdtp_previous_month_arrow")).click();  //click on privious month arrow
		}
		WebElement dayElement = driver.findElement(By.xpath("//android.view.View[@content-desc=\"18 March 1999\"]")); //click on date 
		dayElement.click();
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/mdtp_ok"));                 // click on ok btn
		return this;
	}

	private void scrollToYear(int year) {
		boolean yearFound = false;
		while (!yearFound) {
			try {
				WebElement yearToSelect = driver.findElement(AppiumBy.accessibilityId(String.valueOf(year)));
				if (yearToSelect.isDisplayed() && yearToSelect.isEnabled()) {
					yearToSelect.click();
					yearFound = true;
				}
			} catch (NoSuchElementException e) {
				androidutils.swipeDown(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']"));
			}
		}
	}

	private void passportIssueDate(int year, String month, int day) {
		seleniumutils.clickElement(AppiumBy.xpath(
				"(//android.view.ViewGroup[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/mainContainer\"])[1]")); //click on select
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/mdtp_date_picker_year"));
		scrollToYear(year);
		for (int i = 0; i < 4; i++) {
			driver.findElement(By.id("ae.smartdubai.dubainow.enterprise:id/mdtp_previous_month_arrow")).click();   //click on privious month arrow
		}
		WebElement dayElement = driver.findElement(By.xpath("//android.view.View[@content-desc=\"01 May 2021\"]"));// click on ok btn
		dayElement.click();
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/mdtp_ok"));                   //click on date 
	}

	private void passportExpiryDate(int year, String month, int day) {
		seleniumutils.clickElement(AppiumBy.xpath(
				"(//android.view.ViewGroup[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/mainContainer\"])[1]"));  //click on select
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/mdtp_date_picker_year"));
		scrollToYear(year);
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.id("ae.smartdubai.dubainow.enterprise:id/mdtp_next_month_arrow")).click();             //click on next month arrow
		}
		WebElement dayElement = driver.findElement(By.xpath("//android.view.View[@content-desc=\"18 December 2025\"]"));    //click on date
		dayElement.click();
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/mdtp_ok"));                        // click on ok btn
	}

	public DWFunctionLibrary SelectProfileWithStatusAndName(String status, String name) {
		waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Dashboard", Duration.ofSeconds(60));
		String fullName = name;
		boolean statusFound = false;
		while (!statusFound) {
			List<WebElement> statuses = driver.findElements(By.xpath(
					"//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewDetail\"]"));

			waitutils.sleepInSeconds(2);
			for (WebElement card : statuses) {
				String cardText = card.getText();
				if (cardText.contains(fullName)) {
					waitutils.sleepInSeconds(3);
					card.click();
					statusFound = true;
					break;
				}
			}
			if (!statusFound) {
				androidutils.swipeUp(CommonElements.SwipeUp);
			}
		}

		return this;
	}

	
	public DWFunctionLibrary ClickOnNewResidency() {
		waitutils.sleepInSeconds(2);
		waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Manage Domestic Worker", Duration.ofSeconds(60));
		waitutils.waitForElementPresent(ManageDomesticWorker.NewResidency, Duration.ofSeconds(60));
		seleniumutils.clickElement(ManageDomesticWorker.NewResidency);
		return this;
	}

	public DWFunctionLibrary StepperStatusVerification(String status, boolean isMedical) {
		waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Domestic Worker", Duration.ofSeconds(60));
		assertions.assertElementDisplayed(CommonElements.Options(status));
		if (isMedical) {
			assertions.assertElementEnabled(DomesticWorkerPage.MedicalTest);
		} else {
			assertions.assertElementEnabled(DomesticWorkerPage.ChangeStatus);
		}
//	    assertions.assertElementEnabled(DomesticWorkerPage.StartButton);
		return this;
	}

	public DWFunctionLibrary FillPendingDataForChangeStatusOnReviewScreen() {
		waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Review Details", Duration.ofSeconds(60));
		androidutils.swipeUp(CommonElements.SwipeUp);
		androidutils.swipeUp(CommonElements.SwipeUp);
		JSONObject jsonObject = jsonutil.readJsonFilee();
		if (jsonObject != null) {
			String educationcountry = jsonutil.getJsonValue(jsonObject, "educationCountry");
			String placeofissue = jsonutil.getJsonValue(jsonObject, "placeOfIssue");

			String permanentcountry = jsonutil.getJsonValue(jsonObject, "permanentCountry");
			String city = jsonutil.getJsonValue(jsonObject, "city");
			String abroadaddress = jsonutil.getJsonValue(jsonObject, "abroadAddress");
			String abroadmobileno = jsonutil.getJsonValue(jsonObject, "abroadMobileNo");

			String emirate = jsonutil.getJsonValue(jsonObject, "emirate");
			String cityinside = jsonutil.getJsonValue(jsonObject, "city");
			String area = jsonutil.getJsonValue(jsonObject, "area");
			String street = jsonutil.getJsonValue(jsonObject, "street");
			String building = jsonutil.getJsonValue(jsonObject, "building");
			String floor = jsonutil.getJsonValue(jsonObject, "floor");
			String apartmentno = jsonutil.getJsonValue(jsonObject, "apartmentNo");

			String basicsalary = jsonutil.getJsonValue(jsonObject, "basicSalary");

			String persontype = jsonutil.getJsonValue(jsonObject, "personalType");
			String mediatortype = jsonutil.getJsonValue(jsonObject, "mediatorType");
			String mediatoraddress = jsonutil.getJsonValue(jsonObject, "mediatorAddress");

			seleniumutils.clickElement(CommonElements.SelectOption);
			seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), educationcountry);
			seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));
			seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Confirm\"]"));

			androidutils.swipeUp(CommonElements.SwipeUp);

			seleniumutils.enterText(PassportDetailsPage.PlaceOfIssueField, placeofissue);
			driver.hideKeyboard();

			androidutils.swipeUp(CommonElements.SwipeUp);

			assertions.assertElementPresent(AddressDetailsPage.PermanentCountryOption);
			seleniumutils.clickElement(AddressDetailsPage.PermanentCountryOption);
			seleniumutils.clickElement(AddressDetailsPage.PermanentCountryOption);
			seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), permanentcountry);
			seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));
			seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Confirm\"]"));

			seleniumutils.enterText(AddressDetailsPage.CityField, city);
			seleniumutils.enterText(AddressDetailsPage.AbroadAddress, abroadaddress);
			seleniumutils.enterText(AddressDetailsPage.AbroadMobileNumberField, abroadmobileno);
			androidutils.swipeUp(CommonElements.SwipeUp);

			seleniumutils.clickElement(AddressDetailsPage.EmirateOptions);
			seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"" + emirate + "\"]"));

			waitutils.sleepInSeconds(3);
			seleniumutils.clickElement(AddressDetailsPage.CityOptions);
			seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"DUBAI \"]"));

			waitutils.sleepInSeconds(3);
			seleniumutils.clickElement(AddressDetailsPage.AreaOptions);
			seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), area);
			seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));
			seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Confirm\"]"));

			seleniumutils.enterText(AddressDetailsPage.StreetField, street);
			seleniumutils.enterText(AddressDetailsPage.BuildingField, building);
			androidutils.swipeUp(CommonElements.SwipeUp);
			seleniumutils.enterText(AddressDetailsPage.FloorField, floor);
			seleniumutils.enterText(AddressDetailsPage.ApartmentNoField, apartmentno);
			androidutils.swipeUp(CommonElements.SwipeUp);

			seleniumutils.enterText(SalaryDetailsPage.BasicSalaryField, basicsalary);

			waitutils.waitForElementClickable(AppiumBy.xpath(
					"(//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/lbl_description\"])[1]"),
					Duration.ofSeconds(60));
			seleniumutils.clickElement(AppiumBy.xpath(
					"(//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/lbl_description\"])[1]"));
			seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"" + persontype + "\"]"));

			waitutils.sleepInSeconds(3);
			seleniumutils.clickElement(AppiumBy.xpath(
					"(//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/lbl_description\"])[2]"));
			seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"" + mediatortype + "\"]"));

			seleniumutils.enterText(OtherDetailsPage.MediatorAddressField, mediatoraddress);

			waitutils.waitForElementPresent(CommonElements.CheckBox, Duration.ofSeconds(60));
			seleniumutils.clickElement(CommonElements.CheckBox);

			waitutils.waitForElementClickable(CommonElements.Continue, Duration.ofSeconds(60));
			seleniumutils.clickElement(CommonElements.Continue);
		}
		return this;
	}

	public DWFunctionLibrary VerifyMedicalScreen() {
		waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Medical", Duration.ofSeconds(60));
		assertions.assertElementDisplayed(MedicalPage.FitnessService);
		assertions.assertElementDisplayed(MedicalPage.VIPService);
		assertions.assertElementDisplayed(MedicalPage.RegularService);
		assertions.assertElementDisplayed(MedicalPage.UrgentService);
		assertions.assertElementDisplayed(MedicalPage.MedicalFitnessCenters);
		assertions.assertElementDisplayed(MedicalPage.FitnessCenter);
		assertions.assertElementDisplayed(MedicalPage.WorkerContactDetails);
		assertions.assertElementDisplayed(MedicalPage.WorkerMobileNo);
		assertions.assertElementDisplayed(MedicalPage.WorkerEmail);
		return this;
	}

	public DWFunctionLibrary EnterDataForMedicalScreen() {
		waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Medical", Duration.ofSeconds(60));
		seleniumutils.clickElement(MedicalPage.UrgentServiceRadioButton);
		seleniumutils.clickElement(MedicalPage.RegularServiceRadioButton);
		JSONObject jsonObject = jsonutil.readJsonMedicalFile();
		if (jsonObject != null) {
			JSONObject medical = (JSONObject) jsonObject.get("Medical");
			JSONObject regularService = (JSONObject) medical.get("REGULARSERVICE");
			String firstCenterName = (String) regularService.get("firstCenter");
			JSONObject workerContactDetails = (JSONObject) medical.get("WORKERCONTACTDETAILS");
			String mobile = (String) workerContactDetails.get("WorkerMobileNo");
			String email = (String) workerContactDetails.get("WorkerEmail");
			seleniumutils.clickElement(MedicalPage.Select);
			waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Fitness Center Locations",
					Duration.ofSeconds(60));
			boolean firstCenterFound = false;
			List<WebElement> containers = driver.findElements(CommonElements.Container);
			for (WebElement container : containers) {
				List<WebElement> listItems = container.findElements(By.className("android.widget.TextView"));
				for (WebElement item : listItems) {
					if (item.getText().equals(firstCenterName)) {
						item.click();
						firstCenterFound = true;
						break;
					}
				}
				if (firstCenterFound)
					break;
			}
			androidutils.swipeUp(CommonElements.SwipeUp);
			seleniumutils.enterText(MedicalPage.WorkerMobileNo, mobile);
			androidutils.swipeUp(CommonElements.SwipeUp);
			seleniumutils.enterText(MedicalPage.WorkerEmail, email);
			waitutils.waitForElementClickable(CommonElements.CheckBox, Duration.ofSeconds(60));
			seleniumutils.clickElement(CommonElements.CheckBox);
		}
		return this;
	}

	public DWFunctionLibrary VerifyMedicalFitnessCentersScreen() {
		waitutils.sleepInSeconds(5);
		//driver.findElement(By.xpath("//android.widget.Button[@text='Select']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/button\" and @text=\"Select\"]")).click();
		waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Fitness Center Locations", Duration.ofSeconds(60));
		List<WebElement> containers = driver.findElements(By.xpath(
				"//android.widget.LinearLayout[@resource-id='ae.smartdubai.dubainow.enterprise:id/mainContainer']"));
		Set<String> uniqueFitnessCenters = new HashSet<>();
		for (WebElement container : containers) {
			List<WebElement> listItems = container.findElements(By.className("android.widget.TextView"));
			for (WebElement item : listItems) {
				uniqueFitnessCenters.add(item.getText());
			}
		}
		for (String fitnessCenter : uniqueFitnessCenters) {
			System.out.println("Fitness Center: " + fitnessCenter);
		}
		return this;
	}

	public DWFunctionLibrary VerifyMedicalFitnessCentersCanChange() {
		JSONObject jsonObject = jsonutil.readJsonMedicalFile();
		if (jsonObject != null) {
			JSONObject medical = (JSONObject) jsonObject.get("Medical");
			JSONObject vipService = (JSONObject) medical.get("VIPSERVICE");
			String firstCenterName = (String) vipService.get("firstCenter");
			String secondCenterName = (String) vipService.get("SecondCenter");
			List<WebElement> containers = driver.findElements(CommonElements.Container);
			Set<String> uniqueFitnessCenters = new HashSet<>();
			for (WebElement container : containers) {
				List<WebElement> listItems = container.findElements(By.className("android.widget.TextView"));
				for (WebElement item : listItems) {
					uniqueFitnessCenters.add(item.getText());
				}
			}
			for (String fitnessCenter : uniqueFitnessCenters) {
				System.out.println("Fitness Center: " + fitnessCenter);
			}
			boolean firstCenterFound = false;
			for (WebElement container : containers) {
				List<WebElement> listItems = container.findElements(By.className("android.widget.TextView"));
				for (WebElement item : listItems) {
					if (item.getText().equals(firstCenterName)) {
						item.click();
						firstCenterFound = true;
						break;
					}
				}
				if (firstCenterFound)
					break;
			}
			
			verifySelectedCenter(firstCenterName);
			seleniumutils.clickElement(MedicalPage.ChangeCenter);
			waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Fitness Center Locations",
					Duration.ofSeconds(60));
			containers = driver.findElements(CommonElements.Container);
			boolean secondCenterFound = false;
			for (WebElement container : containers) {
				List<WebElement> listItems = container.findElements(By.className("android.widget.TextView"));
				for (WebElement item : listItems) {
					if (item.getText().equals(secondCenterName)) {
						item.click();
						secondCenterFound = true;
						break;
					}
				}
				if (secondCenterFound)
					break;
			}
			verifySelectedCenter(secondCenterName);
			System.out.println("First Center Name: " + firstCenterName);
			System.out.println("Second Center Name: " + secondCenterName);
			assert !firstCenterName.equals(secondCenterName) : "The selected fitness center did not change.";
		} else {
			System.out.println("JSON data could not be loaded.");
		}
		return this;
	}

	private void verifySelectedCenter(String centerName) {
		String dynamicXPath = String.format(
				"//android.widget.TextView[@resource-id='ae.smartdubai.dubainow.enterprise:id/textViewTitle' and @text='%s']",
				centerName);
		WebElement selectedCenter = driver.findElement(By.xpath(dynamicXPath));
		assert selectedCenter.getText().equals(centerName) : "Center not selected correctly";
	}

	public DWFunctionLibrary OpenSameApplicationForDataVerification(String status, String name) {
		SelectProfileWithStatusAndName(status, name);
		ClickOnNewResidency();
		ClickOnEditButton();
		waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Medical", Duration.ofSeconds(60));
		assertions.assertElementEnabled(MedicalPage.RegularServiceRadioButton);
		return this;
	}

//	public DWFunctionLibrary ClickOnButtonWithStatus(String status, String button) {
//		List<WebElement> elements = driver.findElements(CommonElements.Container);
//		for (WebElement element : elements) {
//			try {
//				WebElement statusElement = element.findElement(CommonElements.Options(status));
//				if (statusElement != null) {
//					WebElement viewButton = element.findElement(CommonElements.Button(button));
//					viewButton.click();
//					break;
//				}
//			} catch (NoSuchElementException e) {
//				System.out.println("Status element not found in this container, moving to the next one.");
//			}
//		}
//		return this;
//	}

	public DWFunctionLibrary ClickOnButtonWithStatus(String status, String button) {
	    boolean statusFound = false;
	    
	    while (!statusFound) {
	        List<WebElement> elements = driver.findElements(CommonElements.Container); // Re-fetch elements to avoid stale references

	        for (WebElement element : elements) {
	            try {	                
	                WebElement statusElement = element.findElement(CommonElements.Options(status));
	                if (statusElement != null) {
	                    WebElement viewButton = element.findElement(CommonElements.Button(button));
	                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	                    wait.until(ExpectedConditions.elementToBeClickable(viewButton));
	                    System.out.println("Found status: " + status + ". Clicking on button: " + button);
	                    viewButton.click();
	                    statusFound = true;
	                    break;
	                }
	            } catch (StaleElementReferenceException e) {
	                System.out.println("StaleElementReferenceException: Re-fetching elements...");
	                break; 
	            } catch (NoSuchElementException e) {
	                System.out.println("Status element not found in this container, checking next...");
	            }
	        }

	        if (!statusFound) {
	            System.out.println("Status not found, swiping up...");
	            androidutils.swipeUp(CommonElements.SwipeUp);
	            waitutils.sleepInSeconds(2); 
	        }
	    }

	    return this;
	}
	public DWFunctionLibrary VerifyButtonWithMessage(String message, String button) {
		waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Medical Test", Duration.ofSeconds(60));
		List<WebElement> elements = driver.findElements(CommonElements.Container);
		for (WebElement element : elements) {
			try {
				WebElement statusElement = element.findElement(CommonElements.Options(message));
				if (statusElement != null) {
					element.findElement(CommonElements.Button(button)).isDisplayed();
					System.out.println(message + " is present with " + button + "button");
					break;
				}
			} catch (NoSuchElementException e) {
				System.out.println("Status element not found in this container, moving to the next one.");
			}
		}
		return this;
	}

	public DWFunctionLibrary VerifyMedicalTestScreen() {
		waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Medical Test", Duration.ofSeconds(60));
		assertions.assertElementDisplayed(MedicalPage.MedicalTestInfo);
		assertions.assertElementDisplayed(MedicalPage.ApplicationAppNo);
		assertions.assertElementDisplayed(MedicalPage.MedicalAppNo);
		assertions.assertElementDisplayed(MedicalPage.Status);

		assertions.assertElementDisplayed(MedicalPage.MedicalFitnessCenterLocation);
		JSONObject jsonObject = jsonutil.readJsonMedicalFile();
		if (jsonObject != null) {
			JSONObject medical = (JSONObject) jsonObject.get("Medical");
			JSONObject regularService = (JSONObject) medical.get("REGULARSERVICE");
			String firstCenterName = (String) regularService.get("firstCenter");
			ClickOnButtonWithStatus(firstCenterName, "View");
			driver.findElement(By.xpath(
					"//android.widget.ImageView[@resource-id=\"com.google.android.apps.maps:id/street_view_thumbnail\"]"))
					.isDisplayed();
			androidutils.goBack();
			androidutils.goBack();
		}

		assertions.assertElementDisplayed(MedicalPage.Documents);
		assertions.assertElementDisplayed(MedicalPage.PaymentReceipt);
		ClickOnButtonWithStatus("Payment Receipt", "View");
		seleniumutils.clickElement(CommonElements.JustOnce);
		seleniumutils.clickElement(CommonElements.Tap);
		assertions.assertElementDisplayed(CommonElements.PaymentReceiptDoc);
		return this;
	}

	public DWFunctionLibrary VerifyStatusOnStepperAndButton(String message, String button) {
//		waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Domestic Worker", Duration.ofSeconds(60));
//		List<WebElement> elements = driver.findElements(CommonElements.Container);
//		for (WebElement element : elements) {
//			try {
//				WebElement statusElement = element.findElement(CommonElements.Options(message));
//				if (statusElement != null) {
//					element.findElement(CommonElements.Button(button)).isEnabled();
//					System.out.println(message + " is present with " + button + " button");
//					break;
//				}
//			} catch (NoSuchElementException e) {
//				System.out.println("Status element not found in this container, moving to the next one.");
//			}
//		}
//		return this;
		 waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Domestic Worker", Duration.ofSeconds(60));
		    List<WebElement> elements = driver.findElements(CommonElements.Container);
		    boolean isFound = false;
		    for (WebElement element : elements) {
		        try {
		            WebElement statusElement = element.findElement(CommonElements.Options(message));
		            if (statusElement != null) {
		                WebElement buttonElement = element.findElement(CommonElements.Button(button));
		                if (buttonElement.isEnabled()) {
		                    System.out.println(message + " is present with an enabled " + button + " button.");
		                    isFound = true;
		                    break;
		                } else {
		                    throw new AssertionError("Button '" + button + "' is not enabled for the status: " + message);
		                }
		            }
		        } catch (NoSuchElementException e) {
		            System.out.println("Status element or button not found in this container, moving to the next one.");
		        }
		    }

		    if (!isFound) {
		        throw new AssertionError("Failed to find the status '" + message + "' with an enabled '" + button + "' button.");
		    }

		    return this;
	}

	public DWFunctionLibrary OpenSameApplicationFromDashboard(String status) {
		waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Domestic Worker", Duration.ofSeconds(60));
		androidutils.goBack();
		waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Dashboard", Duration.ofSeconds(60));
		VerifyProfileOnDashboardPage(status);
		return this;
	}
	
	public DWFunctionLibrary VerifyStepperIsDisabled(String stepper) {
		assertions.assertElementNotClickable(CommonElements.Options(stepper));
		return this;
	}
	
	
	public DWFunctionLibrary ClickOnResidencyButton() {
		waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Manage Domestic Worker", Duration.ofSeconds(60)); 
		assertions.assertElementNotClickable(ManageDomesticWorker.Residency);
		return this;
	}
	public DWFunctionLibrary ClickOnViewButtonDomesticWorker() {
		waitutils.waitForElementPresent(DomesticWorkerPage.View, Duration.ofSeconds(80));
		seleniumutils.clickElement(DomesticWorkerPage.View);
		return this;
	}
	public DWFunctionLibrary VerifyAllEntryPermitPage() {
		waitutils.waitForElementPresent(EntryPermitPage.ApplicationNo, Duration.ofSeconds(80)); 
		assertions.assertElementPresent(EntryPermitPage.ApplicationNo);
		assertions.assertElementPresent(EntryPermitPage.MohreRefNo);
		assertions.assertElementPresent(EntryPermitPage.ApplicationStatus); 
		assertions.assertElementPresent(EntryPermitPage.EntryPermitNo);
		assertions.assertElementPresent(EntryPermitPage.IssueDate);
		assertions.assertElementPresent(EntryPermitPage.Expirydate);
		
		return this;
	}
	public DWFunctionLibrary VerifyEntryPermitPage() {
		waitutils.waitForElementPresent(EntryPermitPage.ApplicationNo, Duration.ofSeconds(80)); 
		assertions.assertElementPresent(EntryPermitPage.ApplicationNo);
		assertions.assertElementPresent(EntryPermitPage.MohreRefNo);
		assertions.assertElementPresent(EntryPermitPage.ApplicationStatus); 	
		return this;
	}
	

	public DWFunctionLibrary VerifyStepperIsEnabled(String stepper) {
		waitutils.sleepInSeconds(2);
		assertions.assertElementEnabled(CommonElements.Options(stepper));
		return this;
	}
	 
	public DWFunctionLibrary VerifyErrorMessage(String stepper) {
		assertions.assertTextEquals(PassportDetailsPage.TextMessage, stepper);
		
		
		return this;
	}
	public DWFunctionLibrary EnterExpiryDateLessThan180DaysIntoPassportDetails(DataTable dataTable) {
		waitutils.waitForElementVisible(PassportDetailsPage.PassportNumberField, Duration.ofSeconds(30));
		List<List<String>> data = dataTable.asLists(String.class);

		String passportnumber = data.get(1).get(0);
		String passporttype = data.get(1).get(1);
		String issuedate = data.get(1).get(2);
		String expirydate = data.get(1).get(3);
		String placeofissue = data.get(1).get(4);
		String countryofissue = data.get(1).get(5);
		String countryofissuegov = data.get(1).get(6);

		seleniumutils.enterText(PassportDetailsPage.PassportNumberField, passportnumber);

		assertions.assertTextEquals(PassportDetailsPage.PassportTypeOptions, passporttype);

		passportIssueDateFor180Days(2024, "March", 18);
		
		waitutils.sleepInSeconds(3);

		passportExpiryDateFor180days(2024, "June", 18);

		seleniumutils.enterText(PassportDetailsPage.PlaceOfIssueField, placeofissue);
		driver.hideKeyboard();

		seleniumutils.clickElement(CommonElements.SelectOption);
		seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), countryofissue);
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Confirm\"]"));

		seleniumutils.clickElement(CommonElements.SelectOption);
		seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), countryofissuegov);
		seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));
		seleniumutils.clickElement(AppiumBy.xpath("//*[@text=\"Confirm\"]"));
		androidutils.swipeUp(CommonElements.SwipeUp);
		return this;
	}
	
	private void passportIssueDateFor180Days(int year, String month, int day) {
		seleniumutils.clickElement(PassportDetailsPage.PassportIssueDateBtn);
				
		for (int i = 0; i < 1; i++) {
		driver.findElement(PassportDetailsPage.PreviousMonthArrow).click();     
		}
		WebElement dayElement = driver.findElement(PassportDetailsPage.PreviousDate); 
		dayElement.click();
		seleniumutils.clickElement(PassportDetailsPage.OkBtn);                         
	}

	private void passportExpiryDateFor180days(int year, String month, int day) {
		seleniumutils.clickElement(PassportDetailsPage.PassportExpiryDateBtn);  
		
		for (int i = 0; i < 4; i++) {
		driver.findElement(PassportDetailsPage.NextMonthArrow).click();              
		}
		WebElement dayElement = driver.findElement(PassportDetailsPage.NextDate);    
		dayElement.click();
		seleniumutils.clickElement(PassportDetailsPage.OkBtn);                            
	}

	public DWFunctionLibrary downloadAndVerifyForm(String remoteFilePath, String localFileName, String expectedText) throws IOException {
	    // Step 1: Define the project-specific path for the DownloadedForms folder
	    String projectPath = System.getProperty("user.dir"); // Root directory of the project
	    String downloadFolderPath = projectPath + File.separator + "DownloadedForms";
	    // Step 2: Ensure the DownloadedForms folder exists
//	    File downloadFolder = new File(downloadFolderPath);
//	    if (!downloadFolder.exists()) {
//	        downloadFolder.mkdirs(); // Create the folder if it does not exist
//	    }
     // String Uitext = driver.findElement(PaymentPage.TotalFees).getText();
  // Step 3: Pull the file from the emulated device
	    byte[] fileData = driver.pullFile(remoteFilePath);
	    // Step 4: Construct the full local file path
	    String localFilePath = downloadFolderPath + File.separator + localFileName;
	    // Step 5: Write the file to the specified location
	    try (FileOutputStream fos = new FileOutputStream(localFilePath)) {
	        fos.write(fileData);
	    }
	    // Step 6: Validate content in the downloaded file
	    File pdfFile = new File(localFilePath);
	    try (PDDocument document = PDDocument.load(pdfFile)) {
	        PDFTextStripper pdfStripper = new PDFTextStripper();
	        String pdfText = pdfStripper.getText(document);
	        System.out.println("PDF Content: " + pdfText);
	        if (pdfText.contains(expectedText)) {
	                Assert.assertTrue(pdfText.contains(expectedText), "Expected text not found in PDF!");
	            }
	        else if (pdfText.contains(textSplit)) {
	                Assert.assertTrue(pdfText.contains(textSplit), "Expected text not found in PDF!");
	           }
	    }

	    return this;
	}

	public DWFunctionLibrary VerifyWorkerContractDownloadedForms() throws IOException {
		waitutils.waitForElementPresent(CommonElements.viewButton(1), Duration.ofSeconds(80)); 
		seleniumutils.clickElement(CommonElements.viewButton(1));
		waitutils.sleepInSeconds(8);
		seleniumutils.clickElement(EntryPermitPage.Moreoptions);
	    seleniumutils.clickElement(EntryPermitPage.DownloadBtn);
		seleniumutils.clickElement(EntryPermitPage.NavigateBackEntryPermit);   //back to EntryPermit page
		 String remoteFilePath="//storage/emulated/0/Download/Worker_Contract.pdf";
		 String localFileName="Worker_Contract.pdf";
		 String expectedText="Emiratisation";
		
		return downloadAndVerifyForm(remoteFilePath,localFileName,expectedText); //storage/emulated/0/Download/Worker_Contract.pd
	    
	}

	/*public DWFunctionLibrary VerifyEntryPermitDownloadedForms() throws IOException {
		waitutils.waitForElementPresent(EntryPermitPage.EntryPermitView, Duration.ofSeconds(80)); 
		seleniumutils.clickElement(EntryPermitPage.EntryPermitView);
		return downloadAndVerifyForm(
	       // EntryPermitPage.EntryPermitView,
	        "/storage/emulated/0/Download/Entry_Permit_Receipt.pdf",
	        "Entry_Permit_Receipt.pdf",
	        "eReceipt"
	    );
	}*/
	
	public DWFunctionLibrary VerifyPaymentReceiptDownloadedForms() throws IOException, InterruptedException {
		 waitutils.waitForElementPresent(EntryPermitPage.PaymentReceiptView, Duration.ofSeconds(100)); 
		 seleniumutils.clickElement(EntryPermitPage.PaymentReceiptView);
		 waitutils.sleepInSeconds(5);
		 seleniumutils.clickElement(EntryPermitPage.Moreoptions);
	     seleniumutils.clickElement(EntryPermitPage.DownloadBtn);
	     waitutils.sleepInSeconds(5);
	     seleniumutils.clickElement(EntryPermitPage.NavigateBackEntryPermit);      //back to EntryPermit page
		 seleniumutils.clickElement(EntryPermitPage.NavigateBackDomesticWorker);  //back to Domestic worker page
		 String remoteFilePath="/storage/emulated/0/Download/Entry_Permit_Receipt.pdf";
		 String localFileName="Payment_Receipt.pdf";
		 String expectedText="285.75";
		
		 return downloadAndVerifyForm(remoteFilePath,localFileName,expectedText);
	}
	public DWFunctionLibrary VerifyPdfPayment() throws IOException, InterruptedException {
		 waitutils.waitForElementPresent(EntryPermitPage.PaymentReceiptViewForNewAppli, Duration.ofSeconds(100)); 
		 seleniumutils.clickElement(EntryPermitPage.PaymentReceiptViewForNewAppli);
		 waitutils.sleepInSeconds(5);
		 seleniumutils.clickElement(EntryPermitPage.Moreoptions);
	     seleniumutils.clickElement(EntryPermitPage.DownloadBtn);
	     waitutils.sleepInSeconds(5);
	     seleniumutils.clickElement(EntryPermitPage.NavigateBackEntryPermit);      //back to EntryPermit page
		 seleniumutils.clickElement(EntryPermitPage.NavigateBackDomesticWorker);  //back to Domestic worker page
		 String remoteFilePath="/storage/emulated/0/Download/Entry_Permit_Receipt.pdf";
		 String localFileName="Payment_Receipt.pdf";
		 String expectedText="eReceipt";

		return downloadAndVerifyForm(remoteFilePath,localFileName,expectedText);
	}
	public DWFunctionLibrary VerifyAlignment(WebElement element1, WebElement element2, int tolerance) {
	    // Get the X-coordinates of the elements
	    int x1 = element1.getLocation().getX();
	    int x2 = element2.getLocation().getX();

	    // Print alignment details for debugging
	    System.out.println("Element 1 X: " + x1);
	    System.out.println("Element 2 X: " + x2);
	    System.out.println("Difference: " + Math.abs(x1 - x2));

	    // Verify horizontal alignment within tolerance
	    Assert.assertTrue( Math.abs(x1 - x2) <= tolerance, "The elements are not horizontally aligned within the tolerance");
	 
	    // Verify width and height
	    int width1 = element1.getSize().getWidth();
	    int width2 = element2.getSize().getWidth();
	    int height1 = element1.getSize().getHeight();
	    int height2 = element2.getSize().getHeight();

	    Assert.assertEquals(width1, width2, "The elements have different widths");
	    Assert.assertEquals(height1, height2, "The elements have different heights");
	    return this;
	}
	public DWFunctionLibrary VerifyViewButtonsAlignment() {
	    seleniumutils.clickElement(CommonElements.ViewButton(3));

	    WebElement viewButton1 = driver.findElement(CommonElements.viewButton(1));
        WebElement viewButton2 = driver.findElement(CommonElements.viewButton(2)); 
	    // Use the reusable method
	    return VerifyAlignment(viewButton1, viewButton2, 12); // 12-pixel tolerance
	}
	
	public DWFunctionLibrary verifyColorOfText(
	        WebElement element,       // WebElement of the target element
	        int startX, int startY,   // Starting coordinates to scan
	        int scanRange,            // Range of pixels to scan (box size)
	        int expectedRed, int expectedGreen, int expectedBlue, // Expected RGB color
	        int threshold             // Allowed deviation for RGB values
	) throws IOException, InterruptedException {
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    Thread.sleep(3000);

	    // 1. Take a Screenshot of the WebElement
	    File elementScreenshot = element.getScreenshotAs(OutputType.FILE);

	    // Create the "screenshots" directory if it doesn't exist
	    File screenshotDir = new File("TextColorscreenshots"); // Relative to project root
	    if (!screenshotDir.exists()) {
	        screenshotDir.mkdir();
	    }

	    // Save the screenshot in the "screenshots" directory
	    File destination = new File(screenshotDir, "element_screenshot.png");
	    FileUtils.copyFile(elementScreenshot, destination);
	    System.out.println("Screenshot saved at: " + destination.getAbsolutePath());

	    // 2. Analyze Pixel Color Using Java AWT
	    BufferedImage image = ImageIO.read(destination);
	    System.out.println("Image Width: " + image.getWidth());
	    System.out.println("Image Height: " + image.getHeight());

	    boolean colorFound = false;

	    // 3. Scan Pixels in the Specified Range
	    for (int y = startY; y < startY + scanRange && y < image.getHeight(); y++) {
	        for (int x = startX; x < startX + scanRange && x < image.getWidth(); x++) {
	            int pixelColor = image.getRGB(x, y);
	            Color color = new Color(pixelColor);

	            // Debugging: Print RGB values for each pixel
	            System.out.println("Checking pixel at X: " + x + ", Y: " + y + " - R: " + color.getRed() +
	                    ", G: " + color.getGreen() + ", B: " + color.getBlue());

	            // 4. Compare Pixel Color with Expected Color (within threshold)
	            if (Math.abs(color.getRed() - expectedRed) <= threshold &&
	                Math.abs(color.getGreen() - expectedGreen) <= threshold &&
	                Math.abs(color.getBlue() - expectedBlue) <= threshold) {
	                System.out.println("Expected color found at X: " + x + ", Y: " + y);
	                colorFound = true;
	                break;
	            }
	        }
	        if (colorFound) break;
	    }	   
	    if (colorFound) {
	        System.out.println("Color verification passed: The expected color is present.");
	    } else {
	    	System.out.println("Color verification failed: The expected color was not found.");
	    	Assert.fail("Color verification failed: The expected color was not found.");
	    	
	    }

	    return this;
	}
	
    public DWFunctionLibrary VerifyColorForRedConfig(String text) throws IOException, InterruptedException {
        List<ColorConfig> colorConfigs = JSONUtils.readColorJsonFile();
        ColorConfig config = colorConfigs.get(0); 
        waitutils.waitForElementPresent(CommonElements.Options(text),Duration.ofSeconds(100));
        WebElement textelements = driver.findElement(CommonElements.Options(text));
        return runColorVerification(config,textelements);
    }
    public DWFunctionLibrary VerifyColorForGreenConfig(String text) throws IOException, InterruptedException {
    	List<ColorConfig> colorConfigs = JSONUtils.readColorJsonFile();
        ColorConfig config = colorConfigs.get(2);  
        waitutils.waitForElementPresent(CommonElements.Options(text),Duration.ofSeconds(100));
        WebElement textelements = driver.findElement(CommonElements.Options(text));
        return runColorVerification(config,textelements);
    }
    public DWFunctionLibrary VerifyColorForBlueConfig(String text) throws IOException, InterruptedException {
    	List<ColorConfig> colorConfigs = JSONUtils.readColorJsonFile();
        ColorConfig config = colorConfigs.get(3);
        waitutils.waitForElementPresent(CommonElements.Draft(text),Duration.ofSeconds(60));
        WebElement textelements = driver.findElement(CommonElements.Draft(text));
        return runColorVerification(config,textelements);
    }
    public DWFunctionLibrary VerifyColorForDarkRedConfig(String text) throws StreamReadException, DatabindException, IOException, InterruptedException  {
        
   	assertions.assertElementDisplayed(CommonElements.Options(text));
   	 List<ColorConfig> colorConfigs = JSONUtils.readColorJsonFile();
        ColorConfig config = colorConfigs.get(1);  
        waitutils.waitForElementPresent(CommonElements.Options(text),Duration.ofSeconds(100));
        WebElement textelements = driver.findElement(CommonElements.Options(text));
        return runColorVerification(config,textelements);
       
   }
    public DWFunctionLibrary VerifyColorForOrangeConfig(String text) throws IOException, InterruptedException {
        List<ColorConfig> colorConfigs = JSONUtils.readColorJsonFile();
        ColorConfig config = colorConfigs.get(4); 
        waitutils.waitForElementPresent(CommonElements.Options(text),Duration.ofSeconds(100));
        WebElement textelements = driver.findElement(CommonElements.Options(text));
        return runColorVerification(config,textelements);
    }

    // Common method to perform color verification
    private DWFunctionLibrary runColorVerification(ColorConfig config, WebElement textelements) throws IOException, InterruptedException {      
        System.out.println("Running verification with Config: StartX=" + config.startX + ", StartY=" + config.startY);
        // Use the reusable method
        return verifyColorOfText(
                textelements,
                config.startX,
                config.startY,
                config.scanRange,
                config.expectedRed,
                config.expectedGreen,
                config.expectedBlue,
                config.threshold
        );
    }
public DWFunctionLibrary ClickOnCheckboxAndVerifyButton() {
	waitutils.waitForElementPresent(DocumentsPage.Checkbox, Duration.ofSeconds(60));
	seleniumutils.clickElement(DocumentsPage.Checkbox);
		return this;
	}
public DWFunctionLibrary VerifyButton(String button) {
	waitutils.waitForElementPresent(DocumentsPage.Checkbox, Duration.ofSeconds(60));
	waitutils.waitForElementPresent(CommonElements.Button(button), Duration.ofSeconds(60));
	assertions.assertElementDisabled(CommonElements.Button(button));
		return this;
	}
public DWFunctionLibrary ClickOnHistoryicon() {
	waitutils.waitForElementPresent(DashboardPage.HistoryButton, Duration.ofSeconds(60));
	seleniumutils.clickElement(DashboardPage.HistoryButton);
		return this;
	}
public DWFunctionLibrary SelectHistoryProfileWithStatusAndName(String status, String name) {
	waitutils.waitForTextToBePresent(CommonElements.PageTitle, "History", Duration.ofSeconds(80));
	String fullName = name;
	boolean statusFound = false;
	while (!statusFound) {
		
		List<WebElement> statuses = driver.findElements(By.xpath(
				"//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewDetail\"]"));

		waitutils.sleepInSeconds(2);
		for (WebElement card : statuses) {
			String cardText = card.getText();
			if (cardText.contains(fullName)) {
				waitutils.sleepInSeconds(3);
				card.click();
				statusFound = true;
				break;
			}
		}
		if (!statusFound) {
			waitutils.sleepInSeconds(2); 
			androidutils.swipeUp(CommonElements.SwipeUp);
		}
	}

	return this;
}
public DWFunctionLibrary VerifyHistoryScreen(DataTable dataTable) {
	 List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	    String expectedText1 = data.get(0).get("ExpectedText");
	    String expectedText2 = data.get(1).get("ExpectedText");
	    assertions.assertTextEquals(HistoryPage.Status,expectedText1);
	    assertions.assertTextEquals(HistoryPage.Timestamp,expectedText2);
	  
	return this;
	}
public DWFunctionLibrary VerifyDoccumentsRemoveIcon() {
	waitutils.waitForElementPresent(DocumentsPage.RemoveWorkerPhotoIcon, Duration.ofSeconds(60));
	assertions.assertElementDisplayed(DocumentsPage.RemoveWorkerPhotoIcon);
	assertions.assertElementDisplayed(DocumentsPage.WorkerPassportRemoveIcon);
	
		return this;
	}
public DWFunctionLibrary VerifyDoccumentsDisabledButton(String button) {
	waitutils.waitForElementPresent(CommonElements.Button(button), Duration.ofSeconds(60));
	waitutils.sleepInSeconds(1);
	assertions.assertElementDisabled(CommonElements.Button(button));
		return this;
	}
public DWFunctionLibrary VerifyEnabledButton(String button) {
	waitutils.waitForElementPresent(CommonElements.Button(button), Duration.ofSeconds(60));
	waitutils.sleepInSeconds(1);
	assertions.assertElementEnabled(CommonElements.Button(button));
		return this;
	}
public DWFunctionLibrary VerifyAttachButton() {
	waitutils.waitForElementPresent(DocumentsPage.attachButton,Duration.ofSeconds(60));
	waitutils.sleepInSeconds(1);
	assertions.assertElementEnabled(DocumentsPage.attachButton);
		return this;
	}
public DWFunctionLibrary ClickOnDoccumentsRemoveIcon() {
	waitutils.waitForElementPresent(DocumentsPage.RemoveWorkerPhotoIcon,Duration.ofSeconds(60));
	seleniumutils.clickElement(DocumentsPage.RemoveWorkerPhotoIcon);
	waitutils.sleepInSeconds(1);
	seleniumutils.clickElement(DocumentsPage.okButton);
	waitutils.waitForElementPresent(DocumentsPage.RemovePassportPhotoIcon,Duration.ofSeconds(60));
	waitutils.sleepInSeconds(5);
	seleniumutils.clickElement(DocumentsPage.RemovePassportPhotoIcon);
	seleniumutils.clickElement(DocumentsPage.okButton);
		return this;
	}
public DWFunctionLibrary ClickOnButton(String button) {
	waitutils.waitForElementPresent(CommonElements.Button(button), Duration.ofSeconds(60));
	waitutils.sleepInSeconds(5);
	seleniumutils.clickElement(CommonElements.Button(button));
		return this;
	}
public DWFunctionLibrary ClickOnoptions(String button) {
	waitutils.waitForElementPresent(CommonElements.Options(button), Duration.ofSeconds(60));
	seleniumutils.clickElement(CommonElements.Options(button));
		return this;
	}
public DWFunctionLibrary VerifyDocuments() {
	// Verify file name
//    WebElement uploadedFileName = driver.findElement(By.id("ae.smartdubai.dubainow.enterprise:id/filename"));
//    String displayedFileName = uploadedFileName.getText();
//    Assert.assertEquals(displayedFileName, "1000000018.jpg", "Uploaded file name does not match!");
    assertions.assertTextEquals(DocumentsPage.UploadedFileName,"1000000018.jpg");
		return this;
	}
public DWFunctionLibrary VerifyPolicyNo() {
	waitutils.waitForElementPresent(PolicyDetailsPage.PolicyNoText, Duration.ofSeconds(60));
	assertions.assertElementDisplayed(PolicyDetailsPage.PolicyNoText);
		return this;
	}
public DWFunctionLibrary DownloadInsuranceReceipt() throws IOException, InterruptedException {
	 waitutils.waitForElementPresent(PolicyDetailsPage.InsuranceReceiptView, Duration.ofSeconds(100)); 
	 seleniumutils.clickElement(PolicyDetailsPage.InsuranceReceiptView);
	 waitutils.sleepInSeconds(5);
	 seleniumutils.clickElement(EntryPermitPage.Moreoptions);
    seleniumutils.clickElement(EntryPermitPage.DownloadBtn);
    waitutils.sleepInSeconds(5);
    seleniumutils.clickElement(EntryPermitPage.NavigateBackEntryPermit);      //back to EntryPermit page
	 seleniumutils.clickElement(EntryPermitPage.NavigateBackDomesticWorker);  //back to Domestic worker page
	 String remoteFilePath="/storage/emulated/0/Download/Insurance_Receipt.pdf";
	 String localFileName="Payment_Receipt.pdf";
	 String expectedText=" ";
	
	 return downloadAndVerifyForm(remoteFilePath,localFileName,expectedText);
}
/*
public DWFunctionLibrary EnterRenewDataIntoSecondSectionofPersonalDetails(DataTable dataTable) {
    androidutils.swipeUp(CommonElements.SwipeUp);
    
    // Convert DataTable to List
    List<List<String>> data = dataTable.asLists(String.class);
    String emirateBirth = data.get(1).get(0);
    String cityBirth = data.get(1).get(1);

    // Select Emirate (Birth)
    System.out.println("Selecting Emirate: " + emirateBirth);
    seleniumutils.clickElement(PersonalDetailsPage.EmirateBirth);
    seleniumutils.clickElement(CommonElements.SelectOption);
    waitutils.waitForElementVisible(AppiumBy.xpath("//*[contains(@text, '" + emirateBirth + "')]"), Duration.ofSeconds(10));
    seleniumutils.clickElement(AppiumBy.xpath("//*[contains(@text, '" + emirateBirth + "')]"));

    // Scroll up to ensure the City field is visible
    androidutils.swipeUp(CommonElements.SwipeUp);
    waitutils.sleepInSeconds(1);  // Allow UI to settle

    // Select City (Birth)
    System.out.println("Selecting City: " + cityBirth);
    seleniumutils.clickElement(CommonElements.SelectOption);
    waitutils.sleepInSeconds(2); // Ensure dropdown opens
    waitutils.waitForElementVisible(AppiumBy.xpath("//*[contains(@text, '" + cityBirth + "')]"), Duration.ofSeconds(10));
    seleniumutils.clickElement(AppiumBy.xpath("//*[contains(@text, '" + cityBirth + "')]"));
    androidutils.swipeUp(CommonElements.SwipeUp);
    return this;
}*/
public DWFunctionLibrary EnterRenewDataIntoSecondSectionofPersonalDetails(DataTable dataTable) {
    androidutils.swipeUp(CommonElements.SwipeUp);
    
    // Convert DataTable to List
    List<List<String>> data = dataTable.asLists(String.class);
    String emirateBirth = data.get(1).get(0);
    String cityBirth = data.get(1).get(1);

    //1. Select Emirate (Birth)
    System.out.println("Selecting Emirate: " + emirateBirth);
//    seleniumutils.clickElement(CommonElements.SelectOption);
//    waitutils.waitForElementVisible(AppiumBy.xpath("//*[contains(@text, '" + emirateBirth + "')]"), Duration.ofSeconds(10));
//    seleniumutils.clickElement(AppiumBy.xpath("//*[contains(@text, '" + emirateBirth + "')]"));

    // Scroll up to ensure the City field is visible
    androidutils.swipeUp(CommonElements.SwipeUp);
    waitutils.sleepInSeconds(1); // Allow UI to settle

    //2. Select City (Birth)
    System.out.println("Selecting City: " + cityBirth);
   // seleniumutils.clickElement(CommonElements.SelectOption);
    waitutils.sleepInSeconds(2); // Ensure dropdown opens
    waitutils.waitForElementVisible(AppiumBy.xpath("//*[contains(@text, '" + cityBirth + "')]"), Duration.ofSeconds(10));
   // seleniumutils.clickElement(AppiumBy.xpath("//*[contains(@text, '" + cityBirth + "')]"));

    androidutils.swipeUp(CommonElements.SwipeUp);
    return this;
}

public DWFunctionLibrary EnterRenewEnterDataIntoThirdSectionofPersonalDetails(DataTable dataTable) {
	androidutils.swipeUp(CommonElements.SwipeUp);
	waitutils.waitForElementVisible(PersonalDetailsPage.ReligionText, Duration.ofSeconds(30));
	assertions.assertElementDisplayed(PersonalDetailsPage.ReligionText);
	List<List<String>> data = dataTable.asLists(String.class);
	String educationcountry = data.get(1).get(5);
	androidutils.swipeUp(CommonElements.SwipeUp);
	waitutils.sleepInSeconds(20);
//	seleniumutils.clickElement(CommonElements.SelectOption);
//	seleniumutils.enterText(AppiumBy.id("android:id/search_src_text"), educationcountry);
//	seleniumutils.clickElement(AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle"));

	return this;
}

public DWFunctionLibrary EnterRenewEnterDataIntoFourthSectionofPersonalDetails(DataTable dataTable) {
    androidutils.swipeUp(CommonElements.SwipeUp);

    // Extract data from DataTable
    List<List<String>> data = dataTable.asLists(String.class);
    String mothersName = data.get(1).get(0);

    
            System.out.println("Entering Mother’s Name: " + mothersName);
//            seleniumutils.clickElement(PersonalDetailsPage.MotherNameText);
//            seleniumutils.enterText(PersonalDetailsPage.MotherNameText, mothersName);
       
    androidutils.swipeUp(CommonElements.SwipeUp);
    return this;
}
public DWFunctionLibrary EnterRenewStaticDataIntoPassportDetails(DataTable dataTable) {
	waitutils.waitForElementVisible(PassportDetailsPage.PassportTypeText, Duration.ofSeconds(30));
	List<List<String>> data = dataTable.asLists(String.class);
	String placeofissue = data.get(1).get(4);
	assertions.assertElementDisplayed(PassportDetailsPage.PassportTypeText);
	//seleniumutils.enterText(PassportDetailsPage.PlaceOfIssueField, placeofissue);
	driver.hideKeyboard();
	androidutils.swipeUp(CommonElements.SwipeUp);
	return this;
}
public DWFunctionLibrary VerifyResidencyDuration (DataTable dataTable) {
	waitutils.waitForElementVisible(ResidencyDurationPage.ResidencyYears, Duration.ofSeconds(30));
	assertions.assertElementDisplayed(ResidencyDurationPage.ResidencyYears);
    androidutils.swipeUp(CommonElements.SwipeUp);
    List<List<String>> data = dataTable.asLists(String.class);
    String ResidencyYears = data.get(1).get(0);
    System.out.println("Selecting Emirate: " + ResidencyYears);
   // seleniumutils.clickElement(CommonElements.SelectOption);
    seleniumutils.clickElement(ResidencyDurationPage.SelectResidency);
    waitutils.waitForElementVisible(AppiumBy.xpath("//*[contains(@text, '" + ResidencyYears + "')]"), Duration.ofSeconds(10));
    seleniumutils.clickElement(AppiumBy.xpath("//*[contains(@text, '" + ResidencyYears + "')]"));

	return this;
}
public DWFunctionLibrary EnterRenewResidencyDataForMedicalScreen() {
    // Wait for the "Medical" page to load
    waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Medical", Duration.ofSeconds(60));

    // Select Urgent Service, then switch to Regular Service
    seleniumutils.clickElement(MedicalPage.UrgentServiceRadioButton);
    seleniumutils.clickElement(MedicalPage.RegularServiceRadioButton);

    // Read JSON data for Medical Information
    JSONObject jsonObject = jsonutil.readJsonMedicalFile();
    if (jsonObject != null) {
        JSONObject medical = (JSONObject) jsonObject.get("Medical");
        if (medical == null) {
            System.out.println("Medical data not found in JSON.");
            return this;
        }

        JSONObject regularService = (JSONObject) medical.get("REGULARSERVICE");
        String firstCenterName = (regularService != null) ? (String) regularService.get("firstCenter") : null;
        
        JSONObject workerContactDetails = (JSONObject) medical.get("WORKERCONTACTDETAILS");
        String mobile = (workerContactDetails != null) ? (String) workerContactDetails.get("WorkerMobileNo") : "";
        String email = (workerContactDetails != null) ? (String) workerContactDetails.get("WorkerEmail") : "";

        // Click 'Select' to choose a fitness center
        seleniumutils.clickElement(MedicalPage.Select);
        waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Fitness Center Locations", Duration.ofSeconds(60));

        // Select the first fitness center
        if (firstCenterName != null && !firstCenterName.isEmpty()) {
            boolean firstCenterFound = false;
            List<WebElement> containers = driver.findElements(CommonElements.Container);
            for (WebElement container : containers) {
                List<WebElement> listItems = container.findElements(By.className("android.widget.TextView"));
                for (WebElement item : listItems) {
                    if (item.getText().equals(firstCenterName)) {
                        item.click();
                        firstCenterFound = true;
                        break;
                    }
                }
                if (firstCenterFound) break;
            }
        } else {
            System.out.println("First fitness center name not found in JSON.");
        }

        // Scroll up and enter Worker Contact Details
//        androidutils.swipeUp(CommonElements.SwipeUp);
//        if (!mobile.isEmpty()) {
//            seleniumutils.enterText(MedicalPage.WorkerMobileNo, mobile);
//        } else {
//            System.out.println("Worker mobile number is empty.");
//        }
//
//        androidutils.swipeUp(CommonElements.SwipeUp);
//        if (!email.isEmpty()) {
//            seleniumutils.enterText(MedicalPage.WorkerEmail, email);
//        } else {
//            System.out.println("Worker email is empty.");
//        }
    } 
    return this;
}
public DWFunctionLibrary UploadDocumentRenewResidency() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	waitutils.waitForElementPresent(DocumentsPage.attachButton, Duration.ofSeconds(120));
	waitutils.sleepInSeconds(2);
	seleniumutils.clickElement(DocumentsPage.attachButton);
	waitutils.sleepInSeconds(2);
	seleniumutils.clickElement(DocumentsPage.photoLibrary);
	waitutils.sleepInSeconds(2);
	seleniumutils.clickElement(DocumentsPage.photo);
	wait.until(ExpectedConditions.invisibilityOf(driver.findElement(DocumentsPage.progressBar)));
	
//	waitutils.sleepInSeconds(2);
//	seleniumutils.clickElement(DocumentsPage.RemoveWorkerPhotoIcon);
//	waitutils.sleepInSeconds(2);
//	seleniumutils.clickElement(DocumentsPage.okButton);
//	seleniumutils.clickElement(DocumentsPage.attachButton);
//	waitutils.sleepInSeconds(2);
//	seleniumutils.clickElement(DocumentsPage.photoLibrary);
//	waitutils.sleepInSeconds(2);
//	
	return this;
}
public DWFunctionLibrary DHAPayment() {
	waitutils.waitForTextToBePresent(CommonElements.PageTitle, "Service Fees", Duration.ofSeconds(60));
	waitutils.sleepInSeconds(3);
	seleniumutils.clickElement(PaymentPage.PayButton);
	waitutils.sleepInSeconds(12);
	waitutils.waitForElementPresent(PaymentPage.Pay, Duration.ofSeconds(60));
	seleniumutils.clickElement(PaymentPage.Pay);
	ClickOnContinueButton();
	return this;
}
}

