package board.demo.service;

import board.demo.domain.Boards;
import board.demo.persistence.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService
{
    @Autowired
    private BoardRepository repository;

    public List<Boards> boardList(){
        return repository.findAll();
    }
}
