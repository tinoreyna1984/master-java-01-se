package org.usuarios.repositorio;

import org.usuarios.modelo.Usuario;
import org.usuarios.util.ConexionBaseDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorioImpl implements Repositorio<Usuario>{

    private Connection getConnection() throws SQLException {
        return ConexionBaseDatos.getConnection();
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> usuarios = new ArrayList<>();
        try  (Connection conn = getConnection();
              Statement stmt = conn.createStatement();
              ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios")) {
            //
            while (rs.next()){
                Usuario usuario = crearUsuario(rs);
                usuarios.add(usuario);
            }
        }
        catch (SQLException sqle){
            System.err.println("Error: " + sqle.getErrorCode() + " - " + sqle.getMessage());
        }
        return usuarios;
    }

    @Override
    public Usuario porId(Long id) {
        Usuario usuario = null;
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM usuarios WHERE id = ?")) {
            stmt.setLong(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    usuario = crearUsuario(rs);
                }
            }
        } catch (SQLException sqle) {
            System.err.println("Error: " + sqle.getErrorCode() + " - " + sqle.getMessage());
        }
        return usuario;
    }

    @Override
    public void guardar(Usuario usuario) {
        //
        String sql;
        if (usuario.getId() != null && usuario.getId()>0) {
            sql = "UPDATE usuarios SET username=?, password=?, email=? WHERE id=?";
        } else {
            sql = "INSERT INTO usuarios(username, password, email) VALUES(?,?,?)";
        }
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());
            stmt.setString(3, usuario.getEmail());
            if (usuario.getId() != null && usuario.getId() > 0) {
                stmt.setLong(4, usuario.getId());
            }
            stmt.executeUpdate();
        } catch (SQLException sqle) {
            System.err.println("Error: " + sqle.getErrorCode() + " - " + sqle.getMessage());
        }
    }

    @Override
    public void eliminar(Long id) {
        //
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM usuarios WHERE id=?")) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        } catch (SQLException sqle) {
            System.err.println("Error: " + sqle.getErrorCode() + " - " + sqle.getMessage());
        }
    }


    private Usuario crearUsuario(ResultSet rs) throws SQLException {
        Usuario u = new Usuario();
        u.setUsername(rs.getString("username"));
        u.setPassword(rs.getString("password"));
        u.setEmail(rs.getString("email"));
        return u;
    }

}
