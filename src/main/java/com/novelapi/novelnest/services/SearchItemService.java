package com.novelapi.novelnest.services;

import com.novelapi.novelnest.models.SearchItems;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchItemService {
    private List<SearchItems> searchItemsList;

    public List<SearchItems> searchNovel(String query) {
        searchItemsList = new ArrayList<>();
        String baseUrl = "https://novelfull.me/search?q=" + query;

        try {
            String nextPageUrl = baseUrl;

            do {
                Document doc = Jsoup.connect(nextPageUrl).get();

                Elements novelItems = doc.select(".book-item");

                for (Element novelItem : novelItems) {
                    String title = novelItem.select(".title a").attr("title");
                    String href = novelItem.select(".title a").attr("href");

                    SearchItems searchItems = new SearchItems();
                    searchItems.setTitle(title);
                    searchItems.setPageLink(href);

                    searchItemsList.add(searchItems);
                }

                Elements paginationLinks = doc.select(".paginator a.link");
                nextPageUrl = null;
                for (Element link : paginationLinks) {
                    if (link.text().equals("❯")) {
                        nextPageUrl = link.attr("href");
                        if (!nextPageUrl.startsWith("http")) {
                            nextPageUrl = "https://novelfull.me" + nextPageUrl;
                        }
                        break;
                    }
                }

            } while (nextPageUrl != null);

        } catch (Exception e) {
            System.out.println("Error : " + e);
        }

        return searchItemsList;
    }
}
