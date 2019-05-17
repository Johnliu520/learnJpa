package net.ebzh.bootjpa.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: John Ming
 * @Date: 2019/5/17 15:34
 * @Version 1.0
 * @describe:
 */

@Data
@Entity
public class grade implements Serializable {

    private static final long serialVersionUID = -3752294262021766827L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String gname;


}
