package originalMovieProject;

public class Theater {
	String movieName; // 영화이름
	String movieTime; // 영화시간 
	String[][][] arr; //좌석 
	Res res = new Res();
	
	 Theater() {}
	Theater(String movieName, String movieTime, String[][][] arr) {
		this.movieName = movieName;
		this.movieTime = movieTime;
		this.arr = arr;
	}
	
	//get
	String getmovieName() {
		return movieName;
	}
	String getmovieTime() {
		return movieTime;
	}
	String[][][] getarr() {
		return arr;
	}

	// set
	void setmovieName(String movieName) {
		this.movieName = movieName;
	}
	void setmovieTime(String movieTime) {
		this.movieTime = movieTime;
	}
	void setarr (String[][][] arr) {
		this.arr = arr;
	}

	@Override
	public String toString() {			
		return "Theater [movieName=" + movieTime + ", movieTime=" + movieTime + "]";
	}
	

}
	
	

