package Pemrograman2Tugas.Tugas3;

import java.util.ArrayList;
import java.util.List;

class TextStore {
    private final List<String> texts = new ArrayList<>();

    void add(String text) {
        texts.add(text);
    }

    List<String> getAll() {
        return new ArrayList<>(texts);
    }
}