package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
/**
 * @author sathish
 * @date ${22/8/22}
 *  Project name: ${Adactin_hotel}  
 *  JVM Report
 * 
 * 
 */
public class Reporting {
	/**
	 * 
	 *
	 *
	 *
	 */
	public static void generateJvmReport(String jsonFile) {
		
		File file=new File(System.getProperty("user.dir")+"\\target\\finalReport.html");
		
		Configuration configuration=new Configuration(file, "adctinTestReport");
		
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Browser Version", "104");
		configuration.addClassifications("Os", "Win 10");
		configuration.addClassifications("Sprint", "34");
		
		List<String> list=new ArrayList<String>();
		list.add(jsonFile);
		
		ReportBuilder builder=new ReportBuilder(list, configuration);
		builder.generateReports();
	
	
	}
	
	
}
