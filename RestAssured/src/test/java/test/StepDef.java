package test;
import cucumber.api.java.en.Given;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

public class StepDef {
	
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
		 given().contentType(ContentType.JSON)
		 .when().get("http://www.google.com")
		 .then().statusCode(200);
		 
	 }

}
