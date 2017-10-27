package com.reviews;

public class Review {

	// instance variables
	private long id;
	private String title;
	private String imageURL;
	private String reviewCategory;
	private String content;
	private String releaseYear;

	// constructors
	public Review(long id, String title, String imageURL, String reviewCategory, String content, String releaseDate) {
		this.id = id;
		this.title = title;
		this.imageURL = imageURL;
		this.reviewCategory = reviewCategory;
		this.content = content;
		this.releaseYear = releaseDate;
	}

	// getters
	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImageURL() {
		return imageURL;
	}

	public String getReviewCategory() {
		return reviewCategory;
	}

	public String getContent() {
		return content;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	// setters
	public void setId(long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public void setReviewCategory(String reviewCatogory) {
		this.reviewCategory = reviewCatogory;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

}
