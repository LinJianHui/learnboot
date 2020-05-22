package com.learn.linjianhui.learnboot.controller;

import com.learn.linjianhui.learnboot.model.GreetingModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by linjianhui on 2020/5/22.
 */
@RestController
public class GreetingController {
    private AtomicLong counter = new AtomicLong();
    @RequestMapping("/greeting")
    public GreetingModel greeting(@RequestParam(name = "name") String name) {
        return new GreetingModel(counter.incrementAndGet(),name);
    }
}
