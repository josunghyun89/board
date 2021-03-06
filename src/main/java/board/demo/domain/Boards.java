package board.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name="Tb_Board")
public class Boards
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idx;
    @Column
    private String title;
    @Column
    private String content;
}
