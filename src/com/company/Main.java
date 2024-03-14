package com.company;

import java.util.Arrays;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Collection list = Arrays.asList("a1", "a2", "a3", "a1");
        list.stream().forEach(System.out::print);
        System.out.println("\nпроверка на вхождение a8");
        boolean any = list.stream().anyMatch(s->s=="a1");
        System.out.println(any);
        System.out.println("проверка наличие символа 1 у всех членов коллекции сп1");
        boolean all = list.stream().allMatch(s->s.toString().contains("a"));
        System.out.println(all);
        System.out.println("проверка наличие символа 1 у всех членов коллекции сп2");
        boolean all_2 = list.stream().allMatch(s->s.toString().indexOf("b")!=-1);
        System.out.println(all_2);
        System.out.println("проверка отсутствия элемента а7 в коллекции");
        boolean none = list.stream().noneMatch(s->s=="a1");
        System.out.println(none);





    }
}
