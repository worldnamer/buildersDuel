package com.augustalso.bd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlayerGoldTest {
	
	private Player player;
	
	@Before
	public void before(){
		player = new Player();
	}
	
	@Test
	public void itHasGold() {		
		assertEquals(3, player.gold());
	}
	
	@Test
	public void itCanHaveGoldAdded() {
		player.addGold(3);
		assertEquals(6, player.gold());
	}
	
	@Test(expected = NotEnoughGoldException.class)
	public void itCanHaveGoldSubtracted() {
		player.subtractGold(4);
		
	}
	
	@Test
	public void itOnlySubtractsGoldIfYouHaveEnough(){
		try {
			player.subtractGold(10);
		}
		catch(NotEnoughGoldException ex) {
			assertEquals(3, player.gold());
		}
	}

}
