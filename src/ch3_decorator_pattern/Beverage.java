package ch3_decorator_pattern;

public abstract class Beverage {
    String description = "제목없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
