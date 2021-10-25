package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchDef {
	@Given("I have a search box on home page")
	public void i_have_a_search_box_on_home_page() {
		 System.out.println("1. search box is displayed");	  
	}

	@When("I search for a macbook with product name {string} and price {int}")
	public void i_search_for_a_macbook_with_product_name_and_price(String string, Integer int1) {
		 System.out.println("2. searched for "+string+ "and the price is "+int1);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String string) {
		 System.out.println("3. Product "+ string+" is displayed ");	   
	}
}
