package ex17.test;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i= 0; i<5; i++) 
			if(i==4)
				System.out.printf("%C ",'A'+i);
			else if(i%2==0)
				System.out.printf("%C, ",' ');
			else
				System.out.printf("%C, ",'A'+i);
	}

}
