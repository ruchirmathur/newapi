package com.app.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.MemberData;
import com.app.model.MemberSearchRequest;
import com.app.model.MemberSearchResponse;

@Repository
public class MemberDataImpl implements MemberData{

	
	@Autowired
	 private JdbcTemplate jdbcTemplate;

	public MemberSearchResponse searchMember(MemberSearchRequest memberSearchRequest) {
		
		MemberSearchResponse memberSearchResponse = null ;
	    try {
	    	 memberSearchResponse = jdbcTemplate.queryForObject("SELECT * FROM pocdatabase.profile WHERE member_user_name=?",
	          BeanPropertyRowMapper.newInstance(MemberSearchResponse.class), memberSearchRequest.getMember_user_name());

	      return memberSearchResponse;
	    } catch (IncorrectResultSizeDataAccessException e) {
	      return memberSearchResponse;
	    }
	  }
}
