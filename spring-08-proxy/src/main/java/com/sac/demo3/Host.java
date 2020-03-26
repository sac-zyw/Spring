package com.sac.demo3;
/**
 * @author ShiAC
 * @date 2020/3/26
 */
//房东
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房屋出租");
    }
}
