public class DoWhile01 {
    public static void main(String[] arge){

        int i = 0;
        int sum = 0;
        //先定义两个变量的初始值
        do{
            System.out.println("i=" + i);
            sum +=i;//因为循环赋值原因，一定要把求和函数放在赋值之前不然就会导致sum多加一个最后赋值数
            i++;
        }while(i <= 100);
        System.out.println("sum=" + sum);
    }
    
}

