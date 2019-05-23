package testrun;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
@CucumberOptions( features="src/test/java/features",
				  glue="stepdefinations"
				 )
public class testRunner extends AbstractTestNGCucumberTests{

}


