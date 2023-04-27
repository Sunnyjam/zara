package com.zara.kid;

import com.zara.man.Man;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface KidMapper {
    int insertKid (Kid kid);

    int updateKid (Kid kid);

    int deleteKid(int kidId);

    List<Kid> kidList();

    List<Kid> kidTop();

    List<Kid> kidBottom();
}
