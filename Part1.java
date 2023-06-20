package Exam;

import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) {
		
		//
		
		Scanner kb=new Scanner(System.in);
		
		System.out.println("How much money do you wish to prepay?");
		int prepay=kb.nextInt();
		
		if(prepay<0) {
		System.out.println("Please enter a valid number");
		
		}else {
		int no_apps=prepay/3, no_songs=prepay/7, no_apps2=prepay/3-no_songs*7/3;
		int rest_apps=prepay-no_apps*3, rest_songs=prepay-no_songs*7, rest_apps2=rest_songs-no_apps2*3;
		
		if(no_apps==1 && no_songs==1 && no_apps2==1) {
		System.out.println("With this amount, you will be able to purchase "+no_apps+" app. You will then have "+rest_apps+"$ left as a credit on your account.");
		System.out.println("Alternatively, for this amount, you will be able to purchase "+no_songs+" song and "+no_apps2+" app. You will then have "+rest_apps2+"$ left as a credit on your account.");
		System.out.println("Thanks for Shopping at Best Music Store!");
		
		}else if(no_apps==1 && no_songs==1) {
		System.out.println("With this amount, you will be able to purchase "+no_apps+" app. You will then have "+rest_apps+"$ left as a credit on your account.");
		System.out.println("Alternatively, for this amount, you will be able to purchase "+no_songs+" song and "+no_apps2+" apps. You will then have "+rest_apps2+"$ left as a credit on your account.");
		System.out.println("Thanks for Shopping at Best Music Store!");
		
		}else if(no_apps==1 && no_apps2==1) {
		System.out.println("With this amount, you will be able to purchase "+no_apps+" app. You will then have "+rest_apps+"$ left as a credit on your account.");
		System.out.println("Alternatively, for this amount, you will be able to purchase "+no_songs+" songs and "+no_apps2+" app. You will then have "+rest_apps2+"$ left as a credit on your account.");
		System.out.println("Thanks for Shopping at Best Music Store!");
		
		}else if(no_songs==1 && no_apps2==1) {
		System.out.println("With this amount, you will be able to purchase "+no_apps+" apps. You will then have "+rest_apps+"$ left as a credit on your account.");
		System.out.println("Alternatively, for this amount, you will be able to purchase "+no_songs+" song and "+no_apps2+" app. You will then have "+rest_apps2+"$ left as a credit on your account.");
		System.out.println("Thanks for Shopping at Best Music Store!");
		
		}else if(no_apps==1) {
		System.out.println("With this amount, you will be able to purchase "+no_apps+" app. You will then have "+rest_apps+"$ left as a credit on your account.");
		System.out.println("Alternatively, for this amount, you will be able to purchase "+no_songs+" songs and "+no_apps2+" apps. You will then have "+rest_apps2+"$ left as a credit on your account.");
		System.out.println("Thanks for Shopping at Best Music Store!");				
		
		}else if(no_songs==1) {
		System.out.println("With this amount, you will be able to purchase "+no_apps+" apps. You will then have "+rest_apps+"$ left as a credit on your account.");
	    System.out.println("Alternatively, for this amount, you will be able to purchase "+no_songs+" song and "+no_apps2+" apps. You will then have "+rest_apps2+"$ left as a credit on your account.");
		System.out.println("Thanks for Shopping at Best Music Store!");
			
		}else if(no_apps2==1) {
		System.out.println("With this amount, you will be able to purchase "+no_apps+" apps. You will then have "+rest_apps+"$ left as a credit on your account.");
		System.out.println("Alternatively, for this amount, you will be able to purchase "+no_songs+" songs and "+no_apps2+" app. You will then have "+rest_apps2+"$ left as a credit on your account.");
		System.out.println("Thanks for Shopping at Best Music Store!");
		
		}else {
		System.out.println("With this amount, you will be able to purchase "+no_apps+" apps. You will then have "+rest_apps+"$ left as a credit on your account.");
		System.out.println("Alternatively, for this amount, you will be able to purchase "+no_songs+" songs and "+no_apps2+" apps. You will then have "+rest_apps2+"$ left as a credit on your account.");
	    System.out.println("Thanks for Shopping at Best Music Store!");
		
		kb.close();}}}}