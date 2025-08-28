package com.horstmann.bigjava.ch10.special_topic_2_2;

public interface Measurable
{
   double getMeasure(); // An abstract method
   
   default boolean smallerThan(Measurable other)
   {
      return getMeasure() < other.getMeasure();
   }
}

