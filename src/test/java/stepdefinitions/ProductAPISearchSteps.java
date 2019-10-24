package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import services.ProductSearchTests;

public class ProductAPISearchSteps {
    @Steps
    ProductSearchTests productSearch;

    @Given("a user opens Book Info Product API")
    public void callProductSearchAPI(){
        productSearch.searchProductsAPI();
    }

    @When("the response is a success")
    public void verifyProductAPIResponseSuccess(){
        productSearch.IsExecutedSuccessfully();
    }

    @Then("the users gets the title {string} in the response")
    public void theUsersGetsTheTitleInTheResponse(String title) {
        productSearch.IsExecutedSuccessfully();
        productSearch.findTheTitle(title);
    }
}