package com.busyqa.course.generics.multiple;

public class GenericPair<K,V> {
	
    // K stands for "Key"
    private K k;
    // V stands for "Value"
    private V v;

	public GenericPair(K k, V v) {
		super();
		this.k = k;
		this.v = v;
	}

	public K getK() {
		return k;
	}

	public void setK(K k) {
		this.k = k;
	}

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
	
	@Override
	public String toString() {
		return "GenericClass [k=" + k + ", v=" + v + "]";
	}

	public static void main(String[] args) {
		
		/*
		 * In Java SE 7 and later, you can replace the type arguments required 
		 * to invoke the constructor of a generic class with an empty set of type 
		 * arguments (<>) as long as the compiler can determine, or infer, the 
		 * type arguments from the context. This pair of angle brackets, <>, is 
		 * informally called the diamond.
		 */
		
		GenericPair<Integer,String> obj1 = new GenericPair<>(1,"busyQA");
		System.out.println(obj1);
				
		GenericPair<String,Integer> obj2 = new GenericPair<>("busyQA",200);
		System.out.println(obj2);
	}

}
