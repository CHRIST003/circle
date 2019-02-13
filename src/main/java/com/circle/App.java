package com.circle;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args) {
        // TODO code application logic here

        double radius;

        String str;
        String output;

        circle prac2 = new circle();

        str = JOptionPane.showInputDialog("enter radius: ");
        radius = Double.parseDouble(str);
        output = "radius: "+radius+"\n"+"area:"+prac2.area(radius)+"\n"+"circumference:"+prac2.circumference(radius)+"\n"+"diameter:"+prac2.diameter(radius);
        JOptionPane.showMessageDialog(null,"need to be review", output, JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        System.out.println(prac2.toString());
        System.exit(0);
    }

}
