package org.example;

import java.util.List;

public class Book implements Cloneable {
    private String title;
    private String author;
    private List<String> chapters;

    public Book(String title, String author, List<String> chapters) {
        this.title = title;
        this.author = author;
        this.chapters = chapters;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getChapters() {
        return chapters;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setChapters(List<String> chapters) {
        this.chapters = chapters;
    }



    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", chapters=" + chapters +
                '}';
    }

    @Override
    public Book clone() {
        try {
            return  (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
