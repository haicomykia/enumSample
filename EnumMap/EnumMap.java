package EnumMap;

import java.util.EnumSet;
import java.util.regex.Pattern;

public class EnumMap {
	
	public enum Rank {
		BRONZE(1.0),
		SILVER(0.9),
		GOLD(0.8);
		
		private final double rate;
		
		private Rank(double _rate) {
			this.rate = _rate;
		}
		
		private static final EnumSet<Rank> ranksCanGetPresent = EnumSet.of(SILVER, GOLD);
		
		public boolean canGetPresent() {
			return ranksCanGetPresent.contains(this);
		}
	}
	
	public static void main(String[] args) {
		boolean matches = Pattern.matches(".+", "");
		System.out.println(matches);
	}
}
