package services;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;

import static org.hamcrest.Matchers.is;

public class ProductSearchTests {
    private String PRODUCT_URL = "http://35.224.212.34/api/v1/products";
    private Response response;

    public void searchProductsAPI(){
        response = SerenityRest.when().get(PRODUCT_URL);
    }

    public void IsExecutedSuccessfully(){
        response.then().statusCode(200);
    }

    public void findTheTitle(String title){
        response.then().body("[0].title", is(title));
    }
}