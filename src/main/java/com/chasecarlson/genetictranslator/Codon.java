package com.chasecarlson.genetictranslator;

public class Codon {
	private char letterA;
	private char letterB;
	private char letterC;

	public Codon(char c0, char c1, char c2) {
		this.letterA = c0;
		this.letterB = c1;
		this.letterC = c2;
	}

	public String toString()
	{
		return "" + letterA + letterB + letterC;
	}

	public char getLetterA() { return letterA; }
	public char getLetterB() { return letterB; }
	public char getLetterC() { return letterC; }
}
