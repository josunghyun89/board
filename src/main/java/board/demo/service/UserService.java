package board.demo.service;

import board.demo.domain.Boards;
import board.demo.persistence.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    private BoardRepository repository;

    public List<Boards> getBoards(){
        return repository.findAll();
    }
}
