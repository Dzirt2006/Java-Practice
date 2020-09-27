package OOP_Questions;
import java.util.*;

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

class IteratorObj {//Java Iterator class can help you to iterate through every element in a collection
    static Iterator func(ArrayList mylist) {
        Iterator it = mylist.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            if (element instanceof String)//Hints: use instanceof operator
                break;
        }
        return it;
    }
}