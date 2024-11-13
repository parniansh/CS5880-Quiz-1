package org.example;

import java.util.List;

class BookShallowCopy extends Book {
    public BookShallowCopy(String title, String author, List<String> chapters) {
        super(title, author, chapters);
    }

    @Override
    public Book clone() {
        return new BookShallowCopy(getTitle(), getAuthor(), getChapters());
    }
}

