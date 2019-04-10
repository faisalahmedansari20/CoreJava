package com.larger;

public class LargestContinueStringFinder {

    private static LargestContinueStringFinder stringFinder;

    private LargestContinueStringFinder() {
    }

    public static LargestContinueStringFinder getInstance() {
        if (stringFinder == null) {
            stringFinder = new LargestContinueStringFinder();
        }
        return stringFinder;
    }

    public String find(LowestLargestString stringData) {

        if (stringData.isComparable()) {
            //System.out.println("lowest string is "+stringData.getLowest()+" and its length is"+stringData.getLowestLength());
            //System.out.println("largest string is "+stringData.getLargest()+" and its length is"+stringData.getLargestLength());
//        for (String s: stringData.getLowestStringArray()) {
//            System.out.println(s);
//        }
            // String getLowestArray]

            return findLargestContinueString(stringData);
        }

        System.out.println("String cannot be compared");
        return null;

    }

    private String findLargestContinueString(LowestLargestString stringData) {
        String[] lowestArrayString = stringData.getLowestStringArray();
        String continueLongest = "";
        StringBuilder currentSequence = new StringBuilder();

        for (int i = 0; i < lowestArrayString.length; i++) {

            currentSequence.append(lowestArrayString[i]);

            if (stringData.getLargest().contains(currentSequence)) {
                if (continueLongest.length() < currentSequence.length()) {
                    continueLongest = currentSequence.toString();
                }
                continue;
            }

           String newString= getTrimEligibleWord(currentSequence.toString(), stringData.getLargest());
            currentSequence.delete(0, currentSequence.length());
            currentSequence.append(newString);
        }


        return continueLongest;
    }


    public String getTrimEligibleWord(String string, String largest) {

        // String newString = (string.length() == 1) ? string : string.substring(1, string.length());
//        String newString = string.replace(string.charAt(0) + "", "");
        String newString = string.replaceFirst(String.valueOf(string.charAt(0)) , "");

        if (!newString.isEmpty()) {

            if (largest.contains(newString)) {
                return newString;
            }
           return getTrimEligibleWord(newString, largest);
        }

        // if(newString.isEmpty())

        return newString;
    }
}
