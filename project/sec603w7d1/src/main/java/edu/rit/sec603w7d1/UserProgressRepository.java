package edu.rit.sec603w7d1;

import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class UserProgressRepository {
    private Map<String, UserProgress> progressMap = new HashMap<>();

    // Initialize with a minimal default user progress
    public UserProgressRepository() {
        UserProgress defaultProgress = new UserProgress("user1");
        defaultProgress.setTotalPoints(0);
        defaultProgress.setArticlesCompleted(0);
        defaultProgress.setTotalLearningTimeSeconds(0);
        progressMap.put("user1", defaultProgress);
    }

    // Save or update user progress
    public UserProgress save(UserProgress progress) {
        progressMap.put(progress.getUserId(), progress);
        return progress;
    }

    // Find user progress by userId
    public Optional<UserProgress> findByUserId(String userId) {
        return Optional.ofNullable(progressMap.get(userId));
    }
}