package com.akashpal.collection.hashset;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void append(List<Integer> list) {
		list.add(42);
	}

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		//intList.add("666");
		append(intList);
		System.out.println(intList.get(0));
	}

}
