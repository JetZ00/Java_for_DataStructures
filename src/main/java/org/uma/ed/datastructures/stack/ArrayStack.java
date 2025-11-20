package org.uma.ed.datastructures.stack;

import java.util.Arrays;

/**
 * This class represents a Stack data structure implemented using an array of elements.
 * The size of the array (capacity) is automatically increased when it runs out of capacity.
 *
 * @param <T> The type of elements in stack.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public class ArrayStack<T> extends AbstractStack<T> implements Stack<T> {

  static final int TAM_MAXIMO = 20;
  int size;

}
