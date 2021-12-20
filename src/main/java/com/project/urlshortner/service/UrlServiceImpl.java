package com.project.urlshortner.service;

import com.google.common.hash.Hashing;
import com.project.urlshortner.model.Url;
import com.project.urlshortner.model.UrlDto;
import org.apache.commons.lang3.StringUtils;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

public class UrlServiceImpl implements UrlService {

    @Override
    public Url generateShortLink(UrlDto urlDto) {
        if (StringUtils.isNotEmpty(urlDto.getUrl())) {
            String encodedUrl = encodedUrl(urlDto.getUrl());
        }
        return null;
    }

    private String encodedUrl(String url) {
        String encodedUrl = "";
        LocalDateTime time = LocalDateTime.now();
        encodedUrl = Hashing.murmur3_32().hashString(url.concat(time.toString()), StandardCharsets.UTF_8).toString();
        return encodedUrl;
    }

    @Override
    public Url persistShortLink(Url url) {
        return null;
    }

    @Override
    public Url getEncodedUrl(String url) {
        return null;
    }

    @Override
    public void deleteShortLink(Url url) {

    }
}
