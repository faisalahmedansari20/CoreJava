package com.larger;

public class LowestLargestString {

    private String lowest;
    private String largest;
    private int lowestLength;
    private int largestLength;
    private String[] lowestStringArray;
    private boolean isComparable;

    private LowestLargestString(String lowest, String largest, boolean isComparable) {
        this.lowest = lowest;
        this.largest = largest;
        this.lowestLength = lowest.length();
        this.largestLength = largest.length();
        this.lowestStringArray=lowest.split("");
        this.isComparable = isComparable;
    }

    private LowestLargestString() {
    }

    public static LowestLargestString getResult(String s1, String s2) {

        if (s1 == null || s2 == null) {
            return new LowestLargestString();
        }

        if (s1.length() < s2.length() || s1.length() == s2.length()) {
            return new LowestLargestString(s1, s2, true);
        } else {
            return new LowestLargestString(s2, s1, true);
        }
    }


    public boolean isComparable() {
        return isComparable;
    }

    public String[] getLowestStringArray() {
        return lowestStringArray;
    }

    public String getLowest() {
        return lowest;
    }

    public String getLargest() {
        return largest;
    }

    public int getLowestLength() {
        return lowestLength;
    }

    public int getLargestLength() {
        return largestLength;
    }

    public void setLowest(String lowest) {
        this.lowest = lowest;
    }

    public void setLargest(String largest) {
        this.largest = largest;
    }

    public void setLowestLength(int lowestLength) {
        this.lowestLength = lowestLength;
    }

    public void setLargestLength(int largestLength) {
        this.largestLength = largestLength;
    }

}
