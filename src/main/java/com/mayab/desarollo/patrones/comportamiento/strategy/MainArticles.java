package com.mayab.desarollo.patrones.comportamiento.strategy;

public class MainArticles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Article art1 = new Article(" Pieza de Madera", 10.5, 4);
		Article art2 = new Article(" Pieza de Metal", 15.2, 1);
		Article art3 = new Article(" Pieza de Plastico", 30.6, 7);
		
		Report rep = new ReportSales();
		rep.addArticle(art1);
		rep.addArticle(art2);
		rep.addArticle(art3);
		
		Report rep2 = new ReportInventory();
		rep2.addArticle(art1);
		rep2.addArticle(art2);
		rep2.addArticle(art3);
		
		rep2.performExport();
		rep2.setExpB(new ExportJson());
		
		rep.performExport();
		rep2.performExport();
		
	}

	
}
