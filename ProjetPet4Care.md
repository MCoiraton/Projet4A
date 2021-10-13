# Projet 

### Nom : Pet4Care

**Sujet** : Un site où les clients se connectent et propose à d'autres clients, les dogsitters, de s'occuper de leurs animaux de compagnie pendant un certain temps. Le site les mets en relation, leurs permet de créer des dates pour le dogsitting et de se retrouver. Ils gèrent les détails plus personnels entre eux.











## Client

* Ont un compte
* 1. Nom 
  2. Adresse
  3. Id
  4. Mdp
  5. N°personne
  6. Fiche animal

* Possède fiche présentant son animal
* A un ou plusieurs animaux, ou aucun

**Dogsitter** hérite de Client

* Possède liste d'avis des anciens clients
* Peut s'occuper de un ou plusieurs animaux, qui doivent appartenir au même client
* 1. Liste d'avis
  2. Jours de disponibilités
  3. Statut (occupé, pas occupé)

## Réservation



* Un client fait garder son chien par un dogsitter, ce qui implique

* C'est le client qui réserve le dogsitter

* Seul les dogistters non-occupés sont disponibles pour les réservations, autrement ils sont affichées non disponibles ou pas affichés du tout

* 1. Nom du client

  2. Nom du dogsitter 

  3. Heure/jour de début

  4. Heure/jour de fin 

  5. Boîte de commentaire

     

