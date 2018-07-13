package fr.gtm.tp;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class AfficherNombresTest {

	private AfficherNombres app;

	@Before
	public void InisializeApp() {
		this.app = new AfficherNombres();
	}

	@Test
	public void test1StringWithNumber() {
		assertThat(this.app.generateString(), startsWith("1 2 "));
	}

	@Test
	public void test2StringWithBuzzFeez() {
		assertThat(this.app.generateString(),
				allOf(containsString(" Buzz "), containsString(" Freez "), containsString(" BuzzFreez ")));

	}

}
