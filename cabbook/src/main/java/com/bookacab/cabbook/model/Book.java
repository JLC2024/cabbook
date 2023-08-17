package com.bookacab.cabbook.model;


import jakarta.persistence.*;

@Entity
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer bookid;

    @Column(name="passengername")
    String passengername;
    @Column(name="passengercount")
    Integer passengercount;
    @Column(name="pickuptime")
    String pickuptime;

    @Enumerated(EnumType.STRING)
    @Column(name="cabtype")
    CabType selectedCabType;
    
    public Book() {
        
    }
    
    public Book(String pickuptime, String passengername, Integer passengercount, CabType selectedCabType) {
    	this.pickuptime = pickuptime;
    	this.passengername = passengername;
        this.passengercount = passengercount;
        this.selectedCabType=selectedCabType;   
    }

	public Integer getBookid() {
		return bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	public String getPassengername() {
		return passengername;
	}

	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}

	public Integer getPassengercount() {
		return passengercount;
	}

	public void setPassengercount(Integer passengercount) {
		this.passengercount = passengercount;
	}

	public String getPickuptime() {
		return pickuptime;
	}

	public void setPickuptime(String pickuptime) {
		this.pickuptime = pickuptime;
	}


	public CabType getselectedCabtype() {
		return selectedCabType;
	}

	public void setCabtype(CabType selectedCabType) {
		this.selectedCabType = selectedCabType;
	}
	
	
}
