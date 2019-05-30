package carlalo.loops;

import static org.junit.Assert.assertEquals;
import static carlalo.loops.SentenceWriter.writeSentence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * Test if sentences can be written.
 */
public class SentenceWriterTest 
{
    @Test
    public void shouldWriteNothing()
    {
        assertEquals( "", writeSentence(Collections.emptyList()) );
        assertEquals( "", writeSentence(null) );
    }
	
	@Test
    public void shouldWriteSingleWord()
    {
        assertEquals( "Hello.", writeSentence(Collections.singletonList("Hello")) );
    }
    
    @Test
    public void shouldWriteTwoWords()
    {
    	List<String> words = new ArrayList<>();
    	words.add("Hello");
    	words.add("Timo");
    	
        assertEquals( "Hello Timo.", writeSentence(words) );
    }
    
    @Test
    public void shouldStartWithCapitalLetter()
    {
        assertEquals( "Hello.", writeSentence(Collections.singletonList("hello")) );
    }
}
