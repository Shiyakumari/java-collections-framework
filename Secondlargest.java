package ArrayList;
import java.util.ArrayList;
public class Secondlargest {
    static void main(){
        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(12);
        nums.add(67);
         nums.add(89);
          nums.add(76);
          nums.add(90);
          int largest=Integer.MIN_VALUE;
          int Secondlargest=Integer.MIN_VALUE;
          for(int x:nums){
            if(x>largest){
                Secondlargest=largest;
                largest=x;
            }
            else if(x<largest && x>Secondlargest){
                Secondlargest=x;
            }
          }
          if(Secondlargest==Integer.MIN_VALUE){
            System.out.println("Element not found");
          }
          else{
            System.out.println("Element found:"+Secondlargest);
          }
    }
}
