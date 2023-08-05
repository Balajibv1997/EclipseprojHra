package CRUDwithBDDREc;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Delete {
	@Test
	public void get() {
		

		baseURI="https://reqres.in";
		

	when()
	.delete("api/users/2")
	
	.then()
	.assertThat()
	.statusCode(200)
	.contentType(ContentType.JSON)
	.log().all();
		
		
		
	}

}
