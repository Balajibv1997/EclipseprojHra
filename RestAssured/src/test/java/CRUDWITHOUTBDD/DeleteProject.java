package CRUDWITHOUTBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProject {

	
	@Test
	public void getAll() {
		Response rs = RestAssured.delete("https://reqres.in/api/users/2");
		System.out.println(rs.asPrettyString());
	}
}
