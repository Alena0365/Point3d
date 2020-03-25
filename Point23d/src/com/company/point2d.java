package com.company;

import java.util.Scanner;

public class point2d {
        double x,y;

        public point2d() {
            this.x=0;
            this.y=0;
        }
        public point2d(double x, double y) {
            this.x=x;
            this.y=y;
        }
        public double getX () {
            return this.x;
        }
        public double getY () {
            return this.y;
        }
        public void setX ( double x) {
            this.x = x;
        }
        public void setY ( double y) {
            this.y = y;
        }
        public String toString(){
            return "(" + this.x + "," + this.y+")";
        }
        public double[] getXY(){
            double[] results= new double[2];
            results[0]=this.x;
            results[1]=this.y;
            return results;
        }
        public void setXY(double x, double y){
            this.x=x;
            this.y=y;
        }
        public double distance(double x, double y){
            double xDiff=this.x-x;
            double yDiff=this.y-y;
            return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
        }
        public double distance(point2d another){
            double xDiff=this.x-another.x;
            double yDiff=this.y-another.y;
            return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
        }
        public double distance(){return Math.sqrt(this.x*this.x+this.y*this.y);}
    }

