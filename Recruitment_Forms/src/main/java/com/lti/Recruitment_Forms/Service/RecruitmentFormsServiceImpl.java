package com.lti.Recruitment_Forms.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Recruitment_Forms.Dao.RecruitmentFormsDao;
import com.lti.Recruitment_Forms.Model.DemandDetails;
import com.lti.Recruitment_Forms.Model.RecruitmentUnderstanding;


@Service("service")
public class RecruitmentFormsServiceImpl implements RecruitmentFormsService {

	@Autowired
	private RecruitmentFormsDao dao;
	
	
	//select
	
	@Override
	public List<DemandDetails> findAllDemandDetails() {
		return dao.readAllDemandDetails();
	}

	@Override
	public List<RecruitmentUnderstanding> findAllRecruitmentUnderstandingDetails() {
		return dao.readAllRecruitmentUnderstandingDetails();
	}

	
	// insert

	@Override
	public void addDemandDetails(DemandDetails demandDetails) {
		dao.createDemandDetails(demandDetails);
//		if (result == 1)
//			return true;
//		else
//			return false;
	}

	@Override
	public void addRecruitmentUnderstanding(RecruitmentUnderstanding recruitmentUnderstanding) {
		dao.createRecruitmentUnderstandingDetails(recruitmentUnderstanding);
//		if (result == 1)
//			return true;
//		else
//			return false;
	}

}
