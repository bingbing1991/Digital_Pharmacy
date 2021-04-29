package com.project.DigitalPharmacy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="prescription")
public class Prescription
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
//    @SequenceGenerator(sequenceName = "user_seq", allocationSize = 1, name = "USER_SEQ")
	@Column(name = "prescription_id")
	private int prescriptionId;
	
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "prescription_desc")
	private String prescriptionDesc;
	
	public int getPrescriptionId()
	{
		return prescriptionId;
	}
	
	public void setPrescriptionId(int prescriptionId)
	{
		this.prescriptionId = prescriptionId;
	}
	
	public String getUserId()
	{
		return userId;
	}
	
	public void setUserId(String userId)
	{
		this.userId = userId;
	}
	
	public String getPrescriptionDesc()
	{
		return prescriptionDesc;
	}
	
	public void setPrescriptionDesc(String prescriptionDesc)
	{
		this.prescriptionDesc = prescriptionDesc;
	}
	
	
	public Prescription(int prescriptionId, String userId, String prescriptionDesc)
	{
		super();
		this.prescriptionId = prescriptionId;
		this.userId = userId;
		this.prescriptionDesc = prescriptionDesc;
	}
	
	public Prescription()
	{
		
	}
	
}
