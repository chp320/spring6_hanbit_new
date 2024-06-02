package com.example.training.t_0301_di;

import com.example.training.t_0001_common.entity.Training;
import com.example.training.t_0301_di.repository.TrainingRepository;

import java.util.ArrayList;
import java.util.List;

public class MockTrainingRepository implements TrainingRepository {
    @Override
    public List<Training> selectAll() {
        System.out.println("[MockTrainingRepository] 테스트용 데이터를 메모리상에 준비합니다.");
        List<Training> trainings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Training training = new Training();
            training.setTitle("title_" + i);
            trainings.add(training);
        }
        return trainings;
    }
}
