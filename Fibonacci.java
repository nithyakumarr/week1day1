package week.one.dayone;

public class Fibonacci {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int n=11,i;
		int first =1,second=1,third;
		System.out.println(first);
		System.out.println(second);
		for(i=3;i<n;i++)
		{
			third=first+second;
			System.out.println(third);
			first=second;
			second=third;
		}
			

	}

}
