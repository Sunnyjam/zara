package com.zara.woman;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WomanMapper {
    int insertWoman (Woman woman);

    int updateWoman (Woman woman);

    int deleteWoman(int womanId);

    List<Woman> womanList();

    List<Woman> womanTop();

    List<Woman> womanBottom();
}
