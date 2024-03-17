import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment1 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        
        integerList.add(5);
        integerList.add(2);
        integerList.add(10);
        integerList.add(1);
        integerList.add(8);

        
        Collections.sort(integerList);

        System.out.println("Sorted list of integers:");
        for (Integer i : integerList) {
            System.out.println(i);
        }
    }
}
