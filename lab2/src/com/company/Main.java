package com.company;
import com.company.point2d;
import com.company.point3d;
import java.util.Scanner;
public class Main {

    public static double inpX(){
        Scanner in=new Scanner(System.in);
        double num=in.nextDouble();
        return num;
    }
    public static double inpY(){
        Scanner in=new Scanner(System.in);
        double num=in.nextDouble();
        return num;
    }
    public static double inpZ(){
        Scanner in=new Scanner(System.in);
        double num=in.nextDouble();
        return num;
    }
    public static void main(String[] args) {
        System.out.println("Задание для двух точек");
        System.out.println("Введите координаты первой точки: ");
        point2d p1= new point2d(inpX(),inpY());
        System.out.println("Координаты точки p1: " + p1);
        System.out.println("Введите координаты второй точки: ");
        point2d p2= new point2d(inpX(),inpY());
        System.out.println("Координаты точки p2: " + p2);
        if ((p1.getX()==p2.getX())&&(p1.getY()==p2.getY())) {
            System.out.println("Координаты точек p1 и p2 совпадают. Введите другие значения");
        }
        else {
            System.out.println("Расстояние между точкой p1 и p2: " + p1.distance(p2));
            System.out.println("Расстояние между точкой p1 и началом координат: " + p1.distance());
            System.out.println("Расстояние между точкой p2 и началом координат: " + p2.distance());
        }

        System.out.println("Задание для трех точек");
        System.out.println("Введите координаты первой точки: ");
        point3d p3= new point3d(inpX(),inpY(),inpZ());
        System.out.println("Координаты точки p3: " + p3);
        System.out.println("Введите координаты второй точки: ");
        point3d p4= new point3d(inpX(),inpY(),inpZ());
        System.out.println("Координаты точки p4: " + p4);
        System.out.println("Введите координаты третьей точки: ");
        point3d p5= new point3d(inpX(),inpY(),inpZ());
        System.out.println("Координаты точки p5: " + p5);

        if ((p3.getX()==p4.getX())&&(p3.getY()==p4.getY())&&(p3.getZ()==p4.getZ())) {
            System.out.println("Координаты точек p3 и p4 совпадают. Введите другие значения");
        }
        else
        if ((p4.getX()==p5.getX())&&(p4.getY()==p5.getY())&&(p4.getZ()==p5.getZ())) {
            System.out.println("Координаты точек p3 и p5 совпадают. Введите другие значения");
        }
        else
        if ((p3.getX()==p5.getX())&&(p3.getY()==p5.getY())&&(p3.getZ()==p5.getZ())) {
            System.out.println("Координаты точек p4 и p5 совпадают. Введите другие значения");
        }
        else {
            point3d.square(p3, p4, p5);
        }
    }
}