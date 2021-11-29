package com.example.demo.test;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class AnArrayOf {

    public static void main(String[] args) {
//        String[] a = new String[]{};
//        TestA testA = new TestA();
//        String aName = testA.getAName();
//        System.out.println(aName);
        Test test = new Test();

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add("a");
        set1.add("b");
        set1.add("c");

        set2.add("c");
        set2.add("d");
        set2.add("e");

        set1.retainAll(set2);
        System.out.printf("交集是："+ set1);
        ReentrantLock reentrantLock = new ReentrantLock();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

    }
}
