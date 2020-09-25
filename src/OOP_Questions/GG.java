package OOP_Questions;

public class GG {
}
interface AdvancedArithmetic{
    int divisor_sum(int n);
}

//Write your code here
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int result=0;
        int count=1;
        while(count<=n){
            float temp=n/(float)count;
            if(temp%1==0){
                result+=count;
            }
            count++;
        }
        return result;
    }
}