package com.yongwoonlim.api.designpattern;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

public class DecoratorTest {
    class Burger {
        private String burgerType;

        public Burger() {
            this.burgerType = "";
        }

        private Burger(String type) {
            this.burgerType = type;
        }

        public Burger addVeggies() {
            System.out.println("Adding vegies to the burger");
            return new Burger(this.burgerType += " Veggie");
        }

        public Burger addCheese() {
            System.out.println("Adding cheese to the burger");
            return new Burger(this.burgerType += " Cheese");
        }

        @Override
        public String toString() {
            return String.format("%s", burgerType + " burger");
        }
    }

    class BurgerShop {
        Function<Burger, Burger> decoration;

        public BurgerShop(Function<Burger, Burger> decoration) {
            this.decoration = decoration;
        }

        public Burger use(Burger burger) {
            System.out.println("Base Burger : " + burger);
            return decoration.apply(burger);
        }
    }

    @Test
    @DisplayName("데코레이터 패턴 테스트")
    void main() {
        Burger myBurger = new BurgerShop(Burger::addCheese)
                .use(new BurgerShop(Burger::addVeggies)
                        .use(new Burger()));

        System.out.println("주문한 버거: " + myBurger);
    }
}
