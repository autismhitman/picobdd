package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import pojos.Customer;

public class DataTableSteps {

@DataTableType 
public Customer customerEntry(DataTable dataTable) {
	
	return new Customer(dataTable.row(0).get(1), dataTable.row(1).get(1));
}

@Given("my credentials")
public void my_credentials( Customer customer) {
         
	    System.out.println(customer.getUname());
	    System.out.println(customer.getPwd());
     }

}
