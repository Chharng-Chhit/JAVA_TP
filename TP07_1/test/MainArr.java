package TP07_1.test;

import java.util.Arrays;

public class MainArr {
    public static void main(String[] args) {
        int[] ages = {18, 20,35, 19, 15};
        double[] scores = new double[]{2.3, 50.5, 70.8, 88.8, 99,9};
        Group p = new Group("I3", null);
        Group[] groups = new Group[4];
        groups[0] = p;
        groups[1] = new Group("I3A", p);
        groups[2] = new Group("I3B", p);
        groups[3] = new Group("I3C", p);
        System.out.println(Arrays.toString(ages));
        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(groups));

    }
}
class Group{
    String name;
    Group parent;
    public Group(String name, Group parent){
        this.name = name;
        this.parent = parent;
    }
    @Override
    public String toString(){
        return String.format("%s%s",name, parent==null?"":"(in "+parent+")");
    }
}
