/*  old test cases */



import static org.junit.Assert.*;

import org.junit.Test;


public class MinheapTest {

	@Test
	public void testPrint1() {
		
		MinHeap tester = new MinHeap();
		String printString ="addcatingfaningsubtractequalingballminus";
		tester.insert("ball");
		tester.insert("cating");
		tester.insert("add");
		tester.insert("subtract");
		tester.insert("minus");
		tester.insert("equaling");
		tester.insert("faning");
	    assertEquals("Answer for input ball,cating,add,subtract,equaling,faning is add,cating,faning,subtract,equaling,ball,minus", printString, tester.toString());
		
	}
	
	@Test
	public void testPrint2() {
		
		MinHeap tester = new MinHeap();
		String printString ="catingfaningequaling";
		tester.insert("ball");
		tester.insert("cating");
		tester.insert("add");
		tester.insert("subtract");
		tester.insert("minus");
		tester.insert("equaling");
		tester.insert("faning");
	    assertEquals("Answer for input ball,cating,add,subtract,equaling,faning is catingfaningequaling", printString, tester.printOnlyIng());
		
	}
	
	@Test
	public void testPrint3() {
		
		MinHeap tester = new MinHeap();
		String printString ="abdc";
		tester.insert("a");
		tester.insert("b");
		tester.insert("c");
		tester.insert("d");
	    assertEquals("Answer for input abcd is abdc", printString, tester.toString());
		
	}

}
