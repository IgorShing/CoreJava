package com.corejava.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;

public class CollectionsDemo {
	public List<String> createList() {

		List<String> list = new ArrayList<>();
		list.add(null);
		return list;
	}

	public String treeSetDemo() {
		Set<String> strSet = new TreeSet<String>();
		strSet.add("f");
		strSet.add("a");
		strSet.add("d");
		strSet.add("w");
		strSet.add("b");

		return strSet.toString();
	}

	public List<Double> squares(List<Double> vals) {

		// Create new list that contains square roots.
		Spliterator<Double> spltitr = vals.spliterator();
		ArrayList<Double> sqrs = new ArrayList<>();
		while (spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))))
			;

		return sqrs;
	}
}
