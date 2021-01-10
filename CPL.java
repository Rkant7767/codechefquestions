import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;
class CPL{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int testCases=sc.nextInt();
		for(int i=0;i<testCases;i++){
			perform(sc);
		}
	}
	
	public static void perform(Scanner sc){
		int noOfBoxes=sc.nextInt();
		int height=sc.nextInt();
		int [] heightOfBoxes=new int[noOfBoxes];
		for(int i=0;i<noOfBoxes;i++){
			heightOfBoxes[i]=sc.nextInt();
		}
		minBoxesRequired(heightOfBoxes,height);	
	}
	
	
	public static void minBoxesRequired(int [] heightOfBoxes,int height){
		Arrays.sort(heightOfBoxes);
		int mikeheight=0;
		int tracyheight=0;
		boolean mikereached=false;
		boolean tracyreached=false;
		int pointer=heightOfBoxes.length-1;
		for(int i=heightOfBoxes.length;i>0;--i){
			if(pointer!=0){
				if(!mikereached){
					mikeheight+=heightOfBoxes[pointer--];
					//System.out.println("mikeheight:"+mikeheight);
					if(mikeheight>=height){
						mikereached=true;
					}
				}
			}
			
			if(pointer!=0){
				if(!tracyreached){
					tracyheight+=heightOfBoxes[pointer--];
					//System.out.println("tracyheight:"+tracyheight);
					if(tracyheight>=height){
						tracyreached=true;
						break;
					}
				}
			}
			
		}
		if(mikereached && tracyreached){
			System.out.println(heightOfBoxes.length-pointer-1);
		}
		else{
			System.out.println(-1);
		}
		
	}
	
	
	public static void printarray(int []  arr){
		for(int num : arr){
			System.out.print(num+",");
		}
		System.out.println();
	}
}