package br.com.clubeDaLuta.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TB_LUTADOR")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Lutador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME", nullable = false, length = 50)
    private String nome;

    @Column(name = "STATUS", nullable = false)
    private String status;

    @Column(name = "PAGAMENTOLUTADOR", nullable = false)
    private Long pagamentoLutador;

}
