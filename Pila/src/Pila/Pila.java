package Pila;

public class Pila {
	private String arreglo[];
	private int top;
	private int tamano;

	Pila(int tamano){
		arreglo=new String[tamano];
		this.tamano=tamano;
		top=-1;
	}

	public boolean lleno(){
		return top==tamano-1;
	}

	public boolean vacio(){
		return top==-1;
	}

	public int getTamano(){
		return tamano;
	}
	
	public int getTop(){
		return top+1;
	}


	public void push(String texto){
		if (lleno()){
			System.out.println("La pila esta llena");
			System.exit(1);
		}
		arreglo[++top]=texto;
		System.out.println("Agregado el texto: '" + texto + "'");
		System.out.println("Top: "+top);
	}
	
	public String pop(){
		if(vacio()){
			System.out.println("La pila esta vacia");
			System.exit(1);
		}
		return arreglo[top--];
	}

	public String getTextoMasLargo(){
		if (vacio()) {
			System.out.println("La pila esta vacia");
			System.exit(1);
		}
		int max=0;
		int pos=0;
		for (int i = 0; i <= top; i++) {
			if (arreglo[i].length() > max) {
				max=arreglo[i].length();
				pos=i;
			}
		}
		return arreglo[pos];
	}

	public String getTextoMasCorto(){
		if (vacio()) {
			System.out.println("La pila esta vacia");
			System.exit(1);
		}
		int min = 10000;
		int pos = 0;
		for (int i = 0; i <= top; i++) {
			if (arreglo[i].length() < min) {
				min = arreglo[i].length();
				pos = i;
			}
		}
		return arreglo[pos];
	}

	public int getTamanoTexto(int posicion){
		if (vacio()) {
			System.out.println("La pila esta vacia");
			System.exit(1);
		}
		if (posicion>top || posicion<0){
			System.out.println("Posicion no valida");
			System.exit(1);
		}
		return arreglo[posicion].length();
	}

	public String imprimirTexto(int posicion){
		if (vacio()) {
			System.out.println("La pila esta vacia");
			System.exit(1);
		}
		if (posicion > top || posicion < 0) {
			System.out.println("Posicion no valida");
			System.exit(1);
		}
		return arreglo[posicion];
	}

	//Dadas dos palabras, dice cual es mas larga
	public void compararTamanos(int pos1,int pos2){
		if (vacio()) {
			System.out.println("La pila esta vacia");
			System.exit(1);
		}
		if (pos1 > top || pos1 < 0) {
			System.out.println("Posicion del primer texto no valida");
			System.exit(1);
		}
		if (pos2 > top || pos2 < 0) {
			System.out.println(pos2);
			System.out.println(top);
			System.out.println("Posicion del segundo texto no valida");
			System.exit(1);
		}
		int comp=arreglo[pos1].compareTo(arreglo[pos2]);
		if (comp>0) {
			System.out.format("El texto %s es mas largo que el texto %s\n", arreglo[pos1], arreglo[pos2]);
		} else if(comp<0){
			System.out.format("El texto %s es mas largo que el texto %s\n", arreglo[pos2], arreglo[pos1]);
		} else{
			System.out.println("Ambas palabras tienen el mismo largo");
		}
	}

	
}
