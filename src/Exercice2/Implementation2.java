package Exercice2;

import java.util.Arrays;

public class Implementation2 extends Template{
    @Override
    public int operationAbs(int[] data) {
        int x = Arrays.stream(data).filter(pixel -> pixel > 100).toArray().length;
        return x;
    }
}
