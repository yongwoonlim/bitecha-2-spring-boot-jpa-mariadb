package com.yongwoonlim.api.designpattern;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CommandTest {
    class Aircon {
        void turnOn() {
            System.out.println("에어콘 켜기");
        }

        void turnOff() {
            System.out.println("에어콘 끄기");
        }

        void increaseTemp() {
            System.out.println("온도 올리기");
        }

        void decreaseTemp() {
            System.out.println("온도 내리기");
        }
    }

    interface Command {
        void execute();
    }

    class AirconRemoteControl {
        Command command;

        void setCommand(Command command) {
            this.command = command;
        }

        void buttonPressed() {
            command.execute();
        }
    }

    @Test
    @DisplayName("커맨드 패턴 테스트")
    void commandPatternTest(){
        Aircon aircon = new Aircon();
        AirconRemoteControl control = new AirconRemoteControl();
        control.setCommand(aircon::turnOn);
        control.buttonPressed();
    }
}
