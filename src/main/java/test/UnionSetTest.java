package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import src.UnionSet;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

// TODO: Auto-generated Javadoc
/**
 * The Class UnionSetTest.
 */
///Class test
public class UnionSetTest {

	/** The vector 1. */
	//Définition type variables
	private Vector vector1;
	
	/** The vector 2. */
	private Vector vector2;
	
	/** The vector union. */
	private Vector vectorUnion;

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@BeforeAll
	void SetUp() throws Exception {
		//Initialisation données variable
		vector1 = new Vector<>();
		vector2 = new Vector<>();
		vectorUnion = new Vector<>();
		
		//Ajout élément dans chaque veteur
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

		//Merge 2 vecteur dans 1
		vectorUnion = UnionSet.unionSet(vector1, vector2);

	}

	/**
	 * Down.
	 */
	@AfterAll
	public void Down() {
		//Met toute les variable à null
		vector1 = null;
		vector2 = null;
		vectorUnion = null;
	}

	/**
	 * Element test.
	 */
	@Test
	void ElementTest() {
		//Vérification SI l'élément à i dans "vectorUnion" égale i+1 
		for (int i = 0; i < vectorUnion.size(); i++) {
			Integer nb = (Integer) vectorUnion.elementAt(i);
			assertTrue(nb.intValue() == i + 1);
		}
	}

	/**
	 * Removes the and order check.
	 */
	@Test
	void RemoveAndOrderCheck() {
		//Supprime un element dans le vecteur et vérifie son ordre final
		vectorUnion.remove(4);
		int i = 1;

		for (Object value : vectorUnion) {
			if (i != 4) {
				assertTrue((int) value == i);
				i++;
			}
		}

	}

}