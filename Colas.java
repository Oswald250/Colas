public class Colas {

    public static void main(String[] args) {

    double lambda1 = 15,mu1 = 20;
    double P1 = lambda1 / mu1;
    double Lq1 = (P1 * P1) / (1 - P1);
    double Wq1 = Lq1 / lambda1;
    double W1 = 1 / (mu1 - lambda1);

    System.out.println("Funcion de Colas 1");
    System.out.println("p =" + P1 + "Lq =" + Lq1 + "Wq = " + Wq1 + "w = " + W1);

    double lambda2 = 10, mu2 = 15;

    System.out.println("\n=== Funcion de Colas 2 ====");
    if (lambda2 >=mu2) {

        System.out.println("El sistema instable (lambda >= mu)");
        
    } else {
        double P2 = lambda2 / mu2;
    }


        
    }
}
