package com.cyberinnovation.custombaseadapter.model;

public class UserModel {

	private String url_image = "Image";
	private String user_name = "Mirza Adil";
	private String user_message = "Hello This is Custom Adapter";

	public String getUrl_image() {
		return url_image;
	}

	public void setUrl_image(String url_image) {
		this.url_image = url_image;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_message() {
		return user_message;
	}

	public void setUser_message(String user_message) {
		this.user_message = user_message;
	}

	@Override
	public String toString() {
		return "UserModel [url_image=" + url_image + ", user_name=" + user_name
				+ ", user_message=" + user_message + "]";
	}

}
