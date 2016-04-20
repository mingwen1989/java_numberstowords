import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class NumbersWords {
  public static void main(String[] args) {}

  public static String calculateNumber(String userNumber) {

    HashMap<String, String> singleDigits = new HashMap<String, String>();
    singleDigits.put("0", "");
    singleDigits.put("1", "one");
    singleDigits.put("2", "two");
    singleDigits.put("3", "three");
    singleDigits.put("4", "four");
    singleDigits.put("5", "five");
    singleDigits.put("6", "six");
    singleDigits.put("7", "seven");
    singleDigits.put("8", "eight");
    singleDigits.put("9", "nine");

    HashMap<String, String> teens = new HashMap<String, String>();
    teens.put("10", "ten");
    teens.put("11", "eleven");
    teens.put("12", "twelve");
    teens.put("13", "thirteen");
    teens.put("14", "fourteen");
    teens.put("15", "fifteen");
    teens.put("16", "sixteen");
    teens.put("17", "seventeen");
    teens.put("18", "eighteen");
    teens.put("19", "nineteen");

    HashMap<String, String> tensDigits = new HashMap<String, String>();
    tensDigits.put("0", "");
    tensDigits.put("1", "ten");
    tensDigits.put("2", "twenty");
    tensDigits.put("3", "thirty");
    tensDigits.put("4", "forty");
    tensDigits.put("5", "fifty");
    tensDigits.put("6", "sixty");
    tensDigits.put("7", "seventy");
    tensDigits.put("8", "eighty");
    tensDigits.put("9", "ninety");

    HashMap<String, String> hundredsDigits = new HashMap<String, String>();
    hundredsDigits.put("0", "");
    hundredsDigits.put("1", "one hundred");
    hundredsDigits.put("2", "two hundred");
    hundredsDigits.put("3", "three hundred");
    hundredsDigits.put("4", "four hundred");
    hundredsDigits.put("5", "five hundred");
    hundredsDigits.put("6", "six hundred");
    hundredsDigits.put("7", "seven hundred");
    hundredsDigits.put("8", "eight hundred");
    hundredsDigits.put("9", "nine hundred");


    Integer number = Integer.parseInt(userNumber);


    char[] numberString = userNumber.toCharArray();


    String results = new String();

    if (number < 10) {
    results = singleDigits.get(userNumber);
  } else if (number > 10 && number < 20) {
    results = teens.get(userNumber);
  } else if (number > 19 && number < 100) {
    results = (tensDigits.get(Character.toString(numberString[0]))) + " " + singleDigits.get(Character.toString(numberString[1]));
  } else if (number > 99 && number < 1000) {
    results = (hundredsDigits.get(Character.toString(numberString[0])) + " " + tensDigits.get(Character.toString(numberString[1])) + " " + singleDigits.get(Character.toString(numberString[2])));
  }

  else {

  }
    return results;
  }

}
