/*
* Copyright (c) 2014 Qunar.com. All Rights Reserved.
*/
package com.lxz.test.netty;

import com.google.common.base.Optional;
import org.apache.commons.lang3.StringUtils;

/**
 * @author: xiaole  Date: 15-8-13 Time: 下午12:07
 * @version: \$Id$
 */
public class Test {
    public static void main(String[] args){
        String userId = "xiang.tong@quar";

        System.out.println(StringUtils.substringBeforeLast(userId, "@"));


        Optional<Integer> o1 = Optional.absent();
        Optional<Integer> o2 = Optional.of(new Integer(2));

        System.out.println(o2.get());
        if(o1.isPresent()) {
            System.out.println(o1.get());
        } else {
            System.out.println("is null");
        }
    }
}