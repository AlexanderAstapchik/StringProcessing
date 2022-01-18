package com.company;

public class Main {

    public static void main(String[] args) {
	boolean check = TextWorker.isPalindrome("ffuff ");
        System.out.println(check);
        String check1=TextWorker.getSequance("Textual",'t','l');
        System.out.println(check1);
        String check2=TextWorker.createSequance(4,10);
        System.out.println(check2);
        String check3=TextWorker.insertAll("initialText", new String[]{"9Trr", "6543","G"}, new int[]{0, 5,3});
        System.out.println(check3);
        String check4=TextWorker.insertAllNew("initialText", new String[]{"9Trr", "6543","G"}, new int[]{0, 5,3});
        System.out.println(check4);
        String[] check5=TextWorker.findAllMails("Some text rty@gmail.com and one more phj@company.com mail");
        System.out.println(check5);
    }
}
