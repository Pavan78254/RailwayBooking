package Dto;

import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class TrainTicket {
	@Id
	@GeneratedValue(generator="pnr")
	@SequenceGenerator(initialValue= 4566541,allocationSize=1, name="pnr")
	int pnr;
	int id;
	int trainnumber;
	String source;
	String destination;
	int numberofseats;
	double amount;
	Date dateofBooking;
	Date dateofJourney;
	String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTrainnumber() {
		return trainnumber;
	}

	public void setTrainnumber(int trainnumber) {
		this.trainnumber = trainnumber;
	}

	

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumberofseats() {
		return numberofseats;
	}

	public void setNumberofseats(int numberofseats) {
		this.numberofseats = numberofseats;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDateofBooking() {
		return dateofBooking;
	}

	public void setDateofBooking(Date dateofBooking) {
		this.dateofBooking = dateofBooking;
	}

	public Date getDateofJourney() {
		return dateofJourney;
	}

	public void setDateofJourney(Date dateofJourney) {
		this.dateofJourney = dateofJourney;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

	public int getPnr() {
		return pnr;
	}

	public void setPnr(int pnr) {
		this.pnr = pnr;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@ManyToOne
	User user;

}
