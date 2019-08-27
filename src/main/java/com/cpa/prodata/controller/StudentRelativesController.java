/*
 * Created on 2019-05-30 ( Date ISO 2019-05-30 - Time 14:40:07 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.cpa.prodata.controller;


import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cpa.prodata.controller.dto.StudentRelativesDTO;
import com.cpa.prodata.service. StudentRelativesService;

/**
 * Rest controller which produce Hal+json content (including hateoas metadata).
 * @author Somesh Biswas version 3.0.0
 */
@RestController
@RequestMapping("/api/rest")
@CrossOrigin(origins = { "http://localhost:4200" })
public class StudentRelativesController {

	private static final Logger LOG = Logger.getLogger( StudentRelativesController.class);


	@Autowired
	private  StudentRelativesService studentRelativesService;

	
	@PostMapping("/createStudentRelatives")
	public ResponseEntity<StudentRelativesDTO> insertStudentRelatives(@Valid @RequestBody StudentRelativesDTO studentRelativesDTO,
			BindingResult result){
				if(result.hasErrors()){
			HttpHeaders headers = new HttpHeaders();
			return new ResponseEntity<>(headers, HttpStatus.PRECONDITION_FAILED);
			}

			HttpHeaders headers = new HttpHeaders();
			StudentRelativesDTO datastudentRelativesDTO=null;
			try {
			datastudentRelativesDTO = studentRelativesService.persistStudentRelatives(studentRelativesDTO);
			} catch (Exception e) {
				LOG.error("Error while inserting StudentRelatives {}",e);
			}
			return new ResponseEntity<>(datastudentRelativesDTO, headers, HttpStatus.CREATED);
	}

	@GetMapping("/getAllStudentRelatives")
	public ResponseEntity<List<StudentRelativesDTO>> getAllStudentRelatives() {
		List<StudentRelativesDTO> studentRelativesDTOResp=null;
		try {
			studentRelativesDTOResp = studentRelativesService.retrieveAllStudentRelatives();
		} catch (Exception e) {
			LOG.error("Error while retrieving all  StudentRelatives {}",e);
		}
		return new ResponseEntity<>(studentRelativesDTOResp, HttpStatus.OK);
	}

		@GetMapping("/getStudentRelativesById/{rollno}")
	public ResponseEntity<List<StudentRelativesDTO>> getStudentRelativesById(@PathVariable Long rollno) {
	List<StudentRelativesDTO> studentRelativesDTO = null;
		try {
			studentRelativesDTO =  studentRelativesService.retrieveStudentRelativesByRoll(rollno);
		} catch (Exception e) {
			LOG.error("Error while retrieving By StudentRelatives ID {}",e);
		}
		return new ResponseEntity<>(studentRelativesDTO , HttpStatus.OK);
	}


	
	@PutMapping("/modifyStudentRelatives")
	public ResponseEntity<StudentRelativesDTO> modifyStudentRelatives(@Valid @RequestBody StudentRelativesDTO studentRelativesDTO,
			BindingResult result){
				if(result.hasErrors()){
			HttpHeaders headers = new HttpHeaders();
			return new ResponseEntity<>(headers, HttpStatus.PRECONDITION_FAILED);
			}

			HttpHeaders headers = new HttpHeaders();
			StudentRelativesDTO datastudentRelativesDTO=null;
			try {
			datastudentRelativesDTO = studentRelativesService.modifyStudentRelatives(studentRelativesDTO);
			} catch (Exception e) {
				LOG.error("Error while inserting  Data {}",e);
			}
			return new ResponseEntity<>(datastudentRelativesDTO, headers, HttpStatus.CREATED);
	}


	@DeleteMapping("/removeStudentRelativesById")
	public ResponseEntity<Void> removeStudentRelativesById(@Valid @RequestParam("id") Integer id){
	StudentRelativesDTO studentRelativesDTO = studentRelativesService.retrieveStudentRelativesById(id);
	if(studentRelativesDTO !=null){
	studentRelativesService.deleteById( id);
	HttpHeaders headers= new HttpHeaders();
			return new ResponseEntity<>(headers, HttpStatus.NO_CONTENT);
	
	}

	else{
	HttpHeaders headers= new HttpHeaders();
		    return new ResponseEntity<>(headers, HttpStatus.PRECONDITION_REQUIRED);
	}
	
	}

}









