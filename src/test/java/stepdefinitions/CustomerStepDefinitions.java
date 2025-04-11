package stepdefinitions;

import context.TestContext;
import io.cucumber.java.en.Given;
import pages.PageManager;
import pojos.BillingDetails;

public class CustomerStepDefinitions {
	
	TestContext context;
	 
	
	public CustomerStepDefinitions(TestContext context) {
		this.context = context;
	}
	
	@Given("I'm a guest customer")
	public void i_m_a_guest_customer() {
		PageManager.getSp().navigateToStore();

	}
	
	@Given("my billing details are")
	public void my_billing_details_are(BillingDetails billingDetails) {
	   context.billingDetails = billingDetails;
	 
	}
	
	

}
