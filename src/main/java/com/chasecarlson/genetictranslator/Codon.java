package com.chasecarlson.genetictranslator;

import java.util.ArrayList;
import java.util.List;

public class Codon {
	private char letterA;
	private char letterB;
	private char letterC;

	public Codon(char c0, char c1, char c2) {
		this.letterA = c0;
		this.letterB = c1;
		this.letterC = c2;
	}

	public static List<Codon> fromDNASequence(String sequence)
	{
		List<Codon> codons = new ArrayList<>();
		for (int i = 0; i < sequence.length(); i += 3) {
			String codonLetters = sequence.substring(i, Math.min(sequence.length(), i + 3));
			codons.add(new Codon(codonLetters.charAt(0), codonLetters.charAt(1), codonLetters.charAt(2)));
		}
		return codons;
	}

	public String toString()
	{
		return "" + letterA + letterB + letterC;
	}

	public char getLetterA() { return letterA; }
	public char getLetterB() { return letterB; }
	public char getLetterC() { return letterC; }
}
