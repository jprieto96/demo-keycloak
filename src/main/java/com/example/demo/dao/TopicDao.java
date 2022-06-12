package com.example.demo.dao;

import com.example.demo.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface TopicDao extends JpaRepository<Topic, Long>, JpaSpecificationExecutor<Topic> {
    Optional<Topic> findStockById(String idStock);
}
