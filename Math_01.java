import java.util.Scanner;

public class Math_01{
    public static void main(String[] elisei){
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";

        Scanner userChoice = new Scanner(System.in);
        System.out.println("How can I help you? /n Chose a number: \n Choose 1 if you need to calculate the factorial of a number. \n Chose 2 if you need to do permutations. \n Chose 3 if you need to do combinations");
        int usrcho = userChoice.nextInt();
        switch(usrcho){
            // factorial of a number
            case 1:
            Scanner factObj = new Scanner(System.in);
            System.out.println("Enter your number");
            long factnumber1 = factObj.nextLong();
            long factnumber2 = factnumber1;
            long factorial3=0;
            for(int m=1;m<factnumber2;m++){
                factorial3 = factnumber1*m;
                factnumber1=factorial3;
            }
                System.out.println(ANSI_YELLOW + factnumber2 + "!= " + factorial3 + ANSI_RESET);
            break;

            // permutations code
            case 2:
            System.out.println("So... It's permutations time!\n");
            Scanner firstpObj = new Scanner(System.in);
            System.out.println(ANSI_CYAN + "Enter the total number of elements:" + ANSI_RESET);
            int firstn = firstpObj.nextInt();
            int firstfactorial=0;
            int secn = firstn;
            for(int i=1;i<secn;i++){ // calculate n!
                firstfactorial=i*firstn;
                firstn=firstfactorial;
            }
            Scanner secondpObj = new Scanner(System.in);
            System.out.println( ANSI_CYAN + "Insert the number of selected elements to be arranged in a specific order:" + ANSI_RESET);
            int firstk = secondpObj.nextInt();
            int firstdiff=secn-firstk;
            int secdiff=firstdiff;
            int secfactorial=0;
            for(int j=1; j<secdiff;j++){ // calculate (n-k)!
                secfactorial=j*firstdiff;
                firstdiff=secfactorial;
            }
            System.out.println("\n" + ANSI_GREEN + secn + "! = " + firstfactorial);
            System.out.println("(" + secn + " - " + firstk +  ")! = " + secdiff + "! = " + secfactorial);
            int p=firstfactorial/secfactorial;
            System.out.println("P(" + secn + "," + firstk + ")= " + p);
            System.out.println(ANSI_YELLOW + "\nNumber of possible arrangements based on " + secn + " elements and shortlisted by your criteria is " +  p + "." + ANSI_RESET);
            break;

            // combination code
            case 3:
            System.out.println("So... It's combinations time!\n");
            Scanner firstcObj = new Scanner(System.in);
            System.out.println(ANSI_CYAN + "Enter the total number of elements:" + ANSI_RESET);
            int firstn1 = firstcObj.nextInt(); // insert n
            int firstfactorial1=0;
            int secn1 = firstn1;
            for(int a=1;a<secn1;a++){ // calculate n!
                firstfactorial1=a*firstn1;
                firstn1=firstfactorial1;
            }
            Scanner secondcObj = new Scanner(System.in);
            System.out.println( ANSI_CYAN + "Insert the number of selected elements:" + ANSI_RESET);
            int firstk1 = secondcObj.nextInt(); // insert k
            int seck1=firstk1;
            int factorial1=0;
            for(int t=1;t<seck1;t++){ // calculate k!
                factorial1=t*firstk1;
                firstk1=factorial1;
            }
            int firstdiff1=secn1-seck1; // n-k
            int secdiff1=firstdiff1;
            int secfactorial1=0;
            for(int b=1; b<secdiff1;b++){ // calculate (n-k)!
                secfactorial1=b*firstdiff1;
                firstdiff1=secfactorial1;
            }
            int p1=secfactorial1*factorial1;
            int p2=firstfactorial1/p1;
            System.out.println("\n" + ANSI_GREEN + secn1 + "! = " + firstfactorial1);
            System.out.println(seck1 + "!= " + factorial1);
            System.out.println("(" + secn1 + " - " + seck1 +  ")! = " + secdiff1 + "! = " + secfactorial1);
            System.out.println("C(" + secn1 + "," + firstk1 + ")= " + p2);
            System.out.println(ANSI_YELLOW + "\nThere are " + p2 + " possible combinations of " + seck1 + " that can be created from " + secn1 + "." + ANSI_RESET);
            break;
        }
    }
}