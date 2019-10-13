package aniket.creational.builder;

public abstract class SeriesBuilder {
    protected Series series;

    public Series getSeries() {
        return series;
    }

    public void createSeries() {
        series = new Series();

    }

    public abstract void setType();

    public abstract void setPlatform();

    public abstract void setCharges();


}
