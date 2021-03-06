package board.demo.persistence;

import board.demo.domain.Boards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Boards, Integer>
{
}
