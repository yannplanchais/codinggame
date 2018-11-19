package fr.ausy.codinggame.q03_HelloArguments;
/**
 * 
 */


/**
 * @author Administrateur
 * Pour le lancer en mode commande :
 * java nompackage/Nomclass arguments
 */
public class Echo {

	/**
	 * @param args
	 */
	public static String echo(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		if(args.length > 1) {
			for (int i = 0; i < args.length ; i ++) {
				sb.append(args[i]).append("\n");
			}
		}
		return sb.toString();

	}

}
