package br.com.partypass.dao;

import br.com.partypass.entidade.Produto;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class ProdutoDaoImpl extends BaseDaoImpl<Produto, Long> implements ProdutoDao {

    @Override
    public Produto pesquisarPorId(Long id, Session sessao) throws HibernateException {
        return sessao.find(Produto.class, id);
    }

    @Override
    public List<Produto> pesquisarPorCodigo(String codigo, Session sessao) throws HibernateException {
        Query<Produto> consulta = sessao.createQuery("FROM Produto p WHERE p.codigo = :codigo ORDER BY p.codigo");
        consulta.setParameter("codigo", codigo);
        return consulta.getResultList();
    }

    @Override
    public List<Produto> pesquisarPorNome(String nome, Session sessao) throws HibernateException {
        Query<Produto> consulta = sessao.createQuery("FROM Produto c WHERE c.nome LIKE :nome ORDER BY c.nome");
        consulta.setParameter("nome", "%" + nome + "%");
        return consulta.getResultList();
    }

    @Override
    public List<Produto> pesquisarPorTipo(String tipo, Session sessao) throws HibernateException {
        Query<Produto> consulta = sessao.createQuery("FROM Produto c WHERE c.tipo = :tipo ORDER BY c.tipo");
        consulta.setParameter("tipo", tipo);
        return consulta.getResultList();
    }

    @Override
    public List<Produto> pesquisarTodos(Session sessao) throws HibernateException {
        Query<Produto> consulta = sessao.createQuery("FROM Produto c ORDER BY c.id");
        return consulta.getResultList();
    }

}
