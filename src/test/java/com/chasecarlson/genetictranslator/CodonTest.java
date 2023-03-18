package com.chasecarlson.genetictranslator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CodonTest {

	@Test
	void fromDNASequence() {
		List<Codon> codons = Codon.fromDNASequence("AUGUCU");
		assertEquals(codons.size(), 2);
		Codon cod0 = codons.get(0);
		Codon cod1 = codons.get(1);
		assertEquals(cod0.getLetterA(), 'A');
		assertEquals(cod0.getLetterB(), 'U');
		assertEquals(cod0.getLetterC(), 'G');

		assertEquals(cod1.getLetterA(), 'U');
		assertEquals(cod1.getLetterB(), 'C');
		assertEquals(cod1.getLetterC(), 'U');
	}

	@Test
	void testToString() {
		assertEquals(new Codon('A', 'U', 'G').toString(), "AUG");
	}
}