package Exercice2;

import java.util.Arrays;

public class StrategyImpl1 implements StandardStrategy{

    @Override
    public int[] filter(int[] image) {
        System.out.println("Image after Filter1:");
        int[] newImage = Arrays.stream(image).map(pixel -> pixel < 100 ? 0 : pixel).toArray();
        return newImage;
    }
}
