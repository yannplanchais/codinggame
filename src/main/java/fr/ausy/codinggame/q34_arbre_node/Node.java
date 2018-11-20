package fr.ausy.codinggame.q34_arbre_node;

public class Node {

	Node left, right;
	int value;
	int profondeur;
	
	public Node(int valeur) {
		this.value = valeur;
	}
	Node find(int v) {
		int prof = 0;
		Node temp = this;
		System.out.println("Valeur à chercher : " + v);
		while(true) {
			prof ++;
			System.out.println("Valeur du noeud courant : " + temp.value);
			
			if (temp.value == v) {
				System.out.println("VALEUR TROUVEE : " + temp.value);
				temp.profondeur = prof;
				return temp;
			} else if(temp.value > v) {
				if(temp.left == null) {
					System.out.println("Arbre de gauche est nul " + temp.value);
					return null;
				} else {
					temp = temp.left;
					System.out.println("On passe à l'arbre de gauche de valeur " + temp.value);
				}
			} else if(temp.value < v) {
				if (temp.right == null) {
					System.out.println("Arbre de droite est nul :" + temp.value );
					return null;
				} else {
					temp = temp.right;
					System.out.println("On passe à l'arbre de droite la valeur : " + temp.value);
				}
			}
		}
		
	}
	
	
	


}
