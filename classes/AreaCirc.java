package classes;

public class AreaCirc {
	
	double raio;
	final static double pi = 3.1415;
	
	AreaCirc(double raioFinal){
		raio = raioFinal;
	}
	
	double Area(){
		return Math.pow(raio, 2) * pi;
	}
	
	static double area(double raio) {
		return pi * Math.pow(raio, 2);
	}
}