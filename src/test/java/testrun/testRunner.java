package testrun;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
@CucumberOptions( features="src/test/java/features",
				  glue="stepdefinations",
				  tags="@search",
				  plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"}
				 )
public class testRunner extends AbstractTestNGCucumberTests{

}


