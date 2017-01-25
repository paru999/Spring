package com.spring;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.spring.DB_Connection;

public class DB_Connection extends DB_insert 
{
	
	
	public String login(String username,String Password)
	{
		PreparedStatement pt;
		try {
			pt=super.conn.prepareStatement("select * from tbl_user where pk_int_user_id=2");
			ResultSet st =pt.executeQuery("select * from tbl_user where pk_int_user_id=2");
			if (st.next()) {                            //if rs.next() returns false
                return "success";
				
				}
			else
			{
				return "login";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return"error";
		}
		
		
		
	}
	public void  insert(String firstname, String lastname, int phoneno, String email,String password)
	{
		PreparedStatement pt;
		try {
			pt = super.conn
			.prepareStatement("insert into tbl_user(vchr_firstname, vchr_lastname,int_phoneno,vchr_email,vchr_password)values(?,?,?,?,?)");
			pt.setString(1,firstname);
			pt.setString(2,lastname);
			pt.setInt(3,phoneno);
			pt.setString(4,email);
			pt.setString(5,password);
			pt.execute();
			//pt.getUsername();
			
			
			
			
			System.out.println("inserted");
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("not inserted");
		}
		
		    
	}
	public static void main(String[] args)
	{
		DB_Connection db=new DB_Connection();
		System.out.println(db);
		db.insert("xyz","abc",12345,"abc@gmail.com","abc123");
		
		
		
	
}
}
