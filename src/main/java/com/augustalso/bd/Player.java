package com.augustalso.bd;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Player {
	
	private ResourceFactory factory;
	private Set<Resource> supply = new HashSet<Resource>();
	private Set<Resource> reserve = new HashSet<Resource>();
	
	private int gold = 3;
	
	public Player(){
		
	}
	
	public Player(ResourceFactory factory){
		this.factory = factory;
		
		supply.add(factory.getWoodResource1());
		supply.add(factory.getRockResource1());
		supply.add(factory.getSandResource1());
		
		List<Resource> resources = Arrays.asList(factory.getWoodResource2(), factory.getSandResource2(), factory.getRockResource2(),
                factory.getSheepResource1(), factory.getSheepResource2(), factory.getSheepResource3(), factory.getSheepResource4(),
                factory.getOreResource1());
	
		reserve.addAll(resources);
	}
	
	public int getGold() {
		return this.gold;
	}

	public void addGold(int gold) {
		this.gold += gold;
	}

	public void subtractGold(int gold) {
		if (gold > this.gold){
			throw new NotEnoughGoldException();
		}
		else {
			this.gold -= gold;
		}
	}

	public Object getResourceFactory() {
		
		return factory;
	}

	public void setResourceFactory(ResourceFactory factory) {
		this.factory = factory;
		
	}

	public Set<Resource> getSupply() {
		return supply;
	}

	public Set<Resource> getReserve() {
		return reserve;
	}

	public void toSupply(Resource resource) {
		reserve.remove(resource);
		supply.add(resource);
	}

	public void toReserve(Resource resource) {
		supply.remove(resource);
		reserve.add(resource);
	}

	
	
}
