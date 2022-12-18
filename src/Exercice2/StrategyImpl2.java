package Exercice2;

import java.util.Arrays;

public class StrategyImpl2 implements StandardStrategy{

    @Override
    public int[] filter(int[] image) {
        System.out.println("Image after Filter2:");
        int[] newImage = Arrays.stream(image).map(pixel -> pixel > 100 ? 0 : pixel).toArray();
        return newImage;
    }
}
