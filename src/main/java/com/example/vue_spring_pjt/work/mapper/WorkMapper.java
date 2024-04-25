package com.example.vue_spring_pjt.work.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.vue_spring_pjt.work.domain.WorkRequestDTO;
import com.example.vue_spring_pjt.work.domain.WorkResponseDTO;

@Mapper
public interface WorkMapper {
    public List<WorkResponseDTO> findAll();
    public void addWork(WorkRequestDTO params);
    public void deleteWork(Integer id);
    public WorkResponseDTO findWork(Integer id);
    public void updateWork(WorkRequestDTO params);
}
