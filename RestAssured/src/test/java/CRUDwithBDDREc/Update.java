package CRUDwithBDDREc;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenaricUtilities.JavaUtilities;
import io.restassured.http.ContentType;

public class Update {
	@Test
	public void post() {
		

		JavaUtilities jLib=new JavaUtilities();
		int ran = jLib.getRandomNumber();

		baseURI="https://reqres.in";
		
		 JSONObject obj=new JSONObject();
		 obj.put("name","abhii1"+ran);
		 obj.put("job","cricktng2"+ran);
		
       given()
       .body(obj)
       .contentType(ContentType.JSON)
       
      .when()
       .put("/api/users/2")
       
       .then()
       .assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.log().all();

       
       
	}

}
