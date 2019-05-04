package com.example.gitboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gitboot.entity.Git;

@Repository
public interface GitRepository extends JpaRepository<Git, Integer> {

}
