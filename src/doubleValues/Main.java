package doubleValues;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("перший");
        words.add("другий");
        words.add("третій");
        words.add("четвертий");
        words.add("п'ятий");

        ArrayList<String> doubleWords = doubleValues(words);

        for (int i = 0; i < doubleWords.size(); i++) {
            System.out.println(doubleWords.get(i));
        }
    }
    public static ArrayList<String> doubleValues(ArrayList<String> stringList)
    {
        ArrayList<String> doubleValuesList = new ArrayList<>();
        for (String string : stringList)
        {
            doubleValuesList.add(string);
            doubleValuesList.add(string);
        }
        return doubleValuesList;
    }
}
