package com.sebastian.zemogatest.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sebastian.zemogatest.portfolio.entity.Tweet;

@Service("twitterService")
public class TwitterService {

	@Autowired
	private RestTemplate restTemplate;

	public List<Tweet> getTweetsTimeline() {
		final HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization",
				"Bearer AAAAAAAAAAAAAAAAAAAAAAf7HAEAAAAA7TaqJ0hYztJfogOO1Nyk5iVOTtI%3DHQMLJN4vMFF0TI0YDWXyBUz6PV8iExiHPxqzVQZUKl402tLcq6");
		final HttpEntity<String> entity = new HttpEntity<String>(headers);
		final ResponseEntity<List<Tweet>> response = restTemplate.exchange(
				"https://api.twitter.com/1.1/statuses/user_timeline.json?screen_name=ELTIEMPO&count=5", HttpMethod.GET,
				entity, new ParameterizedTypeReference<List<Tweet>>() {
				});
		return response.getBody();
	}

}
