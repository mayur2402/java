/*
	Implement an algorithm to determine if a string has all unique characters. 
	What if you	can not use additional data structures?

	checkDuplicate(string):
		convert string to array
			take one character starting from first position
			compare that character with remaining characters
			if character found in remaning characters return false
			when we reach to last position then there is not a duplicate character return true

	checkDuplicate(string)

		arr[]
			for i = 1 to length of arr -1 do
				for j = i + 1 to length of arr do
					if arr[i] == arr[j]	return false

			return true

*/
import java.lang.*;
import java.util.*;

class CheckDuplicate{
	public boolean check(String str){
		char[] arr = str.toCharArray();

		for(int i = 0;i < arr.length - 1;i++){
			for(int j = i+1;j < arr.length;j++){
				if(arr[i] == arr[j]){
					return false;
				}
			}
		}
		return true;
	}
}

class Duplicate{
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter string");
			String str = sc.next();

			CheckDuplicate cd = new CheckDuplicate();
			boolean isduplicate = cd.check(str);

			if(isduplicate){
				System.out.println("String does't contains duplicate character");
			}
			else{
				System.out.println("String contains duplicate character");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}