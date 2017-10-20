package board.demo.web;

import board.demo.service.BoardService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
}
