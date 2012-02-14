package com.augustalso.bd;

public class Resource {
	
	private ResourceType type;
	private boolean refined = false;
	
	public Resource(ResourceType type) {
		this.type = type;
	}

	enum ResourceType{
		ORE, SHEEP, WOOD, SAND, ROCK
	}

	public ResourceType getType() {
		return this.type;
	}

	public boolean isRefined() {
		return this.refined;
	}

	public void setRefined(boolean refined) {
		this.refined = refined;
		
	}
	

}
