package com.lti.Recruitment_Forms.Dao;

import java.util.List;

import com.lti.Recruitment_Forms.Model.DemandDetails;
import com.lti.Recruitment_Forms.Model.RecruitmentUnderstanding;

public interface RecruitmentFormsDao {

	//Select details
	public List<DemandDetails> readAllDemandDetails();
	public List<RecruitmentUnderstanding> readAllRecruitmentUnderstandingDetails();
	
	//Insert details
	public void createDemandDetails(DemandDetails demandDetails);
	public void createRecruitmentUnderstandingDetails(RecruitmentUnderstanding recruitmentUnderstandingDetails);
	
	//Delete details
	public int deleteDemandDetails(int formIdOne);
	public int deleteRecruitmentUnderstanding(int formIdTwo);
}
