package com.endava.wiki.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by aancuta on 8/10/2016.
 */
public class ArticleDTO {
    private List<String> titles;

    private List<WordDTO> wordsList;

    private int duration;

    private String source;

    private List<InArticleDTO> articles;

    private WordDTO wordDTO;

    public int getMode() {
        return envMode;
    }

    public void setMode(int mode) {
        envMode = mode;
    }

    private int envMode;

    public ArticleDTO() {
        wordDTO = null;
        envMode = 0;
    }

    public List<InArticleDTO> getArticles() {
        return articles;
    }

    public void setArticles(List<InArticleDTO> articles) {
        this.articles = articles;
    }

    public List<String> getTitles() {
        return titles;
    }

    public void setTitles(String title) {
        List<String> titles = new ArrayList<>();
        titles.add(title);
        this.titles = titles;
    }

    public void setTitles(List<String> titles) {
        this.titles = titles;
    }

    public void setWordsList(Map<String, Integer> words) {
        this.wordsList = new ArrayList<>();
        for (String key : words.keySet()) {
            wordsList.add(new WordDTO(key, words.get(key)));
        }
    }

    public List<WordDTO> getWordsList() {
        return wordsList;
    }

    public void setWordsList(List<WordDTO> wordsList) {
        this.wordsList = wordsList;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public WordDTO getWordDTO() {
        return wordDTO;
    }

    public void setWordDTO(WordDTO wordDTO) {
        this.wordDTO = wordDTO;
    }

    @Override
    public String toString() {
        return "ArticleDTO{" +
                "titles=" + titles +
                ", wordsList=" + wordsList +
                ", duration=" + duration +
                ", source='" + source + '\'' +
                ", wordDTO=" + wordDTO +
                '}';
    }
}
