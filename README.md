<center># Systemes Distribues : 4A2I</center>

### Cours numéro 2 - 18/02/21

------------------------

### Table de sommaire 
1. [Architecture Java EE](#AJEE)
2. [Different types de langages](#langages)
3. [Design Pattern MVC](#MVC)
4. [Pratique : projet Demo4a2I](#Demo4a2I)
5. [Installation Maven](#Maven)


------------------------

## Architecture Java EE <a name="AJEE"></a>
L'architecture JAVA EE est une architecture utilisée lors du développement d'une application web **Java/EE**.

On retrouvera ci-dessous un schéma explicatif de cette architecture

![TEST](https://github.com/Paul-Edgar/Systemes_Distribues_4A2I/blob/main/images/Architecture_JavaEE.jpg)

## Les différents types de langages <a name="langages"></a>
- **langage compilé** : Le code source va êtrecompilé, par un compilateur, en un code binaire. Ce code binaire peut être représenté comme le langage machine. Le code binaire est ensuite traité par le système d’exploitation de notre ordinateur.
 
<center> C , C++ , Cobol </center>

&nbsp;
- **langage interprété** : Le code source va être interprété par un interpréteur. Ce dernier va utiliser le code source et les données d’entrée pour calculer les données de sortie.

<center> Perl , Matlab  , PHP </center>

&nbsp;
- **langage intermédiaire** : Certains langages appartiennent en quelque sorte aux deux catégories. Le programme écrit avec ces langages peut dans certaines conditions subir une phase de compilation intermédiaire vers un fichier écrit dans un langage qui n'est pas intelligible (donc différent du fichier source) et non exécutable (nécessité d'un interpréteur).

<center> Python , Java , REXX </center>


### Design Patter MVC<a name="MVC"></a>
Ce pattern architectural permet de séparer les _données_ (**modèle**), l'interface _homme-machine_ (**vue**) et le le **controleur**.

On retrouvera ci-dessous un schéma explicatif du **M**odèle **V**ue **C**ontroller

![Design Patter MVC](https://github.com/Paul-Edgar/Systemes_Distribues_4A2I/blob/main/images/MCV.jpg)

### Pratique : Demo4a2I<a name="Demo4a2I"></a>

Pour mettre en application l'ensemble des notions vues durant ce cours. Nous avons pu développer un petit projet **Demo4a2I**
&nbsp;
Ce projet ce déroule sous l'IDE _Integrated Development Environment_ : **Eclipse IDE for Developpers**
&nbsp;
 * Création d'un Dynamic Web Project
 * Server Tomcat 8.5
 * Dynamique Web Module Version : 3.1 (sup à 3, nous ne sommes pas obligé de passer par un fichier de configuration)
 * Nous générons le dossier _web.xml_
 
Une fois le projet crée nous retrouverons plusieurs dossiers.
Dans le dossier **Java Ressources**, un dossier **src**. Ici l'ensemble du code _JAVA_. On y retrouvera les servlets.

Dans la partie **WEB_CONTENT**, on retrouve l'ensemble des _JSP_ et le dossier de configuration _web.xml_

----------------

A travers ce projet nous avons reussi à utiliser :
&nbsp;
 * **Servlets** : C'est une classe Java qui permet de créer dynamiquement des données au sein d'un serveur HTTP. Ces données sont le plus généralement présentées au format HTML, mais elles peuvent également l'être au format XML ou tout autre format destiné aux navigateurs web.

 **A noter** : Une Servlet est une classe Java qui hérite de Servlet Java

 * **JSP** : Ces fichiers Java  permettent de créer dynamiquement du code HTML

 * **web.xml** : Il définit le mappages entres les chemins URL et les servlets  qui traitent les requêtes.

  <span style="color: #ED1414 ">L'ensemble des types de fichiers sont détaillés et exliqué dans le projet</span>  

--------

**Problème rencontré**

Nous avons rencontré quelques problèmes lors du mappage des URL. Les problèmes provenaient du _web.xml_. Nous avons du supprimer l'ensemble des Servlets et JSP du projet.
Avant de les reinstaller nous avons retirer le serveur **Tomcat** du projet et nous l'avons relancé une fois l'ensemble des Servlets et JSP recrés.


## Download/Install Maven <a name="Maven"></a>
**Apache Maven** est un outil de gestion et d'automatisation de production des projets logiciels **Java**  et **Java EE** . Il est utilisé pour automatiser l'intégration continue lors d'un développement de logiciel. 

...
 




