package CRUDwithBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.http.ContentType.*;

public class getSingle {

	@Test
	public void get() {
		

		baseURI="http://rmgtestingserver";
		port=8084;

	when()
	.get("/projects/TY_SCM_8888")
	
	.then()
	.assertThat()
	.statusCode(200)
	.contentType(ContentType.JSON)
	.log().all();
		
		
		
	}
}
