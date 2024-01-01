import java.util.Scanner;
public class MulForExercise01{
    public static void main(String[] arge){
        Scanner myScanner = new Scanner(System.in);
        int zsum = 0;
        for(int banji = 1; banji <=3; banji++){

       
            int sum = 0 ;
            for(int stus = 1; stus < 6 ; stus++){
                System.out.print("请输入第" + banji+"班级的第" + stus +"个小朋友的成绩：");
                int scoer = myScanner.nextInt();
                sum +=scoer;
            }
            System.out.println("该班的平均分为：" + sum / 5 +"\t该班的总分为：" + sum );
            zsum +=sum;
    }
        System.out.println("年级平均分为"+ zsum / 3 +"年纪总分为" + zsum);
    }



}
//目前有一个很突出的问题就是，变量的命名不规范
//应该多用英文命名，首先好记，也便于工作之后的接轨
