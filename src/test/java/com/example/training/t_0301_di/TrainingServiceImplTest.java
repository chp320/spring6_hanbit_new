package com.example.training.t_0301_di;

import com.example.training.t_0001_common.entity.Training;
import com.example.training.t_0301_di.repository.TrainingRepository;
import com.example.training.t_0301_di.service.TrainingService;
import com.example.training.t_0301_di.service.TrainingServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TrainingServiceImplTest {

    @Test
    @DisplayName("의존객체를_Mock객체로_변경하여도_의존성주입은_정상_처리된다.")
    public void test_findAll() {
        TrainingRepository trainingRepository = new MockTrainingRepository();
        TrainingService trainingService = new TrainingServiceImpl(trainingRepository);

        List<Training> trainings = trainingService.findAll();

        // 결과 확인
        assertThat(trainings.size()).isEqualTo(10);
    }
}
