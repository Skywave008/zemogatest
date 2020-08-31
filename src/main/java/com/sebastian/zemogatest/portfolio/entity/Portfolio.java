package com.sebastian.zemogatest.portfolio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="portfolio")
public class Portfolio {
	
	@Id
	@Column(name="idportfolio")
	private Integer id;
	
	@Column(name="description")
	private String description;
	
	@Column(name="image_url")
	private String image;
	
	@Column(name="twitter_user_name")
	private String twitterUserName;
	
	@Column(name="title")
	private String title;
	
	public Portfolio(final Integer idportfolio, final String description, final String image, final String twitterUserName, final String title) {
		super();
		this.id = idportfolio;
		this.description = description;
		this.image = image;
		this.twitterUserName = twitterUserName;
		this.title = title;
	}
	
	public Portfolio() {
		super();
	}



	public Integer getIdportfolio() {
		return id;
	}

	public void setIdportfolio(final Integer idportfolio) {
		this.id = idportfolio;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(final String image) {
		this.image = image;
	}

	public String getTwitterUserName() {
		return twitterUserName;
	}

	public void setTwitterUserName(final String twitterUserName) {
		this.twitterUserName = twitterUserName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Portfolio [id=" + id + ", description=" + description + ", image=" + image + ", twitterUserName="
				+ twitterUserName + ", title=" + title + "]";
	}

	

}
