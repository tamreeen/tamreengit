package edu.rit.sec603w7d1;

public class Article {

    private Long id;
    private String title;
    private String pdfUrl;  // Changed from content to pdfUrl
    private String category;
    private int readTime;
    private String imageUrl;

    // Default constructor
    public Article() {}

    // Full constructor
    public Article(Long id, String title, String pdfUrl, String category, int readTime, String imageUrl) {
        this.id = id;
        this.title = title;
        this.pdfUrl = pdfUrl; // Changed from content to pdfUrl
        this.category = category;
        this.readTime = readTime;
        this.imageUrl = imageUrl;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getPdfUrl() { return pdfUrl; } // Changed from getContent to getPdfUrl
    public void setPdfUrl(String pdfUrl) { this.pdfUrl = pdfUrl; } // Changed from setContent to setPdfUrl
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public int getReadTime() { return readTime; }
    public void setReadTime(int readTime) { this.readTime = readTime; }
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}
