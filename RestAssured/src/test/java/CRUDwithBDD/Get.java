package CRUDwithBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.apache.commons.logging.Log;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Get {

	

public class Post {

	@Test
	public void get() {
		

		baseURI="http://rmgtestingserver";
		port=8084;

	when()
	.get("/projects")
	
	.then()
	.assertThat()
	.statusCode(200)
	.contentType(ContentType.JSON)
	.log().all();
		
		
		
	}
	}
	
	

}
