package com.runall;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature", glue = "com.sample", dryRun = false, 
monochrome = true, strict = true, plugin = {"pretty",
		"html:C:\\Users\\ayoth\\eclipse-workspace\\As\\allreport\\htmlreport" ,
		"json:C:\\Users\\ayoth\\eclipse-workspace\\As\\allreport\\jsonreport\\fb.json",
		"junit:C:\\Users\\ayoth\\eclipse-workspace\\As\\allreport\\junitreport\\fb.xml",
		""})

public class Runall {
     @AfterClass
     public static void report() {

    	 Jvmreports.generatereport(System.getProperty("user.dir")+("\\As\\JVmreport"));
     	 
    	 
    	 
	}
}
