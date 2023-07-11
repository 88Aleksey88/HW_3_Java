package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static java.lang.reflect.Array.get;

/*
Задание
Пусть дан произвольный список целых чисел.
1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение

* */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 5, 6, 11, 3, 15, 7, 8, 3);
        //task1(list);
        //task2(list);
        //task3(list);
        //task4(list);
    }
    static void task1 (List<Integer> list){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            int i = (Integer) o;
            if (i%2 == 0){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
    static void task2(List<Integer>list){
        Collections.sort(list);
        System.out.println(list.get(0));
    }
    static void task3(List<Integer>list) {
        Collections.sort(list);
        System.out.println(list.get(list.size() - 1));
    }
    static void task4(List<Integer> list){
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        double aver = sum/(list.size());
        System.out.println(aver);
    }
}