package com.web.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.Getter;
import lombok.Setter;

// 댓글 테이블
@Getter
@Setter
@Entity
public class Comments {
	
	  	@Id
	    @GeneratedValue
	    private Long id; // 번호
	    
	    
	    private String boardcomment; // 댓글
	    
	    @Column(insertable = false, updatable = false, columnDefinition = "date default sysdate")
		private Date createDate; // 날짜
	    
	    
	    private String username; // 유저 이름
	    
	    private String profile; // 프로필 이미지
	    
	    @ManyToOne
	    @JoinColumn(name = "boardid", nullable = false)
	    private Board boardid;	// 글 번호 
	    
	    @Column(nullable = false)
	    private String email; // 이메일
	    
	    
	    
	    	
}
