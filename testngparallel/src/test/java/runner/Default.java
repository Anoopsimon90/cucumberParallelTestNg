package runner;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.ThreadLocalRandom;

@CucumberOptions(glue = "stepdef",
		plugin = {"json:target/json-cucumber-reports/cukejson.json",
		"testng:target/testng-cucumber-reports/cuketestng.xml" },
		features = "src/test/resources/feature/",
		tags="@loginS"
		)
public class Default extends AbstractTestNGCucumberParallelTests {
	
	private static long duration;
	private  static ExtentReports testreporters;
	//private  static ;;
	ExtentTest test;
	@BeforeClass
	public static void before() {
		duration = System.currentTimeMillis();
		System.out.println("Thread Id  | Scenario Num       | Step Count");
		ReportUtil.testreporters = new ExtentReports(System.getProperty("user.dir")+"/target/testng-cucumber-reports/r.html");
		//test = testreporters.startTest("TC01");

	}
	
	@AfterClass
	public static void after() {
		duration = System.currentTimeMillis() - duration;
		System.out.println("DURATION - "+ duration);
		//test.log(LogStatus.PASS,"All Good");
		//ReportUtil.testreporters.endTest(test);
		ReportUtil.testreporters.flush();
	}

	@BeforeMethod
	public void start()
	{
		System.out.println( "Before Method");
//		test = ReportUtil.testreporters.startTest("TC0"+ ThreadLocalRandom.current().nextInt());
//		test.log(LogStatus.PASS,"Started" );
//		test.log(LogStatus.PASS,"Login" );

	}
	@AfterMethod
	public void end()
	{
//		System.out.println( "After Method");
//		ReportUtil.testreporters.endTest(test);

	}
}
