package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.domain.Board;
import com.web.persistence.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardRepository boardRepo;

	// 게시판 작성한거 저장하기
	@Override
	public void createBoard(Board board) {
		
		boardRepo.save(board);
		
		
	}
	
	// 전체 게시판 글  가져오기
	@Override
	public List<Board> getBoardList() {
		
		return (List<Board>) boardRepo.findAllByOrderByTimestampDesc();
	}
	

	
	// 좋아요 갯수 업데이트 
	@Override
	public void updateLike(Long postId,int newLikesCount) {
		Board board = boardRepo.findById(postId).get();
		
		board.setLikes(newLikesCount);
		
		boardRepo.save(board);
	}
//	

	
}
