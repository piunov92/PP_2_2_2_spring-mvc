package web.model;

public class Car {

    private String model;
    private String year;
    private String series;

    public Car() {
    }

    public Car(String model, String year, String series) {
        this.model = model;
        this.year = year;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "model: '" + model + '\'' +
                "\tyear: '" + year + '\'' +
                "\tseries: '" + series + '\'';
    }
}
