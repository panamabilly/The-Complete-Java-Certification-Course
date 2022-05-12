package practice.loops;

public class ForLoopPractice {
	
//	Code Challenge: Reverse the given string "abcdefghijklmnopqrstuvwxyz" and print it in the console.	
	
	public static void main(String args[]) {
//		Given String
		String name = "abcdefghijklmnopqrstuvwxyz";
		
//		 Strings are immutable (you can't change the order so you have to make it a array which is immutable. )Put string into an array so we have the ability to have an index for each char.
		char stringarray[] = name.toCharArray();
//		 Print array in a line by itself
		System.out.println(stringarray);
		
		for (int i = stringarray.length -1; i >= 0; i--) {
			System.out.print(stringarray[i]);
		}
// Code Challenge: Print numbers from 0 to 100 inclusive by twos		
		for (int j = 0; j <= 100; j = j + 2) {
			System.out.println(j);
		}
		 
		
	}

}
