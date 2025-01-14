package com.web.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.domain.Board;
import com.web.domain.Heart;

public interface HeartRepository extends JpaRepository<Heart, Long> {
    
	// 좋아요 상태 like or unlike 보내기
	 boolean existsByBoardidAndEmail(Board board, String email);
	
	// 좋아요 상태 정보 삭제
	void deleteByBoardidAndEmail(Board board, String email);
	
	// 게시글 삭제시 좋아요 삭제
	void deleteByBoardid(Board board);
}
