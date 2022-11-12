package moviee;


public class movie {
	
	private int id;

	private String mtitle;
	private String ryear;
	private String genre;
	private String description;
	private String actor;

	private String picurl;
	
	
	
	
	






	

	public movie(int id, String mtitle, String ryear, String genre, String description, String actor,String picurl) {
		
		this.id = id;
		this.mtitle = mtitle;
		this.ryear = ryear;
		this.genre = genre;
		this.description = description;
		this.actor = actor;
		this.picurl = picurl;
	}
	
	
	
	public int getId() {
		return id;
	}




	public String getMtitle() {
		return mtitle;
	}




	public String getRyear() {
		return ryear;
	}




	public String getGenre() {
		return genre;
	}




	public String getDescription() {
		return description;
	}





	public String getActor() {
		return actor;
	}



	public String getPicurl() {
		return picurl;
	}



	
	
}
