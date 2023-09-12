package com.tnsif.daythree;

public class UsingFinal {
	
		private final int size;//in we have to assign the value in this line only
		private static final int length;//we can use in the static block;
		public UsingFinal() {
			size=500;
		}
		static
		{
			length=20;
		}
		
		public UsingFinal(int size) {
			this();//call default constructor
		//	this.size=size;//there is no need of this statement
			
		}
		public int getSize() {
			return size;
		}
		
		public static int getLength() {
			return length;
		}
		public void change() {
			//final cna't be reassigned
			//size++;
			//The final field UsingFinal.length cannot be assigned
			//length++;
		}

		
}
