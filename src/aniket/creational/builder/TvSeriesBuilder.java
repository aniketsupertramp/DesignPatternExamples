package aniket.creational.builder;

public class TvSeriesBuilder extends SeriesBuilder {
    @Override
    public void setType() {
        series.setType("TV");
    }

    @Override
    public void setPlatform() {
        series.setPlatform("STAR WORLD");
    }

    @Override
    public void setCharges() {
        series.setCharges(60f);
    }
}
