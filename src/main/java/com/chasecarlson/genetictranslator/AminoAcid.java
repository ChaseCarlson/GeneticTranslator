package com.chasecarlson.genetictranslator;

public enum AminoAcid {
	ALA("Alanine", "Ala"),
	CYS("Cysteine", "Cys"),
	ASP("Aspartate", "Asp"),
	GLU("Glutarnate", "Glu"),
	PHE("Phenylalanine", "Phe"),
	GLY("Glycine", "Gly"),
	HIS("Histidine", "His"),
	ILE("Isoleucine", "Ile"),
	LYS("Lysine", "Lys"),
	LEU("Leucine", "Leu"),
	MET("Methionine", "Met"),
	ASN("Asparagine", "Asn"),
	PRO("Proline", "Pro"),
	GLN("Glutamine", "Gln"),
	ARG("Arginine", "Arg"),
	SER("Serine", "Ser"),
	THR("Threonine", "Thr"),
	VAL("Valine", "Val"),
	TRP("Tryptophan", "Trp"),
	TYR("Tyrosine", "Tyr"),
	STOP("STOP", "STOP");

	private String name;
	private String code;

	private AminoAcid(String name, String code)
	{
		this.name = name;
		this.code = code;
	}

}
