/**
 * 1-100的数字
 * 整除3，输出Fizz
 * 整除5，输出Buzz
 * 整除3和5，输出FizzBuzz
 */
public class Test02 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%3==0&&i%5==0){
                System.out.println("FizzBuzz");
            } else if(i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
            System.out.println("=============");
        }
    }
}
