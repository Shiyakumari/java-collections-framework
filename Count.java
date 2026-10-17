package ArrayList;
import java.util.ArrayList;
public class Count {
    static void main(){
        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(3);
         nums.add(8);
        nums.add(9);
         nums.add(12);
         nums.add(4);
         nums.add(15);
         nums.add(2);
        int count=0;
        for(int x:nums){
            if(x>7){
                count++;
            }
        }
        System.out.println(count);
    }
}
