package org.fourstack.interview.datatypes;

public class SizeofDataTypes {

	public static <T> int sizeOf(Class<T> dataType) {
		if (dataType == null)
			throw new NullPointerException();
		
		if (dataType == byte.class || dataType == Byte.class)
			return 1;
		
		if (dataType == short.class || dataType == Short.class)
			return 2;
		
		if (dataType == char.class || dataType == Character.class)
			return 2;
		
		if (dataType == int.class || dataType == Integer.class)
			return 4;
		
		if (dataType == float.class || dataType == Float.class)
			return 4;
		
		if (dataType == long.class || dataType == Long.class)
			return 8;
		
		if (dataType == double.class || dataType == Double.class)
			return 8;
		
		return 4;
	}
	
	public static <T> int sizeOfType(Class<T> dataType) {
		if (dataType == null)
			throw new NullPointerException();
		
		if (dataType == byte.class || dataType == Byte.class)
			return Byte.SIZE;
		
		if (dataType == short.class || dataType == Short.class)
			return Short.SIZE;
		
		if (dataType == char.class || dataType == Character.class)
			return Character.SIZE;
		
		if (dataType == int.class || dataType == Integer.class)
			return Integer.SIZE;
		
		if (dataType == float.class || dataType == Float.class)
			return Float.SIZE;
		
		if (dataType == long.class || dataType == Long.class)
			return Long.SIZE;
		
		if (dataType == double.class || dataType == Double.class)
			return Double.SIZE;
		
		return 4;
	}
	
	public static void main(String[] args) {
		System.out.println(sizeOfType(byte.class));
	}
}
