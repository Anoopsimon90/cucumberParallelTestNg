package stepdef;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import runner.ReportUtil;

import java.io.File;
import java.util.Base64;
import java.util.concurrent.ThreadLocalRandom;

public class LoginStep {

    TestContext testContext;
    ExtentTest test;
    public  LoginStep(TestContext testContext)
    {
        System.out.println("Login Constructor");
        this.testContext = testContext;
    }


    @Given("I login to application")
    public void i_login_to_application()
    {
        ExtentTest testCase= new ReportUtil().startTest("TC1"+ ThreadLocalRandom.current().nextInt(0, 100));
        testCase.log(LogStatus.PASS, "Login to App");
        testContext.openBrowser();
       // driver.get("http://www.bing.com");
        testCase.log(LogStatus.PASS,testCase.addBase64ScreenShot(imageToBase64("C:\\Users\\P756983.AURDEV\\Documents\\dev\\EndToEndCardsAutomation\\HtmlOutput\\BlockCardConfirm.png")));

        ReportUtil.testreporters.endTest(testCase);
    }
    private String imageToBase64(String filePath)
    {
       try {
           byte[] fileContent = FileUtils.readFileToByteArray(new File(filePath));
           return  "data:image/png;base64,"+Base64.getEncoder().encodeToString(fileContent);
       }catch (Exception e)
       {

           e.printStackTrace();
           return null;
       }
    }

}
