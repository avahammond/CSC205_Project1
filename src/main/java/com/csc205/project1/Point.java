package com.csc205.project1;

/**
 * Author: Ava Hammond
 * Class: CSC205
 * Date: 09/07/2021
 * Project 1
 */

public class Point {

    // variables
    private double y;
    private double x;

    // default coordinates
    public Point() {
        x = 0;
        y = 0;
    }

    // new point with values
    public Point(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    // returns x
    public double getX() {
        return this.x;
    }

    // returns y
    public double getY() {
        return this.y;
    }

    // sets x to new value
    private void setX(double v) {
        this.x = v;
    }

    // sets y to new value
    private void setY(double v) {
        this.y = v;
    }

    // sets point with values
    public void setPoint(double v, double v1) {
        this.setX(v);
        this.setY(v1);
    }

    // returns the distance between the new point and the original point
    public double distance(Point b) {
        return Math.sqrt(Math.pow(b.getY() - this.getY(), 2) + Math.pow(b.getX() - this.getX(), 2));
    }

    // rotates the old point to a new point (gives new coordinates)
    public void rotate(double rotation) {
        this.setX(this.getX() * Math.cos(rotation) - this.getY() * Math.sin(rotation));
        this.setY(this.getX() * Math.sin(rotation) + this.getY() * Math.cos(rotation));
    }

    // adjusts x
    public void shiftX(int i) {
        this.setX(this.getX() + i);
    }

    // adjusts y
    public void shiftY(int i) {
        this.setY(this.getY() + i);
    }

    // returns point coordinates as a string
    public String toString() {
        return "Point{x = " + this.getX() + ", y = " + this.getY() + "}";
    }
}