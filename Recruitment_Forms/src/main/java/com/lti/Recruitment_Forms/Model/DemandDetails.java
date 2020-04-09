package com.lti.Recruitment_Forms.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="demand_details")
public class DemandDetails {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="Form_id_one")
	private int formIdOne;  
	
	@Column(name ="JR_RRID")
	private int jrRRID;
	
	@Column(name ="Job_Title")
	private String jobTitle;
	
	@Column(name ="Job_Overview")
	private String jobOverview;
	
	@Column(name ="Experience")
	private int experience;
	
	@Column(name ="Skills_Required")
	private String skillsRequired;
	
	@Column(name ="Requestor_Id")
	private String requestorId;
	
	@Column(name ="Requestor_PU_BU")
	private String requestorPUBU;
	
	@Column(name ="Requestor_Department")
	private String requestorDepartment;
	
	@OneToMany(mappedBy="demand_details",cascade=CascadeType.MERGE,fetch=FetchType.LAZY)
	private List<RecruitmentUnderstanding> recruitmentUnderstanding = new ArrayList<>();

	public int getFormIdOne() {
		return formIdOne;
	}

	public void setFormIdOne(int formIdOne) {
		this.formIdOne = formIdOne;
	}

	public int getJrRRID() {
		return jrRRID;
	}

	public void setJrRRID(int jrRRID) {
		this.jrRRID = jrRRID;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobOverview() {
		return jobOverview;
	}

	public void setJobOverview(String jobOverview) {
		this.jobOverview = jobOverview;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getSkillsRequired() {
		return skillsRequired;
	}

	public void setSkillsRequired(String skillsRequired) {
		this.skillsRequired = skillsRequired;
	}

	public String getRequestorId() {
		return requestorId;
	}

	public void setRequestorId(String requestorId) {
		this.requestorId = requestorId;
	}

	public String getRequestorPUBU() {
		return requestorPUBU;
	}

	public void setRequestorPUBU(String requestorPUBU) {
		this.requestorPUBU = requestorPUBU;
	}

	public String getRequestorDepartment() {
		return requestorDepartment;
	}

	
	public void setRequestorDepartment(String requestorDepartment) {
		this.requestorDepartment = requestorDepartment;
	}

	public DemandDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DemandDetails(int formIdOne, int jrRRID, String jobTitle, String jobOverview, int experience,
			String skillsRequired, String requestorId, String requestorPUBU, String requestorDepartment) {
		super();
		this.formIdOne = formIdOne;
		this.jrRRID = jrRRID;
		this.jobTitle = jobTitle;
		this.jobOverview = jobOverview;
		this.experience = experience;
		this.skillsRequired = skillsRequired;
		this.requestorId = requestorId;
		this.requestorPUBU = requestorPUBU;
		this.requestorDepartment = requestorDepartment;
	}

	@Override
	public String toString() {
		return "DemandDetails [formIdOne=" + formIdOne + ", jrRRID=" + jrRRID + ", jobTitle=" + jobTitle
				+ ", jobOverview=" + jobOverview + ", experience=" + experience + ", skillsRequired=" + skillsRequired
				+ ", requestorId=" + requestorId + ", requestorPUBU=" + requestorPUBU + ", requestorDepartment="
				+ requestorDepartment + "]";
	}
	
	
}
