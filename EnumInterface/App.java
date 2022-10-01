package EnumInterface;

public class App {
	/*
	 * プリキュア
	 */
	public enum Precure implements CharacterInterface {
		BLACK(){
			@Override
			public String apply(String _s) {
				return String.format(span, "color:black;", _s);
			}
			@Override
			public String getName() {
				return "なぎさ";
			}
		},
		
		WHITE() {
			@Override
			public String apply(String _s) {
				return "<span class=\"color:white;\">" + _s + "</span>";
			}
			@Override
			public String getName() {
				return "ほのか";
			}
		}
	}
	
	/**
	 * リコリス
	 */
	public enum Lycoris implements CharacterInterface {
		CHISATO () {
			@Override
			public String apply(String _s) {
				return "<span class=\"color:#f0555a;\">" + _s + "</span>";
			}

			@Override
			public String getName() {
				return "錦木千束";
			}
			
		},
		
		TAKINA() {
			@Override
			public String apply(String _s) {
				return "<span class=\"color:#2a96fa;\">" + _s + "</span>";
			}
			@Override
			public String getName() {
				return "井ノ上たきな";
			}
		}
	}
	
	public enum Starlight implements CharacterInterface {
		KAREN(){
			@Override
			public String apply(String _s) {
				return "<span class=\"color:#fb5458;\">%s</span>".formatted(_s);
			}
			@Override
			public String getName() {
				return "愛城 華恋";
			}
		},
		HIKARI(){
			@Override
			public String apply(String _s) {
				return "<span class=\"color:#6292e9;\">%s</span>".formatted(_s);
			}
			@Override
			public String getName() {
				return "神楽 ひかり";
			}
		},
	}
	
	public static void main(String[] args) {
		
		CharacterInterface karen = Starlight.KAREN;
		System.out.println(karen == Starlight.KAREN);
		
		for (CharacterInterface character : Lycoris.values()) {
			System.out.println(character.apply(character.getName()));
		}
		
		for (CharacterInterface character : Precure.values()) {
			System.out.println(character.apply(character.getName()));
		}
		
		for (CharacterInterface character : Starlight.values()) {
			System.out.println(character.apply(character.getName()));
		}
	}
}
