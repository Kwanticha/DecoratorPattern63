import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BeverageTest {

	@Test
	void testEspressoSoyMilk() {
		Beverage b1 = new Espresso();
		b1 = new Soy(b1);
		b1 = new SteamedMilk(b1);
		assertEquals("Espresso,Soy,Steamed Milk",b1.getDescription());
		assertEquals(2.24,b1.cost());
	}

	 @Test
    void testDarkRoastMochaWhip() {
		Beverage d1 = new DarkRoast();
		d1 = new Mocha(d1);
		d1 = new Whip(d1);
		assertEquals("Dark Roast,Mocha,Whip",d1.getDescription());
		assertEquals(1.29,d1.cost());
	}

}