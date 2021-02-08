package com.topheryun.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.topheryun.models.Mouse;

public interface IScraperDAO extends JpaRepository<Mouse,Integer> {

}
