package com.web.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.web.domain.Board;
import com.web.domain.Heart;

public interface BoardService {
	
	// 게시판 작성한거 저장하기
	void createBoard(Board board);

	// 전체 게시판 가져오기
	List<Board> getBoardList();
	
	// 게시판 삭제하기
	void deleteBoard(Long postId);
	
	// 좋아요 갯수 업데이트
	void updateLike(Long postId,int newLikesCount);
	
	// 좋아요 갯수 가져오기
	int getLikes(Long postId);
}
	