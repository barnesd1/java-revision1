package cs;

public class CheckString {
	private static final String CHECK = "You'll Never Guess!";
	CheckString() {};
	public boolean GuessAgain(String guess) {
		if (guess.equals(CHECK)) return true; else return false;
	}
	public boolean Compare(String str1, String str2) {
		if (str1.equals(str2)) return true; else return false;
	}
}
