Un arbre est compos� de noeuds qui respectent les r�gles suivantes :
- une noeud tient une  valeur correpondant � un entier.
- hormis le noeud racine, un noeud a toujours un seul p�re
- un noeud n'a pas plus de 2 enfants, appel�s noeud � gauche et noeud � droite.
- si un noeud n'a pas d'enfant alors la r�f�rence correspondante est null.
- la valeur tenue par tout enfant du sous-arbre gauche  est inf�rieure � la valeur de son parent.
- la valeur tenue par tout enfant du sous-arbre droite  est sup�rieure � la valeur de son parent.

Question : impl�menter une nouvelle m�thode find(int v) qui retourne le noeud tenant la valeur de v.

Si ce noeud n'existe pas, la m�thode retoune null.


