package com.movie.성민;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.movie.common.DataSource;

public class CouponDao {
	private DataSource dataSource;
	public CouponDao() throws Exception{
		dataSource = new DataSource();
	}
	
	public Coupon selectByNo(int coupon_no) throws Exception{
		String couponSQL = "select * from coupon_info where coupon_no = ?";
		Coupon coupon = null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(couponSQL);
		pstmt.setInt(1, coupon_no);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			coupon = new Coupon(rs.getInt("coupon_no"), rs.getString("coupon_name"), rs.getInt("coupon_effect"));
		}
		rs.close();
		pstmt.close();
		con.close();
		
		
		return coupon;
	}
	
	
	
}
