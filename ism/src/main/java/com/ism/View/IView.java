package com.ism.View;

import java.util.List;

public interface IView<T> {

    T saisie();

    void afficher(List<T> liste);
}
