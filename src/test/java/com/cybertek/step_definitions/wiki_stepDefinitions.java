package com.cybertek.step_definitions;

import com.cybertek.pages.WikiSearchPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class wiki_stepDefinitions {
    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        String url = ConfigurationReader.getProperty("wikiUrl");
        Driver.getDriver().get(url);
    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiSearchPage.searchButton.click();
    }
    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String arg0) {
        wikiSearchPage.searchBox.sendKeys(arg0);
    }

    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String arg0) {
        String expectedTitle = arg0+" - Wikipedia";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue("title is not same as expected",expectedTitle.equals(actualTitle));

    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String arg0) {
        String expectedHeader = arg0;
        String actualHeader = wikiSearchPage.mainHeader.getText();

        Assert.assertTrue("Header is not same as expected",expectedHeader.equals(actualHeader));

    }

    @Then("User sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String arg0) {
        String expectedImageHeader = arg0;
        String actualImageHeader = wikiSearchPage.imageHeader.getText();

        Assert.assertTrue("ImageHeader is not same as Expected!",expectedImageHeader.equals(actualImageHeader));

    }
}


