package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import src.UnionSet;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UnionSetTest {

    private Vector vector1;
    private Vector vector2;
    private Vector vectorUnion;

    @BeforeAll
    void SetUp() {

    	vector1 = new Vector<>();
    	vector2 = new Vector<>();
    	vectorUnion = new Vector<>();

        vector1.addElement(1);
        vector1.addElement(2);
        vector1.addElement(3);
        vector1.addElement(4);
        vector1.addElement(5);

        vector2.addElement(6);
        vector2.addElement(7);
        vector2.addElement(8);
        vector2.addElement(9);
        vector2.addElement(10);

        vectorUnion = UnionSet.unionSet(vector1, vector2);

    }

    @AfterAll
    public void Down(){
        vector1 = null;
        vector2 = null;
        vectorUnion = null;
    }

    @Test
    void elementTest() {
        for (int i = 0 ; i < vectorUnion.size() ; i++) {
            Integer nb = (Integer)vectorUnion.elementAt(i);
//            int iValue = i + 1;
            assertTrue(nb.intValue() == i+1);
        }
    }

    @Test
    void RemoveAndOrderCheck(){
        vectorUnion.remove(4);
        int i = 1;

        for (Object value : vectorUnion) {
            if(i != 4) {
                assertTrue((int) value == i);
                i++;
            }
        }

    }


}