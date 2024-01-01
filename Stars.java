//空心金字塔
import java.util.Scanner;
public class Stars {
    public static void main(String[] arge){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入你要打印的行数：\t");
        int cengshu = myScanner.nextInt();//接收层数，cengshu
        for(int c = 1;c <= cengshu ;c++){
            //这个是输出每一层的空格，空格的数量等于总层数-当前层数
            for(int k = 0;k <= cengshu - c;k++){
            System.out.print(" ");
        }
            //每一行星星的个数成奇数排列，等于：当前层数*2-1
            for(int geshu = 1;geshu <= c * 2 - 1; geshu++){
                //下面实现空心效果
                if( geshu == 1 || geshu == c *2 -1 || c == cengshu){

                
                System.out.print("*") ;
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }

//c是初始层数的变量，cengshu是限制层数的，k是空格的数量，geshu表示打印多少个*
    }
    
}
