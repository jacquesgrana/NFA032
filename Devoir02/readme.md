Devoir 2 du contrôle continu :

Soit une liste chaînée L composée de cellules comportant un champ ‘info’ qui contient un nombre entier et un champ ‘suivant’ qui contient un pointeur vers la cellule suivante . On suppose que l’utilisateur a rempli les champs ‘info’ avec des entiers strictement positifs et que la liste n’est pas vide .

 On appelle 'marche' une succession de deux cellules telles que l'entier contenu dans la seconde soit égal à celui de la première plus 1 .
Soit par exemple la liste L qui contient les entiers suivants : 9 , 4 , 2 , 3 , 7 , 6 ,  8 , 9 , 3 , 5 . Cette liste contient deux marches : 2_3 et 8_9 .

      a) Ecrire une méthode qui reçoit en paramètre la liste L et qui retourne un booléen de valeur 'true' si la liste contient au-moins une marche et 'false' si elle ne contient pas 
de marche .

      b) Ecrire un code qui entoure la première marche rencontrée de deux '0' , s'il y a au-moins une marche dans la liste L .
      Par exemple , si la liste L est la liste indiquée au a) , après l'application de ce code , elle
devra contenir les éléments suivants : 9 , 4 , 0 , 2 , 3 , 0 , 7 , 6 , 8 , 9 , 3 , 5 .

     c) Ecrire un code qui supprime la première marche , celle entourée de deux '0' , lorsqu'il y
a au-moins une marche dans la liste L .
      Par exemple , avec la liste précédente , on devra obtenir après l'application de ce code la
liste suivante : 9 , 4 , 0 , 0 , 7 , 6 , 8 , 9 , 3 , 5 .



******************************************************************************************************************************************************
