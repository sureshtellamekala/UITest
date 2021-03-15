package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\sures\\eclipse-workspace\\Equifax_Test\\src\\main\\java\\Features",
		glue= {"StepDefinitions"},
		//plugin = {"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"}
		format= {"pretty","html:test-outout"}
		)

public class TestRunner {

}
