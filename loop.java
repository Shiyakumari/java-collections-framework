package ArrayList;
import java.util.ArrayList;
public class loop {
    static void main(){
        ArrayList<Integer>nums= new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        for(int i=0;i<nums.size();i++){
            System.err.println(nums.get(i));
        }
    }
}
