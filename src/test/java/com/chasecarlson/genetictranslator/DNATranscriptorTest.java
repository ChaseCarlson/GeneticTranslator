package com.chasecarlson.genetictranslator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DNATranscriptorTest {

	@Test
	void transcribeDNAString() {
		assertEquals(DNATranscriptor.transcribeDNAString("AUG"), "UAC");
		assertEquals(DNATranscriptor.transcribeDNAString("TACCGGATGCCAGATCAAATC"), "AUGGCCUACGGUCUAGUUUAG");
	}
}