package org._88_others.oopinjava;

public class PairsExample {
	public static void main(String[] args) {
		Pair<String, String> students = 
				new Pair<>("Ivan", "Maria");
		System.out.println(students);
		
		Pair<String, Double> studentWithGrade = 
				new Pair<>("Ivan", 6.00);
		System.out.println(studentWithGrade);

		Pair<Integer, Integer> point = 
				new Pair<>(-3, 12);
		System.out.println(point);
	}
}
