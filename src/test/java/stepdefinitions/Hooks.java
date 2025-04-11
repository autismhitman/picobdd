package stepdefinitions;

import drivers.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
  
	 @Before
	public static void setup(Scenario scenario) {
		
        Driver.initDriver(System.getProperty("browser","chrome"));
        System.out.println(" Thread id is : " + Thread.currentThread().threadId()); 
        System.out.println("Scenario is : "+ scenario.getName());
	}
	
	 @After
	public static void teardown(Scenario scenario) {
		 System.out.println(" Thread id is : " + Thread.currentThread().threadId()); 
		 System.out.println("Scenario is : "+ scenario.getName());
        Driver.closeDriver(); 

	}
	
	
}
