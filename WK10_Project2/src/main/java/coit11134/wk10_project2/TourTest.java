/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package coit11134.wk10_project2;

/**
 *
 * @author Blake Cox (12282557)
 */
public class TourTest {
    public static void main(String[] args) throws Exception {
        //Create Tour instances of generic class
        Tour<Integer> tour1 = new Tour<>("Sydney", 250);
        Tour<Double> tour2 = new Tour<>("National Parks", 110.75);
        //Print Tour instances to console
        System.out.println(tour1);
        System.out.println(tour2);
    }
}
