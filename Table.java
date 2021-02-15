class Table{
	public static void main(String[] args) {
		try{
			if (args.length != 1){
				System.out.println("Enter only one argument");
				System.exit(-1);
			}
			int num = Integer.parseInt(args[0]);

			for (int i = 1; i < 10; i++ ) {
				System.out.println(i*num);
			}
		}
		catch(NumberFormatException n){
			System.out.println("Enter valid number");
		}
		
	}
}