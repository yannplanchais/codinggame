/**
 * 
 */
package fr.ausy.codinggame.q35_tendreVersZero;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger; 

/**
 * @author Administrateur
 *
 */
public class TendreVersZero {
	
	static Logger LOGGER = LogManager.getLogger();
	
	/**
	 * Méthode permettant de déterminer quel entier d'un tableau est le plus proche de 0.
	 * Un entier positif est plus près qu'un entier négatif.
	 * @param ints le tableau des entiers à comparer.
	 * @return l'entier le plus proche de 0.
	 */
	static int closestToZero(int[] ints) {
		
		System.out.println(" Nom du logger : " + LOGGER.getName());
		if(LOGGER.isDebugEnabled() && ints != null) {
			LOGGER.debug("Nombre de nombres : " + ints.length);
		}
		int result = Integer.MAX_VALUE;

		if (ints == null || ints.length == 0) {
			result = 0;
		} else {
			for (int i : ints) {
				if (Math.abs(result) > Math.abs(i)) {
					result = i;
				} else if (Math.abs(result) == Math.abs(i)) {
					if (result < 0) {
						result = i;
					}
				}
			}
		}
		return result;
	}

}
 