package com.zara.man;

import com.zara.woman.Woman;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ManMapper {
    int insertMan (Man man);

    int updateMan (Man man);

    int deleteMan(int manId);

    List<Man> manList();

    List<Man> manTop();

    List<Man> manBottom();
}
