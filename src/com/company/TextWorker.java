package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextWorker {

    public static boolean isPalindrome(String word) {
        String word1 = word.trim();
        StringBuffer stringBuffer = new StringBuffer(word1).reverse();
        boolean answer = true;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != stringBuffer.charAt(i)) {
                answer = false;
                break;
            }
        }
        return answer;
    }

    public static String getSequance(String text, char symbolStart, char symbolEnd) {
        int startIndex = text.indexOf(symbolStart);
        int endIndex = text.lastIndexOf(symbolEnd);
        if (startIndex >= 0 && startIndex < text.length() && endIndex >= 0 && endIndex < text.length()) {
            StringBuffer stringBuffer1 = new StringBuffer(text);
            String sequance = stringBuffer1.substring(startIndex, endIndex + 1);
            return sequance;
        } else {
            return null;
        }
    }

    public static String createSequance(int start, int end) {
        String createText = "";
        if (start <= end) {
            for (int i = start; i <= end; i++) {
                createText += i + " ";
            }
            return createText;
        } else return null;
    }

    public static String insertAll(String initialText, String[] toInsert, int[] indexes) {
        StringBuffer stringBuffer2 = new StringBuffer(initialText);
        if (toInsert.length == indexes.length) {
            for (int i = 0; i < toInsert.length; i++) {
                stringBuffer2.insert(indexes[i], toInsert[i]);
            }
            return stringBuffer2.toString();
        } else return null;
    }

    public static String insertAllNew(String initialText, String[] toInsert, int[] indexes) {
        StringBuffer stringBuffer3 = new StringBuffer(initialText);
        if (toInsert.length == indexes.length) {
            for (int i = 0; i < toInsert.length; i++) {
                for (int j = 0; j < indexes.length; j++) {
                    if (i == j) {
                        if (i > 0) {
                            indexes[j] += toInsert[i - 1].length();
                        }
                        stringBuffer3.insert(indexes[j], toInsert[i]);
                    }
                }
            }
            return stringBuffer3.toString();
        } else return null;
    }

    public static String[] findAllMails(String text) {

        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            if (matcher.group() != null) {
                String[] mails = new String[matcher.group().length()];
                mails[matcher.group().length() - 1] = matcher.group();
                System. out. println (mails[matcher.group().length() - 1]) ;

            } else return null;
        }
       return null;
    }
}