package com.ljh.study.pattern.observer;

import com.google.common.eventbus.Subscribe;

/**
 * @description: 观察者模式-接收问题者B
 * @author: Jh Lee
 * @create: 2019-03-19 21:25
 **/
public class AnswererB {

    @Subscribe
    public void answaerer(String q){
        System.out.println("我是消息接受者B，收到消息："+q);
    }
}
