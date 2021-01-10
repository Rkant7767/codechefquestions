import java.util.Scanner;
class PointOfImpact{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int testCases=sc.nextInt();
		for(int i=0;i<testCases;i++){
			perform(sc);
		}
	}
	
	public static void perform(Scanner sc){
		int sizexsize=sc.nextInt();
		int noOfCollisions=sc.nextInt();
		noOfCollisions=noOfCollisions%4;
		int xCoordinate=sc.nextInt();
		int yCoordinate=sc.nextInt();
		int impactonx=0;
		int impactony=0;
		if(xCoordinate==yCoordinate){
			System.out.println(sizexsize+" "+sizexsize);
			return;
		}
		else if(xCoordinate>yCoordinate){
			switch(noOfCollisions){
				case 0: impactonx=xCoordinate-yCoordinate;
						System.out.println(impactonx+" "+0);
						break;
				case 1: impactony=yCoordinate+sizexsize-xCoordinate;
						System.out.println(sizexsize+" "+impactony);
						break;
				case 2: impactonx=yCoordinate+sizexsize-xCoordinate;
						System.out.println(impactonx+" "+sizexsize);
						break;
				case 3: impactony=xCoordinate-yCoordinate;
						System.out.println(0+" "+impactony);
						break;
			}
		}
		else{
			switch(noOfCollisions){
				case 0: impactony=yCoordinate-xCoordinate;
						System.out.println(0+" "+impactony);
						break;
				case 1: impactonx=xCoordinate+sizexsize-yCoordinate;
						System.out.println(impactonx+" "+sizexsize);
						break;
				case 2: impactony=xCoordinate+sizexsize-yCoordinate;
						System.out.println(sizexsize+" "+impactony);
						break;
				case 3: impactonx=yCoordinate-xCoordinate;
						System.out.println(impactonx+" "+0);
						break;
			}
		}
	}	

}