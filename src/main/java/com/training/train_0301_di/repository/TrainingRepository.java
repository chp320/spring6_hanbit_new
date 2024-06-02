package com.training.train_0301_di.repository;

import com.training.train_0001_common.entity.Training;

import java.util.List;

public interface TrainingRepository {

    List<Training> selectAll();
}
