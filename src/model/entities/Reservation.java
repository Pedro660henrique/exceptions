package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	

public Reservation() {
}


public Reservation(Integer roolNumber, Date checkIn, Date checkOut) {
	this.roomNumber = roolNumber;
	this.checkIn = checkIn;
	this.checkOut = checkOut;
}


public Integer getRoolNumber() {
	return roomNumber;
}


public void setRoomNumber(Integer roolNumber) {
	this.roomNumber = roolNumber;
}


public Date getCheckIn() {
	return checkIn;
}

public Date getCheckOut() {
	return checkOut;
}


public long duration() {
	long diff = checkOut.getTime() - checkIn.getTime();
	return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
}

public void updateDates(Date checkIn, Date checkOut) {
	this.checkIn = checkIn;
	this.checkOut = checkOut;
}
@Override
public String toString() {
	return "Room"
			+ roomNumber
			+" , checkIn: "
			+ sdf.format(checkIn)
			+ ", checkOut: "
			+ sdf.format(checkOut)
			+","
			+ duration()
			+ " nights";
}
}