package com.ebay.scenario.based.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActorClickOnToAdvanceSearchInEbayHomePage {
    @Given("As an User I am on Ebay Home Page")
    public void as_an_User_I_am_on_Ebay_Home_Page() {
        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.ebay.com/");
    }

    @When("I click on The Advanced Search Link")
    public void i_click_on_The_Advanced_Search_Link() {
        // Write code here that turns the phrase above into concrete actions
   }

    @Then("I Navigate to the Advance Search Page")
    public void i_Navigate_to_the_Advance_Search_Page() {
        // Write code here that turns the phrase above into concrete actions
    }


}
