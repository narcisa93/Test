package teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clase.OperatiiVector;

public class TesteOperatiiVector {

	OperatiiVector ov;
	ArrayList<Integer> vector;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		 vector = new ArrayList<Integer>();
	     ov = new OperatiiVector(vector);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSuma1() {
		assertEquals(0,ov.sumaElemente());
	}
	
	@Test
	public void testSuma2() {
		vector.add(null);
		ov = new OperatiiVector(vector);
		assertEquals(0,ov.sumaElemente());
	}
	
	@Test
	public void testSuma3() {
		vector.clear();
		vector.add(-1);
		vector.add(-2);
		ov.setVector(vector);
		assertEquals(-3,ov.sumaElemente());
	}
	
	@Test
	public void testSuma4() {
		vector.clear();
		vector.add(-1);
		vector.add(1);
		ov.setVector(vector);
		assertEquals(0,ov.sumaElemente());
	}
	
	@Test
	public void testMaxPar1() {
		vector.clear();
		vector.add(2);
		vector.add(4);
		ov.setVector(vector);
		assertEquals(4,ov.maximPar());
	}
	
	@Test
	public void testMaxPar2() {
		vector.clear();
		vector.add(1);
		vector.add(3);
		ov.setVector(vector);
		assertEquals(-1,ov.maximPar());
	}
	
	@Test
	public void testMaxPar3() {
		vector.clear();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		ov.setVector(vector);
		assertEquals(4,ov.maximPar());
	}
	
	@Test
	public void testMaxPar4() {
		vector.clear();
		vector.add(null);
		vector.add(null);
		ov.setVector(vector);
		assertEquals(-1,ov.maximPar());
	}
	
	@Test
	public void testMaxPar5() {
		vector.clear();
		vector.add(null);
		vector.add(2);
		ov.setVector(vector);
		assertEquals(2,ov.maximPar());
	}
	
	@Test
	public void testMaxPar6() {
		vector.clear();
		ov.setVector(vector);
		assertEquals(-1,ov.maximPar());
	}
	
	@Test
	public void testArrayMin1() {
		vector.clear();
		vector.add(1);
		vector.add(2);
		ov.setVector(vector);
		assertEquals(1,ov.arrayMinimum());
	}
	
	@Test
	public void testArrayMin2() {
		vector.clear();
		ov.setVector(vector);
		assertEquals(Integer.MIN_VALUE,ov.arrayMinimum());
	}
	
	@Test
	public void testArrayMin3() {
		vector.clear();
		vector.add(null);
		ov = new OperatiiVector(vector);
		assertEquals(Integer.MIN_VALUE,ov.arrayMinimum());
	}
	
	@Test
	public void testArrayMin4() {
		vector.clear();
		vector.add(-2);
		vector.add(1);
		ov = new OperatiiVector(vector);
		assertEquals(-2,ov.arrayMinimum());
	}

}
