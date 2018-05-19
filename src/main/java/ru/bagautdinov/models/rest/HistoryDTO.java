package ru.bagautdinov.models.rest;

import java.util.List;

public class HistoryDTO {

    private List<Double> history;

    public List<Double> getHistory() {
        return history;
    }

    public void setHistory(List<Double> history) {
        this.history = history;
    }

}
