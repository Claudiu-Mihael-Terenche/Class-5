package Exam;

import java.util.Scanner;

public class Part2_vowel_consonant {

	public static void main(String[] args) {
		
		//Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
		//Test Data Input an alphabet: p
		//Input letter is Consonant
		
        Scanner kb=new Scanner(System.in);
		System.out.println("Input an alphabet: ");
		String letter=kb.nextLine();
		char ch=0;
		if ((Character.isLetter(letter.charAt(ch))==false || letter.length() != 1)) {
		System.out.println("This is not a valid input. Please check if you input a letter, and only one letter.");
		}else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
		System.out.println("Input letter is Vowel");
		}else 
		System.out.println("Input letter is Consonant");
		kb.close();}}
