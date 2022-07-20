package ru.job4j.di;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.req(Store.class);
        context.req(ConsoleInput.class);
        context.req(StartUI.class);
        StartUI ui = context.get(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan Ivanov");
        ui.print();
    }
}
