package student;

public class Merge {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "12345";
		String mergedString = mergeStrings(s1, s2);
		System.out.println("Merged String: " + mergedString);
		}
		public static String mergeStrings(String s1, String s2) {
		String merged = "";
		int length1 = s1.length();
		int length2 = s2.length();
		int minLength = Math.min(length1, length2);
		for (int i = 0; i < minLength; i++) {
		merged += s1.charAt(i);
		merged += s2.charAt(i);
		}
		if (length1 > minLength) {
		merged += s1.substring(minLength);
		} else {
		merged += s2.substring(minLength);
		}
		return merged;
		}
}
