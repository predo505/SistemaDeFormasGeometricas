import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(3.0);
        Retangulo r = new Retangulo(3.0, 6.0);
        Quadrado q = new Quadrado(4.0);

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(c);
        formas.add(r);
        formas.add(q);

        for (Forma forma : formas) {
            System.out.println("Forma: " + forma.nome());
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("Perimetro: " + forma.calcularPerimetro());
            System.out.println();
        }
    }
}
