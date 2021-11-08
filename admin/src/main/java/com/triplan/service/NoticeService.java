package com.triplan.service;

import com.triplan.domain.NoticeVO;

import java.net.Inet4Address;

public interface NoticeService {
    void noticeInsert(NoticeVO noticeVO);

    NoticeVO noticeSelect(Integer noticeId);

    void noticeUpdate(NoticeVO noticeVO);

    void noticeDelete(Integer noticeId);
}
