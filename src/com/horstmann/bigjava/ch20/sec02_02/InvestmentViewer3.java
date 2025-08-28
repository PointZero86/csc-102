package com.horstmann.bigjava.ch20.sec02_02;

import javax.swing.JFrame;

/**
   This program displays the growth of an investment. 
*/
public class InvestmentViewer3
{  
   public static void main(String[] args)
   {  
      JFrame frame = new InvestmentFrame3();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}

