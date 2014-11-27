package br.com.emavv.web.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.emavv.web.domain.UsuarioDM;
import br.com.emavv.web.factory.JPAUtil;

public class UsuarioDao extends UsuarioDM {

    EntityManager manager = JPAUtil.getConnection();

    public boolean Inserir(UsuarioDM user) throws SQLException {
       
            manager.getTransaction().begin();
            manager.persist(user);
            manager.getTransaction().commit();

            return true;

    }
/** 
 * Método para retornar uma lista de Usuaários
 * 
 * */
    public List<UsuarioDM> Select(String login, String senha) throws SQLException {
        Query q = manager.createQuery("select a from tb_usuarios as a "
                + "where a.fd_login = :fd_login and a.fd_senha = :fd_senha and a.fd_status <> 'E'");
        q.setParameter("fd_login", login);
        q.setParameter("fd_senha", senha);
        List<UsuarioDM> user = q.getResultList();
        return user;

    }

    public List<UsuarioDM> Select(int codigo) throws SQLException {
        Query q = manager.createQuery("select a from tb_usuarios as a "
                + "where a.fd_funcionario = :fd_funcionario and a.fd_status <> 'E'");
        q.setParameter("fd_funcionario", codigo);
        List<UsuarioDM> user = q.getResultList();
        return user;

    }
   
}
