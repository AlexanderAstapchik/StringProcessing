package com.company;

public class ReversInformation implements TextProcessable {
    public ReversInformation() {
    }

    @Override
    public void processText(StringBuilder input) {
        input.reverse().toString();
    }
}
