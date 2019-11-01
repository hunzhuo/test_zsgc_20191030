package com.example.demo.controller;



import com.example.demo.entity.sugar_loss;
import com.example.demo.service.sugar_lossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api", method = { RequestMethod.GET, RequestMethod.POST })
public class sugar_lossController {

    @RequestMapping("/sugar")
    @ResponseBody
    public List<sugar_loss> Listsugar_loss(){
        return sugar_lossService.Listsugar_loss ();

    }

    @Autowired
    private sugar_lossService sugar_lossService;
}
