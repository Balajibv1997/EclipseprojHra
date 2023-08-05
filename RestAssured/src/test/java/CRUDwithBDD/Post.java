package CRUDwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenaricUtilities.JavaUtilities;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class Post {

	@Test
	public void post() {


		JavaUtilities jLib=new JavaUtilities();
		int ran = jLib.getRandomNumber();

		baseURI="http://rmgtestingserver";
		port=8084;


		JSONObject job=new JSONObject();
		job.put("createdBy", "kur"+ran);
		job.put("projectName","Rss"+ran);

		job.put("status","ongoing");
		job.put("teamSize",6);


//pre-condition
		given()
		.body(job)
		.contentType(ContentType.JSON)

		
		//action
		.when()
		.post("/addProject")

		
		//validation
		.then()
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();



	}
}
