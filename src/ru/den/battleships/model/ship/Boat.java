package ru.den.battleships.model.ship;

public class Boat {
    private String coordinate;
    private int state;

    public Boat(String coordinate, int state) {
        this.coordinate = coordinate;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "coordinate='" + coordinate + '\'' +
                ", state=" + state +
                '}';
    }



    public String getCoordinate() {
        return coordinate;
    }
    // получить координаты свои кординаты

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }
    // новые координаты

    public int getState() {
        return state;
    }
    // статус корабля

    public void setState(int state) {
        this.state = state;
    }
    // вернуть состояние

}
