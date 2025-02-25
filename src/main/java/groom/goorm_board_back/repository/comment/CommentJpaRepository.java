package groom.goorm_board_back.repository.comment;

import groom.goorm_board_back.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentJpaRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByBoardId(Long boardId);
}
