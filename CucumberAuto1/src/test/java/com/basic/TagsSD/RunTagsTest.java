package com.basic.TagsSD;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
		
	    monochrome	= true,		// To remove junk characters 	
//	    dryRun = true,		// Checks if configuration issue in Future file. For testing purpose
		
//	    tags = {"@Important"},
//	    tags = {"@Smoke"},
//	    tags = {"@Smoke","@Regression"},	// AND Condition
	    tags = {"@Smoke,@Regression"},		// OR Condition
	    
		features = {"src/test/resources/com/basic/TagsFF/"},
		glue = {"com/basic/TagsSD/"},
			
		plugin = {"pretty", 
				  "html:target/cucumber-htmlreport",
//				  "json:target/cucumber-jsonreport/cucumber-jsonreport.json",
				  "json:target/cucumber-jsonreport.json",
				  "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
				  // The formatter is used to generate the Extended report 
				  // And, the report will be stored inside the "target" folder of this particular project 
				  // The name of the report will be "ExtentReport.html"
		}			
	)
		
public class RunTagsTest {		// This class name must be ended with 'Test' to run as 'Maven Test'

}
