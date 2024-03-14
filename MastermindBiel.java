import java.util.Scanner;

public class Mastermind {
    private int numJugadas;
    private Combinacio secreta;
    private Combinacio jugada;
    // private Combinacion jugada = new Combinacion();

    public Mastermind() {
        numJugadas = 0;
        secreta = new Combinacio();
        jugada = new Combinacio();

    }

    public void iniciarJuego() {
        System.out.print("La combinación secreta es: ");
        secreta.generaCSecreta(2, 8);
        byte[] a = secreta.getArray_Combi();

        Scanner scanner = new Scanner(System.in);

        int NumJugadas;
        do {
            System.out.println("Introduce el número máximo de jugadas (entre 6 y 20): ");
            NumJugadas = scanner.nextInt();
            if (NumJugadas < 6 || NumJugadas > 20) {
                System.out.println("Error: El número de jugadas debe estar entre 6 y 20.");
            }
        } while (NumJugadas < 6 || NumJugadas > 20);

        System.out.println("Número de jugadas seleccionado: " + NumJugadas);

        scanner.close();
    }

    public void funcion() {
        iniciarJuego();
    }

    public void pedirJugada() {
        
    }

}
