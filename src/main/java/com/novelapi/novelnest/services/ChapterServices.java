package com.novelapi.novelnest.services;


import com.novelapi.novelnest.entity.Chapters;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterServices {

    private final String baseUrl = "https://novelbuddy.io";
    public List<Chapters> getChapters(){

        String novelUrl = baseUrl + "/novel/genius-daddy-in-the-city";

        try{
            Document novelDoc = Jsoup.connect(novelUrl).get();
            Elements chapters = novelDoc.select("ul#chapter-list li");
            System.out.println(chapters);

            for (Element chapter : chapters) {
                String chapterTitle = chapter.select("strong.chapter-title").text();

                String chapterUrl = chapter.select("a").attr("href");

                String fullChapterUrl = baseUrl + chapterUrl;

                Document chapterDoc = Jsoup.connect(fullChapterUrl).get();

                Element chapterContent = chapterDoc.select("div.chapter-content").first();

                String chapterText = chapterContent.text();

                System.out.println("Chapter Title: " + chapterTitle);
                System.out.println("Chapter URL: " + fullChapterUrl);
                System.out.println("Chapter Content: " + chapterText.substring(0, Math.min(200, chapterText.length())) + "...");
                System.out.println();
            }
        }catch (Exception e){
            // error
        }

        return null;
    }
}
