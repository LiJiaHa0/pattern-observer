package com.ljh.study.pattern.observer;

import com.google.common.eventbus.EventBus;

/**
 * @description: guava测试
 * @author: Jh Lee
 * @create: 2019-03-19 21:22
 **/
public class GuavaTest {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register( new AnswererA());
        eventBus.register(new AnswererB());
        eventBus.post("观察者模式是什么意思？");
    }
}
