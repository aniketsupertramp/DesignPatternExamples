package aniket.creational.builder;

public class WebSeriesBuilder extends SeriesBuilder {
    @Override
    public void setType() {
        series.setType("Web");
    }

    @Override
    public void setPlatform() {
        series.setPlatform("Netflix");
    }

    @Override
    public void setCharges() {
        series.setCharges(100f);
    }
}
