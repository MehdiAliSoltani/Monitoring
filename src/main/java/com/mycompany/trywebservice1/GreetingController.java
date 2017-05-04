/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trywebservice1;

/**
 *
 * @author mehdi
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController

public class GreetingController {
/*
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    String name;

    @PostConstruct
    public void initialize() {
        //do your stuff
            this.name = "MMMMOOOOOAAAAAAAAAJJJ@@@@@######";
            System.out.println("*****************************************************");
    }


    @RequestMapping("/")

//    public Greeting hello(@RequestParam(value = "name", defaultValue = "World.....") String name) {
    public Greeting hello(@RequestParam(value = "name", defaultValue = "World.....") String name) {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(this.name);
        return new Greeting(counter.incrementAndGet(),
                String.format(template, this.name));
    }

    @RequestMapping(Constants.ROOTLINK)

    public Greeting greeting(@RequestParam(value = "name", required = false) String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping(value = "/hand", method = RequestMethod.POST)

    public List<Greeting> myhand(@RequestParam(value = "name", defaultValue = "ali") String name, @RequestParam(value = "lastname", defaultValue = "ali soltani") String lastname) {

        List<Greeting> gree = new ArrayList<Greeting>();
        gree.add(new Greeting(counter.incrementAndGet(), name + lastname));
        gree.add(new Greeting(counter.incrementAndGet(), name + lastname));

//        return new Greeting(counter.incrementAndGet(), name + lastname);
        return gree;
    }
*/
}
