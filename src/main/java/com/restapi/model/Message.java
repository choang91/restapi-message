package com.restapi.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	private int id;
	private String message;
	private Date date;
	private String author;

	public Message() {}

	public Message(int id, String message, String author) {
		this.id = id;
		this.message = message;
		this.author = author;
		this.date = new Date();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + ", date=" + date + ", author=" + author + "]";
	}

}
