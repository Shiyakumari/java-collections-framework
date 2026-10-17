package ArrayList;
import java.util.ArrayList;
public class Demo1 {
    static void main(){
        ArrayList<Integer>nums=new ArrayList<>();
         nums.add(70);
        nums.add(90);
        nums.add(60);
        nums.add(80);
        nums.remove(2);
        System.out.println(nums);
    }
}
