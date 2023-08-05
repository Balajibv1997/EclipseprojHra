package CRUDwithBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenaricUtilities.JavaUtilities;
import io.restassured.http.ContentType;

public class UpdatePro {



	@Test
	public void post() {


		JavaUtilities jLib=new JavaUtilities();
		int ran = jLib.getRandomNumber();

		baseURI="http://rmgtestingserver";
		port=8084;


		JSONObject job=new JSONObject();
		job.put("createdBy", "kur1"+ran);
		job.put("projectName","src"+ran);

		job.put("status","ongoing");
		job.put("teamSize",6);


//pre-condition
		given()
		.body(job)
		.contentType(ContentType.JSON)

		
		//action
		.when()
		.put("/addProject/TY_SCM_8888")

		
		//validation
		.then()
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();



	}
}
