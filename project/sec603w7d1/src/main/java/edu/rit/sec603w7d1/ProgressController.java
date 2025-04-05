package edu.rit.sec603w7d1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/progress")
public class ProgressController {

    @Autowired
    private UserProgressService progressService;

    // Get user progress
    @GetMapping("/{userId}")
    public ResponseEntity<UserProgress> getUserProgress(@PathVariable String userId) {
        return ResponseEntity.ok(progressService.getUserProgress(userId));
    }

    // Complete an article
    @PostMapping("/{userId}/complete-article")
    public ResponseEntity<UserProgress> completeArticle(
            @PathVariable String userId,
            @RequestParam int points,
            @RequestParam long learningTimeSeconds) {
        return ResponseEntity.ok(
                progressService.completeArticle(userId, points, learningTimeSeconds)
        );
    }
}
