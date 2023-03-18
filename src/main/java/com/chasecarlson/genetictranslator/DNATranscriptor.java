package com.chasecarlson.genetictranslator;

public class DNATranscriptor {
	public static String transcribeDNAString(String dna)
	{
		String transcribed = "";
		for (char dnaChar : dna.strip().toCharArray())
		{
			transcribed += transcribeDNAChar(dnaChar);
		}
		return transcribed;
	}

	public static char transcribeDNAChar(char dna)
	{
		switch (dna)
		{
			case 'C':
				return 'G';
			case 'G':
				return 'C';
			case 'A':
				return 'U';
			case 'U':
			case 'T':
				return 'A';
			default:
				return ' ';
		}
	}
}
