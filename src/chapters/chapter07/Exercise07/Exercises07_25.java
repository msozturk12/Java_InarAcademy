package chapters.chapter07.Exercise07;

import java.util.Scanner;

public class Exercises07_25 {
    public static void main(String[] args) {
        /*
            The method returns the number
            of real roots.
            -enter 3 values a,b,c
            -method
            -display the real root
            ax2 + bx + c = 0
         */
        double[] eqn = getThreeValue(); //double r = Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2];
        double r = getDiscriminant(eqn);
        if (r == 0) {
            System.out.println("The equation has one root : " + getRoot1(eqn));
        } else if (r > 0) {
            System.out.println("The equation has 2 roots " + getRoot2(eqn) + " and " + getRoot3(eqn));

        } else {
            System.out.println("The equation has no real root");
        }
    }

    public static double  getRoot3(double[] eqn) {
        return (-eqn[1] - Math.pow(getDiscriminant(eqn),0.5) / (2* eqn[0]));
    }

    public static double getRoot2(double[] eqn) {
        return (-eqn[1] + Math.pow(getDiscriminant(eqn),0.5) / (2* eqn[0]));
    }

    public static double getRoot1(double[] eqn) {  //double root1 = (-b + Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / (2*a);
        double root1 = (-eqn[1] + Math.pow(getDiscriminant(eqn),0.5) / (2* eqn[0]));
        return root1;
    }


    // r=Math.pow(b, 2) - 4 * a * c > 0


    public static double getDiscriminant(double[] eqn) {  //Math.pow(b, 2) - 4 * a * c > 0  a=0,b=1,c=2
        return Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2];


    }


    public static double[] getThreeValue() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three value(a,b,c) for equation ");//denklem için sayı alıyoruz
        double[] eqn = new double[3];
        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();

        }
        return eqn;
    }

    public static void displayRoots(double[] root) {
        System.out.println("Equation's root(s) --> ");
        for (int i = 0; i < root.length; i++) {
            System.out.println(root[i] + " ");

        }
    }

}
