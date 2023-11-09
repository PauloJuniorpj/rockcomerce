package Enty;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;

    @Column(name = "emai" )
    private String email;

    @Column(name = "perfil_id")
    private Long perfilId;

    @OneToOne
    @JoinColumn(name = "perfil_id", insertable = false, updatable = false)
    private Perfil perfil;
}
