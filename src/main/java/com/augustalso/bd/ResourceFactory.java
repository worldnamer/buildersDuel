package com.augustalso.bd;

public class ResourceFactory {

	private Resource wood1 = new Resource(Resource.ResourceType.WOOD);
	private Resource wood2 = new Resource(Resource.ResourceType.WOOD);
	private Resource sand1 = new Resource(Resource.ResourceType.SAND);
	private Resource sand2 = new Resource(Resource.ResourceType.SAND);
	private Resource rock1 = new Resource(Resource.ResourceType.ROCK);
	private Resource rock2 = new Resource(Resource.ResourceType.ROCK);
	private Resource ore1 = new Resource(Resource.ResourceType.ORE);
	private Resource sheep1 = new Resource(Resource.ResourceType.SHEEP);
	private Resource sheep2 = new Resource(Resource.ResourceType.SHEEP);
	private Resource sheep3 = new Resource(Resource.ResourceType.SHEEP);
	private Resource sheep4 = new Resource(Resource.ResourceType.SHEEP);


	
	public Resource getWoodResource1(){
		return wood1;
	}

	public Resource getWoodResource2() {
		return wood2;
	}

	public Resource getSandResource1() {
		return sand1;
	}

	public Resource getSandResource2() {
		return sand2;
	}

	public Resource getRockResource1() {
		return rock1;
	}

	public Resource getRockResource2() {
		return rock2;
	}

	public Resource getOreResource1() {
		return ore1;
	}

	public Resource getSheepResource1() {
		return sheep1;
	}
	
	public Resource getSheepResource2() {
		return sheep2;
	}

	public Resource getSheepResource3() {
		return sheep3;
	}

	public Resource getSheepResource4() {
		return sheep4;
	}
	
}

