package com.wwr.book.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	public static Connection createCon(){
		String drv="com.mysql.jdbc.Driver";
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/new_schema";
		String username="root";
		String password="wwr1994519";
		try{
			Class.forName(drv);
			con=DriverManager.getConnection(url,username,password);
			}catch(ClassNotFoundException e){
				e.printStackTrace();
		    }catch(SQLException e){
		    	e.printStackTrace();
		    }
			return con;
	}
	public static PreparedStatement pre(Connection con,String sql){
		PreparedStatement presta=null;
		try{
			presta=con.prepareStatement(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return presta;
	}
	public static void close(Connection con){
		try{
			con.close();
			con=null;
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public static void close(Statement stmt){
		try{
			stmt.close();
			stmt=null;
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public static void close(ResultSet rs){
		try{
			rs.close();
			rs=null;
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
