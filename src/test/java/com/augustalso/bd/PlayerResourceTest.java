package com.augustalso.bd;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class PlayerResourceTest {
	
	private Player player;
	private ResourceFactory factory;
	
	@Before
	public void playermaker(){
		factory = new ResourceFactory();
		player = new Player(factory);
	}
	
	@Test
	public void canSetResourceFactory() {
		assertEquals(factory, player.getResourceFactory());
	}
	
	@Test
	public void canHaveSupply() {
		Set<Resource> supply = player.getSupply();
		assertNotNull(supply);
	}
	
	@Test
	public void supplyHasThreeResources(){
		List<Resource> checkfor = Arrays.asList(factory.getWoodResource1(), factory.getSandResource1(), factory.getRockResource1());

		Set<Resource> supply = player.getSupply();
		
		assertEquals(checkfor.size(), supply.size());
		assertTrue(supply.containsAll(checkfor));
	}
	
	@Test
	public void canHaveReserve(){
		List<Resource> checkfor = Arrays.asList(factory.getWoodResource2(), factory.getSandResource2(), factory.getRockResource2(),
                factory.getSheepResource1(), factory.getSheepResource2(), factory.getSheepResource3(), factory.getSheepResource4(),
                factory.getOreResource1());

		Set<Resource> supply = player.getReserve();
		
		assertEquals(checkfor.size(), supply.size());
		assertTrue(supply.containsAll(checkfor));
	}
	
	@Test
	public void canMoveToSupply(){
		player.toSupply(factory.getSheepResource1());
		
		assertTrue(player.getSupply().contains(factory.getSheepResource1()));
		assertFalse(player.getReserve().contains(factory.getSheepResource1()));
	}
	
	@Test
	public void canMoveToReserve(){
		player.toReserve(factory.getWoodResource1());
		
		assertTrue(player.getReserve().contains(factory.getWoodResource1()));
		assertFalse(player.getSupply().contains(factory.getWoodResource1()));
	}

}
