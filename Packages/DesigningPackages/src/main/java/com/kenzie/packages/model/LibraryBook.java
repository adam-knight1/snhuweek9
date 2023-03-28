package com.kenzie.packages.model;

/*
Properties
 * `String isbn`
 * `String subjectList`

Constructors
* `LibraryBook()`
* `LibraryBook(String title, String author)`

Methods
* a public `setBookInfo()` method
    * Acts like a setter
    * It will take in a responseString
    * Assign values to all relevant properties.
* override the `toString()` method
* public getter/setter methods for all the properties


The Response String Format
title|author|isbn|[subject]

ex -
The Art of War|Sun Tzu|9781780282992|[Military art and science, early works to 1800]
 */


public class LibraryBook extends Book {

private String isbn = "";
private String subjectList = "";

public LibraryBook() {
    this.isbn = "";
    this.subjectList = "";
}
public LibraryBook(String title, String author) {
    this.title = title;
    this.author = author;

}

    @Override
    public String toString() {
    //LibraryBook{title='The Art of War', author='Sun Tzu', isbn='9781780282992', subjectList=[Military art and science,  early works to 1800]}
    String newString = "LibraryBook{title='" + this.title + "', author='" + this.author + "', isbn='" + this.isbn + "', subjectList='" + this.subjectList + "'}";


        return newString;
    }

    @Override
    public void setBookInfo(String responseString) {
    String[] bookInfo = responseString.split("\\|");
    this.title = bookInfo[0];
    this.author = bookInfo[1];
    this.isbn = bookInfo[2];
    this.subjectList = bookInfo[3];
        }


    //title|author|isbn|[subject]






    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(String subjectList) {
        this.subjectList = subjectList;
    }


}








