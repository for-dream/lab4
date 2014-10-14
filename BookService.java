package com.wwr.book.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class BookService {
	public Vector SearchbyName(String Name){
		Vector<Book> b=new Vector<Book>();
		Connection con=DBConnection.createCon();
		String sql="SELECT * FROM Book WHERE name=?";
		PreparedStatement presta=DBConnection.pre(con, sql);
		Book data=null;
		try{
			presta.setString(1,Name);
			ResultSet result = presta.executeQuery();
			if(result.next()){
				data=new Book();
				data.setISBN(result.getString("ISBN"));
				data.setTitle(result.getString("Title"));
				data.setAuthorID(result.getInt("AuthorID"));
				data.setPublisher(result.getString("Publisher"));
				data.setPublishDate(result.getString("PublishDate"));
				b.addElement(data);
			}
			}catch(SQLException e){
				e.printStackTrace();
			}
			DBConnection.close(presta);
			DBConnection.close(con);
			return b;
	}
	public void delete(Book data){
		deletebyISBN(data.getISBN());
	}
	public void deletebyISBN(String ISBN){
		Connection con=DBConnection.createCon();
		String sql="delete from book where ISBN=?";
		PreparedStatement presta=DBConnection.pre(con,sql);
		try{
			presta.setString(1,ISBN);
			presta.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		DBConnection.close(presta);
		DBConnection.close(con);
	}
}
