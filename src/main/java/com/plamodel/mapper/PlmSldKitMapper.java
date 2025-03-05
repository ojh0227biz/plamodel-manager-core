package com.plamodel.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.plamodel.entity.PlmSldKit;

@Mapper
public interface PlmSldKitMapper {
    List<PlmSldKit> selectAll();
}
