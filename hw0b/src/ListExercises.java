import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int count = 0, len = L.size();
        for(int i = 0; i<len; i++){
            count+= L.get(i);
        }
        return count;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> Leven = new ArrayList<Integer>(){};
        int len = L.size();
        for(int i=0;i<len;i++){
            if(L.get(i) %2==0){
                Leven.add(L.get(i));
            }
        }
        return Leven;

    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        return null;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        return 0;
    }
}
