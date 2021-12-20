package com.project.urlshortner.service;

import com.project.urlshortner.model.Url;
import com.project.urlshortner.model.UrlDto;

public interface UrlService {

    public Url generateShortLink(UrlDto urlDto);
    public Url persistShortLink(Url url);
    public Url getEncodedUrl(String url);
    public void deleteShortLink(Url url);


}
