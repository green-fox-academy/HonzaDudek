package com.greenfoxacademy.reddit.Repositories;

import com.greenfoxacademy.reddit.Models.Reddit;
import org.springframework.data.repository.CrudRepository;

public interface RedditRepo extends CrudRepository<Reddit, Long> {
}
