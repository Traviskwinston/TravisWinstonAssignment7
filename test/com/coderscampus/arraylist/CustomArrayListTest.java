package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_100_items_and_test_size() {
		//Arrange
		CustomArrayList<Integer> customList = new CustomArrayList<>();
		//Act
		for(int i=0;i<100;i++) {
			customList.add(i);
		}
		//Assert
		assertEquals(100, customList.getSize());
	}
	
	@Test
	void should_add_item_to_index_5_and_get_index_5() {
		CustomArrayList<Integer> customList = new CustomArrayList<>();
		//Act
		for(int i=0;i<10;i++) {
			customList.add(i);
		}
		customList.add(5,777);
		//Assert
		assertEquals(777, customList.get(5));
		assertEquals(9, customList.get(10));
		assertEquals(11, customList.getSize());
		


	}
	
	@Test 
	void should_remove_index_5() {
		CustomArrayList<Integer> customList = new CustomArrayList<>();
		//Act
		for(int i=0;i<10;i++) {
			customList.add(i);
		}
		customList.remove(5);
		//Assert
		assertEquals(6, customList.get(5));
		assertEquals(9, customList.getSize());
	}

}
