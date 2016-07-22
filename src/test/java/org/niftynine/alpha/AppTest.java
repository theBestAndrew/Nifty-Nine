package org.niftynine.alpha;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    /* Added by quickstart archetype
    don't know what it does
    public AppTest( String testName )
    {
        super( testName );
    }*/

    /**
     * @return the suite of tests being tested
     */
    /* Added by quickstart archetype
    don't know what it does
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }*/

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        App app = new App();
        app.deprecatedMethod();
        assertTrue( true );
    }
}
