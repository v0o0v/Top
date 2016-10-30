package com.v0o0v.top.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.v0o0v.top.domain.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
//    List<Image> findById(@Param("id") Long id);
}
