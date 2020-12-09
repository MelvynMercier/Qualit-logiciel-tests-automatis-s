package src;

import java.util.Vector;
import java.util.stream.Collectors;

// TODO: Auto-generated Javadoc
/**
 * The Class UnionSet.
 */
//Vector Class
public class UnionSet {
    
    /** The vector 1. */
    private Vector vector1;
    
    /** The vector 2. */
    private Vector vector2;

    /**
     * Union set.
     *
     * @param vector1 the vector 1
     * @param vector2 the vector 2
     * @return the vector
     * @throws Exception the exception
     */
    //Merge 2 vecteur dans 1 seul
    public static Vector<Object> unionSet(Vector<Object> vector1, Vector<Object> vector2) throws Exception {
        CheckVector(vector1);
        CheckVector(vector2);
    	
    	Vector<Object> result = new Vector<Object>();
        result.addAll(vector1);
        result.addAll(vector2);
        return result;
    }
    
    /**
     * Check vector.
     *
     * @param vector the vector
     * @throws Exception the exception
     */
    //Vérification si un vecteur != null
    public static void CheckVector(Vector<Object> vector) throws Exception {
    	if(vector == null) {
    		throw new Exception("Un des vecteur est null");
    	}
    }
}