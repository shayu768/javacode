//比break更狠，它会直接跳出方法
//该程序会直接跳出main方法
public class return_dif{
    public static void main(String[] args){
        for(int i = 1;i <= 5; i++){
            if(i==3){
                System.out.println("执行循环打印" + i);
                return;//continue;break;
            }
            System.out.println("hello");

        }
        System.out.println("for循环的边界");

}

}