package com.example.vue_spring_pjt.work.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.vue_spring_pjt.work.domain.WorkRequestDTO;
import com.example.vue_spring_pjt.work.domain.WorkResponseDTO;
import com.example.vue_spring_pjt.work.mapper.WorkMapper;

@Service
public class WorkService {

    @Autowired
    private WorkMapper workMapper;

    public List<WorkResponseDTO> getWorks(){
        System.out.println(">> debug : Work Service getWorks()");
        return workMapper.findAll();
    }

    public void addWork(WorkRequestDTO params) {
        System.out.println(">> debug : Work Service addWork()");
        workMapper.addWork(params);
    }

    public void deleteWork(Integer id) {
        System.out.println(">> debug : Work Service deleteWork()");
        workMapper.deleteWork(id);
    }

    public WorkResponseDTO findWork(Integer id) {
        System.out.println(">> debug : Work Service findWork()");
        return workMapper.findWork(id);
    }

    public void updateWork(WorkRequestDTO params) {
        System.out.println(">> debug : Work Service updateWork()");
        workMapper.updateWork(params);
    }

    
} 
