package org.hxb.blog.service;

import org.hxb.blog.entity.Essay;
import org.hxb.blog.vo.EssayVo;

import java.util.List;

public interface EssayService {
    public List<Essay>getAllEssay();
    public int insertEssay(EssayVo essayVo);
    public int deleteEssay(int id);
}
