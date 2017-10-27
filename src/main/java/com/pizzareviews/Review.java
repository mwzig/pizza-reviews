package com.pizzareviews;

public class Review {

	public Review(long id, String title, String imageURL, String category, String content, String address,
			String website, String date, int rating) {
		this.id = id;
		this.title = title;
		this.imageURL = imageURL;
		this.category = category;
		this.content = content;
		this.address = address;
		this.website = website;
		this.date = date;
		this.rating = rating;
	}

	private long id;
	private String title;
	private String imageURL;
	private String category;
	private String content;
	private String address;
	private String website;
	private String date;
	private int rating;

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImageURL() {
		return imageURL;
	}

	public String getCategory() {
		return category;
	}

	public String getContent() {
		return content;
	}

	public String getAddress() {
		return address;
	}

	public String getWebsite() {
		return website;
	}

	public String getDate() {
		return date;
	}

	public int getRating() {
		return rating;
	}

}
