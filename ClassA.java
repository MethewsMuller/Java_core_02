package first_javapj;

import java.math.*;
public class ClassA {
	public static void main(String[] args) {
		int in = 1;
		double d = 1.1;
		float f = 1.1f;
		boolean b = true;
		
		System.out.println("Long max: " + Long.MAX_VALUE);
		System.out.println("Integer max: " + Integer.MAX_VALUE);
		System.out.println("Short max: " + Short.MAX_VALUE);
		System.out.println("Byte max: " + Byte.MAX_VALUE);
		System.out.println("Float max: " + Float.MAX_VALUE);
		System.out.println("Double max: " + Double.MAX_VALUE);
		System.out.println("Boolean: " + Boolean.TRUE);
		System.out.println("Boolean: " + Boolean.FALSE);
		System.out.println("Character: " + Character.BYTES + " bytes");
		
        int mass[] = new int[10];
		
		
		for (int i = 0; i < 10; i++) {
			mass[i] = (int) (Math.random()*255);
			System.out.print(mass[i] + " ");
		}
		System.out.println();
		int min = mass[10-1];
		int max = 0;
		
		for(int i = 0; i < 10; i++) {
		if(mass[i] < min) {
			min = mass[i];
			}
		}
		System.out.println("min = " + min);
		
		for(int i = 0; i < 10; i++) {
			if(mass[i] > max) {
				max = mass[i];
				}
			}
		System.out.println("max = " + max);
		
	}
	// first commit
}
