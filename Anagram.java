/*
Write a method to decide if two strings are anagrams or not.
*/

import java.lang.*;
import java.util.*;

class CheckAna{
	String s1 = null,s2 = null;

	public CheckAna(String n1,String n2){
		this.s1 = s1;
		this.s2 = s2;
	}

	public boolean isAnagram(){
		byte[] sarr1 = new byte[s1.length()];
		byte[] sarr2 = new byte[s2.length()];

		Arrays.sort(sarr1);
		Arrays.sort(sarr2);

		if(sarr1.equals(sarr2)){
			return true;
		}
		else{
			return false;
		}
	}
}

class Anagram{
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter first String");
			String str1 = sc.next();

			System.out.println("Enter second string");
			String str2 = sc.next();

			CheckAna ch = new CheckAna(str1,str2);
			boolean isanagram = ch.isAnagram();

			if(isanagram){
				System.out.println("Strings are anagrams");
			}
			else {
				System.out.println("Strings are not anagrams");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}