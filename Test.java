/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Praktikum;

/**
 *
 * @author LENOVO
 */
public class Test {
    public static void main(String[] args) {
        Rect x = new Rect();
        Rect y = new Rect(3,3);
        y.move(1,1);
        int x1 = y.x1;
        int x2 = y.x2;
        int y1 = y.y1;
        int y2 = y.y2;
        
        System.out.println("Awal (" +x1+ "," +y1+ "," +y2+ ")");
        Rect main = new Rect(x1, y1, x2, y2);
        System.out.println("<2,3> inside the union = " +main.isInside(2,3));
        Rect last = new Rect(2, 3, 5, 6);
        x = main.union(last);
        
        int a = x.x1;
        int b = x.x2;
        int c = y.y1;
        int d = y.y2;
        
        System.out.println("(1,1,4,4) Union (2,3,5,6 = (" +a+ "," +c+ "," +d+ ")");
        x = main.intersection(last);
        
        int e = x.x1;
        int f = x.x2;
        int g = x.y1;
        int h = x.y2;
        
        System.out.println("(1,1,4,4) Union (2,3,5,6) = (" +e+ "," +f+ "," +g+ "," +h+ ")");
        
    }
}
