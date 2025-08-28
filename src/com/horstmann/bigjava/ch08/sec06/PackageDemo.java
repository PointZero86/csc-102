package com.horstmann.bigjava.ch08.sec06;

import com.horstmann.bigjava.ch08.sec06.com.horstmann.bigjava.Financial;

public class PackageDemo
{
   public static void main(String[] args)
   {
      double price = 9.95;
      double taxRate = 8.25;
      double tax = Financial.percentOf(price, taxRate);
      System.out.printf("Tax: %.2f%n", tax);
   }
}

