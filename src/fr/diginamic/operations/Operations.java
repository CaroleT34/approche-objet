package fr.diginamic.operations;

public abstract class Operations {
	
	double a; 
	double b; 
	char ope;
	
	public Operations(double a, double b, char ope) {
		this.a = a;
		this.b = b;
		this.ope = ope;
	}

	//METHODE
	public double calcul() {
		if(ope == '+') {
			return a + b;
		} else if (ope == '-') {
			return a - b;
		} else if (ope == '*') {
			return a * b;
		} else if (ope == '/') {
			return a / b;
		} else {
			System.err.println("Operateur inconnu");
			return 00000000;
		}
	}
	
	public String affichageResult() {
		if(ope == '+') {
			return "Addition : " + a + " + " + b + " = " + calcul();
		} else if (ope == '-') {
			return "Soustraction : " + a + " - " + b + " = " +  calcul();
		} else if (ope == '*') {
			return"Multiplication : " + a + " * " + b + " = " +  calcul();
		} else if (ope == '/') {
			return "Division : " + a + " / " + b + " = " +  calcul();
		}
		System.err.println("Operateur inconnu");
		return null; 
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public char getOpe() {
		return ope;
	}

	public void setOpe(char ope) {
		this.ope = ope;
	}
	
	
}
