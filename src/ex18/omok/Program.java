package ex18.omok;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1; i<=10; i++){
				for(int j=1;j<=10 ;j++) {
					if(i==3 && j==4)	
						System.out.printf("%c", '●');
					else if(j == 1 && i ==1)	
						System.out.printf("%c", '┏');
					else if(j == 10 && i==1 )	
						System.out.printf("%c", '┓');
					else if(j == 1&& i==10)	
						System.out.printf("%c", '┗');
					else if(j == 10 &&  i==10)	
						System.out.printf("%c", '┛');
					else if(j==1)
						System.out.printf("%c", '┣');
					else if(j==10 )	
						System.out.printf("%c", '┫');
					else if(i == 10)	
						System.out.printf("%c", '┻');
					else if(i == 1)	
						System.out.printf("%c", '┳');
					else
						System.out.printf("%c", '╋');
				}
				System.out.println();
			}
		
	}

}
