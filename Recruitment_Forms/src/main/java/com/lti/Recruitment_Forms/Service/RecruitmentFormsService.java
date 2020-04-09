package com.lti.Recruitment_Forms.Service;

import java.util.List;

import com.lti.Recruitment_Forms.Model.DemandDetails;
import com.lti.Recruitment_Forms.Model.RecruitmentUnderstanding;

public interface RecruitmentFormsService {

	public  List<DemandDetails> findAllDemandDetails();
	public  List<RecruitmentUnderstanding> findAllRecruitmentUnderstandingDetails();
	
	public void addDemandDetails(DemandDetails demandDetails);
	public void addRecruitmentUnderstanding(RecruitmentUnderstanding recruitmentUnderstanding);
}
