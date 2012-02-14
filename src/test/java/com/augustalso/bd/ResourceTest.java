package com.augustalso.bd;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResourceTest {
	
	@Test
	public void itHasAType() {
		Resource resource = new Resource(Resource.ResourceType.ORE);
		assertEquals(Resource.ResourceType.ORE, resource.getType());
	}
	
	@Test
	public void itCanBeSheep() {
		Resource resource = new Resource(Resource.ResourceType.SHEEP);
		assertEquals(Resource.ResourceType.SHEEP, resource.getType());
	}
	
	@Test
	public void itCanBeWood() {
		Resource resource = new Resource(Resource.ResourceType.WOOD);
		assertEquals(Resource.ResourceType.WOOD, resource.getType());
	}
	
	@Test
	public void itCanBeSand() {
		Resource resource = new Resource(Resource.ResourceType.SAND);
		assertEquals(Resource.ResourceType.SAND, resource.getType());
	}
	
	@Test
	public void itCanBeRock() {
		Resource resource = new Resource(Resource.ResourceType.ROCK);
		assertEquals(Resource.ResourceType.ROCK, resource.getType());
	}
	
	@Test
	public void itStartsUnrefined() {
		Resource resource = new Resource(Resource.ResourceType.ROCK);
		assertFalse(resource.isRefined());
	}
	
	@Test
	public void refinedStateCanBeSet() {
		Resource resource = new Resource(Resource.ResourceType.ROCK);
		resource.setRefined(true);
		assertTrue(resource.isRefined());
	}
}
