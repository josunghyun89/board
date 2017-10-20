package board.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name="Tb_User")
public class Users
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idx;
    @Column
    private String email;
    @Column
    private String name;
}
