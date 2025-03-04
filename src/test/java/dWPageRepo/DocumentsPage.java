package dWPageRepo;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class DocumentsPage {

	public static By UploadDocumentsLabel = AppiumBy.xpath("//*[contains(@text,\"Upload Documents\")]");
	
	public static By DomesticWorkerDocuments = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Domestic Worker Documents\"]");
	
	//public static By DigitalSignature = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Digital Signature\"]");
	public static By DigitalSignature = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"e-signature\"]");
	
	public static By SponsorSignature = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/textViewName");
	
	public static By Sign = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/textViewBtnTitle");
	 
    public static By SignatureUpdatedSuccessfully = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/textViewDesc");
	
	public static By View = AppiumBy.xpath("//*[@text='View']");
	
	public static By Signaturewillbeusedinlabourcontract = AppiumBy.xpath("//*[contains(@text,\"Signature will be used in labour contract\")]");
	
	public static By Checkbox = AppiumBy.className("android.widget.CheckBox");
	
	public static By attachButton = AppiumBy.xpath("(//android.widget.TextView[@resource-id='ae.smartdubai.dubainow.enterprise:id/attachimg'])[1]");
	public static By progressBar = AppiumBy.xpath("//android.widget.ImageView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/progressBarHolderShadow\"]");
	public static By photoLibrary = AppiumBy.xpath("//android.widget.TextView[@resource-id='android:id/text1' and @text='Photo Library']");
	public static By okButton = AppiumBy.id("android:id/button1");
	public static By allowButton = AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button"); 
	//public static By photo = AppiumBy.xpath("//android.widget.ImageView[@resource-id=\"com.google.android.documentsui:id/icon_thumb\"]");
//	public static By photo = AppiumBy.xpath("//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"]");                               
//	public static By photo = AppiumBy.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])[2]");
	
	public static By photo = AppiumBy.xpath("//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"]");
	
	public static By RemoveWorkerPhotoIcon=AppiumBy.xpath("(//android.widget.ImageView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/imageViewDelete\"])[1]");
	public static By RemovePassportPhotoIcon=AppiumBy.xpath("//android.widget.ImageView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/imageViewDelete\"]");
	public static By WorkerPassportRemoveIcon=AppiumBy.xpath("(//android.widget.ImageView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/imageViewDelete\"])[2]");

	public static By UploadedFileName =AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/filename");
	
}
