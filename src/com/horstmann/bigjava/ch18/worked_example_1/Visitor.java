package com.horstmann.bigjava.ch18.worked_example_1;

public interface Visitor<E>
{
   /**
      This method is called for each visited node.
      @param data the data of the node
   */
   void visit(E data);
}

