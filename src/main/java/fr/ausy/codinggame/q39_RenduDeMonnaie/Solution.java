/**
 * 
 */
package fr.ausy.codinggame.q39_RenduDeMonnaie;

/**
 * @author Administrateur
 *
 */
public class Solution {

	
	static Monnaie monnaieOptimale(long s) {
		Monnaie monnaie = new Monnaie();
		
		if (s == 1 || s ==3) {
			// Cas impossible.
			return null;
		} 
		long somme = s;
		boolean ajoutDix = false;
		if (s > 10) {
			somme -= 10;
			ajoutDix = true;
			
		}
		monnaie.billet10 = somme/10;
		monnaie.billet5 = (somme -10*monnaie.billet10)/5;
		monnaie.piece2 = (somme -10*monnaie.billet10 - 5*monnaie.billet5)/2;
		
		
		if ((10*monnaie.billet10 + 5*monnaie.billet5 +2*monnaie.piece2 ) == somme ) {
			if(ajoutDix) {
				monnaie.billet10 ++;
			}
		} 
		
		monnaie.nombreBillets = MonnaieUtils.calculNombreBillets(monnaie);
		
		System.out.println(s + " => " + monnaie.billet10 + "|" + monnaie.billet5 + "|" + monnaie.piece2);

		return monnaie;
	}
	
}


