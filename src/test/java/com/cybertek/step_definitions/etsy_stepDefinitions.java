package com.cybertek.step_definitions;

import com.cybertek.pages.EtsySearchPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class etsy_stepDefinitions {
    @Given("user is on the etsy landing page")
    public void user_is_on_the_etsy_landing_page() {
        String url = ConfigurationReader.getProperty("etsyUrl");
        Driver.getDriver().get(url);
    }

    @Then("user should see Etsy title as expected")
    public void user_should_see_etsy_title_as_expected() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue("Title is not as expected!",expectedTitle.equals(actualTitle));

    }
    EtsySearchPage etsySearchPage = new EtsySearchPage();

    @When("user types wooden spoon in the search bar")
    public void user_types_wooden_spoon_in_the_search_bar() {
        etsySearchPage.searchQuery.sendKeys("wooden spoon");
    }
    @When("user clicks to the search button")
    public void user_clicks_to_the_search_button() {
        etsySearchPage.searchButtonEnter.click();
    }
    @Then("user sees title as wooden spoon | etsy")
    public void user_sees_title_as_wooden_spoon_etsy() {
        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue("Title is not as expected!",expectedTitle.equals(actualTitle));
    }
}
