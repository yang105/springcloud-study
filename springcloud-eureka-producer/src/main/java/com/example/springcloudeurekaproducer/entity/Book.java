package com.example.springcloudeurekaproducer.entity;

/**
 * Copyright (C), 2010-2020, 广州广电运通智能科技有限公司
 * FileName:     Book
 * Author:       zyang
 * Date:         2020/4/29 17:30
 * Description:  书籍实体类
 * History:
 * <author>      <time>          <version>          <desc>
 * 作者姓名       修改时间         版本号             描述
 */

public class Book {
    private String name;
    private String author;
    private Integer price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
