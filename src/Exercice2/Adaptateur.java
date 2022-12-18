package Exercice2;

public class Adaptateur extends ImplNonStandard implements StandardStrategy{

    @Override
    public int[] filter(int[] image) {
        int[] newimage = appliquerFiltre("Filter3",image);
        return newimage;
    }
}
