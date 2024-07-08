package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.domain.Comments;
import com.web.persistence.CommentsRepository;

@Service
public class CommentsServiceImpl implements CommentsService{
	
	@Autowired
	private CommentsRepository commentsRepo;
	// 댓글 생성
	@Override
	public void insertComments(Comments comments) {
		commentsRepo.save(comments);
		
	}
	// 댓글 목록
	@Override
	public List<Comments> getCommentsList() {
	
		return (List<Comments>) commentsRepo.findAllByOrderByCreateDateDesc();
	}
	
	
	
}
