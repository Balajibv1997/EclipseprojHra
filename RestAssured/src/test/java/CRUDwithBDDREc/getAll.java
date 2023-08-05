package CRUDwithBDDREc;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class getAll {

	@Test
	public void get() {
		

		baseURI="https://reqres.in";
		

	when()
	.get("api/users/2")
	
	.then()
	.assertThat()
	.statusCode(200)
	.contentType(ContentType.JSON)
	.log().all();
		
		
		
	}

}
