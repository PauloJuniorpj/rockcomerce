package Enty;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProdutoIngresso {

    private Long id;
    private BigDecimal precoUnico;
    private Integer quantidadeProduto;

}
