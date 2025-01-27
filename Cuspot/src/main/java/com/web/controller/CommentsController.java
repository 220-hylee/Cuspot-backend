package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.domain.Comments;
import com.web.service.CommentsService;

@RestController
@RequestMapping("/api")
@CrossOrigin()
public class CommentsController {
	
	@Autowired
	private CommentsService cs;
	
	
		// 댓글 생성
		@PostMapping("/insertComments")
			public void createBoard(@RequestBody Comments comments) {
			// 댓글 생성	
			cs.insertComments(comments);
		}

//		// 댓글 목록 가져오기
		@GetMapping("/getCommentsList/{postId}")
		public List<Comments> getCommentsList(@PathVariable Long postId) {
			List<Comments> commentsList = cs.getCommentsList(postId);
			
			return commentsList ;
		}

		// 댓글 삭제 하기
		@DeleteMapping("/deleteComments/{postId}/{email}/{commentId}")
		public void deleteComments(@PathVariable Long postId, @PathVariable String email, @PathVariable Long commentId) {
			cs.deleteComments(postId,email,commentId);
		}
}
