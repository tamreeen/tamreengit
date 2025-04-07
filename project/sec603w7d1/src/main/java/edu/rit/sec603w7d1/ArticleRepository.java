package edu.rit.sec603w7d1; // Package declaration for the ArticleRepository class.

// Importing necessary Java and Spring components for the repository class.
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository // This annotation marks the class as a Spring Repository, which is responsible for data access.
public class ArticleRepository {
    // This is a list that will hold the articles in memory, like a database.
    private List<Article> articleList = new ArrayList<>();

    // ID counter to generate unique IDs for articles.
    private Long idCounter = 1L;
    //We write L to show that the number should be treated as a long instead of integer

    // Constructor that initializes articles.
    public ArticleRepository() {
        //  article 1
        articleList.add(new Article(idCounter++,
                "The Effects of Climate Change",
                "https://science.nasa.gov/climate-change/effects//",
                "Climate Change",
                5,
                "https://picsum.photos/seed/climate/400/300"));

        // article 2
        articleList.add(new Article(idCounter++,
                "UN chief urges renewable energy revolution for a brighter future.",
                "https://news.un.org/en/story/2023/01/1132452",
                "Renewable Energy",
                6,
                "https://picsum.photos/seed/renewable/400/300"));

        // article 3
        articleList.add(new Article(idCounter++,
                "17 Goals of sustainability",
                "https://sdgs.un.org/goals",
                "Sustainable Living",
                4,
                "https://picsum.photos/seed/sustainable/400/300"));

        //article 4
        articleList.add(new Article(idCounter++,
                "What is climate change?",
                "https://www.bbc.com/news/science-environment-24021772",
                "Climate Change",
                5,
                "https://picsum.photos/seed/picsum/400/300"));

        // article 5
        articleList.add(new Article(idCounter++,
                "UAE airports lead sustainable travel.",
                "https://www.msn.com/en-ae/news/other/uae-airports-cement-global-leadership-in-sustainability-shape-future-of-travel/ar-AA1BTCv7?ocid=BingNewsVerp",
                "Sustainable Living",
                4,
                "https://picsum.photos/seed/nature/400/300"));

        // article 6
        articleList.add(new Article(idCounter++,
                "Renewables impact bills—follow the money.",
                "https://www.usatoday.com/story/news/2025/03/27/how-do-delaware-green-energy-initiatives-reflect-on-your-utility-bill/82654067007/?gnt-cfr=1&gca-cat=p",
                "Renewable Energy",
                4,
                "https://picsum.photos/seed/forest/400/300"));
    }

    // Method to get all articles
    public List<Article> findAll() {
        return articleList; // Returns the entire list of articles.
    }

    // Method to find an article by its ID
    public Optional<Article> findById(Long id) {
        // Searches the articleList for an article with the matching ID
        return articleList.stream()
                .filter(article -> article.getId().equals(id)) // Filters the list by article ID.
                .findFirst(); // Returns the first article found
    }

    // Method to find articles by their title.
    public List<Article> findByTitle(String title) {
        // Filters articles whose title contains the search term.
        return articleList.stream()
                .filter(article -> article.getTitle().toLowerCase().contains(title.toLowerCase())) // Title contains the search string.
                .collect(Collectors.toList()); // Collects the results into a list and returns it.
    }

    // Method to find articles by their category.
    public List<Article> findByCategory(String category) {
        // Filters articles by category,
        return articleList.stream()
                .filter(article -> article.getCategory().equalsIgnoreCase(category)) // Category matches the given category.
                .collect(Collectors.toList()); // Collects the results into a list and returns it.
    }

    // Method to save, create or update an article.
    public Article save(Article article) {
        if (article.getId() == null) { // If the article doesn't have an ID, it's a new article.
            article.setId(idCounter++); // So we assign a new id
            articleList.add(article); // now it adds the new article to the list.
        } else { // If the article already has an ID, it's being updated.
            // Remove the article with the same ID from the list and add the updated one.
            articleList.removeIf(a -> a.getId().equals(article.getId()));
            articleList.add(article);
        }
        return article; // Returns the saved (new or updated) article.
    }

    // Method to delete an article by its ID.
    public boolean deleteById(Long id) {
        // Removes the article with the matching ID 
        return articleList.removeIf(article -> article.getId().equals(id));
    }
}
