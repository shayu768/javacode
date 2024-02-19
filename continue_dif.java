//循环条件->循环体—>循环结束
//continue的循环体
//if(条件){...continue;}
//continue语句用于结束本次循环，继续执行下一次循环
//他并不会退出循环，而会再次返回循环条件判断
//continue和break用法类似，但是一个是结束循环返回条件判断一个是退出循环
public class continue_dif {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 4) {
            i++;
            if( i==2){
                continue;
            }
            System.out.println("i=" + i);
        }
    }
}
//当i=2的时候，执行continue结束循环并返回条件判断
//所以说并不会执行打印2的结果