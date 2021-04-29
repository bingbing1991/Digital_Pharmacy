package com.project.DigitalPharmacy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.DigitalPharmacy.model.Prescription;
import com.project.DigitalPharmacy.service.PrescriptionService;

@RestController
public class PrescriptionController
{
	@Autowired
	private PrescriptionService prescriptionService;
	
	@PostMapping("/createPrescription")
	@CrossOrigin(origins = "http://localhost:4200")
	public Prescription createPrescription(@RequestBody Prescription prescription) throws Exception
	{
		Prescription newPrescription = new Prescription();
		newPrescription = prescriptionService.savePrescription(prescription);
		return newPrescription;
	}
	
}
