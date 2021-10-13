import javax.swing.*;

public class PythagoreanTheorem{
    public static void main(String[] dth){
        int toFind = Integer.parseInt(JOptionPane.showInputDialog("What do you need to find?\n\n1. The hypotenuse.\n2. One of the sides."));

        double sideA = 0;
        double sideB = 0;
        double hypotenuse = 0;
        double z = 0;
        int restart = 1;

        switch(toFind){
            case 1:
            sideA = findsidea(sideA);
            sideB = findsideb(sideB);
            sideA *= sideA;
            sideB *= sideB;
            z = sideA + sideB;
            hypotenuse = Math.sqrt(z);
            JOptionPane.showMessageDialog(null, "The hypotenuse length is " + hypotenuse);
            break;

            case 2:
            do{
                sideA = findsidea(sideA);
                hypotenuse = findhypotenuse(hypotenuse);
                hypotenuse *= hypotenuse;
                sideA *= sideA;
                z = hypotenuse - sideA;

                if(z > 0){
                    sideB = Math.sqrt(z);
                    JOptionPane.showMessageDialog(null, "The second side length is " + sideB);
                    restart = 0;
                } else{
                    JOptionPane.showMessageDialog(null, "The hypotenuse length should be greater than the side.");
                    int doRestart = Integer.parseInt(JOptionPane.showInputDialog("Do you want to try again?\n\n1. Yes.\n2. No."));
                    switch(doRestart){
                        case 1:
                        restart ++;
                        break;
                        
                        case 2:
                        restart = 0;
                    }
                }
            } while(restart > 0);
            
            
            break;
        }
    }

    static double findsidea(double sideA){
        sideA = Double.parseDouble(JOptionPane.showInputDialog("Input first side length."));
        return sideA;
    }

    static double findsideb(double sideB){
        sideB = Double.parseDouble(JOptionPane.showInputDialog("Input second side length."));
        return sideB;
    }

    static double findhypotenuse(double hypotenuse){
        hypotenuse = Double.parseDouble(JOptionPane.showInputDialog("Input hypotenuse length."));
        return hypotenuse;
    }
}