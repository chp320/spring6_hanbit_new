package com.training.train_0301_di;

import com.training.train_0001_common.entity.Training;
import com.training.train_0301_di.repository.JdbcTrainingRepository;
import com.training.train_0301_di.repository.TrainingRepository;
import com.training.train_0301_di.service.TrainingService;
import com.training.train_0301_di.service.TrainingServiceImpl;

import java.util.List;

public class TrainingApplication {
    public static void main(String[] args) {
        System.out.println("===== TrainingApplication (start) =====");

        // 사용되는 객체
        TrainingRepository trainingRepository = new JdbcTrainingRepository();
        // 사용하는 객체 - '외부' TrainingApplication 에서 '사용하는 객체' 에 '사용되는 객체'를 '주입' !!
        TrainingService trainingService = new TrainingServiceImpl(trainingRepository);

        // 사용하는 객체 내용을 담음
        List<Training> trainings = trainingService.findAll();
        for (Training training : trainings) {
            System.out.println(training.getTitle());
        }

        System.out.println("===== TrainingApplication (end) =====");
    }
}
