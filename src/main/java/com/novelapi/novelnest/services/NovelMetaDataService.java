package com.novelapi.novelnest.services;

import com.novelapi.novelnest.models.NovelMetaData;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Service
public class NovelMetaDataService {

    public List<NovelMetaData> getNovelData() {
        List<NovelMetaData> list = new ArrayList<>();
        NovelMetaData novelMetaData = new NovelMetaData();
        String baseUrl = "https://novelfull.me";
        try {
            Document doc = Jsoup.connect("https://novelfull.me/alchemy-and-martial-supreme").get();

            String coverImageSrc = doc.select("div#cover img").attr("src");
            String absoluteImageSrc = constructAbsoluteUrl(baseUrl, coverImageSrc);
            String title = doc.select("div.name h1").text();
            String subtitle = doc.select("div.name h2").text();
            String author = doc.select("p:contains(Authors) a span").text();
            String status = doc.select("p:contains(Status) a span").text();
            String genre = doc.select("p:contains(Genres) a").text();
            String chapters = doc.select("p:contains(Chapters) span").text();
            String lastUpdate = doc.select("p:contains(Last update) span").text();
            String rating = doc.select("div.rating .score").text();
            Elements data_li = doc.select(".info-meta > li");

            System.out.println("Cover Image Source: " + absoluteImageSrc);
            System.out.println("Title: " + title);
            System.out.println("Subtitle: " + subtitle);
            System.out.println("Author: " + author);
            System.out.println("Status: " + status);
            System.out.println("Genre: " + genre);
            System.out.println("Chapters: " + chapters);
            System.out.println("Last Update: " + lastUpdate);
            System.out.println("Rating: " + rating);

            novelMetaData.setCoverImage(absoluteImageSrc);
            novelMetaData.setTitle(title);
            novelMetaData.setSubTitle(subtitle);
            novelMetaData.setAuthor(author);
            novelMetaData.setStatus(status);
            novelMetaData.setGenra(genre);
            novelMetaData.setChapters(chapters);
            novelMetaData.setRating(rating);
            novelMetaData.setLastUpdate(lastUpdate);

            list.add(novelMetaData);
            return list;
        } catch (Exception e) {
            System.out.println("Error in fetching web page: " + e.getMessage());
        }
        return list;
    }

    private static String constructAbsoluteUrl(String baseUrl, String relativeUrl) {
        try {
            URL base = new URL(baseUrl);
            URL absolute = new URL(base, relativeUrl);
            return absolute.toString();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
