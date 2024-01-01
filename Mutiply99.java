//输出一个九九乘法表
public class Mutiply99{
    public static void main(String[] arge){
    for(int i = 1 ;i < 10; i++){
        for(int j = 1 ; j<=i;j++){
            int product =j*i;
            System.out.print(i + "x" + j + "=" + product + '\t');//这里这个变量没比较设置，直接(i*j)也可以
        }
        System.out.println();
    }
}
}
//调试了好几次都不是三角形输出，问题如下：
//print和println的区别
//print是直接打印
//println会自动把打印结果换行