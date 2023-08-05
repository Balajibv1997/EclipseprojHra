package CRUDWITHOUTBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreatProject {
	
@Test
	public void postProject() {
	
	 JSONObject obj=new JSONObject();
	 obj.put("name","abhii");
	 obj.put("job","crick");
	 
	 
	 RequestSpecification req = RestAssured.given();
		
		req.body(obj);
		req.contentType(ContentType.JSON);
		
		Response rs = req.post("https://reqres.in/api/users");
		
		//System.out.println(rs.asString());
		System.out.println(rs.asPrettyString());
	    //System.out.println((rs.prettyPeek()));
	}
}
