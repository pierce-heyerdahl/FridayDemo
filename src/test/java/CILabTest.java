import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    // test for all upper case
    @Test
    public void detectCapitalUseTest1() {
        myString.setString("ALLUPPERCASE");
        assertTrue(myString.detectCapitalUse());
    }

    // test for all lower case
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("alllowercase");
        assertTrue(myString.detectCapitalUse());
    }

    // test for capital letters at start and end
    @Test
    public void detectCapitalUseTest3() {
        myString.setString("FirstandlastcapitaL");
        assertFalse(myString.detectCapitalUse());
    }

    // test for capital letter in middle
    @Test
    public void detectCapitalUseTest4() {
        myString.setString("capitalInmiddle");
        assertFalse(myString.detectCapitalUse());
    }


}
