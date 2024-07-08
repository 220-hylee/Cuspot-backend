package com.web.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.domain.Heart;

public interface HeartRepository extends JpaRepository<Heart, Long> {
    
	// 좋아요 상태 like or unlike 보내기
	boolean existsByBoardidAndEmail(Long boardid, String email);
	
	// 좋아요 상태 정보 삭제
	void deleteByBoardidAndEmail(Long boardid, String email);

}