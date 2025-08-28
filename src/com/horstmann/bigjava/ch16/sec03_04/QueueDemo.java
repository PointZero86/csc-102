package com.horstmann.bigjava.ch16.sec03_04;

public class QueueDemo
{
   public static void main(String[] args)
   {
      CircularArrayQueue q = new CircularArrayQueue();
      q.add("Tom");
      q.add("Diana");
      q.add("Harry");
      while (!q.empty())
      {
         System.out.println(q.remove());
      }
   }
}

