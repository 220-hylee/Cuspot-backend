package com.web.persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.web.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long> {
	// 전체 게시글 가져오기  
	// 날짜 최신순으로 모든 게시판 목록 가져오기
	 List<Board> findAllByOrderByTimestampDesc();
	 
	 
	 
	 
	// 좋아요 갯수 가져오기
	int findByLikes(Long postId);


}
