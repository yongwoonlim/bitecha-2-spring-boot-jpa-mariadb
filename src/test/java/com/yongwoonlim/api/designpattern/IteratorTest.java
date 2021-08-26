package com.yongwoonlim.api.designpattern;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

public class IteratorTest {
    class MyArrayList {
        Object[] elements = new Object[5];

        MyArrayList(Object[] elements) {
            this.elements = elements;
        }

        void forEach(Consumer<Object> action) {
            for (Object element : elements) {
                action.accept(element);
            }
        }
    }

    @Test
    @DisplayName("이터레이터 패턴 테스트")
    void main() {
        MyArrayList list = new MyArrayList(new Object[]{1, 3, 5, 6, 7, 8});
        list.forEach(System.out::println);
    }
}
