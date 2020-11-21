package edu.epam.practicethree.entity;

public class Ball {
    private double weight;
    private Color color;

    public Ball(double weight, Color color) {
        setWeight(weight);
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight){
        if (weight <= 0){
            throw new IllegalArgumentException("Wrong weight : " + weight);
        }
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ball{");
        sb.append("weight=").append(weight);
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Double.compare(ball.weight, weight) == 0 &&
                color == ball.color;
    }

    @Override
    public int hashCode() {
        return (int) (31 * weight + ((color == null) ? 0 : color.hashCode()));
    }
}
