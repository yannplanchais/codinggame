Dans cet exercice, nous allons calculer une approximation de la valeur de PI.

La technique :
- prendre un point P aléatoire de coordonnées (x,y) telles que 0 <= x <= 1 et 0 <= y <= 1.
- Si x² + y² <= 1 alors le point est dans le quart de disque de rayon 1. Sinon il est en dehors.

On sait que la probabilité que le point soit à l'intérieur du disque est de PI/4.

Ecrire la méthode double Approx(Point[] pts) qui va utiliser le tableau pour retourner cette approximation.

En entrée : 
- Chaque Item dans pts est une instance de Point (ne pas changer la classe). Un point est représenté par 2 nombres x et y tels que  0 <= x <= 1 et 0 <= y <= 1.
- pts n'est jamais null
- pts contient au moins 1 item


