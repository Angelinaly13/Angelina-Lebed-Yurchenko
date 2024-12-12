package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class HowToSortTest {

    private HowToSort howToSort;

    @BeforeEach
    void setUp() {
        howToSort = new HowToSort(100); // Устанавливаем лимит длины списка для проверки.
    }

    @Test
    void testMergeSortWithRandomData() {
        Random random = new Random();
        List<Integer> randomList = new ArrayList<>();
        int size = random.nextInt(50) + 1; // Случайный размер списка от 1 до 50.

        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(1000)); // Добавляем случайные числа от 0 до 999.
        }

        List<Integer> expectedList = new ArrayList<>(randomList);
        Collections.sort(expectedList); // Ожидаемый результат.

        assertEquals(expectedList, howToSort.mergeSort(randomList));
    }

    @Test
    void testBubbleSortWithRandomData() {
        Random random = new Random();
        List<Integer> randomList = new ArrayList<>();
        int size = random.nextInt(50) + 1; // Случайный размер списка от 1 до 50.

        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(1000)); // Добавляем случайные числа от 0 до 999.
        }

        List<Integer> expectedList = new ArrayList<>(randomList);
        Collections.sort(expectedList); // Ожидаемый результат.

        assertEquals(expectedList, howToSort.bubbleSort(randomList));
    }

    @Test
    void testCheckLengthWithRandomData() {
        Random random = new Random();
        List<Integer> randomList = new ArrayList<>();
        int size = random.nextInt(100); // Случайный размер списка от 0 до 99.

        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(1000)); // Добавляем случайные числа от 0 до 999.
        }

        if (size > howToSort.limit_for_length) {
            assertThrows(RuntimeException.class, () -> howToSort.CheckLength(randomList));
        } else {
            assertDoesNotThrow(() -> howToSort.CheckLength(randomList));
        }
    }

    @Test
    void testMyAddWithRandomData() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        int element = random.nextInt(1000); // Случайный элемент.

        howToSort.my_add(list, element);
        assertEquals(1, list.size());
        assertEquals(element, list.get(0));
    }

    @Test
    void testMyGetWithRandomData() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        int size = random.nextInt(50) + 1; // Случайный размер списка от 1 до 50.

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(1000)); // Добавляем случайные числа от 0 до 999.
        }

        int index = random.nextInt(size); // Случайный индекс в пределах размера списка.
        assertEquals(list.get(index), howToSort.my_get(list, index));
    }
}
