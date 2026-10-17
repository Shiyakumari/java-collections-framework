package ArrayList;
import java.util.ArrayList;
public class Sum {
    static void main(){
        int sum=0;
        ArrayList<Integer> marks= new ArrayList<>();
        marks.add(80);
          marks.add(88);
            marks.add(78);
              marks.add(90);
              for(int x:marks){
                sum+= x;
              }
              System.out.println(sum);
        
    }
}
