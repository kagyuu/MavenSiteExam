package com.example.sub1;

import com.example.sub2.Sub2App;

/**
 * Sub1App
 * @author hondou.atsushi
 */
public class Sub1App {
    public int add(int x, int y) {
        return x + y;
    }
    public int multi(int x, int y) {
        return x * y;
    }
    public int sub(int x, int y) {
        Sub2App s2 = new Sub2App();
        return s2.sub(x, y);
    }
}
