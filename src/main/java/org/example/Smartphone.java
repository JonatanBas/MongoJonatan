package org.example;

public class Smartphone
{
    //ATRIBUTOS
    private int id;
    private String model;
    private double screen;
    private double weight;
    private String soc;
    private double prize;

    //CONSTRUCTOR GENERAL
    public Smartphone(int id, String model, double screen, double weight, String soc, double prize) {
        this.id = id;
        this.model = model;
        this.screen = screen;
        this.weight = weight;
        this.soc = soc;
        this.prize = prize;
    }

    //SETTERS
    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSoc(String soc) {
        this.soc = soc;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    //GETTERS
    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public double getScreen() {
        return screen;
    }

    public double getWeight() {
        return weight;
    }

    public String getSoc() {
        return soc;
    }

    public double getPrize() {
        return prize;
    }

    //MÉTODOS
    @Override
    public String toString() {
        return "Smartphone{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", screen=" + screen +
                ", weight=" + weight +
                ", soc='" + soc + '\'' +
                ", prize=" + prize +
                '}';
    }
}
