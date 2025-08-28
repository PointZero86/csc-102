package com.horstmann.bigjava.ch08.sec03_04;

public class Student
{
   private String name;
   private int id;

   public Student(int anId) { id = anId; }
   public String getId() { return Integer.toString(id); }
   // No setId method

   public String getName() { return name; }

   public void setName(String newName)
   {
      if (newName.length() > 0) { name = newName; }
   }
}

