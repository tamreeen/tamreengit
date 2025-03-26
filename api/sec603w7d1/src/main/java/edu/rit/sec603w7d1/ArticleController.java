package edu.rit.sec603w7d1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    // Get all articles
    @GetMapping
    public List<Article> getAllArticles() {
        return articleService.getAllArticles();
    }

    // Get article by ID
    @GetMapping("/{id}")
    public Article getArticleById(@PathVariable Long id) {
        // Find the article
        Optional<Article> article = articleService.getArticleById(id);

        // If article exists, return it
        if (article.isPresent()) {
            return article.get();
        }

        // If no article found, return null
        return null;
    }

    // Search articles by title
    @GetMapping("/search")
    public List<Article> searchArticlesByTitle(@RequestParam String title) {
        return articleService.findArticlesByTitle(title);
    }

    // Create a new article
    @PostMapping
    public Article createArticle(@RequestBody Article article) {
        return articleService.saveArticle(article);
    }

    // Update an existing article
    @PutMapping("/{id}")
    public Article updateArticle(@PathVariable Long id, @RequestBody Article article) {
        return articleService.updateArticle(id, article);
    }

    // Delete an article
    @DeleteMapping("/{id}")
    public boolean deleteArticle(@PathVariable Long id) {
        return articleService.deleteArticle(id);
    }
}

