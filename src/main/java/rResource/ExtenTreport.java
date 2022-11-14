package rResource;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;

public class ExtenTreport extends BaseS {
	
	public WebDriver driver;
	public ExtentSparkReporter reporter;
	public ExtentReports extent;
	
	public ExtentReports RepoConfi()
	{
		String path= System.getProperty("user.dir")+"\\reportFile\\index.html";
		reporter =new ExtentSparkReporter(path);
		
		reporter.config().setReportName("Web auto");
		reporter.config().setDocumentTitle("test Result");
		
		extent =new ExtentReports();
		extent.attachReporter(reporter);
		
	extent.setSystemInfo("tester", "aks");
		//extent.flush();
		return extent;
	}
	
	

}

