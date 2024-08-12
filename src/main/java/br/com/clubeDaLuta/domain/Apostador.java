package br.com.clubeDaLuta.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TB_APOSTADOR")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Apostador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME", nullable = false, length = 50)
    private String nome;

    @Column(name = "PASSAPORT", nullable = false)
    private Integer passaport;

    @Column(name = "STATUS", nullable = false)
    private String status;

    @Column(name = "TIME", nullable = false)
    private String time;

    @Column(name = "VALORAPOSTADO", nullable = false)
    private Long valorApostado;

}
