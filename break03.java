//一个建议匹配验证和程序
//重点主要字符数匹配函数equals函数的使用
//两种写法：
//1.name.equals("匹配字符")
//2."匹配字符".equals(name)
//推荐使用第二种，不会指针为空
import java.util.Scanner;
public class break03 {
    public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    int chance = 3;//定义输入的变量
    for(int i = 1;i <= 3;i++){
        System.out.println("请输入你的用户名");
        String name = myScanner.next();
        System.out.println("请输入你的用户密码");
        String passwds = myScanner.next();
        //对结果进行验证，成立则跳出循环
        if("丁真".equals(name) && "666".equals(passwds)){
            System.out.println("登陆成功");
            break;
        }
    chance --;
    System.out.println("你还有"+ chance +"次登陆机会");
    }

    }
    
}
