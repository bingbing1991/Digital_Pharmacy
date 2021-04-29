package com.project.DigitalPharmacy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.DigitalPharmacy.model.Prescription;
import com.project.DigitalPharmacy.repository.PrescriptionRepository;

@Service
public class PrescriptionService
{
	
	@Autowired
	private PrescriptionRepository prescriptionRepository;
	
	public Prescription savePrescription(Prescription prescription)
	{
		return prescriptionRepository.save(user);
	}
	
	public Prescription findByUserId(String userId)
	{
		Prescription foundPrescr = prescriptionRepository.findByUserId(userId);
		return foundPrescr;
	}
	
	public Prescription findByPrescriptionId(int prescriptionId)
	{
		Prescription foundPrescr = prescriptionRepository.findByPrescriptionId(prescriptionId);
		return foundPrescr;
	}
	
}
