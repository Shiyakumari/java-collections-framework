package ArrayList;
import java.util.ArrayList;
public class Min {
    static void main(){
        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(67);
         nums.add(89);
          nums.add(76);
          nums.add(90);
          int min=nums.get(0);
          for(int i:nums){
            if(i<min){
                min=i;
            }
          }
          System.out.println(min);
    }
}
