package com.ljh.study.pattern.observer;

import com.google.common.eventbus.Subscribe;

/**
 * @description: 观察者模式-回答者A
 * @author: Jh Lee
 * @create: 2019-03-19 21:18
 **/
public class AnswererA {

    @Subscribe
    public void answaerer(String q){
        System.out.println("我是消息接受者A，收到消息："+q);
    }
}
