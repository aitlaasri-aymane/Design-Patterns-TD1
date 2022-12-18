package Exercice2;

import java.util.Arrays;

public class ImplNonStandard {
    public int[] appliquerFiltre(String filtername,int[] image) {
        System.out.println("Image after " + filtername + ":");
        int[] newImage = Arrays.stream(image).map(pixel -> pixel == 255 ? pixel : 255).toArray();
        return newImage;
    }
}
