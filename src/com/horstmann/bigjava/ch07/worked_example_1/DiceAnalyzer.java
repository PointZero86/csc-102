package com.horstmann.bigjava.ch07.worked_example_1;

public class DiceAnalyzer
{
   public static void main(String[] args)
   {
      final int SIDES = 6;
      Dice dice = new Dice(SIDES); 
      dice.countInputs();
      dice.printCounters();
   }
}

