package com.ty.hospital_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Encounter 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String Reason;
	private int dateofjoin;
	private String discharge;
	
	@OneToMany(mappedBy = "encounters")
	private List<Observation> observations;
	
	@ManyToOne
	@JoinColumn
	private Branch branches;
	
	@OneToMany(mappedBy = "encounters")
	private List<MedOrder> medorders;
	
	@ManyToOne
	@JoinColumn
	private Person persons;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getReason() {
		return Reason;
	}

	public void setReason(String reason) {
		Reason = reason;
	}

	public int getDateofjoin() {
		return dateofjoin;
	}

	public void setDateofjoin(int dateofjoin) {
		this.dateofjoin = dateofjoin;
	}

	public String getDischarge() {
		return discharge;
	}

	public void setDischarge(String discharge) {
		this.discharge = discharge;
	}

	public List<Observation> getObservations() {
		return observations;
	}

	public void setObservations(List<Observation> observations) {
		this.observations = observations;
	}

	public Branch getBranches() {
		return branches;
	}

	public void setBranches(Branch branches) {
		this.branches = branches;
	}

	public List<MedOrder> getMedorders() {
		return medorders;
	}

	public void setMedorders(List<MedOrder> medorders) {
		this.medorders = medorders;
	}

	public Person getPersons() {
		return persons;
	}

	public void setPersons(Person persons) {
		this.persons = persons;
	}

	
	
}
