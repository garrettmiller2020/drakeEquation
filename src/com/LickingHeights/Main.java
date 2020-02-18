package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
 drakeEquation();

    }

    public static void drakeEquation(){
/*Drake equation
N = number of intelligent species that can communicate with us
R∗ = 1 yr−1 (1 star formed per year, on the average over the life of the galaxy; this was regarded as conservative)
fp = 0.2 to 0.5 (one fifth to one half of all stars formed will have planets)
ne = 1 to 5 (stars with planets will have between 1 and 5 planets capable of developing life)
fl = 1 (100% of these planets will develop life)
fi = 1 (100% of which will develop intelligent life)
fc = 0.1 to 0.2 (10–20% of which will be able to communicate)
L = 1000 to 100,000,000 years (which will last somewhere between 1000 and 100,000,000 years)
 */

    int N;
    double rStar;
    double f_p;
    double numberOfExoplanets;
    double f_l;
    double f_i;
    double f_c;
    int L;

    Scanner keyboard;

        keyboard = new Scanner (System.in);

        System.out.println("Rate of star formation in our galaxy.");
        rStar=keyboard.nextDouble();

        System.out.println("The fraction of those stars that have planets.");
        f_p=keyboard.nextDouble();

        System.out.println("The number of those planets that can potentially support life.");
        numberOfExoplanets=keyboard.nextDouble();

        System.out.println("The fraction of planets that could support life that actually develop life at some point.");
        f_l=keyboard.nextDouble();

        System.out.println("The fraction of planets with life that actually go on to develop intelligent life ");
        f_i=keyboard.nextDouble();

        System.out.println("The fraction of civilizations that develop a technology.");
        f_c=keyboard.nextDouble();

        System.out.println("The length of time for which such civilizations release detectable signals into space.");
        L=keyboard.nextInt();

        //Ask for rStar number store in the rStar variable and commit
        //Ask for f_p fraction store in the f_p variable and commit
        //todo complete each one of the variables and store correctly commit each time


    N = (int)(rStar * f_p * numberOfExoplanets * f_l * f_i * f_c * L);


    System.out.println("The number of intelligent species that are out there "+ N );




    }

}
