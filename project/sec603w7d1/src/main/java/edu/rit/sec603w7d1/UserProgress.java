package edu.rit.sec603w7d1;

public class UserProgress {
    private Long id;
    private String userId; // Unique identifier for the user
    private int totalPoints;
    private int articlesCompleted;
    private long totalLearningTimeSeconds;

    // Constructors
    public UserProgress() {}

    public UserProgress(String userId) {
        this.userId = userId;
        this.totalPoints = 0;
        this.articlesCompleted = 0;
        this.totalLearningTimeSeconds = 0;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getArticlesCompleted() {
        return articlesCompleted;
    }

    public void setArticlesCompleted(int articlesCompleted) {
        this.articlesCompleted = articlesCompleted;
    }

    public long getTotalLearningTimeSeconds() {
        return totalLearningTimeSeconds;
    }

    public void setTotalLearningTimeSeconds(long totalLearningTimeSeconds) {
        this.totalLearningTimeSeconds = totalLearningTimeSeconds;
    }

    // Utility methods to update progress
    public void addPoints(int points) {
        this.totalPoints += points;
    }

    public void incrementArticlesCompleted() {
        this.articlesCompleted++;
    }

    public void addLearningTime(long seconds) {
        this.totalLearningTimeSeconds += seconds;
    }
}