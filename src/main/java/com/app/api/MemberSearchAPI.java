package com.app.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.MemberData;
import com.app.model.MemberSearchRequest;
import com.app.model.MemberSearchResponse;

@RestController
public class MemberSearchAPI {
	
	@Autowired
	private MemberData memberData;

	
	/**
	 * 
	 * @param patientSearchRequest
	 * @return
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/api/searchMember", method = RequestMethod.POST,produces = "application/json")
	public ResponseEntity<MemberSearchResponse> searchPatient(@RequestBody MemberSearchRequest memberSearchRequest) {

		MemberSearchResponse patientSearchResponse = memberData.searchMember(memberSearchRequest);

		return new ResponseEntity<MemberSearchResponse>(patientSearchResponse, HttpStatus.OK);
	}

}
