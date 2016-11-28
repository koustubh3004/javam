package Model;

import java.util.ArrayList;

public class Season {
 private int id;
 private int seriesId;
 
 public int getSeriesId() {
	return seriesId;
}
 public Season(int id , int seriesId, ArrayList<Episode> al) {
	 this.id = id;
	 this.seriesId = seriesId;
	 this.episodes = al;
 }
public void setSeriesId(int seriesId) {
	this.seriesId = seriesId;
}
 private ArrayList<Episode> episodes;
 
 public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public ArrayList<Episode> getEpisodes() {
	return episodes;
}
public void setEpisodes(ArrayList<Episode> episodes) {
	this.episodes = episodes;
}
 
}
