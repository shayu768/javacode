//利用循环简易录取系统
//先判断分数，然后根据性别分组
import java.util.Scanner;
public class Nextedif {

    public static void main(String[] arge){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入该歌手的成绩:");
        double score = myScanner.nextDouble();
        if ( score > 8.0){
            System.out.println("请输入你的性别：");
            char  gender = myScanner.next().charAt(0);
            //把字符串转换为字符char,指把字符串的第一个字符得到
            if (gender == '男'){
                System.out.println ("你被分入男子组");}

            else if (gender == '女'){
                System.out.println("你被分入女子组");
            }
            else {
                System.out.println("你的性别输入有误");
            }}
        else{
            System.out.println("很遗憾，你被淘汰");
        }
            
            }
        }

    

