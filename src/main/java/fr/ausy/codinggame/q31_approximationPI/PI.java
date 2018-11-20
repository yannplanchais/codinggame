/**
 * 
 */
package fr.ausy.codinggame.q31_approximationPI;

/**
 * @author Administrateur
 * Approximation de PI
 * avec x et y compris entre 0 et 1 inclus
 * - si x^2 + y^2 <= 1 => point à l'intérieur du cercle
 * => la probabilité que le point se situe à l'intérieur du cercle est égale à Pi/4
 */
public class PI {

	static double approx(double[][] pts) {
		double exterieur = 0;
		double interieur = 0;
		for (int i = 0; i < pts.length; i++) {
			double calcul = pts[i][0]* pts[i][0] + pts[i][1]* pts[i][1];
			if (calcul <= 1) {
				interieur +=1;
			} else {
				exterieur += 1;
			}
		}
		return interieur/pts.length;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double[][] pts = new double [100000][2];
		for (int i = 0; i < 100000; i++) {
			pts [i][0] = Math.random();
			pts [i][1] = Math.random();
		}
		System.out.println("Resultat : " + approx(pts));
		
		double[][] pts_unitaire = new double [1][2];
		pts_unitaire[0][0] = 1;
		pts_unitaire[0][1] = 0;
		
		System.out.println("Resultat : " + approx(pts_unitaire));
	}

}
 