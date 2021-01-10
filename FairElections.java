import  java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
class FairElections{
	
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int testCases=sc.nextInt();
		for(int i=0;i<testCases;i++){
			perform(sc);
		}
	}
	
	public static void perform(Scanner sc){
		int noOfPacksOfJohn=sc.nextInt();
		int noOfPacksOfJack=sc.nextInt();
		int packOfJohn[]=new int [noOfPacksOfJohn];
		int packOfJack[]=new int [noOfPacksOfJack];
		int maxNoOfSwaps=noOfPacksOfJack>noOfPacksOfJohn?noOfPacksOfJohn:noOfPacksOfJack;
		for(int i=0;i<noOfPacksOfJohn;i++){
			packOfJohn[i]=sc.nextInt();
		}
		for(int i=0;i<noOfPacksOfJack;i++){
			packOfJack[i]=sc.nextInt();
		}
		int minswap=0;
		
		while(checkIfJohnWins(packOfJohn,packOfJack)){
			if(minswap<maxNoOfSwaps){
				// printarray(packOfJack);
				// printarray(packOfJohn);
				swap(packOfJohn,packOfJack);
			}
			else{
				System.out.println(-1);
				return;
			}
			minswap++;
		}
		System.out.println(minswap);
	}
	
	public static void swap(int [] packOfJohn,int [] packOfJack){
		Map<String,Integer> mapForJack= max(packOfJack);
		Map<String,Integer> mapForJohn= min(packOfJohn);
		int temp=packOfJack[mapForJack.get("index")];
		packOfJack[mapForJack.get("index")]=packOfJohn[mapForJohn.get("index")];
		packOfJohn[mapForJohn.get("index")]=temp;
		// printarray(packOfJack);
		// printarray(packOfJohn);
	}
	
	public static Map<String,Integer> max(int [] arr){
		int max=arr[0];
		int counter=0;
		int index=0;
		for(int i : arr){
			if(i>max){
				max=i;
				index=counter;
			}
			counter++;
		}
		Map<String,Integer> map= new HashMap<String,Integer>();
		map.put("max",max);
		map.put("index",index);
		return map;
	}
	
	public static Map<String,Integer> min(int [] arr){
		int min=arr[0];
		int counter=0;
		int index=0;
		for(int i : arr){
			if(i<min){
				min=i;
				index=counter;
			}
			counter++;
		}
		Map<String,Integer> map= new HashMap<String,Integer>();
		map.put("min",min);
		map.put("index",index);
		return map;
	}
	
	public static boolean checkIfJohnWins(int [] arr1, int [] arr2){
		int noOfVotesForJohn=0;
		int noOfVotesForJack=0;
		for(int num:arr1){
			noOfVotesForJohn+=num;
		}
		for(int num:arr2){
			noOfVotesForJack+=num;
		}
		if(noOfVotesForJack<noOfVotesForJohn){
			return false;
		}
		return true;
	}
	
	public static void printarray(int[] arr2){
		for(int num :arr2){
			System.out.print(num+" ,");
		}
		System.out.println();
	}
	
}