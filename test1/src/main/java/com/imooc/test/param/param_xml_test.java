package com.imooc.test.param;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class param_test {

    @Test
    @Parameters({"name","age"})   //进行参数化
    public void test01(String name, int age){
        System.out.println("c");    //换行（发现用xml执行第一行跟前缀老连在一起，所以加入换行命令）
        System.out.println("name=" + name + ";age=" + age);
    }
}
