package com.augustalso.bd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ResourceFactoryTest {
	
	private ResourceFactory factory;
	
	@Before
	public void before(){
		factory = new ResourceFactory();
	}
	
	@Test
	public void itCreatesWoodResource1() {
		assertNotNull(factory.getWoodResource1());
	}
	
	@Test
	public void itAlwaysReturnsTheSameWoodResource1() {
		assertSame(factory.getWoodResource1(), factory.getWoodResource1());
	}
	
	@Test
	public void itCreatesWoodResource2() {
		assertNotNull(factory.getWoodResource2());
	}
	
	@Test
	public void itAlwaysReturnsTheSameWoodResource2() {
		assertSame(factory.getWoodResource2(), factory.getWoodResource2());
	}
	
	@Test
	public void itCreatesSandResource1() {
		assertNotNull(factory.getSandResource1());
	}
	
	@Test
	public void itAlwaysReturnsTheSameSandResource1() {
		assertSame(factory.getSandResource1(), factory.getSandResource1());
	}
	
	@Test
	public void itCreatesSandResource2() {
		assertNotNull(factory.getSandResource2());
	}
	
	@Test
	public void itAlwaysReturnsTheSameSandResource2() {
		assertSame(factory.getSandResource2(), factory.getSandResource2());
	}
	
	@Test
	public void itCreatesRockResource1() {
		assertNotNull(factory.getRockResource1());
	}
	
	@Test
	public void itAlwaysReturnsTheSameRockResource1() {
		assertSame(factory.getRockResource1(), factory.getRockResource1());
	}
	
	@Test
	public void itCreatesRockResource2() {
		assertNotNull(factory.getRockResource2());
	}
	
	@Test
	public void itAlwaysReturnsTheSameRockResource2() {
		assertSame(factory.getRockResource2(), factory.getRockResource2());
	}
	
	@Test
	public void itCreatesOreResource1() {
		assertNotNull(factory.getOreResource1());
	}
	
	@Test
	public void itAlwaysReturnsTheSameOreResource1() {
		assertSame(factory.getOreResource1(), factory.getOreResource1());
	}
	
	@Test
	public void itCreateSheepResource1() {
		assertNotNull(factory.getSheepResource1());
	}
	
	@Test
	public void itAlwaysReturnsTheSameSheepResource1() {
		assertSame(factory.getSheepResource1(), factory.getSheepResource1());
	}

	@Test
	public void itCreateSheepResource2() {
		assertNotNull(factory.getSheepResource2());
	}
	
	@Test
	public void itAlwaysReturnsTheSameSheepResource2() {
		assertSame(factory.getSheepResource2(), factory.getSheepResource2());
	}
	
	@Test
	public void itCreateSheepResource3() {
		assertNotNull(factory.getSheepResource3());
	}
	
	@Test
	public void itAlwaysReturnsTheSameSheepResource3() {
		assertSame(factory.getSheepResource3(), factory.getSheepResource3());
	}
	
	@Test
	public void itCreateSheepResource4() {
		assertNotNull(factory.getSheepResource4());
	}
	
	@Test
	public void itAlwaysReturnsTheSameSheepResource4() {
		assertSame(factory.getSheepResource4(), factory.getSheepResource4());
	}
}
