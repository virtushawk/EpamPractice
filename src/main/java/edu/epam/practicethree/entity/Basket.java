package edu.epam.practicethree.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Basket {

    private final ArrayList<Ball> balls;

    public Basket(List<Ball> balls){
        this.balls = (ArrayList<Ball>) balls;
    }

    public Basket(){
        balls = new ArrayList<>();
    }

    public Ball get(int index) {
        if (index < 0 || index >= balls.size()){
            throw new ArrayIndexOutOfBoundsException("wrong index" + index);
        }
        return balls.get(index);
    }

    public void add(Ball ball) {
        balls.add(ball);
    }

    public List<Ball> getBalls() {
        return new ArrayList<>(balls);
    }

    public int size(){
        return balls.size();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Basket{");
        sb.append("balls=").append(balls);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(balls, basket.balls);
    }

    @Override
    public int hashCode() {
        int hashcode = 1 ;
        for (Ball ball : this.balls) {
            hashcode = 31 * hashcode + ball.hashCode();
        }
        return  hashcode;
    }
}
