package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber.html"}, 	 
		glue = {"stepdefinitions","pages","pojos","drivers","constants","customType","util"},
	    features = {"src/test/resources/features/AddProductToCart.feature"},
	    dryRun= false
		)//AddProductToCart.feature//guest_place_an_order.feature

public class RunnerTest extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}

}
