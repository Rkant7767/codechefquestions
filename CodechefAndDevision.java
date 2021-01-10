import java.util.Scanner;
class CodechefAndDevision
{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		int testCases= sc.nextInt();
		for(int i=0;i<testCases;i++){
			int noOfSetters=sc.nextInt();
			int noOfProblems=sc.nextInt();
			int noOfDays=sc.nextInt();
			int maxNoOfProblemsSet=0;
			for(int j=0;j<noOfSetters;j++){
				int noOfProblemsEachSetterSets=sc.nextInt();
				maxNoOfProblemsSet+=noOfProblemsEachSetterSets;
			}
			int noOfDaysContestCanBeHeld=maxNoOfProblemsSet/noOfProblems;
			if(noOfDaysContestCanBeHeld>noOfDays){
				System.out.println(noOfDays);
			}
			else{
				System.out.println(noOfDaysContestCanBeHeld);
			}
			
			
		}
	}
}