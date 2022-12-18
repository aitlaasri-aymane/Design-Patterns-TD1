package Exercice2;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        int[] image = new Random().ints(20,0,255).toArray();
        System.out.println("Default Image: \n" + Arrays.toString(image));
        Framework framework = new Framework();

        /*
        // Default Strategy (Strategy 1)
        int[] img1 = framework.filter(image);
        System.out.println(Arrays.toString(img1));
        // Strategy 2
        framework.setFilterStrategy(new StrategyImpl2());
        int[] img2 = framework.filter(image);
        System.out.println(Arrays.toString(img2));
        // Using Adapter to use an old Strategy
        framework.setFilterStrategy(new Adaptateur());
        int[] img3 = framework.filter(image);
        System.out.println(Arrays.toString(img3));
        // Using method template 1
        framework.setTemplate(new Implementation1());
        int[] img4 = framework.compresser(image);
        System.out.println(Arrays.toString(img4));
        // Using method template 2
        framework.setTemplate(new Implementation2());
        int[] img5 = framework.compresser(image);
        System.out.println(Arrays.toString(img5));
        */

        Scanner scanner=new Scanner(System.in);
        boolean loop = true;
        while (loop){
            System.out.println("Donner le nom de la classe de la methode filter (Exercice2.StrategyImpl1 ou Exercice2.StrategyImpl2 ou Exercice2.Adaptateur): ");
            String strategyClassName = scanner.nextLine(); // has to be written like Exercice2.StrategyImpl1 since its in the strategy package
            StandardStrategy strategy = (StandardStrategy) Class.forName(strategyClassName).getDeclaredConstructor().newInstance();
            framework.setFilterStrategy(strategy);
            int[] img = framework.filter(image);
            System.out.println(Arrays.toString(img));

            System.out.println("Donner le nom de la classe de la methode compresser (Exercice2.Implementation1 ou Exercice2.Implementation2): ");
            String templateClassName = scanner.nextLine(); // has to be written like Exercice2.Implementation1 since its in the strategy package
            Template template = (Template) Class.forName(templateClassName).getDeclaredConstructor().newInstance();
            framework.setTemplate(template);
            int[] img1 = framework.compresser(image);
            System.out.println(Arrays.toString(img1));

            System.out.println("Taper q pour quitter ou n'importe quoi pour repeter");
            String option = scanner.nextLine();
            if (option == "q"){
                    loop = false;
            }
        }
    }
}
