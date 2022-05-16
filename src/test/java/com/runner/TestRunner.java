package com.runner;

import org.baseclass.CucumberJVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\CucumberJvmReport.feature",glue="org.stepdefinition",dryRun=false,monochrome=true,plugin= {"pretty","json:C:\\Users\\balua\\eclipse-workspace\\Cucumber2\\src\\test\\resources\\Report\\rep.json"})

public class TestRunner {
	@AfterClass
	public static void report() {
		CucumberJVMReport.generateReport("C:\\Users\\balua\\eclipse-workspace\\Cucumber2\\src\\test\\resources\\Report\\rep.json");
		

	}
	
	
	

}
