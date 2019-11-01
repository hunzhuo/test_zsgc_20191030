package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.sugar_loss;
import com.example.demo.mapper.sugar_lossMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class sugar_lossService {

    @Autowired
    private sugar_lossMapper sugar_lossMapper;

    public  List<sugar_loss> Listsugar_loss(){
        return	sugar_lossMapper.Listsugar_loss();
    }
}
