package CRUDwithBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Delete {


	@Test
	public void delete() {
		

		baseURI="http://rmgtestingserver";
		port=8084;

	when()
	.delete("/projects/TY_PROJ_24416")
	
	.then()
	.assertThat()
	.statusCode(204)
	.contentType(ContentType.JSON)
	.log().all();
		
		
		
	}
}
