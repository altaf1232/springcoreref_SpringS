package com.springcoref;

public class TestRefrenceA 
{
	//here is depend A to B per
    private int x;
    private int y;
    private int z;
    private TestRefrenceB ob;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public TestRefrenceB getOb() {
		return ob;
	}
	public void setOb(TestRefrenceB ob) {
		this.ob = ob;
	}
	public TestRefrenceA() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TestRefrenceA(int x, int y, int z, TestRefrenceB ob) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.ob = ob;
	}
	@Override
	public String toString() {
		return "TestRefrenceA [x=" + x + ", y=" + y + ", z=" + z + ", ob=" + ob + "]";
	}
    
	
}
