package com.lti.Recruitment_Forms.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="recruitment_Understanding")
public class RecruitmentUnderstanding {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="Form_id_two")
	private int formIdTwo;  
	
	@Column(name ="job_title")
	private String jobTitle;
	
	@Column(name ="job_overview")
	private String jobOverview;
	
	@Column(name ="Resources_Needed")
	private int resourcesNeeded;
	
	@Column(name ="skill")
	private String skillsRequired;
	
	@Column(name ="criteria")
	private String criteria;
	
	

	
	@ManyToOne
	@JoinColumn(name="Form_id_one")
	private DemandDetails demand_details;
	
	
	

	public int getFormIdTwo() {
		return formIdTwo;
	}

	public void setFormIdTwo(int formIdTwo) {
		this.formIdTwo = formIdTwo;
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

	public int getResourcesNeeded() {
		return resourcesNeeded;
	}

	public void setResourcesNeeded(int resourcesNeeded) {
		this.resourcesNeeded = resourcesNeeded;
	}

	public String getSkillsRequired() {
		return skillsRequired;
	}

	public void setSkillsRequired(String skillsRequired) {
		this.skillsRequired = skillsRequired;
	}

	public String getCriteria() {
		return criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}

	

	public RecruitmentUnderstanding() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecruitmentUnderstanding(int formIdTwo, String jobTitle, String jobOverview, int resourcesNeeded,
			String skillsRequired, String criteria, int formIdOne) {
		super();
		this.formIdTwo = formIdTwo;
		this.jobTitle = jobTitle;
		this.jobOverview = jobOverview;
		this.resourcesNeeded = resourcesNeeded;
		this.skillsRequired = skillsRequired;
		this.criteria = criteria;
		
	}

	@Override
	public String toString() {
		return "RecruitmentUnderstanding [formIdTwo=" + formIdTwo + ", jobTitle=" + jobTitle + ", jobOverview="
				+ jobOverview + ", resourcesNeeded=" + resourcesNeeded + ", skillsRequired=" + skillsRequired
				+ ", criteria=" + criteria + ", demand_details=" + demand_details + "]";
	}


	
	
}
