import java.util.Scanner;
import java.lang.Math;
class EncodedString{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int testCases=sc.nextInt();
		
		for(int i=0;i<testCases;i++){
			int inputlength= sc.nextInt();
			//System.out.println("inputlength used"+inputlength);
			sc.nextLine();
			StringBuilder str= new StringBuilder(sc.nextLine());
			//System.out.println("String used"+str);
			int noOfCharacters=inputlength/4;
			StringBuilder result=new StringBuilder("");
			for(int j=0;j<noOfCharacters;j++){
				int start=j*4;
				int end=(j+1)*4;
				String substr=str.substring(start,end);
				//System.out.println("substring formed: "+substr);
				int noAssignedToChar=0;
				for(int k=0;k<4;k++){
					if(substr.charAt(k)=='1'){
						noAssignedToChar+=Math.pow(2,3-k);
					}
				}
				char ch=(char)(97+noAssignedToChar);
				result.append(Character.toString(ch));
			}
			System.out.println(result.toString());
		}
		
	}

}