package com.app.dao;

import com.app.model.MemberSearchRequest;
import com.app.model.MemberSearchResponse;

public interface MemberData {
	
	public MemberSearchResponse searchMember(MemberSearchRequest memberSearchRequest);
}
