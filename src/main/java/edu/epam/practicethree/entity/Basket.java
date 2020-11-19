package edu.epam.practicethree.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basket {
     private final ArrayList<Ball> balls;

    public Basket(Ball... balls) {
        List <Ball> list = Arrays.asList(balls);
        this.balls = new ArrayList<>(list);
    }

    public Basket(List<Ball> balls){
        this.balls = (ArrayList<Ball>) balls;
    }

    public Basket(){
        balls = new ArrayList<>();
    }

    public Ball getBall(int index) {
        if (index < 0 || index >= balls.size()){
            throw new IllegalArgumentException("Wrong index");
        }
        return balls.get(index);
    }

    public void addBall(Ball ball) {
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
}
