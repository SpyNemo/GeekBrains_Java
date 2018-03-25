package ru.geekbrains.java2.lesson1;

public enum AppState {
    INIT(5), PREPARE(5), WORK(5), SAVE(10), TERMINATE(0);

    private int priority;

    public int getPriority() {
        return priority;
    }

    AppState(int priority) {
        this.priority = priority;
    }
}
