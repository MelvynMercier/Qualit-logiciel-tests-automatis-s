package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Vector;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import src.VectorUnion;

public class VectorUnionTest {
    

    @Test
    public void TestMergeVectors(){
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
        assertEquals(1, thirdTest.size());
    }
}