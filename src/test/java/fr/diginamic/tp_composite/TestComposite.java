package fr.diginamic.tp_composite;

import fr.diginamic.composite.Employe;
import fr.diginamic.composite.Service;

public class TestComposite {

	public static void main(String[] args) {
		
		Employe kevin = new Employe("Kevin","Guineau",7500);
		Employe paul = new Employe("Paul","Martin",3500);
		Employe cecile = new Employe("Cécile","Raspey",10000);
		Employe bilel = new Employe("Bilel","Bechkar",8000);
		Employe jb = new Employe("JB","Ranmey", 7500);
		Employe jane = new Employe("Jane","Doe", 3500);
		
		Service dsin = new Service("DSIN",cecile,bilel);
		Service bigData = new Service("Big Data",jb,jane);
		Service javaDev = new Service("Java Dev",kevin,paul);
		Service global = new Service("global",dsin,bigData,javaDev);
		
		System.out.println("-Salaire de kevin: " + kevin.calculerSalaire());
		System.out.println("-Salaire total DSIN: " + dsin.calculerSalaire());
		System.out.println("-Salaire total Big Data: " +bigData.calculerSalaire());
		System.out.println("-Salaire total Java Dev: " +javaDev.calculerSalaire());
		System.out.println("-Salaire total : " + global.calculerSalaire());

	}

}
