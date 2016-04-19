import org.junit.*;
import static org.junit.Assert.*;

public class NumbersWordsTest {

  @Test
  public void calculateNumber_forNumberOne_1() {
    NumbersWords numbersWords = new NumbersWords();
    String expected = "nine";
    assertEquals(expected, numbersWords.calculateNumber(9));
  }
}
