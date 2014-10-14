package com.wwr.book.action;
import com.opensymphony.xwork2.ActionSupport;


public class BookAction extends ActionSupport {
	private String Name;
	private Book Book;
	private String ISBN;
	public String getName(){
		return Name;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public Book getBook(){
		return Book;
	}
	public void setBook(Book Book){
		this.Book=Book;
	}
}
