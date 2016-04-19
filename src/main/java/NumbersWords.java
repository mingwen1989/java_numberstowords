import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class NumbersWords {
  public static void main(String[] args) {}

  public static String calculateNumber(Integer userNumber) {

    HashMap<Integer, String> singleDigits = new HashMap<Integer, String>();
    singleDigits.put(1, "one");
    singleDigits.put(2, "two");
    singleDigits.put(3, "three");
    singleDigits.put(4, "four");
    singleDigits.put(5, "five");
    singleDigits.put(6, "six");
    singleDigits.put(7, "seven");
    singleDigits.put(8, "eight");
    singleDigits.put(9, "nine");

    String converter = "";
    for(int i = 0; i < singleDigits.size(); i++) {
    //   if(userNumber == singleDigits.get("one")) {
    //     converter = "one";
    //   } else {
    //
    //   }
    }
    String results = singleDigits.get(userNumber);
    return results;
  }

}
