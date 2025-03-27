package edu.rit.sec603w7d1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserProgressService {

    @Autowired
    private UserProgressRepository progressRepository;

    // Get user progress by userId
    public UserProgress getUserProgress(String userId) {
        return progressRepository.findByUserId(userId)
                .orElse(new UserProgress(userId));
    }

    // Update user progress after completing an article
    public UserProgress completeArticle(String userId, int pointsEarned, long learningTimeSeconds) {
        UserProgress progress = getUserProgress(userId);
        progress.incrementArticlesCompleted();
        progress.addPoints(pointsEarned);
        progress.addLearningTime(learningTimeSeconds);
        return progressRepository.save(progress);
    }

    // Get total learning time in hours
    public double getTotalLearningTimeHours(String userId) {
        UserProgress progress = getUserProgress(userId);
        return progress.getTotalLearningTimeSeconds() / 3600.0;
    }
}