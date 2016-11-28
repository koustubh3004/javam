package Model;

import java.util.HashMap;
import java.util.Map;

public class Series {
	private int id;
	private HashMap<Integer, Season> seasons;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Map<Integer, Season> getSeasons() {
		return seasons;
	}
	public void setSeasons(HashMap<Integer, Season> seasons) {
		this.seasons = seasons;
	}

}
