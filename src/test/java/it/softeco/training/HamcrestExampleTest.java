package it.softeco.training;

import static org.hamcrest.Matchers.hasKey;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class HamcrestExampleTest {

	@Test
	public void mapShouldContainValue() {
		Map<String, Integer> maps = getMapValues();
		assertTrue(maps.containsKey("b"));
		
		assertThat(maps, hasKey("b"));
	}
	
	private Map<String, Integer> getMapValues() {
		Map<String, Integer> maps = new LinkedHashMap<>();
		maps.put("A", 1);
		maps.put("b", 2);
		return maps;
	}
	
	@Test
	public void listOrderingIsIrrilevant() {
		List<Integer> list = getNumbers();
		
//		assertEquals(5, (int) list.get(4));
		assertThat(list,  Matchers.hasItem(5));
		
	}
	
	private List<Integer> getNumbers(){
		return Arrays.asList(1,2,3,5,4,6);
	}
}
