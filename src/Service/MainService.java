package Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import Model.Episode;
import Model.Season;
import Model.Series;

public class MainService {
	public static void main(String args[]) {
		ArrayList<Episode> al = new ArrayList<Episode>(16);
		for(int i =0; i< 6 ; i++) {
			al.add(new Episode(12));
		}
		
		Season s = new Season(12, 1, al);
		
		Series series = new Series();
		series.setId(1);
		HashMap<Integer, Season> seasons = new HashMap<Integer, Season>();
		seasons.put(1, s);
		seasons.put(2,s);
		seasons.put(3, s);
		seasons.put(4, s);
		seasons.put(5, s);
		seasons.put(6, s);
		seasons.remove(6);
		
		Set<Map.Entry<Integer, Season>> seasonSet = seasons.entrySet();
		for(Map.Entry<Integer, Season> season : seasonSet) {
			System.out.println("key is "+ season.getKey() +" season Id is "+season.getValue().getId());
		}
		
	}

}
