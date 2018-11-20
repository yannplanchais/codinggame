/**
 * 
 */
package fr.ausy.codinggame.q39_RenduDeMonnaie;

/**
 * @author Administrateur
 *
 */
public class MonnaieUtils {

	/**
	 * Permet de calculer combien de billets au total on rend
	 * 
	 * @param pMonnaie l'objet contenant la monnaie que l'on doit rendre
	 * @return (long) le nombre trouvé. 0 si le paramètre est null.
	 */
	static long calculNombreBillets(Monnaie pMonnaie) {

		long resultat = 0;
		if (pMonnaie != null) {
			resultat = pMonnaie.billet10 + pMonnaie.billet5;
		}

		return resultat;
	}
	
	/**
	 * Méthode non statique
	 * Permet de calculer combien de billets au total on rend
	 * 
	 * @param pMonnaie l'objet contenant la monnaie que l'on doit rendre
	 * @return (long) le nombre trouvé. 0 si le paramètre est null.
	 */
	public long calculNombreBilletsNonStatique(Monnaie pMonnaie) {

		long resultat = 0;
		if (pMonnaie != null) {
			resultat = pMonnaie.billet10 + pMonnaie.billet5;
		}

		return resultat;
	}

}
