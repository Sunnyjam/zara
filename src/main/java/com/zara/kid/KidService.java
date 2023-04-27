package com.zara.kid;

import com.zara.man.Man;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KidService {
    private final KidMapper kidMapper;

    public int insertKid(Kid kid) {
        return kidMapper.insertKid(kid);
    }

    public int updateKid(Kid kid) {
        return kidMapper.updateKid(kid);
    }

    public int deleteKid(int kidId) {
        return kidMapper.deleteKid(kidId);
    }

    public List<Kid> kidList() {
        return kidMapper.kidList();
    }

    public List<Kid> kidTop() {
        return kidMapper.kidTop();
    }

    public List<Kid> kidBottom() {
        return kidMapper.kidBottom();
    }
}
