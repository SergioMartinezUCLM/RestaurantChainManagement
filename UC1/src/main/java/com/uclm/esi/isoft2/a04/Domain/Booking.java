package com.uclm.esi.isoft2.a04.Domain;

import java.util.Date;
import com.uclm.esi.isoft2.a04.Persistence.BookingDao;


public class Booking {

	/**
	 * Date and time of the booking
	 */
	private Date Turn;
	private String clientID;
	private int tableID;
	private BookingDao bookingDAO;

	/**
	 * 
	 * @param clientID
	 * @param tableID
	 * @param date
	 */
	public void Booking(String clientID, int tableID, Date date) {
		this.clientID = clientID;
		this.tableID = tableID;
		this.Turn = date;
	}

	public String getClientID() {
		return this.clientID;
	}

	public int getTableID() {
		return this.tableID;
	}

	public Date getTurn() {
		return this.Turn;
	}

	/**
	 * 
	 * @param id
	 */
	public void setTableID(int id) {
		this.tableID = id;
	}

	/**
	 * 
	 * @param turn
	 */
	public void setTurn(Date turn) {
		this.Turn = turn;
	}
	
	public BookingDao getBookingDAO() {
		return this.bookingDAO;
	}
	
	public void readAll() {
		this.bookingDAO.readAllBookings();
	}
	
	public int read() {
		this.bookingDAO.readBooking(this);
		return 0;
	}
	
	public int insert() {
		this.bookingDAO.createBooking(this);
		return 0;
	}

	public int update() {
		this.bookingDAO.updateBooking(this);
		return 0;
	}

	public int delete() {
		this.bookingDAO.deleteBooking(this);
		return 0;
	}
}
