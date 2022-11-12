package domain;

import application.OrderWork;
import application.work;

import java.util.Arrays;

public enum Comaand {

    ORDER("o", "주문", new OrderWork()),
    ;

    private final String shor;
    private final String description;
    private final work work;


    public String getShor() {
        return shor;
    }

    public String getDescription() {
        return description;
    }

    public application.work getWork() {
        return work;
    }

    Comaand(String shor, String description, work work) {
        this.shor = shor;
        this.description = description;
        this.work = work;
    }

    public static String getCommand(String command) {
        return Arrays.stream(values())
                .filter(e -> e.getShor().equals(command))
                .findFirst()
                .map(e -> e.name())
                .orElseThrow(() -> new IllegalArgumentException("123123"));
    }

}
