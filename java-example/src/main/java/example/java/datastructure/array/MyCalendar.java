package example.java.datastructure.array;

import java.util.*;

public class MyCalendar {

    List<Integer[]> set = new ArrayList<>();

    public MyCalendar() {
    }

    public boolean book(int start, int end) {

        if(slotsAvailable(start,end)) {
            set.add(new Integer[]{start,end});
            return true;
        } else {
            return false;
        }
    }

    public boolean slotsAvailable(int start, int end) {
        for(Integer[] l : set) {
            if(l[0] < end && start < l[1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        MyCalendar myCalendar = new MyCalendar();
        myCalendar.book(10,20);
        myCalendar.book(15,25);
        myCalendar.book(20,30);
//        myCalendar.book();
        /*myCalendar.book(97,100);
        myCalendar.book(33,51);
        myCalendar.book(89,100);
        myCalendar.book(83,100);
        myCalendar.book(75,92);
        myCalendar.book(76,95);
        myCalendar.book(19,30);
        myCalendar.book(53,63);
        myCalendar.book(8,23);
        myCalendar.book(18,37);
        myCalendar.book(87,100);
        myCalendar.book(83,100);
        myCalendar.book(54,67);
        myCalendar.book(35,48);
        myCalendar.book(58,75);
        myCalendar.book(70,89);
        myCalendar.book(13,32);
        myCalendar.book(44,63);
        myCalendar.book(51,62);
        myCalendar.book(2,15);*/

    }
}
