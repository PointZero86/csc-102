package com.horstmann.bigjava.ch15.worked_example_2;

/**
   This event describes a customer departing from a teller.
*/
public class Departure extends Event
{
   private int teller;

   /**
      @param time the departure time
      @param teller the teller holding the customer
   */
   public Departure(double time, int teller)
   {
      super(time);
      this.teller = teller;
   }
   
   public void process(Simulation sim)
   {  
      BankSimulation bank = (BankSimulation) sim;
      bank.remove(teller);
   }
}

