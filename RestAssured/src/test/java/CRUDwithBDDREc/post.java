package CRUDwithBDDREc;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenaricUtilities.JavaUtilities;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class post {
	
	@Test
	public void post() {
		

		JavaUtilities jLib=new JavaUtilities();
		int ran = jLib.getRandomNumber();

		baseURI="https://reqres.in";
		
		 JSONObject obj=new JSONObject();
		 obj.put("name","abhii"+ran);
		 obj.put("job","cricktng"+ran);
		
       given()
       .body(obj)
       .contentType(ContentType.JSON)
       
      .when()
       .post("/api/users")
       
       .then()
       .assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();

       
       
       
	}

}
