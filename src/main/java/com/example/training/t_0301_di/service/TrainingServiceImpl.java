package com.example.training.t_0301_di.service;

import com.example.training.t_0001_common.entity.Training;
import com.example.training.t_0301_di.repository.TrainingRepository;

import java.util.List;

public class TrainingServiceImpl implements TrainingService {

    private TrainingRepository trainingRepository;

    public TrainingServiceImpl(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    @Override
    public List<Training> findAll() {
        // '사용하는 객체'로 '사용되는 객체(의존 객체)'의 selectAll() 을 호출한다.
        return trainingRepository.selectAll();
    }
}
