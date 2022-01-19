package com.company;

public class AppendInformation implements TextProcessable {
    Object endObject;

    public AppendInformation(Object endObject) {
        this.endObject = endObject;
    }

    @Override
    public void processText(StringBuilder input) {
        input.append(endObject);
    }
}
