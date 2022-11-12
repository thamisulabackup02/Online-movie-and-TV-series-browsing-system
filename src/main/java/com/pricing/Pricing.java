package com.pricing;

public class Pricing {
	
	private int pricing_id;
	private String category;
	private String genres;
	private String hdAvailable;
	private String watchOnur;
	private String moviesOrTvshow;
	private int screens;
	
	public Pricing(int pricing_id, String category, String genres, String hdAvailable, String watchOnur, String moviesOrTvshow, int screens) {
		super();
		this.pricing_id = pricing_id;
		this.category = category;
		this.genres =genres ;
		this.hdAvailable = hdAvailable;
		this.watchOnur = watchOnur ;
		this.moviesOrTvshow = moviesOrTvshow ;
		this.screens = screens ;
		
	}

	public int getPricing_id() {
		return pricing_id;
	}

	public String getCategory() {
		return category;
	}

	public String getGenres() {
		return genres;
	}

	public String getHdAvailable() {
		return hdAvailable;
	}

	public String getWatchOnur() {
		return watchOnur;
	}

	public String getMoviesOrTvshow() {
		return moviesOrTvshow;
	}

	public int getScreens() {
		return screens;
	}



}
