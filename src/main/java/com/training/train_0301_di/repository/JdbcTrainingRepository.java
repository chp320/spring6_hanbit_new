package com.training.train_0301_di.repository;

import com.training.train_0001_common.entity.Training;

import java.util.ArrayList;
import java.util.List;

public class JdbcTrainingRepository implements TrainingRepository {
    @Override
    public List<Training> selectAll() {
        System.out.println("[JdbcTrainingRepository] 데이터베이스에서 데이터를 가져옵니다.");

        List<Training> trainings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Training training = new Training();
            training.setTitle("title_" + i);
            trainings.add(training);
        }

        return trainings;
    }
}
