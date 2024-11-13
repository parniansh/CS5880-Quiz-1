package org.example;

import java.util.ArrayList;
import java.util.List;

class BookDeepCopy extends Book {
    public BookDeepCopy(String title, String author, List<String> chapters) {
        super(title, author, chapters);
    }

    @Override
    public Book clone() {
        List<String> clonedChapters = new ArrayList<>(getChapters());
        return new BookDeepCopy(getTitle(), getAuthor(), clonedChapters);
    }
}
