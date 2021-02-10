# Systemes Distribues : 4A2I

### Nouvelles relations  - 08/02/21

------------------------

Dans ce TP nous avons pu mettre en place une base de donnée. Notre projet REST a pour objectif de communiquer avec cette dernière via différente relation que nous expliquerons ci-dessous.

- **OneToOne**

Une relation de type **One-To-One** permet de lier deux objets Java ensemble (ainsi que les données associées en base de données) et de permettre de naviguer d'une instance à l'autre et réciproquement. 

![OneToOne](https://github.com/Paul-Edgar/Systemes_Distribues_4A2I/blob/main/images/One1.PNG)

- **OneToMany**

Une relation de type **One-To-Many** a du sens quand un élément est associé à plusieurs autres éléments.

![OneToOne](https://github.com/Paul-Edgar/Systemes_Distribues_4A2I/blob/main/images/One2.PNG)

- **ManyToOne**

Une relation de type **Many-To-One** a du sens quand plusieurs éléments peuvent être associés à un même élément.

![OneToOne](https://github.com/Paul-Edgar/Systemes_Distribues_4A2I/blob/main/images/Many1.PNG)

- **ManyToMany**

Une association de type **Many-To-Many** et requise entre deux entités quand une instance du type de la première entité peut être mise en relation avec un nombre quelconque d'instance de second type et réciproquement.

![OneToOne](https://github.com/Paul-Edgar/Systemes_Distribues_4A2I/blob/main/images/Many2.PNG)

Nous concernant ces relations sont utilisées dans le cas de notre TP ZOO

**@OneToOne** : un animal ne peut avoir qu'un soigneur
**@OneToMany** : un zoo peut avoir plusieurs animaux
**@ManyToOne** : plusieurs animaux peuvent appartenir au meme zoo
**@ManyToMany** : pas encore implémenté mais nous avions comme objectif , un animal peut avoir plusieurs types de nourritures qui peuvent correspondre à différent animaux

