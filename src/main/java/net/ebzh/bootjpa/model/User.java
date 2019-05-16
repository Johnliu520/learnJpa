package net.ebzh.bootjpa.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: John Ming
 * @Date: 2019/5/16 15:07
 * @Version 1.0
 * @describe:
 */

@Data
@Entity
@Table(name="test_user")//表示表名和类名不一致
public class User implements Serializable {

    private static final long serialVersionUID = -3752294262021766827L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String password;

}
