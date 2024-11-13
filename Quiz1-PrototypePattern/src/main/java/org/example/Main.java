package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> chapters = new ArrayList<>();
        chapters.add("Chapter 1");
        chapters.add("Chapter 2");

        BookShallowCopy originalBook = new BookShallowCopy("Original Book", "Author A", chapters);
        BookShallowCopy clonedBook = (BookShallowCopy) originalBook.clone();

        originalBook.getChapters().set(0, "Modified Chapter 1");

        System.out.println("Original Book chapters: " + originalBook.getChapters());
        System.out.println("Cloned Book chapters: " + clonedBook.getChapters()+"\n");



        List<String> chapters2 = new ArrayList<>();
        chapters2.add("Chapter 1");
        chapters2.add("Chapter 2");

        BookDeepCopy originalBook2 = new BookDeepCopy("Original Book", "Author B", chapters2);
        BookDeepCopy deepClonedBook = (BookDeepCopy) originalBook2.clone();

        originalBook.getChapters().set(0, "Modified Chapter 1");

        System.out.println("Original Book chapters: " + originalBook.getChapters());
        System.out.println("Cloned Book chapters: " + deepClonedBook.getChapters());
    }
}