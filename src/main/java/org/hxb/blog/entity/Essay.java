package org.hxb.blog.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Data
@Alias("essay")
public class Essay {
    private int id;
    private String title;
    private String time;
    private String content;
}
