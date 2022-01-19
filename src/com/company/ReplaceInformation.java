package com.company;

public class ReplaceInformation implements TextProcessable{
    int startReplace;
    int endReplace;
    Object replacement;

    public ReplaceInformation(int startReplace,int endReplace,Object replacement) {
        this.startReplace=startReplace;
        this.endReplace=endReplace;
        this.replacement=replacement;
    }

    @Override
    public void processText(StringBuilder input) {
input.replace(startReplace,endReplace, String.valueOf(replacement));
    }
}
