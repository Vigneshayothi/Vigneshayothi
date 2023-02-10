package com.runall;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Jvmreports {
   
    	public static void generatereport(String jsonpath) {

    		File f = new File(System.getProperty("user.dir"), ("\\As\\JVmreport"));
    		
    		
    		Configuration c = new Configuration(f, "FACEBOOK APPLICATION ");
              c.addClassifications("platform", "window");    		
    		  c.addClassifications("sprint", "file");
    		  c.addClassifications("jdk version", "1.8"); 
    		
    		
    		List<String> l = new ArrayList<String>();
    		l.add(jsonpath);
    		
    		ReportBuilder r = new ReportBuilder(l, c);
    		r.generateReports();
    		
		}
    	 
    
	
}
