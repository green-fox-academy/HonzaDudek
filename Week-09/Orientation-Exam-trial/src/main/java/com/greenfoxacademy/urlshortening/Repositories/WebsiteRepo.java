package com.greenfoxacademy.urlshortening.Repositories;

import com.greenfoxacademy.urlshortening.Models.Website;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WebsiteRepo extends CrudRepository<Website, Long> {

    Website findByAlias(String alias);

    List<Website> findAll();

}
