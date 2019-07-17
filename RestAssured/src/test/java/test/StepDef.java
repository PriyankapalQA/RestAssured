package test;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class StepDef {
	
	//BDD styled
	
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
		 given().contentType(ContentType.JSON);
		
	}

	@When("^I complete action$")
	public void iCompleteAction() throws Throwable {
		when().get("http://www.google.com").then().statusCode(400);  
		
		//.then().body(s:"author",is(value:"ABC"));
		//we cannot use then statement separately but given and when can be used as separate gherkin statements
	}

	@Then("^I validate the outcomes$")
	public void iValidateTheOutcomes() throws Throwable {
		System.out.println("Then cannot be a separate statement");
	}
	
}
