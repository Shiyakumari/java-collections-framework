package ArrayList;
import java.util.ArrayList;
public class Duplicate {
    static void main(){
        ArrayList<Integer>nums=new ArrayList<>();
       nums.add(10);
       nums.add(20);
       nums.add(30);
       nums.add(20);
       nums.add(10);
       nums.add(30);
       for(int i=0;i<nums.size();i++){
        for(int j=i+1;j<nums.size();j++){
            if(nums.get(i).equals(nums.get(i))){
                nums.remove(j);
                j--;

            }
        }
       }
       System.out.println(nums);


    }
}
