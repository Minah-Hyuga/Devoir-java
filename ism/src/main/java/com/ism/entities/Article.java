package com.ism.entities;

import lombok.Data;

@Data
public class Article {
    private String ref;
    private String libelle;
    private int prix;
    private String quantiteArticle;
}
