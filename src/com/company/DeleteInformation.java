package com.company;

public class DeleteInformation implements TextProcessable {
    int startIndex;
    int endIndex;
    public DeleteInformation(int startIndex,int endIndex) {
        this.startIndex=startIndex;
        this.endIndex=endIndex;
    }

    @Override
    public void processText(StringBuilder input) {
        input.delete(startIndex,endIndex);
    }
}
