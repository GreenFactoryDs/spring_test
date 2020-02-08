package com.chuno.test.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;

@RestController
public class usecaseController {
    @Autowired usecaseReporitory usecaseReporitory;

    @PostMapping("/post/usecase")
    public Optional<usecase> lostItem(){
        int numbers=1;
        return usecaseReporitory.findById((long) numbers);
    }

    @PostMapping("/post/founcase")
    public void foundItem(@RequestBody usecaseDTO param){

         usecaseReporitory.save(param.toEntity());
    }

}
