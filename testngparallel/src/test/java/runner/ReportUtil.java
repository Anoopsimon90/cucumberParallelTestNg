package runner;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ReportUtil
{
    public static ExtentReports testreporters;

    public ExtentTest startTest(String testName)
    {
        if(testreporters != null)
        {
            return testreporters.startTest(testName);
        }

        return null;
    }



}
