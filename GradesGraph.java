//Andrea Soteldo
//COSC-1430.501 (wed)
//Project4
//02Dec2020
//This program will return the percentage of each letter grade as a whole number between 0 and 100 in a bar graph.
package college;

import java.util.Scanner;

class GradesGraphDemo 
{
	public static void main(String[] args) {
		GradesGraph s = new GradesGraph();
		s.setGrade();
		s.readInput();
		s.displayOutput();
		s.calcPer();
	}
}

public class GradesGraph {
	
	public static int setA, setB, setC, setD, setF;
	public static double inputA, inputB, inputC, inputD, inputF;
	public static double percentA, percentB, percentC, percentD, percentF;
	public static double total = 0;
	
	public void setGrade()
	{
		inputA = (double) setA;
		inputB = (double) setB;
		inputC = (double) setC;
		inputD = (double) setD;
		inputF = (double) setF;
	}
	public void readInput()
	{	
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter number of As: ");
		inputA = keyboard.nextInt();
		System.out.print("Enter number of Bs: ");
		inputB = keyboard.nextInt();
		System.out.print("Enter number of Cs: ");
		inputC = keyboard.nextInt();
		System.out.print("Enter number of Ds: ");
		inputD = keyboard.nextInt();
		System.out.print("Enter number of Fs: ");
		inputF = keyboard.nextInt();
		
		total = inputA + inputB + inputC + inputD + inputF;
		System.out.println("The total number of grades is " + total);
	}	
	public void displayOutput()
	{
	System.out.println();
	System.out.println("0   10   20   30   40   50   60   70   80   90   100%");
	System.out.println("|    |    |    |    |    |    |    |    |    |    |");
	System.out.println("***************************************************");
	}
	public void calcPer()
	{		
		percentA = ((100/total)*inputA);
		percentB = ((100/total)*inputB);
		percentC = ((100/total)*inputC);
		percentD = ((100/total)*inputD);
		percentF = ((100/total)*inputF);
		
		if(percentA%2 != 0) {
			for(int num = 0; num <= (percentA+1)/2; num++) 
					System.out.print('*');
					System.out.print(" A"); }
		else {
			for(int num = 0; num <= percentA/2; num++) 
				System.out.print('*');
				System.out.print(" A"); }
			System.out.println();
		if(percentB%2 != 0) {
			for(int num = 0; num <= (percentB+1)/2; num++) 
					System.out.print('*');
					System.out.print(" B"); }
		else {
			for(int num = 0; num <= percentB/2; num++) 
				System.out.print('*');
				System.out.print(" B"); }
			System.out.println();
		if(percentC%2 != 0) {
			for(int num = 0; num <= (percentC+1)/2; num++) 
					System.out.print('*');
					System.out.print(" C"); }
		else {
			for(int num = 0; num <= percentC/2; num++) 
				System.out.print('*');
				System.out.print(" C"); }
			System.out.println();
		if(percentD%2 != 0) {
			for(int num = 0; num <= (percentD+1)/2; num++) 
					System.out.print('*');
					System.out.print(" D"); }
		else {
			for(int num = 0; num <= percentD/2; num++) 
				System.out.print('*');
				System.out.print(" D"); }
			System.out.println();
		if(percentF%2 != 0) {
			for(int num = 0; num <= (percentF+1)/2; num++) 
					System.out.print('*');
					System.out.print(" F"); }
		else {
			for(int num = 0; num <= percentF/2; num++) 
				System.out.print('*');
				System.out.print(" F"); }
			System.out.println();
	}
}