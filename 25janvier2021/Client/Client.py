from zeep import Client
import sys;
import os;

#----------------- FONCTIONS ----------------

# Creation des fichiers txt depuis le format JSON récupéré

def Create_File(nb_file,p):
	
	if nb_file == 1: 
		name_file = 'article_All'
		result = client.service.afficherTousLesProduits()
	elif nb_file == 2:
		name_file = 'article_Sup'
		result = client.service.produitSuperieurPrix(int(p))
	elif nb_file == 3:
		name_file = 'article_Inf'
		result = client.service.produitInferieurPrix(int(p))
	else:
		sys.exit()
	
	file = open(name_file + '.txt','w') #ouvre le fichier en ecriture
	strings = [str(result) for result in result]
	a_string = "".join(strings)
	an_integer = str(a_string)
	file.write(an_integer)
	file.close() #ferme le fichier
	# les 24 à 27 permettent de recuperer le contenu JSON et de le mettre dans le fichier texte crée ligne 23

# Connaitre le nombre d'article

def Nb_Article():

	n = 0
	test = 5
	
	fichier = open('article_All.txt', 'r')
	#----------- Détermine le nombre d'article 
	for line in fichier:
		n += 1

	if n == test:
		code_nb = 1
	else:
		code_nb = 1
		while n != test:
			test = test + 4
			code_nb += 1
	
	return code_nb
	fichier.close() 

# Trier les articles du JSON au texte
# Cette fonction permet de trier le format JSON recupéré sur MonService (du côté serveur)

def Trie_Article(nom_fichier):

	designation = "'designation':"
	prix = "'prix':"
	code = "'code':"

	f = open(nom_fichier + '.txt', 'r')
	#---------- Affiche les articles
	for ligne in f:
		if code in ligne:
			code_1 = ""+ligne[12:] #recupere le code de l'article
			code_2 = code_1[:-2]
			#-------------------------
			for ligne2 in f:
				if designation in ligne2:
					designation_1 = ""+ligne2[20:]
					designation_2 = designation_1[:-3] #recupere le nom de l'article
					#-------------------
					for ligne3 in f:
						if prix in ligne3:
							prix_1 = ""+ligne3[12:] #recupere son prix
							print("L'article n°" + code_2 + " : " + designation_2 + ", " + prix_1)
							break
						break
					break	
	f.close()

#--------------------------------------------------------------------

print("\n")
print("╔═════════════════════CLIENT═════════════════════╗")
print("║                                                ║")
print("║  1 - Faire la somme                            ║")
print("║  2 - Multiplier par 100                        ║")
print("║  3 - Afficher les produits                     ║")
print("║  4 - Ajouter un produit                        ║")
print("║  5 - Supprimer un produit                      ║")
print("║  6 - Comparer les prix                         ║")
print("║    - Retour                                    ║")
print("║                                                ║")                                            
print("╚════════════════════════════════════════════════╝")

choose = input("\nChoisir ce que vous voulez faire : ")
client = Client("http://localhost:8989/?wsdl")

if choose == "1":
	a = input("\nVeuillez entrer le premier chiffre : ")
	b = input("Veuillez entrer le second chiffre : ")
	result = client.service.somme(int(a),int(b))
	print("Le résultat renvoyé par le service est", result)
elif choose == "2":
	multiple = input("\nVeuillez entrer le chiffre à multiplier : ")
	result = client.service.methode(int(multiple))
	print("Le résultat renvoyé par le service est", result)
elif choose == "3":
	
	Create_File(1,0) 
	print("\n")
	Trie_Article('article_All')
	os.remove('article_All.txt') #supprime le fichier crée
	
elif choose == "4":
	
	print("\nNous allons ajouter un article")
	
	Create_File(1,0)
	test = Nb_Article()
	code_ajout = test + 1
	designation_ajout = input("\nVeuillez entrer le nom de l'article : ")
	prix_ajout = input("\nVeuillez entrer le prix de l'article : ")
	result = client.service.ajouterProduit(int(code_ajout), str(designation_ajout), int(prix_ajout))
	
	print("L'article a bien été ajouté !")
	os.remove('article_All.txt')
	
elif choose == "5":

	print("\nNous allons supprimer un article")
	print("Voici la liste des articles pouvant être supprimé\n")
	
	Create_File(1,0)
	Trie_Article('article_All')
	
	choose_delete = input("Quelle article voulez vous supprimer (Selectionner le numéro de l'article) : ")
	nb = Nb_Article()
	
	if 0 < int(choose_delete) <= int(nb):
		result = client.service.supprimerProduit(int(choose_delete))
		print("La suppression a été pris en compte !")
		os.remove('article_All.txt')
	else:
		print("L'article n'est pas présent !")
		sys.exit()
		os.remove('article_All.txt')
		
elif choose == "6":
	
	print("\nNous allons comparer les prix")
	choose_prix = input("\nEntrer le prix à comparer : ")
	choose_SupInf = input("Voulez vous les articles supérieur au prix (1) ou inférieur (2) : ")
	
	
	if int(choose_SupInf) == 1:
	
		Create_File(2,int(choose_prix))
		print("\n")
		Trie_Article('article_Sup')
		os.remove('article_Sup.txt')
		
	elif int(choose_SupInf) == 2:
		
		Create_File(3,int(choose_prix))
		print("\n")
		Trie_Article('article_Inf')
		os.remove('article_Inf.txt')
		
	else:
		print("Vous n'avez pas séléctionné la bonne info !")
		sys.exit()
else:
	print("Fermeture du client")
	sys.exit()




