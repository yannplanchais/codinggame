package fr.ausy.codinggame.q03_HelloArguments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fr.ausy.codinggame.q03_HelloArguments.Echo;

class EchoTest {

	@Test
	void testEcho() {
		
		String test1 = new String();
		assertEquals("", Echo.echo(test1.split(" ")));
		String test2= new String ("dede dodo didi");
		assertEquals("dede\ndodo\ndidi\n", Echo.echo(test2.split(" ")));
		
	}

}
