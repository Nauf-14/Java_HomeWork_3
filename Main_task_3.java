// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке. Collections.frequency(list, item)
package Java_HomeWork_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main_task_3 {
    public static void main(String[] args) {
        ArrayList<String> planetList = new ArrayList<>();
        planetList.add("Меркурий");
        planetList.add("Венера");
        planetList.add("Земля");
        planetList.add("Марс");
        planetList.add("Юпитер");
        planetList.add("Сатурн");
        planetList.add("Уран");
        planetList.add("Нептун");
        planetList.add("Плутон");
        planetList.add("Земля");
        planetList.add("Марс");
        planetList.add("Юпитер");
        planetList.add("Земля");

        HashSet<String> uniquePlanets = new HashSet<>(planetList);

        // Выводим название каждой планеты и количество повторений
        for (String planet : uniquePlanets) {
            int frequency = Collections.frequency(planetList, planet);
            System.out.println("Планета: " + planet + ", Количество повторений: " + frequency);
        }
    }
    
}
