
package src;

import java.util.ArrayList;
import java.util.HashMap;


public class Hamming {

	
	public Hamming() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lista = { 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1,
				0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0,
				0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1,
				0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0,
				0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1,
				1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1,
				0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1,
				1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0,
				1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1,
				1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0,
				1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0,
				0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0,
				1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0,
				0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0,
				0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0,
				0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0,
				0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1,
				0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1,
				0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1,
				1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1,
				0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1,
				0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1,
				1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0,
				1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0,
				0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0,
				1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1,
				1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1,
				1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1,
				1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1,
				1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0,
				0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1,
				1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1,
				0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1,
				0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0,
				0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0,
				0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0,
				1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1,
				0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0,
				0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0,
				0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1,
				1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0,
				0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1,
				0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0,
				0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0,
				1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0,
				0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0,
				1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0,
				0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0,
				0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0,
				1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0,
				0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0,
				0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1,
				0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0,
				1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1,
				0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0,
				0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1,
				0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1,
				1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0,
				1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0,
				1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,
				0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0,
				0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1,
				0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1,
				1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0,
				1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0,
				0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0,
				0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1,
				0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0,
				1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0,
				0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1,
				0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1,
				0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0,
				0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1,
				1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0,
				0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1,
				1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0,
				0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1,
				1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0,
				0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1,
				0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0,
				1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1,
				1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0,
				1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1,
				1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1,
				1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1,
				0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1,
				1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1,
				0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1,
				1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0 };
		
		
		
		
		String alf = "AÁBCDEÉFGHIÍJKLMNÑOÓPQRSTUÚVWXYZ .,;:()¿?¡!-0123456789aábcdeéfghiíjklmnñoópqrstuúvwxyz";
		System.out.println(alf.length());
		int[][] matrizA = { { 1, 0, 1, 0, 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1, 1, 0, 0, 1 }, { 1, 0, 1, 1, 0, 1, 1, 0, 0 },
				{ 0, 1, 0, 1, 0, 0, 1, 1, 0 }, { 0, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 0, 0, 0, 0, 0 }, };
		Hamming ham = new Hamming();
		int dimension = matrizA.length;
		int[][] identidad = ham.generarIdentidad(dimension);
		// ham.imprimeMatriz(matrizA);

		int generadora[][] = ham.concatenarMatrices(identidad, matrizA, identidad.length,
				identidad[0].length + matrizA[0].length);
		// System.out.println(generadora.length);
		// ham.imprimeMatriz(generadora);
		// Generacion de la matriz generadora a partir de la de control
		int[][] matriz_control = ham.generarMControl(matrizA);
		// ham.imprimeMatriz(matriz_control);

		int[][] erroresPatron = ham.generarErrorPatron(15, 2);
		// System.out.println("lista: "+lista.length);
		int[][] secuencias = ham.getSecuencias(lista, 15, matriz_control);

		int[][] sindromes0 = ham.productoMatricial(matriz_control, ham.traspuesta(secuencias));
		// imprimeMatriz(sindromes);
		// la trasponemos porque estan por columnas
		int[][] sindromes = ham.traspuesta(sindromes0);
		
		
		
		
		//ham.imprimeMatriz(sindromes);
		System.out.println("\n");
		ArrayList<String> vectorC = ham.obtenerVectorC(matriz_control, erroresPatron, sindromes, secuencias);
		String sec = "";
		
		//int c = 1;
		for (String s : vectorC) {
			//System.out.println(s);
			//if(c ==1){
			//System.out.println(s);
			sec+= s.substring(s.length()-matrizA.length); //15-6
			//System.out.println(sec);
			//}
			//c++;
		}
		int pos = 0;
		int tope = 7;
		System.out.println("sec len"+sec.length());
		for (int i = 0; i < sec.length(); i+=tope) {
			
			if(i+tope>=sec.length()){
				pos = Integer.parseInt(sec.substring(i), 2);
			}else{
				pos = Integer.parseInt(sec.substring(i,i+tope), 2);
			}
			
			//System.out.println("i "+i);
			
			//System.out.println(pos);
			//System.out.print(alf.charAt(pos-1));
		}
		
		
		
	}

	/**
	 * Multiplicamos la matriz de control por cada posible error patron para
	 * saber que error patron corresponde a que sindrome. Hay que trasponer
	 * (poner en columna) el error patron para multiplicarlo por la matriz de
	 * control.
	 * 
	 * @param matriz_control
	 * @param erroresPatron
	 * @param sindromes
	 *            (producto de la lista * matriz de control)
	 * @return
	 */
	private ArrayList<String> obtenerVectorC(int[][] matriz_control, int[][] erroresPatron, int[][] sindromes,
			int[][] secuencias) {
		ArrayList<String> vectorC = new ArrayList<String>();
		

		HashMap<String, String> sindromeYError = new HashMap<>();
		// Aqui obtenemos el producto de los sindrome por el erro patron para
		// sacar el ep asociado al sindrome
		int[][] producto = productoMatricial(matriz_control, traspuesta(erroresPatron));
		 

		int[][] sindrome_error = traspuesta(producto); // desordenados
		//imprimeMatriz(sindrome_error);
		for (int i = 0; i < sindrome_error.length; i++) {

			String sin = getFila(sindrome_error, i);
			String err = getFila(erroresPatron, i);
			
			sindromeYError.put(sin, err);
		}

		// iteramos sobre los sindromes pasados por parametro(ordenados)
		// System.out.println(secuencias.length);
		// System.out.println(sindromes.length);
		imprimeMatriz(secuencias);
		System.out.println();
		imprimeMatriz(matriz_control);
		imprimeMatriz(traspuesta(erroresPatron));
		//System.out.println(getFila(sindromes, 0));
		//System.out.println(sindromeYError.get(getFila(sindromes, 0)));
		String c = "";
		for (int i = 0; i < sindromes.length; i++) {

			c = restaBinaria(getFila(secuencias, i), sindromeYError.get(getFila(sindromes, i)));
			vectorC.add(c);
		}

		
		
		
		
		// System.out.println(sindrome_error.length); // para ver si tiene la
		// misma longitud que los errores patron

		return vectorC;

	}

	private String restaBinaria(String a, String b) {

		int a1 = Integer.parseInt(a, 2);
		int b1 = Integer.parseInt(b, 2);
		int c1 = Math.abs(a1 - b1); 
		String res = Integer.toString(c1, 2);
		
		//hay que añadirle 0 a la izda hasta completar 15 (en este caso)
		return ponCerosIzquierda(res, 15);
	}
	
	private String ponCerosIzquierda(String str,int longitud){
        String ceros = "";
        if(str.length()<longitud){
            for(int i=0;i<(longitud-str.length());i++){
                ceros = ceros + '0';
            }
            str = ceros + str;
        }

        return str;
    }

	private String getFila(int[][] matriz, int fila) {

		String retorno = "";
		for (int i = 0; i < matriz[0].length; i++) {

			retorno += String.valueOf(matriz[fila][i]);
			// System.out.print(prueba[0][i]);
		}

		return retorno;
	}

	private int[][] getSecuencias(int[] lista, int grupos, int[][] control) {

		int[][] secuencias = new int[lista.length / 15][grupos];

		int quince = 0;
		for (int i = 0; i < secuencias.length; i++) {

			for (int j = 0; j < grupos; j++) {

				secuencias[i][j] = lista[quince++];
			}
		}

		// imprimeMatriz(secuencias);

		// Trasponemos las secuencias para poder multiplicar, cada columna sera
		// un sindrome una vez multiplicado por la matriz de control

		// imprimeMatriz(traspuesta(secuencias));
		return secuencias;

	}

	public int[][] generarMControl(int[][] matrizA) {

		int[][] identidad = generarIdentidad(matrizA[0].length);
		int[][] aTraspuesta = traspuestaNegativa(matrizA);
		int matriz_control[][] = control(aTraspuesta, identidad, identidad.length,
				identidad[0].length + aTraspuesta[0].length);

		return matriz_control;
	}

	public int[][] control(int[][] izda, int[][] drcha, int filas, int columnas) {

		int matriz[][] = new int[filas][columnas];
		// System.out.println(matriz.length+" X "+matriz[0].length);
		// imprimeMatriz(matriz);
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[0].length; j++) {

				if (j < izda[0].length) {

					matriz[i][j] = izda[i][j];
				} else {
					matriz[i][j] = drcha[i][j - izda[0].length];
				}
			}
		}

		return matriz;
	}

	public int[][] concatenarMatrices(int[][] izda, int[][] drcha, int filas, int columnas) {

		int matriz[][] = new int[filas][columnas];
		// System.out.println(matriz.length+" X "+matriz[0].length);
		// imprimeMatriz(matriz);
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[0].length; j++) {

				if (j < izda.length) {

					matriz[i][j] = izda[i][j];
				} else {
					matriz[i][j] = drcha[i][j - izda.length];
				}
			}
		}
		return matriz;
	}

	/**
	 * Hay que llenar esta matriz con peso 0, 1 y 2. Para peso 1 todas las
	 * lineas posibles donde puedan haber un 1 y para peso 0 son todo 0
	 * 
	 * @param longitud
	 * @param peso
	 * @return la tabla de errores
	 */
	public int[][] generarErrorPatron(int longitud, int peso) {

		int tam = (longitud * (longitud - 1)) / peso;
		int[][] errorPatron = new int[tam + longitud + 1][longitud]; // Palabras
																		// de
																		// peso
																		// 0
																		// +peso
																		// 1 +
																		// peso
																		// 2 -->
																		// las
																		// filas
		System.out.println(errorPatron.length);

		/*
		 * public static void arraycopy(Object src, int srcPos, Object dest, int
		 * destPos, int length)
		 * 
		 * src − This is the source array.
		 * 
		 * srcPos − This is the starting position in the source array.
		 * 
		 * dest − This is the destination array.
		 * 
		 * destPos − This is the starting position in the destination data.
		 * 
		 * length − This is the number of array elements to be copied.
		 */
		System.arraycopy(getErroresPeso(), 0, errorPatron, 0, tam);
		System.arraycopy(rellenarPeso(longitud, 1), 0, errorPatron, tam, longitud);

		// imprimeMatriz(errorPatron);

		return errorPatron;
	}

	/**
	 * YA FUNCIONA, ESTE METODO ES EL QUE SACA ERRORES PATRON PESO 2
	 */
	private int[][] getErroresPeso() {

		int l = 15;
		int peso = 2;
		int[][] array = new int[(l * (l - 1)) / peso][l];

		int contador_unos = 1;

		// System.out.println("array0:" + array[0].length);
		// System.out.println("array:" + array.length);

		int j = 1;
		int div = 0;
		int grupoNpalabras = array[0].length, fila = 0, movingPos = 0;

		for (int i = 0; i < array.length; i++) {

			if (j == grupoNpalabras) {
				movingPos += 15;
				j = 1;
				grupoNpalabras--;
			}
			div = (movingPos) / l;
			array[fila][div] = 1; // aqui se marca el "1 guia" prueba a quitarlo
									// para ver lo que pasa

			if (j <= array[0].length) {

				if (j + div < 15) {// para que se vayan desplazando los unos y
									// dejando ceros a la derecha
					// System.out.println("div i:" + i+" j+div: "+(j+div));
					array[i][j + div] = 1;
				}

				j++;
				fila++;
			}

		}
		return array;
	}

	private int[][] rellenarPeso(int longitud, int peso) {

		if (peso == 1) {
			return generarIdentidad(longitud);
		}
		return null;

	}

	public int[][] generarIdentidad(int dimension) {

		int[][] identidad = new int[dimension][dimension];

		for (int i = 0; i < identidad.length; i++) {

			for (int j = 0; j < identidad[0].length; j++) {
				if (i == j) {
					identidad[i][j] = 1;
				} else {
					identidad[i][j] = 0;
				}
			}
		}

		return identidad;
	}

	// modulo 2
	public int[][] productoMatricial(int[][] a, int[][] b) {

		int[][] c = new int[a.length][b[0].length];
		// se comprueba si las matrices se pueden multiplicar
		if (a[0].length == b.length) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b[0].length; j++) {
					for (int k = 0; k < a[0].length; k++) {
						// aqu� se multiplica la matriz
						c[i][j] += a[i][k] * b[k][j];
						c[i][j] %= 2;
					}
				}
			}
		}
		/**
		 * si no se cumple la condici�n se retorna una matriz vac�a
		 */
		return c;
	}

	public int[][] traspuestaNegativa(int[][] matriz) {

		int[][] matrizT = new int[matriz[0].length][matriz.length];

		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				matrizT[y][x] = Math.abs((matriz[x][y] * (-1)) % 2);
			}
		}
		return matrizT;
	}

	public int[][] traspuesta(int[][] matriz) {

		int[][] matrizT = new int[matriz[0].length][matriz.length];

		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				matrizT[y][x] = matriz[x][y];
			}
		}
		return matrizT;
	}

	public void imprimeMatriz(int[][] matriz) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

}