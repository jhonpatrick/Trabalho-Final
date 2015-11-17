/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Lord Devil Hunter
 */
public class Login {
    @Id
    @GeneratedValue
    int id;
    long senha;
    String login;

    public Login() {
    }

    public Login(int id, long senha, String login) {
        this.id = id;
        this.senha = senha;
        this.login = login;
    }

    public Login(long senha, String login) {
        this.senha = senha;
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSenha() {
        return senha;
    }

    public void setSenha(long senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Login other = (Login) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Login{" + "id=" + id + ", senha=" + senha + ", login=" + login + '}';
    }
    
    
    
}