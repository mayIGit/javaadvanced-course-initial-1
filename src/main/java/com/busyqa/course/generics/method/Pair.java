package com.busyqa.course.generics.method;


public class Pair<K, V> {

	private K key;
	private V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public static void main(String[] args) {
		
		Pair<Integer, String> p1 = new Pair<>(1, "apple");
		Pair<Integer, String> p2 = new Pair<>(2, "pear");
		System.out.println(Util.<Integer, String>compare(p1, p2));
		
		Pair<Integer, String> p3 = new Pair<>(1, "apple");
		Pair<Integer, String> p4 = new Pair<>(1, "apple");
		
		System.out.println(Util.<Integer, String>compare(p3, p4));
	}
}
