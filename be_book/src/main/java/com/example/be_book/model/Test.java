package com.example.be_book.model;

import java.io.IOException;
    class X {
        public void printFileContent() throws IOException {
            /* code goes here */
            throw new IOException();
        }
    }
    public class Test {
        public static void main(String[] args) throws IOException {
            X xObj = new X();
            xObj.printFileContent();
        }
    }

