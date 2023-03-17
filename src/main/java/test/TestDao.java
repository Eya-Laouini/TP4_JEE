package test;
import java.util.List;

import dao.ProduitDaoImpl;
import metier.entities.Produit;

public class TestDao {
		public static void main(String[] args) {
			ProduitDaoImpl pdao= new ProduitDaoImpl();
			Produit prod= pdao.save(new Produit("Boeing 767-33A/ER",170));
			System.out.println(prod);
			List<Produit> prods =pdao.produitsParMC("Airbus");
			for (Produit p : prods)
			System.out.println(p);
	}

}
