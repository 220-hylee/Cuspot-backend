package com.web.service;

import com.web.domain.Heart;

public interface HeartService {
	// 게시판 마다  각 유저 당 좋아요 상태 정보 만들기
	public void insertLike(Heart heart);
	
	// 좋아요 상태 정보 가져오기
	public boolean getLiked(Long boardid, String email);
	
	// 좋아요 상태 정보 삭제하기
	public void deleteLike(Long boardid,String email);
}
