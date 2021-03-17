package com.core.test.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.core.main.browserutilities.LaunchBrowser;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchCriteriaStepDefinitions {
			AdvancedSearch browser = new AdvancedSearch();
	static WebDriver driver = LaunchBrowser.driver;
	
	@Given("I am an guest user searching cars autotrader")
	public void i_am_an_guest_user_searching_cars_autotrader() {
	//	driver.get("https://www.autotrader.com/cars-for-sale/advanced-search");
		browser.advance_search_page_navigate();
	  //  throw new io.cucumber.java.PendingException();
	}

	@When("navigated to the advanced search page")
	public void navigated_to_the_advanced_search_page() {
	   String Title = driver.getTitle();
	   Title.getClass();
	   String Title2 = driver.findElement(By.className("text-xlg text-light")).getText();
	   
	if ( Title2.contains("Search Cars for Sale")) {
		  System.out.println("Advance Search page opened");
	}
	 //   throw new io.cucumber.java.PendingException();
	}
	
	@And("enter values in zipcode as <zipcode>")
	public void enter_values_in_zipcode_as_zipcode() {
	    
		driver.findElement(By.id("zip48577207")).sendKeys("ZIPCODE");
	//    throw new io.cucumber.java.PendingException();
	}
	@And("select condition as <condition>")
	public void select_condition_as_condition() {
	browser.advance_search_page_navigate();
	browser.selectVehicleCondition("condition");
	   // throw new io.cucumber.java.PendingException();
	}
	@And("select Style as <Style>")
	public void select_style_as_style() {
	    browser.selectVehicleCondition("vehsytle");
	    //throw new io.cucumber.java.PendingException();
	}
	@And("update year as <From> and <To>")
	public void update_year_as_from_and_to() {
		browser.selectStartYear("2017");
		browser.selectEndYear("2020");
		
	    // throw new io.cucumber.java.PendingException();
	}
	@When("selct vehicle make <make>")
	public void selct_vehicle_make_make() {
	    
		browser.selectMake("BMW");
	  //  throw new io.cucumber.java.PendingException();
	}
	
	@And("click on the submit button")
	public void click_on_the_submit_button(io.cucumber.datatable.DataTable dataTable) {
		browser.submitbutton("search");
	   // throw new io.cucumber.java.PendingException();
	}
	@And("navigated to search criteria page")
	public void navigated_to_search_criteria_page() {
	    browser.searchtitle("Certified BMW Convertibles for Sale in Alpharetta, GA");
	  //  throw new io.cucumber.java.PendingException();
	}
	@Then("I validate the resutls <count>")
	public void i_validate_the_resutls_count() {
	  browser.resultcount();
	    throw new io.cucumber.java.PendingException();
	}
	@And("check the name of the cars as per the selected criteria")
	public void check_the_name_of_the_cars_as_per_the_selected_criteria() {
		browser.searchlink("BMW");
	  
	  
	  //  throw new io.cucumber.java.PendingException();
	}
}
