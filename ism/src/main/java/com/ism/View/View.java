package com.ism.View;

import java.util.List;
import java.util.Scanner;

public abstract class View<T> implements IView<T> {
    protected static Scanner scanner;

    public static void setScanner(Scanner scanner) {
        View.scanner = scanner;
    }

    @Override
    public void afficher(List<T> liste) {
        liste.forEach(System.out::println);
    }
}
