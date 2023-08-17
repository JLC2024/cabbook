package com.bookacab.cabbook.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

import jakarta.persistence.Column;

@Entity
@Table(name="cabs")
public class Cabs {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer cabid;
	
	@Column(name="model")
	String model;
	@Column(name="plate")
	String plate;
	@Column(name="fare")
	Double fare;
	@Column(name="year")
	Integer year;
	@Column(name="seats")
	Integer seats;
	@Column(name="service")
	LocalDateTime service;
	@Column(name="isactive")
	Boolean isactive;
	
	public Cabs() {
		
	}
	public Cabs(String model, Double fare, Integer seats) {
		this.model = model;
		this.fare = fare;
		this.seats = seats;
		
	}
	public Integer getCabid() {
		return cabid;
	}
	public void setCabid(Integer cabid) {
		this.cabid = cabid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public Double getFare() {
		return fare;
	}
	public void setFare(Double fare) {
		this.fare = fare;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getSeats() {
		return seats;
	}
	public void setSeats(Integer seats) {
		this.seats = seats;
	}	
	public LocalDateTime getService() {
		return service;
	}
	public void setService(LocalDateTime service) {
		this.service = service;
	}
	
	public Boolean getIsactive() {
		return isactive;
	}
	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}
	@Override
	public String toString() {
		return "Cabs [model=" + model + ", fare=" + fare + ", seats=" + seats + "]";
	}
	
	

	
}
