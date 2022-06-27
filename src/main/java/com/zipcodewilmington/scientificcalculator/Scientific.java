package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;

public class Scientific {
    public double cos(double numA) {
        return Math.cos(numA);
    }

    public double sin(double numB) {

        return Math.sin(numB);
    }

    public double tan(double numC) {

        return Math.tan(numC);
    }


    public double acos(double x) {
        return Math.acos(x);
    }


    public double asin( double y) {
        return Math.asin(y);
    }


    public double atan(double z) {
        return Math.atan(z);
    }


       public static void main(String[] args) {
    JFrame frame = new JFrame();
      frame.setSize(800, 600);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              GraphicsDevice graphics = GraphicsEnvironment.getLocalGraphicsEnvironment()
              .getDefaultScreenDevice();
              graphics.setFullScreenWindow(frame);
              graphics.setDisplayMode(new DisplayMode(800, 600, 32, 60));
              frame.setVisible(true);
              }
}








