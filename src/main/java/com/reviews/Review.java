package com.reviews;

public class Review {

	// instance variables
	private long id;
	private String title;
	private String imageUrl;
	private String reviewCategory;
	private String quote;
	private String content1;
	private String content2;
	private String content3;
	private String releaseYear;

	// constructors
	public Review(long id, String title, String imageUrl, String reviewCategory, String quote, String content1,
			String content2, String content3, String releaseDate) {
		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.reviewCategory = reviewCategory;
		this.quote = quote;
		this.content1 = content1;
		this.content2 = content2;
		this.content3 = content3;
		this.releaseYear = releaseDate;
	}

	// getters
	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getReviewCategory() {
		return reviewCategory;
	}

	public String getQuote() {
		return quote;
	}

	public String getContent1() {
		return content1;
	}

	public String getContent2() {
		return content2;
	}

	public String getContent3() {
		return content3;
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

	public void setImageURL(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public void setReviewCategory(String reviewCatogory) {
		this.reviewCategory = reviewCatogory;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public void setContent1(String content1) {
		this.content1 = content1;
	}

	public void setContent2(String content2) {
		this.content2 = content2;
	}

	public void setContent3(String content3) {
		this.content3 = content3;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

}
