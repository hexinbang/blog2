package org.hxb.blog.service.impl;

import org.hxb.blog.dao.EssayDao;
import org.hxb.blog.entity.Essay;
import org.hxb.blog.vo.EssayVo;
import org.hxb.blog.service.EssayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EssayServiceImpl implements EssayService {

    @Autowired
    EssayDao essayDao;
    @Override
    public List<Essay> getAllEssay() {
        return essayDao.getAllEssay();
    }

    @Override
    public int insertEssay(EssayVo essayVo) {
        return essayDao.insertEssay(essayVo);
    }
    @Override
    public int deleteEssay(int id) {
        return essayDao.deleteEssay(id);
    }
}
