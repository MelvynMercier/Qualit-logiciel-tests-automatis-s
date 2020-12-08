package src;

import java.util.Vector;
import java.util.stream.Collectors;

public class VectorUnion {

    public static Vector<Object> UnionSet(Vector<Object> a, Vector<Object> b) {
        Vector<Object> vector = new Vector<Object>();

        vector.addAll(a);
        vector.addAll(b);
        vector.stream().distinct().collect(Collectors.toCollection(Vector::new));
        return vector;
    }

    public static void main(String[] args) {
        
    	Vector<Object> firstTest = new Vector<Object>() {
            private static final long serialVersionUID = 1L;

            {
                add(1);
                add("1");
            }
        };
        
        
        Vector<Object> secondTest = new Vector<Object>() {
            private static final long serialVersionUID = 1L;

            {
                add(1.00);
            }
        };

        Vector<Object> thirdTest = VectorUnion.UnionSet(firstTest, secondTest);
    }

}