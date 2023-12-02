import java.util.Scanner;
public class Main {
	void dispaly(int no,int no1,int no2)
	{
		   //the outer loops printing the lines +1
		  for (int i=0; i<=no; i++) {
			  //the inner for loop logic excution
			    for (int j =0; j<=no/2; j++) {
			    	// printing two column lines
			  if((i==0|| j ==no/2) && i != 0 ||
					  //printing the first line of alphabet
			i==0 && j != no/2||
			//prints the middle middle line
			i== no /2)
				System.out.println("*");
			  else
				 System.out.println("");
			    }
			    System.out.println();
		  }
	}
	public static void main(String[]args)
	{
		Scanner Sc = new Scanner(System.in);
		Main obj = new Main();
		obj.dispaly(8,7,5);;
	}
	}
