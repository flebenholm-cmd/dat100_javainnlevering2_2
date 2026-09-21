package no.hvl.dat100.matriser;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Timeout(30)
class MatriserEnhetsTests {

	static int[][] a,b,c;

	@BeforeEach
	public void initEach() {
		
		int[] a0 = {1,2,3};
		int[] a1 = {4,5,6};
		int[] a2 = {7,8,9};
		
		a = new int[3][];
		
		a[0] = a0;
		a[1] = a1;
		a[2] = a2;
		
		int[] b0 = {10,11,12};
		int[] b1 = {13,14,15};
		int[] b2 = {16,17,18};
		
		b = new int[3][];
		
		b[0] = b0;
		b[1] = b1;
		b[2] = b2;
		
		int[] c0 = {1,2,3};
		int[] c1 = {4,5,6};
		int[] c2 = {7,8,9};
		int[] c3 = {10,11,12};
		
		c = new int[4][];
		
		c[0] = c0;
		c[1] = c1;
		c[2] = c2;
		c[3] = c3;
		
	}
	
	@Test
	void testSkrivUt() {
		
		Matriser.skrivUt(a);
		Matriser.skrivUt(b);
		Matriser.skrivUt(c);
	}
	
	@Test
	void testtilStreng() {
		
		assertEquals("1 2 3\n4 5 6\n7 8 9\n",Matriser.tilStreng(a));
		assertEquals("1 2 3\n4 5 6\n7 8 9\n10 11 12\n",Matriser.tilStreng(c));
	}

	@Test
	void testSkaler() {
		
		int[][] askalert = { {2,4,6}, {8,10,12}, {14,16,18} };
		int[][] cskalert = { {2,4,6}, {8,10,12}, {14,16,18}, {20,22,24} };
		
		int[][] skaler = Matriser.skaler(2,a);
		
		assertFalse(skaler == a);
		assertArrayEquals(askalert,skaler);
		
		skaler = Matriser.skaler(2, c);
		assertFalse(skaler == c);
		assertArrayEquals(cskalert,skaler);
		
	}
	
	@Test
	void testSpeile() {
		
		int[][] speilet = { {1,4,7}, {2,5,8}, {3,6,9} };
			
		int[][] speile = Matriser.speile(a);
		
		assertFalse(speile == a);
		assertArrayEquals(speilet,speile);
	}
	
	@Test 
	void testMultipliser () {

		int[][] ab = { {84,90,96}, {201,216,231}, {318,342,366} };

		int[][] multiplisert = Matriser.multipliser(a,b);
		
		assertArrayEquals(ab,multiplisert);
				
		int[][] ca = { {30,36,42}, {66,81,96}, {102,126,150}, {138,171,204} };
		multiplisert = Matriser.multipliser(c,a);
		assertArrayEquals(ca,multiplisert);
		
	}
	
	@Test
	void testerLik() {
		
		assertTrue(Matriser.erLik(a, a));
		assertTrue(Matriser.erLik(c, c));
		assertFalse(Matriser.erLik(a, b));
		assertFalse(Matriser.erLik(a, c));
		assertFalse(Matriser.erLik(c, a));
	}
}
