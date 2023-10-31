package com.adactin.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature", 
glue = "com.adactin.stepdefinition",
monochrome = true
,dryRun = false,strict = true,
tags = "@login,@searchhotel,@selecthotel",
plugin= {"html:AdactinReports/Adactin_Html_Report","pretty",
		"json:AdactinReports/Adactin_Json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:AdactinReports/Adactin_Extent_Report.html"})
public class AdactinRunnerClass {
	public static WebDriver driver;

	
	@BeforeClass
	public static void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
	}

	@AfterClass
	public static void Browserclose() { 
		driver.close();
	}
}
