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
				"Le résultat n'est pas correct avec tableau vide.Le bon résultat devrait être 0.");
		assertEquals(0, TendreVersZero.closestToZero(null),
				"Le résultat n'est pas correct avec tableau null.Le bon résultat devrait être 0.");

		test = new int[] { 4 };
		assertEquals(4, TendreVersZero.closestToZero(test), "Résultat incorrect.On attend le singleton 4.");

		test = new int[] { -3 };
		assertEquals(-3, TendreVersZero.closestToZero(test), "Résultat incorrect.On attend le singleton -3.");

		test = new int[] { 1, 4, 12, 2 };
		assertEquals(1, TendreVersZero.closestToZero(test), "Résultat incorrect.Le bon résultat placé en premier.");

		test = new int[] { 3, 4, 12, 2 };
		assertEquals(2, TendreVersZero.closestToZero(test),
				"Le résultat n'est pas correct avec le bon résultat placé en dernier.");

		test = new int[] { -2, 4, 12, 2 };
		assertEquals(2, TendreVersZero.closestToZero(test),
				"Le résultat n'est pas correct : on attend le nombre positif en premier.");

		test = new int[] { 2, 4, 12, -2 };
		assertEquals(2, TendreVersZero.closestToZero(test),
				"Le résultat n'est pas correct : on attend le nombre positif en premier.");

		
	}

}
