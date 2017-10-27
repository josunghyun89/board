package board.demo.web;

import board.demo.domain.Boards;
import board.demo.service.BoardService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Log
@Controller
public class BoardContrller
{
    @Autowired
    private BoardService boardService;

    @GetMapping("/index")
    public String indexForm(){
        log.info("인덱스 폼");
        return "index";
    }

    @GetMapping("/board")
    public String list(Model model){
        List<Boards> boardList = boardService.boardList();
        model.addAttribute("boardList",boardList);
        return "index";
    }
    @GetMapping("/test")
    public String test(){
        return "test";
    }

}
