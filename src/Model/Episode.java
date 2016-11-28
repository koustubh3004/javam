package Model;

public class Episode extends ContentBean {
	private int seasonId;
	public Episode(int id) {
		seasonId = id;
	}

	public int getSeasonId() {
		return seasonId;
	}

	public void setSeasonId(int seasonId) {
		this.seasonId = seasonId;
	}
	
}
