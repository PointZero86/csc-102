package com.horstmann.bigjava.ch18.worked_example_1;

/**
   A person with a name.
*/
public class Person implements Comparable<Person>
{
   private String name;

   /**
      Constructs a Person object
      @param aName the name of the person
   */
   public Person(String aName)
   {
      name = aName;
   }
   
   public String toString() 
   {
      return getClass().getName() + "[name=" + name + "]";
   }
   
   public int compareTo(Person other)
   {
      return name.compareTo(other.name);
   }
}

