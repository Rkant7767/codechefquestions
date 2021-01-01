import java.util.Scanner;
import java.text.DecimalFormat;
class ATM{
    public static void main(String [] args){
        DecimalFormat df= new DecimalFormat("0.00");
        Scanner sc=new Scanner(System.in);
        int amountToBeDeducted= sc.nextInt();
        Double totalAmountPresent= sc.nextDouble();
        if(amountToBeDeducted+0.50<=totalAmountPresent){
            if(amountToBeDeducted%5==0){
                totalAmountPresent=totalAmountPresent-(amountToBeDeducted+0.50);
            }
        }
        System.out.println(df.format(totalAmountPresent));
    }
}