package com.timepass.faltu;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController

public class studentController {
    Map<Integer,student> db = new HashMap<>();

    @GetMapping("/get_info_new")
    public student getStudent(@RequestParam("id") int admnNo){
        return db.get(admnNo);
    }

    @PostMapping("/added")
    public String addStudent(@RequestBody() student student){
        db.put(student.getAdmnNo(), student);
        return "Student has been addad succesfully ";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") int admnNo){
        db.remove(admnNo);
        return "succesfully deleted";
    }

    

}
