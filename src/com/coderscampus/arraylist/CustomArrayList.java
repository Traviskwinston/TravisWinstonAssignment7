package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private int size; //Keep track of the current index

	@Override
	public boolean add(T item) {
		if (size == items.length) {
            // Array is full, need to resize
            items = Arrays.copyOf(items, items.length * 2);
        }
		//if it's not full, add the item to the array at the index 'size'
        items[size++] = item;
        return true;
	}

	@Override
	public int getSize() {
		return size; //size should be dynamically updating with elements being added
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if (!items[index].equals(null)) {
			return (T) items[index];
		} else 
		return null;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		//if array is full, need to increase the size before I push everything over.
		if (size == items.length) {
            items = Arrays.copyOf(items, items.length * 2);
        }
		for(int i = size-1;i>(size-(size-index));i--)
		{
			if (i+1==size) {
				items[i+1] = items[i];
			}
			if (items[i-1] != null) {
				items[i] = items[i-1];				
			}
			if (i-1==(size-(size-index))) {
				items[i-1] = item;
			}
		}
		size++;
		return true;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		
		for(int i = (size-(size-index));i<size-1;i++)//i < 9, so Max, i=8
		{
			if (items[i+1] != null) {
				items[i] = items[i+1];				
			}
			
		}
		items[size-1] = null;
		size--;
		return null;
	}
	
}
