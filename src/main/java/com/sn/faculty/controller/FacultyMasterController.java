
package com.sn.faculty.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sn.faculty.facultyMaster.FacultyMaster;
import com.sn.faculty.service.FacultyMasterService;

@RestController
@RequestMapping(value="/faculty")

public class FacultyMasterController {
	@Autowired
	FacultyMasterService facultyMasterService;
	
	@GetMapping("/{fid}/details")
	public FacultyMaster getFacultyById(@PathVariable int fid) {
		return facultyMasterService.getFacultyDetails(fid);
	}
	
	@PostMapping("/save/details")
	public FacultyMaster saveFaculty(@RequestBody FacultyMaster facultyMaster) {
		return facultyMasterService.saveFacultyDetails(facultyMaster);
	}
	
	@GetMapping("httpConnection/studentDetails")
	public String getStudentDetails() {
		HttpURLConnection connection = null;
		try {
			URL url=new URL("http://localhost:8081/student/details");
			connection=(HttpURLConnection)url.openConnection(); 
			connection.setRequestMethod("GET");
			
			int code = connection.getResponseCode();
			
			  if (code !=  200) {
	                throw new IOException("Invalid response from server: " + code);
	            }

	            BufferedReader rd = new BufferedReader(new InputStreamReader(
	                    connection.getInputStream()));
	            String data = rd.readLine();
	            return data;
		} catch (Exception e) {
			//Logger.error("Error on getting the student details");
			e.printStackTrace();
			System.out.println("Error on getting the student details");
			return null;
			
		} finally {
			if(null != connection)
				connection.disconnect();
		}
	}
	
	@GetMapping("restTemplate/studentDetails")
	public String getStudentDetailsUsingRestTemplate() {
		RestTemplate restTemplate = new RestTemplate();

        String resourceUrl
          = "http://localhost:8081/student/details";

        // Fetch JSON response as String wrapped in ResponseEntity
        ResponseEntity<String> response
          = restTemplate.getForEntity(resourceUrl, String.class);
        
        String responseBody = response.getBody();
        
        System.out.println(responseBody);
        return responseBody;
	}
}
