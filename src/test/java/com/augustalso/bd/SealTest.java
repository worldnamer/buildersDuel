package com.augustalso.bd;

import static org.junit.Assert.*;
import static org.easymock.EasyMock.*;

import java.util.Random;

import org.junit.Test;

public class SealTest {
	
	@Test
	public void hasHigh() {
		Seal seal = new Seal(0, 5, null);
		assertEquals(5, seal.getHigh());
	}
	
	@Test
	public void hasLow() {
		Seal seal = new Seal(1, 4, null);
		assertEquals(1, seal.getLow());
	}
	
	@Test
	public void canFlip() {
		Random rnd = createMock(Random.class);
		expect(rnd.nextBoolean()).andReturn(false);
		replay(rnd);
		Seal seal = new Seal(0, 5, rnd);
		
		int value = seal.flip();
		
		assertEquals(0, value);
		verify(rnd);
	}

	@Test
	public void returnsHighWhenFlipIsTrue() {
		Random rnd = createMock(Random.class);
		expect(rnd.nextBoolean()).andReturn(true);
		replay(rnd);
		Seal seal = new Seal(0, 5, rnd);
		
		int value = seal.flip();
		
		assertEquals(5, value);
		verify(rnd);
	}
}
