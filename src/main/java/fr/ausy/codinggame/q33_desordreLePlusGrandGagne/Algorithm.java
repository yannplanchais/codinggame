/**
 * 
 */
package fr.ausy.codinggame.q33_desordreLePlusGrandGagne;

/**
 * @author Administrateur
 *
 */
public class Algorithm {

	
	static int findLargest(int[] numbers) {
		// FAUX on a pas les int négatifs
		int result = 0;
		// BON RESULTAT
		result = Integer.MIN_VALUE;
		for (int i : numbers) {
			if(result < i) {
				result = i;
			}
		}
		return result;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tableauSimple = {3,12,4,6,6,4};
		System.out.println("Tableau simple (attendu 12) : " + findLargest(tableauSimple));
		
		int[] tableau_MIN_VALUE = {Integer.MIN_VALUE};
		System.out.println("Tableau minValue (attendu MIN_VALUE) : " + findLargest(tableau_MIN_VALUE));
		
		int[] tableauPosition0 = {12,4,6,6,4};
		System.out.println("Tableau position0 (attendu 12) : " + findLargest(tableauPosition0));
		
		int[] tableauPositionMax = {12,4,6,6,4,32};
		System.out.println("Tableau positionFin (attendu 32) : " + findLargest(tableauPositionMax));
		
	}

}
