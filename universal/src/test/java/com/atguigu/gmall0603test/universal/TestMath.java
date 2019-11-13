package com.atguigu.gmall0603test.universal;

import org.junit.Test;

public class TestMath {
    @Test
    public void testMath(){
        System.out.println(Math.round(11.5)); //round 大约 表示四舍五入 往大数方向入
        System.out.println(Math.round(-11.5));
        System.out.println("-------------------------");
        double d1 = -0.5;
        System.out.println(Math.ceil(d1)); //大于等于d1 向上取整 返回不小于他的最大整数
        System.out.println(Math.floor(d1)); //小于等于d1 向下取整 不大于他的最大整数
    }
}
