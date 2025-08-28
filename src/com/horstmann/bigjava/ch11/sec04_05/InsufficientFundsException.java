package com.horstmann.bigjava.ch11.sec04_05;

public class InsufficientFundsException extends IllegalArgumentException
{
   public InsufficientFundsException() {}
   public InsufficientFundsException(String message)
   {
      super(message);
   }
}

