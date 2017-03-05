package com.example.sub1.test;

import com.example.sub1.Sub1App;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Sub1AppTest
 * @author hondou.atsushi
 */
public class Sub1AppTest {
    
    public void testAdd() {
        Sub1App target = new Sub1App();
        assertThat(target.add(1,2), is(equalTo(3)));
    }
}
