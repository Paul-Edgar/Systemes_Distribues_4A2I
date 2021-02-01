# Systemes Distribues : 4A2I

### Cours numéro 2 - 18/02/21

------------------------

### Table de sommaire 

1. [Cours 1](#cours1)
    1. [Définition](#Definition)
    2. [GIT](#GIT)
2. [Cours 2](#cours2)
    1. [Architecture Java EE](#AJEE)
    2. [Different types de langages](#langages)
    3. [Design Pattern MVC](#MVC)
    4. [Pratique : projet Demo4a2I](#Demo4a2I)
3. [Cours 3](#cours3)
    1. [Apache Maven](#MV)
    2. [Pratique : projet Demo4a2IMAVEN](#Demo4a2IMAVEN)
4. [Cours 4](#cours4)
    1. [SOAP](#SOAP)
    2. [SOAPUI](#SoapUI)
    3. [Projet : eclipse + client python](#EclipsePython)
4. [Cours 5](#cours5)
    1. [API REST](#AR)
    2. [Postman](#Postman)
    3. [Pratique : projet APIREST](#ProjetAPIREST)

------------------------
## Cours 1 <a name="cours1"></a>

#### Définition <a name="Definition"></a>
- **architecture differe** : Chaque personne possède une copie du fichier sur lequel on travaille. 

&nbsp;
- **système centralisé** : c'est un système ou tout le monde dépend d'une même autorité centrale.

**<center> Latex, Suite Google </center>**

&nbsp;
- **système distribué** : C'est un système dans lequel l'ensemble des ressources disponibles ne se trouvent pas au même endroit ou sur la même machine. 
Type de client-serveur, s'oppose au système centralisé. 

**<center>GIT</center>**


#### GIT <a name="GIT"></a>

GIT est un logiciel de version décentralisé. 

**<center>EN LOCAL</center>**
L'initialisation d'un dossier et d'un projet pas la suite. 

**<center>git config --global user.name "Paul-Edgar"</center>**
**<center>git config --global user.mail "..."</center>**
**<center>git init</center>**

Si l'initialisation a bien fonctionné : **dir /a**  (voir le fichier caché ".git")

Si l'on souhaite créer un fichier et commencer à développer

**<center>git status</center>**
_<center>Vérifier le statut du fichier</center>_

Un **commit**, peut-être vu comme une photographie au moment actuel. Avant de faire un **commit**, on fait un add pour "monter" les fichiers

**<center>git add file.ext  ou git add .</center>**
**<center>git commit -m "..."</center>**

Une fois le commit réalisé, un identifiant de HACHAGE lui sera assimilé.

**<center>git log</center>**

L'historique des tâches réalisées, on retoruvera le messsage des commit.

**<center>LES BRANCHES</center>**

Les branches sont crées pour permettrent aux développeurs d'expérimenter de nouvelles idées sans mettre à mal le projet en lui même. 
On va donc dissocier la branche maître et les branches secondaires.
temps maximum d'une branche (=48h). Pour ne pas laisser trop de branches et entraîner des conflits plus tard. 

<center>git branch --> check les branches</center>
<center>git branch name --> créer une branche</center>
<center>git checkout name --> changer de branche</center>
<center>git branch -d name --> delete une branche</center>

&nbsp;
Apporter le travail sur la branche maître.
Une fois sur la branche secondaire.

<center>git add .</center>
<center>git commit -m "..."</center>
<center>git checkout master</center>
<center>git merge "nom branche"</center>

**<center>EN DISTANT</center>**

Une fois un dépot crée sur GitHub
On va avoir recours au pull et push

Dans un dossier **git clone "lien sur github"** (crée un dossier avec l'ensemble du dépot git)

**git push** (envoyer sur le dépot)

## Cours 2 <a name="cours2"></a>

#### Architecture Java EE <a name="AJEE"></a>
L'architecture JAVA EE est une architecture utilisée lors du développement d'une application web **Java/EE**.

On retrouvera ci-dessous un schéma explicatif de cette architecture

![TEST](https://github.com/Paul-Edgar/Systemes_Distribues_4A2I/blob/main/images/Architecture_JavaEE.jpg)

#### Les différents types de langages <a name="langages"></a>
- **langage compilé** : Le code source va êtrecompilé, par un compilateur, en un code binaire. Ce code binaire peut être représenté comme le langage machine. Le code binaire est ensuite traité par le système d’exploitation de notre ordinateur.
 
<center> C , C++ , Cobol </center>

&nbsp;
- **langage interprété** : Le code source va être interprété par un interpréteur. Ce dernier va utiliser le code source et les données d’entrée pour calculer les données de sortie.

<center> Perl , Matlab  , PHP </center>

&nbsp;
- **langage intermédiaire** : Certains langages appartiennent en quelque sorte aux deux catégories. Le programme écrit avec ces langages peut dans certaines conditions subir une phase de compilation intermédiaire vers un fichier écrit dans un langage qui n'est pas intelligible (donc différent du fichier source) et non exécutable (nécessité d'un interpréteur).

<center> Python , Java , REXX </center>


#### Design Patter MVC<a name="MVC"></a>
Ce pattern architectural permet de séparer les _données_ (**modèle**), l'interface _homme-machine_ (**vue**) et le le **controleur**.

On retrouvera ci-dessous un schéma explicatif du **M**odèle **V**ue **C**ontroller

![Design Patter MVC](https://github.com/Paul-Edgar/Systemes_Distribues_4A2I/blob/main/images/MCV.jpg)

#### Pratique : Demo4a2I<a name="Demo4a2I"></a>

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

## Cours 3 <a name="cours3"></a>

#### Apache Maven <a name="MV"></a>
**Apache Maven** est un outil de gestion et d'automatisation de production des projets logiciels **Java**  et **Java EE** . Il est utilisé pour automatiser l'intégration continue lors d'un développement de logiciel.

Dans le cadre de notre cours, nous avons appris que **maven** est un gestionnaire de paquets/dépendances.

![Maven](https://github.com/Paul-Edgar/Systemes_Distribues_4A2I/blob/main/images/maven.jpg)

1) Lecture de la liste des dépendances sur le fichier pom.xml
2) Verifier les dépendances installées dans le répertoire local
3) et 4) Téléchargement des dépendances sur le dépot distant
5) Les sauvegarder dans le dépot local


#### Pratique : Projet Demo4a2IMAVEN  <a name="Demo4a2IMAVEN"></a>

**Creation d'un projet**
&nbsp;
1. créer un dossier
2. mvn archetype:generate (connect au distant pour créer un projet maven)
   + 1723
   + 8
   + group Id : fr.polytech.nancy
   + artifact : demo4a2IMaven
   + version enter
   + enter 
   + enter 

**Utiliser notre projet maven sous eclipse**

mvn eclipse:eclipse

sous eclipse : clic droit, import, general, existingProjectintoWorkspace

**A connaitre**
1.

+ mvn validate (valide si le projet est correct)
+ mvn compile (compile le code source du code)
+ mvn test (test compilé à travers des tets unitaires)
+ mvn package (prend le code compiel et l'empaquete sous une forme distribuable , .jar par default)
+ mvn install (met le projet dans le dépot local)
+ (mvn deploy)
2. 

+ mvn clean (supprimer le dossier target)
3. 

+ mvn site (creer un dossier site, soit les pages hmtl et css ou java dispo pour notre projet)

## Cours 4 <a name="cours4"></a>

#### SOAP  <a name="SOAP"></a>
Simple Object Access Protocol de son acronyme **SOAP** est un protocole d'échange d'information structurée dans l'implémentation de services web bâti sur le XML.

![SOAP](https://github.com/Paul-Edgar/Systemes_Distribues_4A2I/blob/main/images/SOAP.png)



