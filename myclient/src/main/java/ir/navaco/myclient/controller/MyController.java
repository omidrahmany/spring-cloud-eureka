package ir.navaco.myclient.controller;


import ir.navaco.myclient.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class MyController {

    @GetMapping("/platform")
    public Person getNewPerson() {
        return new Person("omid", "rahmani", 30);
    }

}




