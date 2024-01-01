//这个一个用来抽数字的简易程序，并且可以输出你的抽出次数
//可以自定义取值范围为0-自定义
//想把此程序改造成计算暴力破解密码的程序
//但是发现我不会限制输出的数字位数
//希望之后可以补坑
import java.util.Scanner;
public class break01 {
    public static void main(String[] arge){
        //创建一个输入对象，用来接收
        Scanner myScanner = new Scanner(System.in);
        //创建一个范围函数的输入值
        //目前水平有限只能用random函数改造，比较繁琐
        System.out.println("请输入你的取值范围为0~：");
        int difnum = myScanner.nextInt();
        //程序说明，定义变量random_num来接收输入的int数值
        System.out.println("请输入你要抽取的数字");
        int random_num = myScanner.nextInt();
        //i代表输入的次数，中间判断条件为空，所以说是一个死循环
        for(int i = 0;; i++){
            //引用math.random方法代表取一个大于零小于1的小数
            //并对它进行强转，乘100加1则恰好是1-100的数字表达
            int j = (int)((Math.random()* difnum + 0.01*difnum));
            System.out.println(j);
            //条件选择，进行数值判断，引入输入数值
            if(j == random_num){
                System.out.println("你是第" + i + "次抽到" + random_num);
                //当条件成立，会执行break，也会跳出最近的一个循环
                //在此程序中即for 循环
                //同时也可以进行定义标签的方式，来自己选择所跳出的循环范围
                //但一般不建议使用，因为会破坏程序的可读性
                //因为标签名个性化程度较强，会显得代码比较臃肿
                break;
                }
        }
    

    }


}
