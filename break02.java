
//求顺序变量的和
//当和大于20则跳出循环
//并输出当前i变量的值

public class break02 {

    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1;i <= 100;i++){
            sum = sum + i;
            if(sum > 20){
                System.out.println("此时i等于" + i);
                break;
            }
        }
    System.out.println("sum=" + sum);
    }
    
}
