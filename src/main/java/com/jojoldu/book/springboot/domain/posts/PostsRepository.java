package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// 별도의 어노테이션은 필요하지 않지만, Entity 클래스와 동일한 경로에 존재해야 한다.
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
