package com.web.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.domain.Board;
import com.web.domain.Heart;
import com.web.persistence.HeartRepository;

@Service
public class HeartServicelmpl implements HeartService{
	
	@Autowired
	private HeartRepository heartRepo;
	
	// 게시판 마다  각 유저 당 좋아요 상태 정보 만들기
	@Override
	public void insertLike(Heart heart) {
	
		heartRepo.save(heart);
	}

	
	// 좋아요 상태 가져오기
	@Override
	public boolean getLiked(Long boardid, String email) {
		
		Board board = new Board();
        board.setId(boardid);
		
		boolean res =  heartRepo.existsByBoardidAndEmail(board, email);
		return res;
	}

	// 좋아요 상태 데이터 삭제하기
	@Override
	@Transactional
	public void deleteLike(Long boardid,String email) {
		Board board = new Board();
        board.setId(boardid);
		
		heartRepo.deleteByBoardidAndEmail(board, email);
		
	}
	
	
	
}
