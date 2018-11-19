/**
 * 
 */
package fr.ausy.codinggame.q35_tendreVersZero;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fr.ausy.codinggame.q35_tendreVersZero.TendreVersZero;

/**
 * @author Administrateur
 *
 */
class TendreVersZeroTest {

	/**
	 * Test method for
	 * {@link fr.ausy.codinggame.q35_tendreVersZero.TendreVersZero#closestToZero(int[])}.
	 */
	@Test
	void testClosestToZero() {

		int[] test = new int[] {};

		assertEquals(0, TendreVersZero.closestToZero(test),
				"Le r�sultat n'est pas correct avec tableau vide.Le bon r�sultat devrait �tre 0.");
		assertEquals(0, TendreVersZero.closestToZero(null),
				"Le r�sultat n'est pas correct avec tableau null.Le bon r�sultat devrait �tre 0.");

		test = new int[] { 4 };
		assertEquals(4, TendreVersZero.closestToZero(test), "R�sultat incorrect.On attend le singleton 4.");

		test = new int[] { -3 };
		assertEquals(-3, TendreVersZero.closestToZero(test), "R�sultat incorrect.On attend le singleton -3.");

		test = new int[] { 1, 4, 12, 2 };
		assertEquals(1, TendreVersZero.closestToZero(test), "R�sultat incorrect.Le bon r�sultat plac� en premier.");

		test = new int[] { 3, 4, 12, 2 };
		assertEquals(2, TendreVersZero.closestToZero(test),
				"Le r�sultat n'est pas correct avec le bon r�sultat plac� en dernier.");

		test = new int[] { -2, 4, 12, 2 };
		assertEquals(2, TendreVersZero.closestToZero(test),
				"Le r�sultat n'est pas correct : on attend le nombre positif en premier.");

		test = new int[] { 2, 4, 12, -2 };
		assertEquals(2, TendreVersZero.closestToZero(test),
				"Le r�sultat n'est pas correct : on attend le nombre positif en premier.");

		
	}

}
