// Пусть дан произвольный список целых чисел, удалить из него четные числа
package Java_HomeWork_3;

import java.util.ArrayList;
import java.util.List;

public class Main_task_1 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        System.out.println("Исходный список чисел: " + numbers);

        
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--; 
            }
        }

        System.out.println("Список чисел после удаления четных чисел: " + numbers);
    }
}




