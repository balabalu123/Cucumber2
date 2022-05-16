package org.baseclass;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class CucumberJVMReport {
	public static void generateReport(String json) {
		
		

		File f = new File("C:\\Users\\balua\\eclipse-workspace\\Cucumber2\\src\\test\\resources\\Report");

		Configuration config = new Configuration(f, "Cucumber");
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("Platform", "Windows");
		config.addClassifications("Build", "1.7.3");
		
		List<String>li= new LinkedList<String>();
		li.add(json);
		
		ReportBuilder rep = new ReportBuilder(li, config);
		rep.generateReports();
		
		
		
		}


}
