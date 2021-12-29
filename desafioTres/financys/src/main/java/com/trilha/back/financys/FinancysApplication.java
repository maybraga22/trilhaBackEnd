package com.trilha.back.financys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.trilha.back.financys.entities.Category;
import com.trilha.back.financys.entities.Entry;

@SpringBootApplication
public class FinancysApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancysApplication.class, args);
		
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
	}

}
