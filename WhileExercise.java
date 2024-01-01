import java.util.Scanner;
public class WhileExercise {


    public static void main(String[] arge){

        Scanner myScanner = new Scanner(System.in);
        System.out.println("输入开始值和结束值:");
        int god = myScanner.nextInt();
        int end = myScanner.nextInt();
        int i  = god;
        while(i <= end){
            if(i % 10 ==0){
                System.out.println("i=" + i);
            }
            i++;
        } 
    }
    
}
