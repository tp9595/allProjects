package org.runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/org/features/Feat_02Ceate_User.feature",
				glue= {"org.AppHooks","StepDefs"},
				monochrome=true,
				dryRun =false,
				plugin = {"pretty",               //To generate reports
						"html:Reports/Other/report.html",  //cucumber report
						"json:Reports/Other/report.json",  //json report
						"junit:Reports/Other/report.xml",  //junit report
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" // extent/spark report available in html
						
}
)

public class RunnerClass {

}
