package practice.loops;

public class LoopsPractice {

	public static void main(String[] args) {
		
//		Code Challenge: Extract all categories form the string argument.		

		String str = "We have a large inventory of things in our warehouse falling in the category:apparel and the slightly more in demand category:makeup along with the category:furniture.";
		
		printCategories(str);
		
	}
	
	public static void printCategories(String str) {
		
		int strlength = str.length();
		
		
		int category1start = str.indexOf(":", 0); // first category : at char 76
	    int category1end = str.indexOf(" ", 76); // first category last letter at 84
	    int category2start = str.indexOf(":", 84); // second category : at 125
	    int category2end = str.indexOf(" ", 125); // second category last letter at 132
	    int category3start =str.indexOf(":", 132); // third category : at char 156
	    int category3end =str.indexOf(".", 156); // third category last char is . at 166
	    
	   String category1str = str.substring(category1start + 1, category1end); // add 1 to starting position to remove the : from the category
	   String category2str = str.substring(category2start + 1, category2end); // add 1 to starting position to remove the : from the category
	   String category3str = str.substring(category3start + 1, category3end); // add 1 to starting position to remove the : from the category
	    
		int i = 0;
		while (true) {
		System.out.println(category1str); // print category 1 in a line
		System.out.println(category2str); // print category 2 in a line
		System.out.println(category3str); // print category 3 in a line
		if ( category3end == (strlength-1)) {
			break; // If the length of the string and the location of the last character is equal the search is complete and you can break out of loop.
		}
		}
		
	} 	
		
	}
