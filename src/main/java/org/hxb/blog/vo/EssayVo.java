package org.hxb.blog.vo;

import org.apache.ibatis.type.Alias;

import javax.xml.crypto.Data;
import java.util.Date;
@lombok.Data
@Alias("essayVo")
public class EssayVo {
    private String title;
    private String content;
    private String time;
}
