/**
 * 
 */
package fr.ausy.codinggame.q35_tendreVersZero;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

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

		assertEquals("Le résultat n'est pas correct avec tableau vide.Le bon résultat devrait être 0.",0, TendreVersZero.closestToZero(test)
				);
		assertEquals(
				"Le résultat n'est pas correct avec tableau null.Le bon résultat devrait être 0.",0, TendreVersZero.closestToZero(null));

		test = new int[] { 4 };
		assertEquals( "Résultat incorrect.On attend le singleton 4.",4, TendreVersZero.closestToZero(test));

		test = new int[] { -3 };
		assertEquals("Résultat incorrect.On attend le singleton -3.",-3, TendreVersZero.closestToZero(test));

		test = new int[] { 1, 4, 12, 2 };
		assertEquals( "Résultat incorrect.Le bon résultat placé en premier.",1, TendreVersZero.closestToZero(test));

		test = new int[] { 3, 4, 12, 2 };
		assertEquals(
				"Le résultat n'est pas correct avec le bon résultat placé en dernier.",2, TendreVersZero.closestToZero(test));

		test = new int[] { -2, 4, 12, 2 };
		assertEquals(
				"Le résultat n'est pas correct : on attend le nombre positif en premier.",2, TendreVersZero.closestToZero(test));

		test = new int[] { 2, 4, 12, -2 };
		assertEquals(
				"Le résultat n'est pas correct : on attend le nombre positif en premier.",2, TendreVersZero.closestToZero(test));

		
	}

}
