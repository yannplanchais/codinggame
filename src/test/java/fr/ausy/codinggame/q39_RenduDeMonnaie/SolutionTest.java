/**
 * 
 */
package fr.ausy.codinggame.q39_RenduDeMonnaie;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

/**
 * @author Administrateur
 *
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({ MonnaieUtils.class })
class SolutionTest {

	public SolutionTest() {

	}

	/**
	 * Test method for
	 * {@link fr.ausy.codinggame.q39_RenduDeMonnaie.Solution#monnaieOptimale(long)}.
	 */
	@Test
	final public void testMonnaieOptimale() {

		// mock creation
		mockStatic(MonnaieUtils.class);
		// using mock object
		when(MonnaieUtils.calculNombreBillets(Mockito.any(Monnaie.class))).thenReturn(0l);

		Monnaie monnaie = Solution.monnaieOptimale(0);
		assertEquals("Aucun billet n'est rendu pour une monnaie de 0.", 0, monnaie.nombreBillets);

		assertNull(" Rendre la monnaie sur 1 n'est pas possible", Solution.monnaieOptimale(1));
		assertNull(" Rendre la monnaie sur 3 n'est pas possible", Solution.monnaieOptimale(3));

		monnaie = Solution.monnaieOptimale(15l);
		assertNotEquals("Un seul billet de 5 aurait du être rendu Mais le mock change la value.", 3,
				monnaie.nombreBillets);
		assertEquals("Un seul billet de 5 aurait du être rendu Mais le mock change la value.", 0,
				monnaie.nombreBillets);

	}

}
