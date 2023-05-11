package com.app.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.MemberSearchRequest;
import com.app.model.MemberSearchResponse;

@RestController
public class MemberSearchAPI {
	

	
	/**
	 * 
	 * @param patientSearchRequest
	 * @return
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/api/searchMember", method = RequestMethod.POST,produces = "application/json")
	public ResponseEntity<MemberSearchResponse> searchPatient(@RequestBody MemberSearchRequest memberSearchRequest) {

		MemberSearchResponse patientSearchResponse = new MemberSearchResponse();
		
		patientSearchResponse.setMember_dental_plan_name("Dental Plan");
    	
		patientSearchResponse.setMember_first_name("TestFirstName");
    	
		patientSearchResponse.setMember_last_name("LastName");
    	
		patientSearchResponse.setMember_medical_plan_name("Medical Plan");
    	
		patientSearchResponse.setMember_pcp_name("PCPName");
    	
		patientSearchResponse.setMember_user_name("UserName");
    	
		patientSearchResponse.setMember_vision_plan_name("Vision Plan");

		return new ResponseEntity<MemberSearchResponse>(patientSearchResponse, HttpStatus.OK);
	}

}
