package myPackage;

public class Triangolo {

	private int base;
	private int altezza;
    
    public Triangolo(int b, int h) {
        
        base = b;
        altezza = h;
    
    }

    public int area() {
    
        return (base * altezza) / 2;
    
    }
}