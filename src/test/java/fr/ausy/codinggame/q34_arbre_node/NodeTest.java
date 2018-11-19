package fr.ausy.codinggame.q34_arbre_node;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fr.ausy.codinggame.q35_tendreVersZero.TendreVersZero;

class NodeTest {

	@Test
	final void testFind() {
		Node n = new Node(5);
		Node result = n.find(5);
		assertEquals(n.value, result.value,
				"Le noeud source aurait du être retourné.");
		assertEquals(1, result.profondeur, "On doit bien trouvé la bonne profondeur de l'arbre.");
		assertNull(n.find(1), "Aucun noeud n'aurait du être trouvé.");
		assertNull(n.find(10), "Aucun noeud n'aurait du être trouvé.");
		
		n = this.creationArbreSimple();
		result = n.find(8);
		assertEquals(8, result.value, "Le noeud trouvé doit bien avoir la bonne valeur.");
		assertEquals(null, result.left, "Le noeud retourné ne doit pas avoir de fils gauche.");
		assertEquals(null, result.right, "Le noeud retourné ne doit pas avoir de fils droit.");
		assertEquals(3, result.profondeur, "On doit bien trouvé la bonne profondeur de l'arbre.");
		
		
		
		// test de robustesse
		int longueur = 10000;
		n = this.creationArbreComplexe(longueur);
		result = n.find(1666);
		assertEquals(1666, result.value, "Le noeud trouvé doit bien avoir la bonne valeur.");
		assertEquals(1666, result.profondeur, "On doit bien trouvé la bonne profondeur de l'arbre.");
		
		
	}

	private Node creationArbreComplexe(int pIteration) {
		Node result = new Node(1);
		
		for(int i=2 ; i < pIteration ; i++) {
			ajoutNoeud(result,i);
		}
		
		return result;
	}

	private void ajoutNoeud(Node result, int i) {
		Node n = new Node(i);
		Node temp = result;
		while(temp.right != null) {
			temp = temp.right;
		}
		temp.right = n;
	}

	/**
	 * Creation arbre<pre>
	 *                9
	 *             7    13
	 *           5   8    17
	 *          2 6      16
	 * </pre>
	 * @return
	 */
	private Node creationArbreSimple() {
		Node n2 = new Node(2);
		Node n6 = new Node(6);
		Node n5 = new Node(5);
		n5.left = n2;
		n5.right = n6;
		Node n8 = new Node(8);
		Node n7 = new Node(7);
		n7.left = n5;
		n7.right = n8;
		
		Node n16 = new Node(16);
		Node n17 = new Node(17);
		n17.left = n16;
		
		Node n13 = new Node(13);
		n13.right = n17;
		
		Node n9 = new Node(9);
		n9.left = n7;
		n9.right = n13;
		return n9;
	}

}
