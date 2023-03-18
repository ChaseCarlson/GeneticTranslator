package com.chasecarlson.genetictranslator;

import java.util.ArrayList;
import java.util.List;

public class GeneticTranslator {
	public static void main(String[] args)
	{
		String dnaSequence = args[0];
		String transcribedSequence = DNATranscriptor.transcribeDNAString(dnaSequence);
		List<Codon> codons = Codon.fromDNASequence(transcribedSequence);
		List<AminoAcid> aminoAcids = new ArrayList<>();

		System.out.print("mRNA: ");
		for (Codon codon : codons)
		{
			System.out.print(codon.toString() + " ");
		}
		System.out.println();
		System.out.println();
		System.out.print("Amino Acid Sequence: ");
		for (Codon codon : codons)
		{
			AminoAcid aminoAcid = AminoAcidTranslator.translateCodon(codon);
			aminoAcids.add(aminoAcid);
			System.out.print(aminoAcid.toString() + " ");
		}
	}
}
