package fr.ausy.codinggame.q34_arbre_node;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import fr.ausy.codinggame.q35_tendreVersZero.TendreVersZero;

class NodeTest {

	@Test
	final void testFind() {
		Node n = new Node(5);
		Node result = n.find(5);
		assertEquals("Le noeud source aurait du être retourné.",n.value, result.value
				);
		assertEquals( "On doit bien trouvé la bonne profondeur de l'arbre.",1, result.profondeur);
		assertNull("Aucun noeud n'aurait du être trouvé.",n.find(1));
		assertNull("Aucun noeud n'aurait du être trouvé.",n.find(10));
		
		n = this.creationArbreSimple();
		result = n.find(8);
		assertEquals("Le noeud trouvé doit bien avoir la bonne valeur.",8, result.value);
		assertEquals( "Le noeud retourné ne doit pas avoir de fils gauche.",null, result.left);
		assertEquals("Le noeud retourné ne doit pas avoir de fils droit.",null, result.right);
		assertEquals("On doit bien trouvé la bonne profondeur de l'arbre.",3, result.profondeur);
		
		
		
		// test de robustesse
		int longueur = 10000;
		n = this.creationArbreComplexe(longueur);
		result = n.find(1666);
		assertEquals("Le noeud trouvé doit bien avoir la bonne valeur.",1666, result.value);
		assertEquals("On doit bien trouvé la bonne profondeur de l'arbre.",1666, result.profondeur);
		
		
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
