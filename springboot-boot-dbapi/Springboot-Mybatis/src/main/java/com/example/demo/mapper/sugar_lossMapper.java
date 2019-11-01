package com.example.demo.mapper;

import com.example.demo.entity.sugar_loss;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface sugar_lossMapper {

    public  List<sugar_loss> Listsugar_loss();


}