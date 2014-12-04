package com.nastajus.ClassDeclarations;

/**
 * Created by IAN on 03/12/14.
 */
public class Main {
    InnerClassDataStructure icds = new InnerClassDataStructure();
    icds.EvenIterator //cannot resolve symbol EvenIterator, despite that IntelliJ autocompletes it. Interesting.
    icds.EvenIterator new InnerClassDataStructure.EvenIterator abc; //unexpected token. Interesting.
    InnerClassDataStructure.EvenIterator abc = new InnerClassDataStructure.EvenIterator() //com.nastajus.ClassDeclarations.InnerClassDataStructure is not an enclosing class. Interesting.
}
