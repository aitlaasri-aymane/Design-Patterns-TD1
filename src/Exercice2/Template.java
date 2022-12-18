package Exercice2;

import java.util.Arrays;

public abstract class Template {
    public int[] compresser(int[] image){
        System.out.println("Image after Compression:");
        int[] newimage;
        int x = operationAbs(image);
        newimage = Arrays.stream(image).map(pixel -> pixel >= x ? pixel-x : 0).toArray();
        return newimage ;
    }

    abstract public int operationAbs(int[] data);
}
