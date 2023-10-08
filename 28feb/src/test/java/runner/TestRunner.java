package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/login.features",
     plugin ="html:target/My/cucumber-html-report", 
     glue= {"StepDefinations" ,"Hooks"},monochrome = true,dryRun = false)


public class TestRunner extends AbstractTestNGCucumberTests{
     
	//json:target/tushar/logs.txt
	

}
