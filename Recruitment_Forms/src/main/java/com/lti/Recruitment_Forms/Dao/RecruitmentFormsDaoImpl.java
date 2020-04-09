package com.lti.Recruitment_Forms.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.Recruitment_Forms.Model.DemandDetails;
import com.lti.Recruitment_Forms.Model.RecruitmentUnderstanding;

@Repository
public class RecruitmentFormsDaoImpl implements RecruitmentFormsDao {

	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	public RecruitmentFormsDaoImpl() {

	}


	//DemandDetails
	@Override
	public List<DemandDetails> readAllDemandDetails() {
		String jpql = "From DemandDetails";
		TypedQuery<DemandDetails> tquery = entityManager.createQuery(jpql, DemandDetails.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}
//"SELECT ptable, ctable FROM DemandDetails as ptable, RecruitmentUnderstanding as cTable WHERE ptable.formIdOne = ctable.Form_id_one AND ptable.formIdOne = 1";
	@Override
	public List<RecruitmentUnderstanding> readAllRecruitmentUnderstandingDetails() {
		String jpql = "From RecruitmentUnderstanding";
		TypedQuery<RecruitmentUnderstanding> tquery = entityManager.createQuery(jpql, RecruitmentUnderstanding.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}

	
	
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void createDemandDetails(DemandDetails demandDetails) {
		entityManager.persist(demandDetails);
		//return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void createRecruitmentUnderstandingDetails(RecruitmentUnderstanding recruitmentUnderstandingDetails) {
		entityManager.persist(recruitmentUnderstandingDetails);
		//return 1;
	}

	@Override
	public int deleteDemandDetails(int formIdOne) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteRecruitmentUnderstanding(int formIdTwo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
