package ArrayList;
import java.util.ArrayList;
public class Max {
    static void main(){
        ArrayList<Integer>marks= new ArrayList<>();
       marks.add(88);
       marks.add(98);
       marks.add(67);
       marks.add(56);
       int max=marks.get(0);
      for(int x=1;x<marks.size();x++){
        if(marks.get(x)>max){
            max=marks.get(x);
        }
    }
        System.out.println(max);
       
         
    }
}
