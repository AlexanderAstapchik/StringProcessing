package com.company;

public class InsertInformation implements TextProcessable {
    int index;
    String str;
    public InsertInformation(int index, String str) {
        this.index=index;
        this.str=str;
    }

    @Override
    public void processText(StringBuilder input) {
        input.insert(index,str);
    }
}
