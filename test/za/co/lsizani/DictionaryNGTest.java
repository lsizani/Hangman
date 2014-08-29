package za.co.lsizani;

import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author LSizani
 */
public class DictionaryNGTest {
    
    public DictionaryNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getAllWords method, of class Dictionary.
     */
    @Test
    public void testGetAllWords() {
        System.out.println("getAllWords");
        Dictionary instance = new DictionaryImpl();
        ArrayList expResult = null;
        ArrayList result = instance.getAllWords();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initWords method, of class Dictionary.
     */
    @Test
    public void testInitWords() {
        System.out.println("initWords");
        Dictionary instance = new DictionaryImpl();
        instance.initWords();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWordAtIndex method, of class Dictionary.
     */
    @Test
    public void testGetWordAtIndex() {
        System.out.println("getWordAtIndex");
        int index = 0;
        Dictionary instance = new DictionaryImpl();
        String expResult = "";
        String result = instance.getWordAtIndex(index);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWordLength method, of class Dictionary.
     */
    @Test
    public void testGetWordLength() {
        System.out.println("getWordLength");
        Dictionary instance = new DictionaryImpl();
        int expResult = 0;
        int result = instance.getWordLength();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of computeGuess method, of class Dictionary.
     */
    @Test
    public void testComputeGuess() {
        System.out.println("computeGuess");
        String ch = "";
        String word = "";
        String lastGuess = "";
        Dictionary instance = new DictionaryImpl();
        String expResult = "";
        String result = instance.computeGuess(ch, word, lastGuess);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DictionaryImpl extends Dictionary {

        public ArrayList<String> getAllWords() {
            return null;
        }

        public void initWords() {
        }

        public String getWordAtIndex(int index) {
            return "";
        }

        public int getWordLength() {
            return 0;
        }
    }
    
}
