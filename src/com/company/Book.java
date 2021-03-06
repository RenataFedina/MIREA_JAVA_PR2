package com.company;

public class Book {
    private String author, name, publisher;
    private int year, page;
    public String getAuthor()
    {
        return author;
    }
    public void  setAuthor(String author)
    {
        this.author = author;
    }

    public String getName()
    {
        return name;
    }
    public void  setName(String name)
    {
        this.name = name;
    }

    public String getPublisher()
    {
        return publisher;
    }
    public void  setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public int getYear()
    {
        return year;
    }
    public void  setYear(int year)
    {
        this.year = year;
    }

    public int getPage()
    {
        return page;
    }
    public void  setPage(int page)
    {
        this.page = page;
    }

    public String toString()
    {
        return "Book{"
                + "author='" + author + '\''
                + ", name=" + name
                + ", publisher=" + publisher
                + ", year=" + year
                + ", page=" + page
                + '}';

    }
}
