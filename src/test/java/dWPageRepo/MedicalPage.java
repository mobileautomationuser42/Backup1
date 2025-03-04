package dWPageRepo;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;

public class MedicalPage {

    private static By generateTitleLocator(String text) {
        return AppiumBy.xpath(String.format(
            "//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"%s\"]",
            text));
    }

    private static By generateEditTextLocator(String text) {
        return AppiumBy.xpath(String.format(
            "//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\" and @text=\"%s\"]",
            text));
    }
    
    private static By generateRadioButtonLocator(int index) {
        return AppiumBy.xpath(String.format(
            "(//android.widget.CheckBox[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/checkBox\"])[%d]", index));
    }

    public static By FitnessService = generateTitleLocator("FITNESS SERVICE - URGENCY TYPES");
    public static By VIPService = generateTitleLocator("VIP SERVICE(30MIN)");
    public static By RegularService = generateTitleLocator("REGULAR(24HRS)");
    public static By UrgentService = generateTitleLocator("URGENT(6HRS)");
    
    public static By VIPServiceRadioButton = generateRadioButtonLocator(1);
    public static By RegularServiceRadioButton = generateRadioButtonLocator(2);
    public static By UrgentServiceRadioButton = generateRadioButtonLocator(3);
    
    public static By MedicalFitnessCenters = generateTitleLocator("MEDICAL FITNESS CENTERS");
    public static By FitnessCenter = generateTitleLocator("Fitness Center");
    
    public static By WorkerContactDetails = generateTitleLocator("WORKER CONTACT DETAILS");    
    public static By WorkerMobileNo = generateEditTextLocator("Worker Mobile Number (+9715xxxxxxxx)");
    public static By WorkerEmail = generateEditTextLocator("Worker email Address");
    
    public static By ChangeCenter = AppiumBy.xpath("//android.widget.Button[@text='Change Center']");
    
    public static By Select = AppiumBy.xpath("//android.widget.Button[@text='Select']");
    
    //Medical Test Page
    public static By MedicalTestInfo = generateTitleLocator("Medical Test Info");
    public static By ApplicationAppNo = generateTitleLocator("Application No.");
    public static By MedicalAppNo = generateTitleLocator("Medical App. No.");
    public static By Status = generateTitleLocator("Status");
    
    public static By MedicalFitnessCenterLocation = generateTitleLocator("Medical Fitness Center Location");
  
    public static By Documents = generateTitleLocator("Documents");
    public static By PaymentReceipt = generateTitleLocator("Payment Receipt");


}
