package com.springcoref;

public class TestRefrenceB 
{
   private int a;
   private int b;
   private int c;
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public int getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}
public int getC() {
	return c;
}
public void setC(int c) {
	this.c = c;
}
public TestRefrenceB() 
{
	super();
	// TODO Auto-generated constructor stub
}
public TestRefrenceB(int a, int b, int c) {
	super();
	this.a = a;
	this.b = b;
	this.c = c;
}
@Override
public String toString() {
	return "TestRefrenceB [a=" + a + ", b=" + b + ", c=" + c + "]";
}
   
}
