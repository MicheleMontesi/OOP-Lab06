package it.unibo.oop.lab.collections1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Example class using {@link java.util.List} and {@link java.util.Map}.
 * 
 */
public final class UseCollection {
	
	private static final int ELEMS = 1_000_000;
    private static final int TO_MS = 1_000_000;
    private static final int TIMES = 1_000;

    private UseCollection() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
    	ArrayList<Integer> array= new ArrayList<>();
    	
    	for (int i=1000; i<2000; i++) {
    		array.add(i);
    	}
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
    	LinkedList<Integer> lList = new LinkedList<>();
    	lList.addAll(array);
    	
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
    	int firstNum = array.get(0);
    	int lastNum = array.get(array.size() - 1);
    	array.remove(0);
    	array.remove(array.size() - 1);
    	array.add(0, lastNum);
    	array.add(array.size() - 1, firstNum);
    	
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
    	for (Integer i : array) {
    		System.out.println(i);
    	}
    	
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
    	long time = System.nanoTime();
    	for (int i = 1; i < ELEMS; i++) {
    		array.add(0, i);
    	}
    	time = System.nanoTime() - time;
    	System.out.println("Time to add in array: " + time / TO_MS + "ms");
    	
    	time = System.nanoTime();
    	for (int i = 1; i < ELEMS; i++) {
    		lList.add(0, i);
    	}
    	time = System.nanoTime() - time;
    	System.out.println("Time to add in lList: " + time / TO_MS + "ms");
    	
        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */
    	time = System.nanoTime();
    	for (int i = 0; i < TIMES; i++) {
    		array.get(array.size() / 2);
    	}
    	time = System.nanoTime() - time;
    	System.out.println("Time to read in array: " + time / TO_MS + "ms");
    	
    	time = System.nanoTime();
    	for (int i = 0; i < TIMES; i++) {
    		lList.get(lList.size() / 2);
    	}
    	time = System.nanoTime() - time;
    	System.out.println("Time to read in lList: " + time / TO_MS + "ms");
    	
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         * 
         * Africa -> 1,110,635,000
         * 
         * Americas -> 972,005,000
         * 
         * Antarctica -> 0
         * 
         * Asia -> 4,298,723,000
         * 
         * Europe -> 742,452,000
         * 
         * Oceania -> 38,304,000
         */
    	Map<String, Long> population = new HashMap<String, Long>()
    	{/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{
    		put("Africa", 1_110_635_000L);
    		put("Americas", 972_005_000L);
    		put("Antarctica", 0L);
    		put("Asia", 4_298_723_000L);
    		put("Europe", 742_452_000L);
    		put("Oceania", 38_304_000L);
    	}};
    	
        /*
         * 8) Compute the population of the world
         */
    	Long worldPopulation = 0L;
    	for (final Long i : population.values()) {
    		worldPopulation += i;
    	}
    	System.out.println("World Population is: " + worldPopulation);
    }
}
