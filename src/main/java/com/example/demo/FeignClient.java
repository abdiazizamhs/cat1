package com.example.demo;

import com.example.demo.models.Attachment;
import com.example.demo.models.Match;
import com.example.demo.models.Student;
import org.springframework.web.bind.annotation.*;

@org.springframework.cloud.openfeign.FeignClient(name = "client", url = "http://10.51.10.111:2200",configuration = FeignConfig.class)
public interface FeignClient {

    //Register Student
    @RequestMapping(method = RequestMethod.POST, value = "students")
    Student registerStudent(@RequestBody Student student);

    @RequestMapping(method = RequestMethod.POST, value= "matches")
    Match createMatch(@RequestParam(name = "studentId") Long studentId,  @RequestParam(name = "gender") String gender);

    @RequestMapping(method = RequestMethod.DELETE, value= "matches")
    Attachment patchAttachment(@RequestParam(name = "studentId") Long studentId);

}
