package edu.epam.practicetwo.entity;

import java.util.Arrays;

public class Basket {
    private Ball[] balls;

    public Basket(Ball... balls) {
        this.balls = balls;
    }

    public Basket(){
        balls = new Ball[0];
    }

    public Ball getBall(int index) {
        if (index < 0 || index >= balls.length){
            throw new IllegalArgumentException("Wrong index");
        }
        return balls[index];
    }

    public void addBall(Ball ball) {
        Ball [] newArray = new Ball[balls.length + 1];
        System.arraycopy(balls, 0, newArray, 0, balls.length);
        newArray[balls.length] = ball;
        this.balls = newArray;
    }

    public double getWeight() {
        double result = 0;
        for (Ball ball : balls) {
            result += ball.getWeight();
        }
        return result;
    }

    public int getNumberByColor(Color color){
        int count = 0;
        for (Ball ball:balls) {
            if (ball.getColor() == color){
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Basket{");
        sb.append("balls=").append(Arrays.toString(balls));
        sb.append('}');
        return sb.toString();
    }
}
