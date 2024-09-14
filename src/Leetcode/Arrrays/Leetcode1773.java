package Leetcode.Arrrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 1773. Count Items Matching a Rule
You are given an array items, where each items[i] = [type, color, name] describes
 the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == type.
ruleKey == "color" and ruleValue == color.
ruleKey == "name" and ruleValue == name.
Return the number of items that match the given rule.

Example 1:

Input: items = [["phone","blue","pixel"],
["computer","silver","lenovo"],["phone","gold","iphone"]],
ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
 */
public class Leetcode1773 {
    public static void main(String[] args) {
   // Creating a list of lists
        List<List<String>> items = new ArrayList<>();

        // Adding individual lists to the main list
        List<String> item1 = new ArrayList<>();
        item1.add("phone");
        item1.add("blue");
        item1.add("pixel");
        items.add(item1);

        List<String> item2 = new ArrayList<>();
        item2.add("computer");
        item2.add("silver");
        item2.add("lenovo");
        items.add(item2);

        List<String> item3 = new ArrayList<>();
        item3.add("phone");
        item3.add("gold");
        item3.add("iphone");
        items.add(item3);

        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(items,ruleKey,ruleValue));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        int count = 0;

        if(ruleKey == "type"){
            index =0;
        } else if(ruleKey == "color"){
            index = 1;
        }else if(ruleKey == "name"){
            index = 2;
        }

        // loop through the list
        for (List<String> item : items){
            if(item.get(index).equals(ruleValue)) {
                count++;            }
        }
        return count;
}}
