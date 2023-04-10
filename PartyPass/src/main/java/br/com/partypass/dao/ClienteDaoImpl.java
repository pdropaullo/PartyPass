package br.com.partypass.dao;

import br.com.partypass.entidade.Cliente;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class ClienteDaoImpl extends BaseDaoImpl<Cliente, Long>
        implements ClienteDao {

    @Override
    public Cliente pesquisarPorId(Long id, Session sessao) throws HibernateException {
        return sessao.find(Cliente.class, id);
    }

    @Override
    public List<Cliente> pesquisarPorNome(String nome, Session sessao) throws HibernateException {
        Query<Cliente> consulta = sessao.createQuery("FROM Cliente u WHERE u.nome LIKE :vNome");
        consulta.setParameter("vNome", "%" + nome + "%");
        return consulta.getResultList();
    }

    @Override
    public List<Cliente> pesquisarTodos(Session sessao) throws HibernateException {
        Query<Cliente> consulta = sessao.createQuery("FROM Cliente u order by u.nome");
        return consulta.getResultList();
    }

    @Override
    public Cliente logar(String login, String senha, Session sessao) throws HibernateException {
        Query<Cliente> consulta = sessao.createQuery("FROM Cliente u WHERE u.login = :login AND u.senha = :senha");
        consulta.setParameter("login", login);
        consulta.setParameter("senha", senha);
        return consulta.uniqueResult();
    }
}
