package com.app.model;

public class MemberSearchResponse implements java.io.Serializable {

	private String member_first_name;

	private String member_last_name;

	private String member_pcp_name;
	
	private String member_medical_plan_name;
	
	private String member_dental_plan_name;
	
	private String member_vision_plan_name;
	
	private String member_user_name;

	public String getMember_first_name() {
		return member_first_name;
	}

	public void setMember_first_name(String member_first_name) {
		this.member_first_name = member_first_name;
	}

	public String getMember_last_name() {
		return member_last_name;
	}

	public void setMember_last_name(String member_last_name) {
		this.member_last_name = member_last_name;
	}

	public String getMember_pcp_name() {
		return member_pcp_name;
	}

	public void setMember_pcp_name(String member_pcp_name) {
		this.member_pcp_name = member_pcp_name;
	}

	public String getMember_medical_plan_name() {
		return member_medical_plan_name;
	}

	public void setMember_medical_plan_name(String member_medical_plan_name) {
		this.member_medical_plan_name = member_medical_plan_name;
	}

	public String getMember_dental_plan_name() {
		return member_dental_plan_name;
	}

	public void setMember_dental_plan_name(String member_dental_plan_name) {
		this.member_dental_plan_name = member_dental_plan_name;
	}

	public String getMember_vision_plan_name() {
		return member_vision_plan_name;
	}

	public void setMember_vision_plan_name(String member_vision_plan_name) {
		this.member_vision_plan_name = member_vision_plan_name;
	}

	public String getMember_user_name() {
		return member_user_name;
	}

	public void setMember_user_name(String member_user_name) {
		this.member_user_name = member_user_name;
	}

	
}
