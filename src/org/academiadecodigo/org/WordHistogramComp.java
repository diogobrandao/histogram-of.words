package org.academiadecodigo.org;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

//import static org.academiadecodigo.org.WordHistogramComp.size;

public class WordHistogramComp implements Iterable<String> {

    private String[] string;
    private HashMap<String,Integer> word = new HashMap();
    private int counter;
    private int size;


    public void WordHistogramComp(String string) {
        String[] tempWords = string.split(" ");


        for (int i = 0; i < tempWords.length; i++) {
            if(!this.word.containsKey(tempWords[i])) {
                this.word.put(tempWords[i], 1);
            }
            else{
                this.word.put(tempWords[i], word.get(tempWords[i]));
            }

        }

    }


    public Integer get(String str) {
        return word.get(str);
    }

    public int size(){
        return word.size();
    }



    @Override
    public Iterator<String> iterator() {

        return word.keySet().iterator();  //devolve conjunto de chaves uniccas, o keyset

    }







}