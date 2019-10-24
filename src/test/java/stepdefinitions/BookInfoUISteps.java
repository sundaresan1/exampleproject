package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import pages.NavigateTo;
import pages.LookUp;

import static org.assertj.core.api.Assertions.assertThat;
import static matchers.TextMatcher.textOf;

public class BookInfoUISteps {

    @Steps
    NavigateTo navigateTo;

    @Steps
    LookUp lookUp;


    @Given("a user opens Book Info Page")
    public void open_book_info_page() {
        navigateTo.bookInfoHomePage();
    }


    @Then("the users views the title {string}")
    public void lookup_for_title(String expectedTerm) {
        assertThat(lookUp.titles())
                .allMatch(title -> textOf(title).containsIgnoringCase(expectedTerm));
    }
}
