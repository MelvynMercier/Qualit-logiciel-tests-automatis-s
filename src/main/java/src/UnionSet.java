package src;

import java.util.Vector;
import java.util.stream.Collectors;

public class UnionSet {
    private Vector vector1;
    private Vector vector2;

    public static Vector<Object> unionSet(Vector<Object> vector1, Vector<Object> vector2) {
        Vector<Object> result = new Vector<Object>();
        result.addAll(vector1);
        result.addAll(vector2);
        return result;
    }
}