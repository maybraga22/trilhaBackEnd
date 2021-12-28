package application;

import entities.Category;
import entities.Entry;
import entities.Product;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {


		Category category1 = new Category(1, "Salário", "Reecebimento de salário");
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Pagamento");
		category2.setDescription("Pagamento de Boletos");
		

		Entry entry1 = new Entry(1, "Salário na Empresa X", "Adiantamento quinzenal", "revenue", "4405.49", "15/12/2021",
				true, 1);

		Entry entry2 = new Entry();
		entry2.setId(2);
		entry2.setName("Salário da Empresa Y");
		entry2.setDescription("Pagamento mensal");
		entry2.setType("revenue");
		entry2.setAmount("4405.49");
		entry2.setDate("30/12/2021");
		entry2.setPaid(true);
		entry2.setCategoryId(2);

		System.out.println(category1.toString());
		System.out.println(category2.toString());
		System.out.println();
		System.out.println(entry1.toString());
		System.out.println(entry2.toString());
		System.out.println();

		List<Product> product1 = new ArrayList<>();

		Product p1 = new Product(1, "BATEDEIRA", "PHILIPS", 300.00);
		Product p2 = new Product(2, "LIQUIDIFICADOR", "BRITANIA", 230.00);
		Product p3 = new Product(3, "MICROONDAS", "LG", 400.00);
		Product p4 = new Product(4, "AIR FRYER", "PHILIPS", 350.00);
		Product p5 = new Product(5, "CAFETEIRA", "NESPRESSO", 120.00);

		product1.add(p1);
		product1.add(p2);
		product1.add(p3);
		product1.add(p4);
		product1.add(p5);

		for (Product p : product1) {
			p.productPrice();
			System.out.println(p);
		}

		List<Product> product2 = new ArrayList<>();
		
		Product pr1 = new Product(1, "TV", "SAMSUNG", 3000.00);
		Product pr2 = new Product(2, "HOME THEATHER", "JBL", 2300.00);
		Product pr3 = new Product(3, "COMPUTADOR", "DELL", 4000.00);

		product2.add(pr1);
		product2.add(pr2);
		product2.add(pr3);		
		
		System.out.println();
		System.out.println("Produtor mais caros:");

		for (Product p : product2) {
			p.productPrice();
			System.out.println(p);
		}



	}

}
