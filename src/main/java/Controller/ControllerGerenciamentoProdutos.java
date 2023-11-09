package Controller;

import Enty.Perfil;
import Enty.Pessoa;
import Enty.ProdutoIngresso;
import Repository.PerfilRepository;
import Repository.PessoaRepository;
import Repository.ProdutoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gerenciamento")
public class ControllerGerenciamentoProdutos {

    private PerfilRepository perfilRepository;
    private PessoaRepository pessoaRepository;
    private ProdutoRepository produtoRepository;

    public ControllerGerenciamentoProdutos(PerfilRepository perfilRepository, PessoaRepository pessoaRepository, ProdutoRepository produtoRepository) {
        this.perfilRepository = perfilRepository;
        this.pessoaRepository = pessoaRepository;
        this.produtoRepository = produtoRepository;
    }

    @GetMapping
    public List<Perfil> listarPerfil() {
        return perfilRepository.findAll();
    }

    @GetMapping
    public List<Pessoa> listarPessoa() {
        return pessoaRepository.findAll();
    }

    @GetMapping
    public List<ProdutoIngresso> listarProdutos() {
        return produtoRepository.findAll();
    }
};
