package com.triplan.mapper;

import com.triplan.domain.NoticeVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoticeMapper {


    void noticeInsert(NoticeVO noticeVO);

    NoticeVO noticeSelect(Integer noticeId);

    void noticeUpdate(NoticeVO noticeVO);

    void noticeDelete(Integer noticeId);
}
