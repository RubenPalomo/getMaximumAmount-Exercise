import java.io.*;
import java.util.*;

class Result {
    public static int getMaximumAmount(List<Integer> quantity, int m) {
        int result = 0;
        
        while (m > 0) {
            Collections.sort(quantity);
            result += quantity.get(quantity.size() - 1);
            quantity.set(quantity.size() - 1, quantity.get(quantity.size() - 1) - 1);
            m--;
        }
        return result;
    }
}
