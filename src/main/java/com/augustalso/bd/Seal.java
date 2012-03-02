package com.augustalso.bd;

import java.util.Random;

public class Seal {
	
	int low;
	int high;
	Random rnd;
	
	public Seal(int low, int high, Random rnd){
		this.low = low;
		this.high = high;
		this.rnd = rnd;
	}

	public int getHigh() {
		return this.high;
	}

	public int getLow() {
		return this.low;
	}

	public int flip() {
		if (this.rnd.nextBoolean()) {
			return high;
		} else {
			return low;
		}
		
	}

}
