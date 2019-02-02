package com.selenium;

public class RuntimePolimarphism {
	public void display(){
		System.out.println("super class method");
	}
}

class sub_class extends RuntimePolimarphism{
	public static void main(String[] args) {
		sub_class t=new sub_class();
		t.display();	
	}
	public void display(){
		
		System.out.println();
	}
	}

