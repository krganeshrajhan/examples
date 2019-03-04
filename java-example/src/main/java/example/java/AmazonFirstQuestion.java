package example.java;

import java.io.*;
import java.util.*;

import static java.lang.Math.pow;

public class AmazonFirstQuestion {


    List<List<Integer>> ClosestXdestinations(int numDestinations,
                                             List<List<Integer>> allLocations,
                                             int numDeliveries)
    {
        // WRITE YOUR CODE HERE
        List<Double> distances = new ArrayList<>();
        List<List<Integer>> closestDestinations = new ArrayList<>();
        double min = -1;
        int ind = -1;
        for(List<Integer> location : allLocations) {
            double distance = calculateDistance(location);
            distances.add(distance);
        }


        int loop = 0;
        while(loop<numDeliveries) {

            for(int i=0; i<distances.size();i++) {
                if(min==-1 || distances.get(i)<min) {
                    min = distances.get(i);
                    ind = i;
                }

            }
            closestDestinations.add(allLocations.get(ind));
            distances.remove(ind);
            allLocations.remove(ind);
            min =-1;
            ind = -1;
            loop++;
        }


        return closestDestinations;

    }

    private double calculateDistance(List<Integer> location) {
        double value = pow(location.get(0),2) + pow(location.get(1), 2);

        return Math.sqrt(value);
    }

    public static void main(String[] args) throws IOException {

        AmazonFirstQuestion s = new AmazonFirstQuestion();
        List<List<Integer>> list = new ArrayList<>();
        /*list.add(Arrays.asList(new Integer[]{1,2}));
        list.add(Arrays.asList(new Integer[]{3,4}));
        list.add(Arrays.asList(new Integer[]{1,-1}));
        s.ClosestXdestinations(3, list, 2);*/

        list.add(Arrays.asList(new Integer[]{3,6}));
        list.add(Arrays.asList(new Integer[]{2,4}));
        list.add(Arrays.asList(new Integer[]{5,3}));
        list.add(Arrays.asList(new Integer[]{2,7}));
        list.add(Arrays.asList(new Integer[]{1,8}));
        list.add(Arrays.asList(new Integer[]{7,9}));
        s.ClosestXdestinations(6, list, 3);

    }
}