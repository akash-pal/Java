package com.akashpal.collection.hashset;

public class Animal {
	public int i=12;
	
	public Animal(){
		i=13;
	}

	@Override
	public String toString() {
		return "Animal " + i ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (i != other.i)
			return false;
		return true;
	}
	
	
	
}
