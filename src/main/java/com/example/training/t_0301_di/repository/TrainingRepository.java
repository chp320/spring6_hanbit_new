package com.example.training.t_0301_di.repository;

import com.example.training.t_0001_common.entity.Training;

import java.util.List;

public interface TrainingRepository {

    List<Training> selectAll();
}
