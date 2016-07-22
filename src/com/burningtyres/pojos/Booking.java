package com.burningtyres.pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="Bookings")
public class Booking {

	private int booking_id;
	private String username;
	private String vehicleName;
	private String driverName;
	private Date startDate;
	private Date endDate;
	private int nod;
	private double km;
	private int no_of_seats;
	private String status;
	private Date bookingDate;
	
	
	
	//Constructors
	
	public Booking() {
		super();
	}


	//Getters and Setters : 

	@Id
	@GeneratedValue
	public int getBooking_id() {
		return booking_id;
	}



	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}


	@Column(name="username")
	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}


	@Column(name="vehicle_name")
	public String getVehicleName() {
		return vehicleName;
	}



	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}


	@Column(name="driver_name")
	public String getDriverName() {
		return driverName;
	}



	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}


	@Column(name="start_date")
	public Date getStartDate() {
		return startDate;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	@Column(name="end_date")
	public Date getEndDate() {
		return endDate;
	}



	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	@Column(name="nod")
	public int getNod() {
		return nod;
	}



	public void setNod(int nod) {
		this.nod = nod;
	}


	@Column(name="km")
	public double getKm() {
		return km;
	}



	public void setKm(double km) {
		this.km = km;
	}


	@Column(name="no_of_seats")
	public int getNo_of_seats() {
		return no_of_seats;
	}



	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}


	@Column(name="status")
	public String getStatus() {
		return status;
	}


	
	public void setStatus(String status) {
		this.status = status;
	}


	@Column(name="booking_date")
	public Date getBookingDate() {
		return bookingDate;
	}



	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	
	
	
	
}
