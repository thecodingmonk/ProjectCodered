package com.codered.java.strings;

public class FindRepeatativeChars {

	public static int[] findRepeatedChars(String input) {
		
		int [] finalArr = new int[128];
		
		input.chars().forEach(System.out::println);
		input.chars().forEach(x->{
			finalArr[x]=finalArr[x]+1;
		});
		
		return finalArr;
		
	}
	
	public static void main(String[] args) {
		int [] x= FindRepeatativeChars.findRepeatedChars("This Is a Test to Validate RepeAtioN's");
		int count = 0;
		for(int i:x) {
			System.out.print(" , "+i+" count: "+count++);
		}
	}
	
	
}
