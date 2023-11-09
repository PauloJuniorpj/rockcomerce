package Repository;

import Enty.ProdutoIngresso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoIngresso, Long> {
}
