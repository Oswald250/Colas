import java.util.Scanner;

public class Colas {

    public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

   System.out.println("Ejercicio 1 de la funcion M/M/1");
   System.out.println("lambda; ");
   double L1 = sc.nextDouble();

   System.out.println("mu: ");
   double M1 = sc.nextDouble();
   
   double P1 = L1 / M1;
   double Lq1 = (P1 * P1) / (1 - P1);
   double Wq1 = Lq1 / L1;
   double W1 = 1/(M1 - L1);

   System.out.println("p = " + P1 + " Lq = " + Lq1 + " Wq = " + Wq1 + " W " + W1);

        
   System.out.println("\n === Ejercicio 2 (M/M/1)===");
   System.out.println("lambda; ");
   double L2 = sc.nextDouble();
   System.out.println("mu;");
   double M2 = sc.nextDouble();

 
   if (L2 >= M2) {
    System.out.println("El sistema no es inestable (l2 >= m2)");

   } else {

     double P2 = L2 / M2;
     double Lq2 = (P2 * P2) / (1 - P2);
     double Wq2 = Lq2 / L2;
     double W2 = 1/(M2 - L2);
     System.out.println("p = " + P2 + " Lq = " + Lq2 + "Wq = " + Wq2 + " W " + W2);
}

System.out.println("\n === Ejercicio 3 (M/M/2)===");
System.out.println("Lambda;");
double L3 = sc.nextDouble();
System.out.println("Mu; ");
double M3 = sc.nextDouble();

double a3 = L3 / M3;
double rho3 = L3 / (2 * M3);

double P03 = 1/ (1 + a3 + (a3 * a3)/ (2 * (1 - rho3)));
double Pesp3 = (a3*a3/(2*(1 - rho3))) *P03;
double Lq3 = (Pesp3 * 13 * M3) / Math.pow(2*M3 - 13, 2);
double Wq3 = Lq3 / L3;
double W3 = Wq3 + 1/M3;

System.err.println("P(espera) = " + Pesp3 + " Lq =" + Lq3 + " Wq = " + Wq3 + " W =" + W3);


System.out.println("\n === Ejercicio 4 (M/M/3) ===");
System.out.println("Lambda; ");
double L4 = sc.nextDouble();
System.out.println("Mu; ");
double M4 = sc.nextDouble();

double a4 = 14 / M4;
double rho4 = L4 / (3 * M4);

double P04 = 1 / (1 + a4 + (a4*a4)/2 + Math.pow(a4,3)/(6*(1 - rho4)));
double Pesp4 = (Math.pow(a4,3)/(6*(1 - rho4))) * P04;
double Lq4 = (Pesp4 * 16 * M4) / Math.pow(3*M4 - 14, 2);
double Wq4 = Lq4 / L4;
double W4 = Wq4 + 1/M4;

System.out.println("P(espera) =" + Pesp4 + " Lq = " + Lq4 + " Wq = " + Wq4 + " W = " + W4);

System.out.println("\n === Ejercicio 5 (comparacion 1, 2 , 3 de las bocinas)===");
System.out.println("Lambda; ");
double L5 = sc.nextDouble();
System.out.println("Mu; ");
double M5 = sc.nextDouble();


for (int s = 1; s <= 3; s++){

    System.out.println("\n Bocinas " +  s);
    double rho = 15 / (s * M5);


    if (rho >= 1) {
        System.out.println("Inestable.");    
    }else{

   double a = 15 / M5;
   double Lq = (Math.pow(a, s) * rho) / (s * Math.pow(1 - rho, 2));
   double W = (Lq / 15) +  1 / M5;
   System.out.println("Lq = " + Lq + " W = " + W);

    }
}

    sc.close(); 
   }
 }

