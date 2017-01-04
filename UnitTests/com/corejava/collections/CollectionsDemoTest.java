package com.corejava.collections;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(value = BlockJUnit4ClassRunner.class)
public class CollectionsDemoTest {

	// @Test(expected = NullPointerException.class)
	@Test
	public void shouldTrowExceptionBecouseOfNullAdding() {
		CollectionsDemo listDemo = new CollectionsDemo();
		listDemo.createList();

	}

	@Test
	public void shouldReturnStringRepresentationOfSortedSet() {
		CollectionsDemo listDemo = new CollectionsDemo();
		String str = listDemo.treeSetDemo();

		assertEquals("[a, b, d, f, w]", str);

	}

	@Test
	public void shouldReturnSquares() {
		// Create an array list for doubles.
		ArrayList<Double> vals = new ArrayList<>();
		// Add values to the array list.
		vals.add(1.0);
		vals.add(2.0);
		vals.add(3.0);
		vals.add(4.0);
		vals.add(5.0);

		CollectionsDemo listDemo = new CollectionsDemo();
		List<Double> result = listDemo.squares(vals);

		assertEquals(5, result.size());

		assertEquals(new Double(Math.sqrt(1)), result.get(0));
		assertEquals(new Double(Math.sqrt(2)), result.get(1));
		assertEquals(new Double(Math.sqrt(3)), result.get(2));
		assertEquals(new Double(Math.sqrt(4)), result.get(3));
		assertEquals(new Double(Math.sqrt(5)), result.get(4));

	}

	@Test
	public void shouldReturnTrueForMaps() {

		Map<String, String> map1 = new HashMap<>();
		map1.put("id1", "1");
		map1.put("id2", "2");
		map1.put("id3", "3");

		Map<String, String> map2 = new HashMap<>();
		map2.put("id3", "3");
		map2.put("id1", "1");
		map2.put("id2", "2");

		assertEquals(map1, map2);

	}
}
