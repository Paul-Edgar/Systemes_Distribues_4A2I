import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService(targetNamespace="http://www.polytech.nancy.fr")
public class MonService 
{
	
	// �crire une m�thode qui permet d'ajouter un produit...
	public Product ajouterProduit(int code, String designation, double prix)
	{
		Product p = new Product(code, designation, prix);
		produits.add(p);
		return p;
	}
	
	// �crire une m�thode qui permet de supprimer un produit sachant son code...
	public Product supprimerProduit(int code)
	{
		Product p = null;
		for (Product product : produits)
		{
			if(product.getCode()==code)
			{
				produits.remove(product);
				p = product;
			}
		}
		return p;
	}
	
	// afficher tous les produits dont le prix est sup�rieur � une valeur pass�e en param�tre...
	public List<Product> produitSuperieurPrix(double prix)
	{
		List<Product> resultat = new ArrayList<>();
		for (Product product : produits)
		{
			if(product.getPrix()>prix)
			{
				resultat.add(product);
			}
		}
		return resultat;
	}
	
	// afficher tous les produits dont le prix est inf�rieur � une valeur pass�e en param�tre...
		public List<Product> produitInferieurPrix(double prix)
		{
			List<Product> resultat = new ArrayList<>();
			for (Product product : produits)
			{
				if(product.getPrix()<prix)
				{
					resultat.add(product);
				}
			}
			return resultat;
		}
	
	public static List<Product> produits = new ArrayList<>();
	static {
		produits.add(new Product(1, "Tableau", 1000));
		produits.add(new Product(2, "Vase", 100));
		produits.add(new Product(3, "Miroir", 50));
		produits.add(new Product(4, "Lampe", 25));
		produits.add(new Product(5, "Tapis", 10));
	
	}
	
	public List<Product> afficherTousLesProduits(){
		return produits;
	}
	
	
	@WebMethod(operationName="methode")
	// methode ou on change le nom
	public double convertir(@WebParam(name="montant") double mt)
	{
		return mt*1.6;
	}
	
	public double somme(double a, double b)
	{
		return a+b;
	}
	
	public Product afficherProduit(int code)
	{
		return new Product(code, "Tablette", 1200);
	}
}
