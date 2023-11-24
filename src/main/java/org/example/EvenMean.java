package org.example;

import java.util.Arrays;
import java.util.List;
public class EvenMean {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(45,33,22,
                68,12,33,45,67,88,4);
        list.stream().filter(s ->(s%2 ==0)).forEach(n -> System.out.print(n+" "));
        System.out.println();
        System.out.println("Среднее значение: "+list.stream().filter(s ->(s%2 ==0))
                .mapToDouble(a -> a).average().getAsDouble());
    }
}
