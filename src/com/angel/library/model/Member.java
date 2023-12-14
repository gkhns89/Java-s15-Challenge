package com.angel.library.model;

import com.angel.library.enums.GenderType;
import com.angel.library.enums.MemberCategories;
import com.angel.library.interfaces.MemberControl;

import java.util.List;

public class Member extends Person implements MemberControl
{
    private List <Book> books;
    private int bookAmount;
    private MemberCategories memberCategories;

    public Member(String id, String name, String surname, GenderType genderType, List<Book> books, int bookAmount, MemberCategories memberCategories) {

        super(id, name, surname, genderType);
        this.books = books;
        this.bookAmount = bookAmount;
        this.memberCategories = memberCategories;
    }

    public List<Book> getBooks() {
        return books;
    }

    public int getBookAmount() {
        return bookAmount;
    }

    public MemberCategories getMemberCategories() {
        return memberCategories;
    }

    private boolean checkBookAmount(List<Book> books,MemberCategories  memberCategories ){

        //TODO: check book amount function

        return true;
    }


    @Override
    public MemberCategories memberCheck() {
        //TODO: member check function!
        return null;
    }
}
