package com.ebay.scenario.based.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.fail;

public class ActorClickOnToAdvanceSearchInEbayHomePage {
    WebDriver webDriver;
    @Given("As an User I am on Ebay Home Page")
    public void as_an_User_I_am_on_Ebay_Home_Page() {
        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.ebay.com/");
    }

    @When("I click on The Advanced Search Link")
    public void i_click_on_The_Advanced_Search_Link() {
        webDriver.findElement(By.linkText("Advanced")).click();
   }

    @Then("I Navigate to the Advance Search Page")
    public void i_Navigate_to_the_Advance_Search_Page() {
        String expURL = "https://www.ebay.com/sch/ebayadvsearch";
        String actURL = webDriver.getCurrentUrl();
        if(!expURL.equals(actURL)){
            fail("Page does not navigate to the expected Page");
        }
    }


}
