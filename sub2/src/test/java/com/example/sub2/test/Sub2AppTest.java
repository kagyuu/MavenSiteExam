package com.example.sub2.test;

import com.example.sub2.Sub2App;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Sub2App
 * @author hondou.atsushi
 */
public class Sub2AppTest {
    public void testSub() {
        Sub2App target = new Sub2App();
        assertThat(target.sub(1,2), is(equalTo(-1)));
    }    
}
