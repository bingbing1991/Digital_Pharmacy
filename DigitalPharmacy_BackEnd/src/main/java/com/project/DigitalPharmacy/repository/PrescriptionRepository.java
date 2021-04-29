package com.project.DigitalPharmacy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.DigitalPharmacy.model.Prescription;

public interface PrescriptionRepository extends JpaRepository<Prescription, Integer>
{
	public Prescription findByUserId(String userId);
	
	public Prescription findByPrescriptionId(int prescriptionId);
}
