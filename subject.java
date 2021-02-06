//Program to calculate sum of 5 subjects and find percentage.
class subject
{
	public static void main(String args[])
	{
		String s1=args[0];
		String s2=args[1];
		String s3=args[2];
		String s4=args[3];
		String s5=args[4];
		int ss1=Integer.parseInt(s1);
		int ss2=Integer.parseInt(s2);
		int ss3=Integer.parseInt(s3);
		int ss4=Integer.parseInt(s4);
		int ss5=Integer.parseInt(s5);
		System.out.println("Subject1\t"+ss1+"\nSubject2\t"+ss2+"\nSubject3\t"+ss3+"\nSubject4\t"+ss4+"\nSubject5\t"+ss5);
		int sum=ss1+ss2+ss3+ss4+ss5;
		System.out.println("Sum of five subject\t"+sum);
		int per=sum/5;
		System.out.println("percentage of subject\t"+per);
	}
}
