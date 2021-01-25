package web.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class Car {

    private String name;
    private int series;
    private String model;



    public Car(String name, int series, String model) {
        this.name = name;
        this.series = series;
        this.model = model;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString() {
        return "name = " + name + ", series = " + series + ", model = " + model + "; ";
    }
}
