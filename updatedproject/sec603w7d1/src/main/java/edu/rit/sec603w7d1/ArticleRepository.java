package edu.rit.sec603w7d1;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class ArticleRepository {
    private List<Article> articleList = new ArrayList<>();
    private Long idCounter = 1L;

    public ArticleRepository() {
        // Sample data
        articleList.add(new Article(idCounter++,
                "Climate Change Basics",
                "Climate change refers to significant long-term changes in the planet's climate system. Learn about its causes, impacts, and what we can do to mitigate its effects.",
                "Climate Change",
                5,
                "https://picsum.photos/seed/climate/400/300"));

        articleList.add(new Article(idCounter++,
                "Renewable Energy Revolution",
                "https://www.etihad.com/en-ae/",
                "Renewable Energy",
                6,
                "https://picsum.photos/seed/renewable/400/300"));

        articleList.add(new Article(idCounter++,
                "Sustainable Living Tips",
                "Practical strategies for reducing your carbon footprint, from recycling and energy conservation to eco-friendly consumer choices.",
                "Sustainable Living",
                4,
                "https://picsum.photos/seed/sustainable/400/300"));
    }

    public List<Article> findAll() {
        return articleList;
    }

    public Optional<Article> findById(Long id) {
        return articleList.stream()
                .filter(article -> article.getId().equals(id))
                .findFirst();
    }

    public List<Article> findByTitle(String title) {
        return articleList.stream()
                .filter(article -> article.getTitle().toLowerCase().contains(title.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Article> findByCategory(String category) {
        return articleList.stream()
                .filter(article -> article.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public Article save(Article article) {
        if (article.getId() == null) {
            article.setId(idCounter++);
            articleList.add(article);
        } else {
            articleList.removeIf(a -> a.getId().equals(article.getId()));
            articleList.add(article);
        }
        return article;
    }

    public boolean deleteById(Long id) {
        return articleList.removeIf(article -> article.getId().equals(id));
    }
}