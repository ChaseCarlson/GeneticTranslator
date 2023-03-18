package com.chasecarlson.genetictranslator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AminoAcidTranslatorTest {

	@Test
	void translateCodon() {
		assertEquals(AminoAcidTranslator.translateCodon('A', 'U', 'G'), AminoAcid.MET);
		assertEquals(AminoAcidTranslator.translateCodon('U', 'A', 'G'), AminoAcid.STOP);
		assertEquals(AminoAcidTranslator.translateCodon('U', 'C', 'U'), AminoAcid.SER);
	}
}