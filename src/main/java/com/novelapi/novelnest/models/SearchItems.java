package com.novelapi.novelnest.models;

public class SearchItems {
    private String title;

    public SearchItems(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPageLink() {
        return pageLink;
    }

    public SearchItems(String title, String pageLink) {
        this.title = title;
        this.pageLink = pageLink;
    }

    public void setPageLink(String pageLink) {
        this.pageLink = pageLink;
    }

    private String pageLink;
}
