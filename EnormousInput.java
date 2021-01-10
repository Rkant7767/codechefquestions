import java.util.Scanner;

class EnormousInput
{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int noOfInputs =sc.nextInt();
		int devisor=sc.nextInt();
		int pointer=0;
		int counter=0;
		while(pointer<noOfInputs){
			if(sc.nextInt()%devisor==0){
				counter++;
			}
			pointer++;
		}
		System.out.println(counter);
		
	}
}