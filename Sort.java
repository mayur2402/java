import java.util.*;

class Sort {
	public static void main(String args[]) {

		if (args.length == 0) {
			System.out.println("Enter valid numbers in arguments");
			System.exit(-1);
		}

		int[] arr = new int[args.length];

		for (int i = 0;i < args.length;i++) {
			arr[i] = Integer.parseInt(args[i]);
		}

		for(int i = 0;i < args.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();

		Arrays.sort(arr);

		for(int i = 0;i < args.length;i++) {
			System.out.print(arr[i]+"\t");
		}

		System.out.println();
	}
}