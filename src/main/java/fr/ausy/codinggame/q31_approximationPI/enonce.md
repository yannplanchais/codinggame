Dans cet exercice, nous allons calculer une approximation de la valeur de PI.

La technique :
- prendre un point P al�atoire de coordonn�es (x,y) telles que 0 <= x <= 1 et 0 <= y <= 1.
- Si x� + y� <= 1 alors le point est dans le quart de disque de rayon 1. Sinon il est en dehors.

On sait que la probabilit� que le point soit � l'int�rieur du disque est de PI/4.

Ecrire la m�thode double Approx(Point[] pts) qui va utiliser le tableau pour retourner cette approximation.

En entr�e : 
- Chaque Item dans pts est une instance de Point (ne pas changer la classe). Un point est repr�sent� par 2 nombres x et y tels que  0 <= x <= 1 et 0 <= y <= 1.
- pts n'est jamais null
- pts contient au moins 1 item


