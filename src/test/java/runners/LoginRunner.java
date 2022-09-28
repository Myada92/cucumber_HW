package runners;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
features = "classpath:features",
	glue = "steps",
	tags = "@HomeworkLoginfeature", //to run whatever feature that i want if i have more than one features just put the name of the feature here
	//we can make a matching tag for more than one scenario and then put it in the tag name example @smoke
	//also if we want to make regrression test we just ADD TAG N A TOP OF FEATURE @REGRRESSION
	monochrome= true,// TO make the CONSOLE OUTPUT BE READABLE
	plugin = {
	"pretty", 
	"html:target/cucumber",
	"json:target/cucumber.json",
	}
		)

public class LoginRunner {

}
