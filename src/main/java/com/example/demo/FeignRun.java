package com.example.demo;

import com.example.demo.models.Attachment;
import com.example.demo.models.Match;
import com.example.demo.models.Student;
import feign.Request;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FeignRun implements CommandLineRunner {

    private final FeignClient feignClient;

    public FeignRun(FeignClient feignClient) {
        this.feignClient = feignClient;
    }

    @Override
    public void run(String... args) throws Exception {

        // Registering a student - ID = 37
        Student reg = feignClient.registerStudent(new Student("94057", "Abdiaziz"));
        System.out.println("Created the following: " + reg);

        // Request match
        Match request = feignClient.createMatch(37L,"MALE");
        System.out.println(request);

        //Reject date
        Attachment patchAttachment = feignClient.patchAttachment(60L);

    }
}
