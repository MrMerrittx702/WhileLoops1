import static org.junit.jupiter.api.Assertions.assertEquals;import org.junit.jupiter.api.DisplayName;import org.junit.jupiter.api.Test;import org.junit.jupiter.params.ParameterizedTest;import org.junit.jupiter.params.provider.CsvSource;import java.io.*;

class WhileLoopsTest {
  @Test
  public void testCountUp()
  {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bos));

    // action
    WhileLoops.countUp();

    // assertion
    assertEquals("1 2 3 4 5 6 7 8 9 10", bos.toString());

    // undo the binding in System
    System.setOut(originalOut);
  }
  
  @Test
  public void testCountDown()
  {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bos));

    // action
    WhileLoops.countDown();

    // assertion
    assertEquals("10 9 8 7 6 5 4 3 2 1", bos.toString());

    // undo the binding in System
    System.setOut(originalOut);
  }
  
  @Test
  public void testCountUpMultiples()
  {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bos));

    // action
    WhileLoops.countUpMultiples();

    // assertion
    assertEquals("0 3 6 9 12 15 18 21 24 27 30", bos.toString());

    // undo the binding in System
    System.setOut(originalOut);
  }
  
  @Test
  public void testCountDownMultiples()
  {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bos));

    // action
    WhileLoops.countDownMultiples();

    // assertion
    assertEquals("20 15 10 5 0", bos.toString());

    // undo the binding in System
    System.setOut(originalOut);
  }
  
  @Test
  public void testNestedLoop()
  {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bos));

    // action
    WhileLoops.nestedLoop();

    // assertion
    assertEquals("1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 ", bos.toString());

    // undo the binding in System
    System.setOut(originalOut);
  }
  
  @Test
  public void testPrintChars()
  {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bos));

    // action
    WhileLoops.printChars("Hello World");

    // assertion
    assertEquals("H e l l o   W o r l d", bos.toString());

    // undo the binding in System
    System.setOut(originalOut);
  }
  
  @Test
  public void testDoWhile()
  {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bos));

    // action
    WhileLoops.doWhile("String", false);

    // assertion
    assertEquals("String", bos.toString());

    // undo the binding in System
    System.setOut(originalOut);
  }
  
  @Test
  public void testBreakCount()
  {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bos));

    // action
    WhileLoops.breakCount(10);

    // assertion
    assertEquals("0 1 2 3 4 5 6 ", bos.toString());

    // undo the binding in System
    System.setOut(originalOut);
  }
  
  @Test
  public void testSkipEvens()
  {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bos));

    // action
    WhileLoops.skipEvens();

    // assertion
    assertEquals("1 3 5 7 9 11 13 15 ", bos.toString());

    // undo the binding in System
    System.setOut(originalOut);
  }
  
  @Test
  public void testPrintArray()
  {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bos));

    String[] array = {"a", "b", "c", "d"};
    // action
    WhileLoops.printArray(array);

    // assertion
    assertEquals("a b c d", bos.toString());

    // undo the binding in System
    System.setOut(originalOut);
  }
 
}
