package src;

import java.util.Vector;
import java.util.stream.Collectors;

public class UnionSet {
    private Vector vector1;
    private Vector vector2;

    public static Vector<Object> unionSet(Vector<Object> vector1, Vector<Object> vector2) throws Exception {
        CheckVector(vector1);
        CheckVector(vector2);
    	
    	Vector<Object> result = new Vector<Object>();
        result.addAll(vector1);
        result.addAll(vector2);
        return result;
    }
    
    //Vérification si un vecteur != null
    public static void CheckVector(Vector<Object> vector) throws Exception {
    	if(vector == null) {
    		throw new Exception("Un des vecteur est null");
    	}
    }
}