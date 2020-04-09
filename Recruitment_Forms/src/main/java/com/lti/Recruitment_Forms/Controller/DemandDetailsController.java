package com.lti.Recruitment_Forms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.Recruitment_Forms.Model.DemandDetails;
import com.lti.Recruitment_Forms.Model.Response;
import com.lti.Recruitment_Forms.Model.ResponseMessage;
import com.lti.Recruitment_Forms.Service.RecruitmentFormsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "DemandDetails")
@CrossOrigin
public class DemandDetailsController {

	
		@Autowired
		private RecruitmentFormsService service;

		private ResponseEntity<ResponseMessage> response;
		
		//select
		// http://localhost:9090/DemandDetails
		@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<Response> viewAllDemandDetails() {
			ResponseEntity<Response> response;
			List<DemandDetails> step1 = service.findAllDemandDetails();
			System.out.println(step1);
			Response res = new Response<>();
			if (step1 != null && step1.size() > 0) {
				
				response = new ResponseEntity<>(res, HttpStatus.CREATED);
				res.setResponseCode(200);
				res.setResponseMessage("Demand details are fetched");
				res.setResponseObject(step1);
			} else {
				
				response = new ResponseEntity<>(res, HttpStatus.BAD_REQUEST);
				res.setResponseCode(400);
				res.setResponseMessage("Demand details are not fetched");
				res.setResponseObject(null);
			}
			return response;
		}
		
		
//		// http://localhost:9090/demanddetails
//			@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//			public List<DemandDetails> viewAllDemandDetails() {
//				List<DemandDetails> demand = service.findAllDemandDetails();
//				System.out.println(demand);
//				return demand;
//			}
			
			// http://localhost:9090/DemandDetails	
			@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
//			public ResponseEntity<ResponseMessage> addDemandDetails(@RequestBody DemandDetails demandDetails) {
//				ResponseEntity<ResponseMessage> response;
//
//				boolean result = service.addDemandDetails(demandDetails);
//				if (result) {
//					response = new ResponseEntity<ResponseMessage>(new ResponseMessage("New Demand Details is added"),
//							HttpStatus.CREATED);
//				} else {
//					response = new ResponseEntity<ResponseMessage>(new ResponseMessage("New Demand Details is not added"),
//							HttpStatus.INTERNAL_SERVER_ERROR);
//				}
//
//				return response;
//			}

			public void addDemandDetails(@RequestBody DemandDetails demandDetails) {
				service.addDemandDetails(demandDetails);
				
			}
			
			
			
			@ExceptionHandler(Exception.class)
			public ResponseEntity<String> HandlerException(Exception ex) {
				ResponseEntity<String> error = new ResponseEntity<String>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				return error;
			}


			public ResponseEntity<ResponseMessage> getResponse() {
				return response;
			}


			public void setResponse(ResponseEntity<ResponseMessage> response) {
				this.response = response;
			}

}
