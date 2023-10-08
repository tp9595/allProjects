package org.tetrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/Resource/org/featurefile/Practice1.feature",
		monochrome =true,
		glue= {"org.StepDefination","org.APPHOOKS"},
				dryRun = false,
		plugin ={"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		})//"json:target/tushar/logs.txt"
				//})
	//"json:target/tushar/logs.txt"
public class practicetest {
	
}

