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
                "The Effects of Climate Change",
                "https://science.nasa.gov/climate-change/effects//",
                "Climate Change",
                5,
                "https://picsum.photos/seed/climate/400/300"));

        articleList.add(new Article(idCounter++,
                "UN chief urges renewable energy revolution for a brighter future.",
                "https://news.un.org/en/story/2023/01/1132452",
                "Renewable Energy",
                6,
                "https://picsum.photos/seed/renewable/400/300"));

        articleList.add(new Article(idCounter++,
                "17 Goals of sustainability",
                "https://sdgs.un.org/goals",
                "Sustainable Living",
                4,
                "https://picsum.photos/seed/sustainable/400/300"));

        articleList.add(new Article(idCounter++,
                "What is climate change?",
                "https://www.bbc.com/news/science-environment-24021772",
                "Climate Change",
                5,
                "https://picsum.photos/seed/picsum/400/300"));

        articleList.add(new Article(idCounter++,
                "UAE airports lead sustainable travel.",
                "https://www.msn.com/en-ae/news/other/uae-airports-cement-global-leadership-in-sustainability-shape-future-of-travel/ar-AA1BTCv7?ocid=BingNewsVerp",
                "Sustainable Living",
                4,
                "https://picsum.photos/seed/nature/400/300"));

        articleList.add(new Article(idCounter++,
                "Renewables impact bills—follow the money.",
                "https://www.usatoday.com/story/news/2025/03/27/how-do-delaware-green-energy-initiatives-reflect-on-your-utility-bill/82654067007/?gnt-cfr=1&gca-cat=p",
                "Renewable Energy",
                4,
                "https://picsum.photos/seed/forest/400/300"));
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