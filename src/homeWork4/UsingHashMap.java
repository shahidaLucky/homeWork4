package homeWork4;

import java.util.*;


/**
 * Created by Shahida Lucky on 3/28/2016.
 */
public class UsingHashMap {
    public static void main(String[] args) {


        List<String> sectionNameOfTarget = new ArrayList<String>();
        sectionNameOfTarget.add("Cloths");
        sectionNameOfTarget.add("Cosmatics");
        sectionNameOfTarget.add("Shoes");
        sectionNameOfTarget.add("Toys");

        List<String> sectionNameOfWalmart = new ArrayList<String>();
        sectionNameOfWalmart.add("Cloths");
        sectionNameOfWalmart.add("Cosmatics");
        sectionNameOfWalmart.add("Shoes");
        sectionNameOfWalmart.add("Toys");

        List<String> sectionNameOfMacy = new ArrayList<String>();
        sectionNameOfMacy.add("Cloths");
        sectionNameOfMacy.add("Cosmatics");
        sectionNameOfMacy.add("Shoes");
        sectionNameOfMacy.add("Toys");

        List<String> sectionNameOfGap = new ArrayList<String>();
        sectionNameOfGap.add("Baby Wear");
        sectionNameOfGap.add("Women's wear");
        sectionNameOfGap.add("Men's wear");
        sectionNameOfGap.add("");

        List<String> sectionNameOfOldNavy = new ArrayList<String>();
        sectionNameOfOldNavy.add("Kids Cloths");
        sectionNameOfOldNavy.add("Men's cloths");
        sectionNameOfOldNavy.add("Women's cloths");
        sectionNameOfOldNavy.add("Shoes");

        Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
        map.put("Target", sectionNameOfTarget);
        map.put("Walmart", sectionNameOfWalmart);
        map.put("Macy", sectionNameOfMacy);
        map.put("Gap", sectionNameOfGap);
        map.put("OldNavy", sectionNameOfOldNavy);

        for(Map.Entry<String,List<String>>section: map.entrySet())

        {
            System.out.println(section.getKey()+"--------->"+section.getValue());
        }
    }
}