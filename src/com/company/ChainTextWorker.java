package com.company;

public class ChainTextWorker {
    TextProcessable[] processes;

    public ChainTextWorker(TextProcessable[] processes) {
        this.processes = processes;
    }

     String processText(String text) {
        StringBuilder stringBuilder=new StringBuilder(text);
        for (int i=0;i<processes.length;i++){
            processes[i].processText(stringBuilder);
        }
        return stringBuilder.toString();
    }
}
