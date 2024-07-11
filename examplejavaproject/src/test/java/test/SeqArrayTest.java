package test;

import java.io.IOException;
import junit.framework.TestCase;
import input.SeqArray;

public class SeqArrayTest extends TestCase {
	protected String filename;

	protected void setUp() throws Exception {
		super.setUp();
		filename = "C:\\Users\\alexw\\Documents\\Java Example\\ecoli_tryptic_peptide_sequences.txt";
	}

	//trying to assign all of the fragment masses here isn't working, we'll just read in the sequences and be done with it
	public void testReadSequences() throws IOException {
		String[] sequences = SeqArray.readSequences(filename);
		assertTrue(sequences.length == 146625);
	}

}
