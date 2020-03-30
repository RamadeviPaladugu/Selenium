package runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


 @RunWith(Cucumber.class)
 @CucumberOptions(
 features = "C:\\Users\\kiran\\workspace\\CucumberDemoTest\\src\\main\\java\\features\\wikiPage.feature"
 ,glue={"stepDefinition"})
		 
 public class TestRunner {

 
 }
 



 

