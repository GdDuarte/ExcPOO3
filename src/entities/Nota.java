package entities;

public class Nota {
    public String nome;
    public double a;
    public double b;
    public double c;

    public double notaFinal(){
        return a + b + c;
    }public double notaFaltante(){
        return 60 - (a + b + c);
    }

}
