package org.hxb.blog.dao;

import org.hxb.blog.entity.Essay;
import org.hxb.blog.vo.EssayVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EssayDao {
    public List<Essay>getAllEssay();
    public int insertEssay(EssayVo essayVo);
    public int deleteEssay(int id);
}
