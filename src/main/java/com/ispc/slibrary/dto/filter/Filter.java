/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ispc.slibrary.dto.filter;

/**
 *
 * @author edgar
 */
public class Filter {

    private int pages;
    private int rows;
    private int current;

    public Filter() {
    }

    public Filter(int pages, int rows, int current) {
        this.pages = pages;
        this.rows = rows;
        this.current = current;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

}
