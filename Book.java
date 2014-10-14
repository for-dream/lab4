package com.wwr.book.action;

public class Book {
	String ISBN;
	String Title;
	int AuthorID;
	String Publisher;
	String PublishDate;
	double Price;
	String Name;
	int Age;
	String Country;
	public String getISBN(){
		return ISBN;
	}
	public void setISBN(String ISBN){
		this.ISBN=ISBN;
	}
	public String getTitle(){
		return Title;
	}
	public void setTitle(String Title){
		this.Title=Title;
	}
	public int getAuthorID(){
		return AuthorID;
	}
	public void setAuthorID(int AuthorID){
		this.AuthorID=AuthorID;
	}
	public String getPublisher(){
		return Publisher;
	}
	public void setPublisher(String Publisher){
		this.Publisher=Publisher;
	}
	public String getPublishDate(){
		return PublishDate;
	}
	public void setPublishDate(String PublishDate){
		this.PublishDate=PublishDate;
	}
	public double getPrice(){
		return Price;
	}
	public void setPrice(double Price){
		this.Price=Price;
	}
	public String getName(){
		return Name;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public int getAge(){
		return Age;
	}
	public void setAge(int Age){
		this.Age=Age;
	}
	public String getCountry(){
		return Country;
	}
	public void setCountry(String Country){
		this.Country=Country;
	}
}
