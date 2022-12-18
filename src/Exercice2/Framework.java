package Exercice2;

import java.util.Random;

public class Framework {
    private StandardStrategy filterStrategy = new StrategyImpl1();
    private Template template;

    public int[] filter(int[] image){
        return filterStrategy.filter(image);
    }

    public int[] compresser(int[] image){
        return template.compresser(image);
    }


    public void setFilterStrategy(StandardStrategy standardStrategy) {
        this.filterStrategy = standardStrategy;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }
}
