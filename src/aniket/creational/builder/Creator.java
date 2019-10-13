package aniket.creational.builder;

public class Creator {

    private SeriesBuilder seriesBuilder;

    public void setSeriesBuilder(SeriesBuilder sb) {
        seriesBuilder = sb;
    }

    public void produceSeries() {
        seriesBuilder.createSeries();
        seriesBuilder.setType();
        seriesBuilder.setPlatform();
        seriesBuilder.setCharges();
    }

    public Series getSeries() {
        return seriesBuilder.getSeries();
    }

    public static void main(String[] args) {
        Creator creator = new Creator();
        creator.setSeriesBuilder(new WebSeriesBuilder());
        creator.produceSeries();

        Series webSeries = creator.getSeries();

        creator.setSeriesBuilder(new TvSeriesBuilder());
        creator.produceSeries();

        Series tvSeries = creator.getSeries();
    }

}
