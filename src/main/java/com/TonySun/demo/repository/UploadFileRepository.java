package com.TonySun.demo.repository;

import com.TonySun.demo.entity.UploadFileEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UploadFileRepository extends PagingAndSortingRepository<UploadFileEntity, Long> {
}