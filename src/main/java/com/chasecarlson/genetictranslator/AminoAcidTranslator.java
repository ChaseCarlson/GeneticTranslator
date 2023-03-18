package com.chasecarlson.genetictranslator;

import java.util.HashMap;

public class AminoAcidTranslator {
	private static HashMap<Character, HashMap<Character, HashMap<Character, AminoAcid>>> translatorRegistry = new HashMap<>();

	static {
		// G
		multiRegisterAminoAcid('G', 'U', "UCAG", AminoAcid.VAL);

		multiRegisterAminoAcid('G', 'C', "UCAG", AminoAcid.ALA);

		multiRegisterAminoAcid('G', 'A', "UC", AminoAcid.ASP);
		multiRegisterAminoAcid('G', 'A', "AG", AminoAcid.GLU);

		multiRegisterAminoAcid('G', 'G', "UCAG", AminoAcid.GLY);



		// U
		multiRegisterAminoAcid('U', 'U', "UC", AminoAcid.PHE);
		multiRegisterAminoAcid('U', 'U', "AG", AminoAcid.LEU);

		multiRegisterAminoAcid('U', 'C', "UCAG", AminoAcid.SER);

		multiRegisterAminoAcid('U', 'A', "UC", AminoAcid.TYR);
		multiRegisterAminoAcid('U', 'A', "AG", AminoAcid.STOP);

		multiRegisterAminoAcid('U', 'G', "UC", AminoAcid.CYS);
		multiRegisterAminoAcid('U', 'G', "A", AminoAcid.STOP);
		multiRegisterAminoAcid('U', 'G', "G", AminoAcid.TRP);



		// C
		multiRegisterAminoAcid('C', 'U', "UCAG", AminoAcid.LEU);

		multiRegisterAminoAcid('C', 'C', "UCAG", AminoAcid.PRO);

		multiRegisterAminoAcid('C', 'A', "UC", AminoAcid.HIS);
		multiRegisterAminoAcid('C', 'A', "AG", AminoAcid.GLN);

		multiRegisterAminoAcid('C', 'G', "UCAG", AminoAcid.ARG);



		// A
		multiRegisterAminoAcid('A', 'U', "UCA", AminoAcid.ILE);
		multiRegisterAminoAcid('A', 'U', "G", AminoAcid.MET);

		multiRegisterAminoAcid('A', 'C', "UCAG", AminoAcid.THR);

		multiRegisterAminoAcid('A', 'A', "UC", AminoAcid.ASN);
		multiRegisterAminoAcid('A', 'A', "AG", AminoAcid.LYS);

		multiRegisterAminoAcid('A', 'G', "UC", AminoAcid.SER);
		multiRegisterAminoAcid('A', 'G', "AG", AminoAcid.ARG);
	}

	private static void multiRegisterAminoAcid(char charLevel0, char charLevel1, String level2Chars, AminoAcid aminoAcid)
	{
		for (char l2char : level2Chars.toCharArray())
		{
			registerAminoAcid(charLevel0, charLevel1, l2char, aminoAcid);
		}
	}

	private static void registerAminoAcid(char charLevel0, char charLevel1, char charLevel2, AminoAcid aminoAcid)
	{
		HashMap<Character, HashMap<Character, AminoAcid>> level0 = translatorRegistry.getOrDefault(charLevel0, new HashMap<>());
		translatorRegistry.putIfAbsent(charLevel0, level0);
		HashMap<Character, AminoAcid> level1 = level0.getOrDefault(charLevel1, new HashMap<>());
		level0.putIfAbsent(charLevel1, level1);
		level1.put(charLevel2, aminoAcid);
	}

	public static AminoAcid translateCodon(char l0, char l1, char l2)
	{
		return translatorRegistry.get(l0)
				.get(l1)
				.get(l2);
	}

	public static AminoAcid translateCodon(Codon codon)
	{
		return translateCodon(codon.getLetterA(), codon.getLetterB(), codon.getLetterC());
	}
}
