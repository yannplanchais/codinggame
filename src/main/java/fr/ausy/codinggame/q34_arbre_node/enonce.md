Un arbre est composé de noeuds qui respectent les règles suivantes :
- une noeud tient une  valeur correpondant à un entier.
- hormis le noeud racine, un noeud a toujours un seul père
- un noeud n'a pas plus de 2 enfants, appelés noeud à gauche et noeud à droite.
- si un noeud n'a pas d'enfant alors la référence correspondante est null.
- la valeur tenue par tout enfant du sous-arbre gauche  est inférieure à la valeur de son parent.
- la valeur tenue par tout enfant du sous-arbre droite  est supérieure à la valeur de son parent.

Question : implémenter une nouvelle méthode find(int v) qui retourne le noeud tenant la valeur de v.

Si ce noeud n'existe pas, la méthode retoune null.


