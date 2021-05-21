package com.example.MustacheIntro.DTO;

public class ArticleDTO {
    String articleId;
    String name;
    String content;

    public ArticleDTO(String articleId, String name, String content) {
        this.articleId = articleId;
        this.name = name;
        this.content = content;
    }

    public ArticleDTO(String articleId, String name) {
        this.articleId = articleId;
        this.name = name;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getArticleId() {
        return articleId;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }
}
