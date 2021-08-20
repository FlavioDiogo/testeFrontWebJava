package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * 
 * @author Flavio
 *
 */


@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/features", 
		glue = "tests", 
		tags = "@executa", 
		dryRun = false, 
		monochrome = true, 
		plugin = {"pretty", "html:target/report.html" }

)

public class ExecutaTeste {

}