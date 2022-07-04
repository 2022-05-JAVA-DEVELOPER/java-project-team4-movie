package com.movie.dao;

public class ReservationSQL {
	public static final String Reservation_INSERT
	="insert into reservation_info(reservation_no,cus_id,payment_no)"
	+"values(to_number(to_char(sysdate, 'yymmddHH24MISS')),?,?)";
	
	public static final String Reservation_SELECT_ALL
	="select reservation_no,cus_id,payment_no from reservation_info";
	
	public static final String Reservation_SELECT_BY_RE_NO
	="select reservation_no,cus_id,payment_no from reservation_info where reservation_no=?";
	
	
	public static final String Reservation_DELETE
	="delete from reservation_info where reservation_no=?"; 
;
}
