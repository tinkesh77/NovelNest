package com.novelapi.novelnest.entity;

public class NovelMetaData {
  private Long id;
  private String coverImage;
  private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String subTitle;
  private String author;

    public NovelMetaData() {
    }

    private String status;
  private String genra;

    public NovelMetaData(Long id, String coverImage, String subTitle, String author, String status, String genra, String chapters, String lastUpdate, String rating) {
        this.id = id;
        this.coverImage = coverImage;
        this.subTitle = subTitle;
        this.author = author;
        this.status = status;
        this.genra = genra;
        this.chapters = chapters;
        this.lastUpdate = lastUpdate;
        this.rating = rating;
    }

    private String chapters;
  private String lastUpdate;
  private String rating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGenra() {
        return genra;
    }

    public void setGenra(String genra) {
        this.genra = genra;
    }

    public String getChapters() {
        return chapters;
    }

    public void setChapters(String chapters) {
        this.chapters = chapters;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
