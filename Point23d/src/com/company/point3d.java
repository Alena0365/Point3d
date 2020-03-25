package com.company;
import com.company.point2d;
public class point3d extends point2d  {
    protected double z;
    public point3d() {
        this.z=0;
    }
    public point3d(double x, double y,double z) {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public double getZ () { return this.z; }
    public void setZ ( double z) { this.z = z; }
    public String toString(){
        return "(" + this.x + "," + this.y+ "," + this.z+ ")";
    }
    public double[] getXYZ(){
        double[] results= new double[3];
        results[0]=this.x;
        results[1]=this.y;
        results[2]=this.z;
        return results;
    }
    public void setXYZ(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public double distance(double x, double y, double z){
        double xDiff=this.x-x;
        double yDiff=this.y-y;
        double zDiff=this.z-z;
        return Math.sqrt(Math.pow(xDiff,2)+Math.pow(yDiff,2)+Math.pow(zDiff,2));
    }
    public double distance(point3d another){
        double xDiff=this.x-another.x;
        double yDiff=this.y-another.y;
        double zDiff=this.z-another.z;
        return Math.sqrt(Math.pow(xDiff,2)+Math.pow(yDiff,2)+Math.pow(zDiff,2));
    }
    public double distance(){return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2)+Math.pow(this.z,2)); }
    public static void square(point3d another_one, point3d another_two, point3d another_three){
        double x1=another_one.x, x2=another_two.x, x3=another_three.x;
        double y1=another_one.y, y2=another_two.y, y3=another_three.y;
        double z1=another_one.z, z2=another_two.z, z3=another_three.z;

        double a=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)+(z1-z2)*(z1-z2));
        double b=Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3)+(z2-z3)*(z2-z3));
        double c=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3)+(z1-z3)*(z1-z3));

        /*if((a+b<=c)||(a+c<=b)||(b+c<=a)){
            System.out.println("Такого треугольника не существует");
        }
        else{*/

            double p=(a+b+c)/2.0;
            double square=Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("Площадь треугольника: " + square);
    }

}
