package com.movie.dao;

public class PaymentSQL {

	
//	public final static String PAYMENT_INSERT
//	="insert into payment values(payment_no_seq.nextval,SYSDATE,?,?,?,?)";
//	public final static String PAYMENT_SELECT_ALL
//	="select * from payment";
//	public final static String PAYMENT_SELECT_BY_NO
//	="select * from payment where payment_no=?";
//	public final static String PAYMENT_DELETE
//	="delete from payment where payment_no=?";
	
	public final static String PAYMENT_DELETE_BY_CUSID = 
	"delete FROM payment WHERE cus_id=?";

	public final static String PAYMENT_DELETE_BY_PAYMENTNO =
	 "DELETE FROM payment WHERE payment_no=?";

	public final static String PAYMENT_INSERT =
	"INSERT INTO payment(pament_no, payment_date, card_name, adult_member_count, child_member_count, cus_id) VALUES (payment_payment_no_SEQ.next, sysdate, ?, ?, ?, ?)";

	public final static String PAYMENT_INSERT_BY_SEATNO =
	"INSERT INTO seat(seat_no, seat_arrange, seat_valid, hall_name) VALUES (SEAT_SEAT_NO_SEQ.nextval, ?, ?, ?)";

	public final static String SELECT_BY_CUSID =
	"SELECT * FROM payment WHERE cus_id=?";

	public final static String PAYMENT_SELECT_ALL =
			"SELECT * FROM payment";

	public final static String SELECT_BY_MOVIEHALL =
	"SELECT * FROM payment p join seat s on p.seat_no = s.seat_no join movie_hall m on s.hall_name = m.hall_name where m.hall_name = ?";

	public final static String SELECT_BY_CUSID_ALL =
	"select * from payment p join seat s on p.seat_no = s.seat_no join movie_hall m on s.hall_name = m.hall_name join price_info price on price.price_no = m.price_no where p.cus_id = ?"; 

}
