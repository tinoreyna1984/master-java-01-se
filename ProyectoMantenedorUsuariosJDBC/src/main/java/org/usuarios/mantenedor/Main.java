package org.usuarios.mantenedor;

import org.usuarios.modelo.Usuario;
import org.usuarios.repositorio.Repositorio;
import org.usuarios.repositorio.UsuarioRepositorioImpl;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //
        Repositorio<Usuario> repositorio = new UsuarioRepositorioImpl();
        int opcionIndice = 0;

        Map<String, Integer> operaciones = new HashMap();
        operaciones.put("Listar", 1);
        operaciones.put("Agregar", 2);
        operaciones.put("Actualizar", 3);
        operaciones.put("Eliminar", 4);
        operaciones.put("Salir", 5);

        Object[] opArreglo = operaciones.keySet().toArray();

        do {
            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Operación",
                    "Mantenedor de Usuarios",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = operaciones.get(opcion.toString());

                switch (opcionIndice) {
                    case 1 -> { // listar
                        List<Usuario> usuarios = repositorio.listar();
                        if (!usuarios.isEmpty()){
                            String lista = "";
                            for (Usuario u: usuarios) {
                                lista += u.toString() + "\n";
                            }
                            JOptionPane.showMessageDialog(null, lista, "Lista", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else
                            JOptionPane.showMessageDialog(null, "No hay registros", "Resultado", JOptionPane.WARNING_MESSAGE);
                    }
                    case 2 -> { // agregar
                        Usuario usuario = new Usuario();
                        Scanner scanner = new Scanner(System.in);
                        try {
                            System.out.print("Ingrese nuevo usuario: ");
                            usuario.setUsername(scanner.next());
                            System.out.print("Ingrese clave: ");
                            usuario.setPassword(scanner.next());
                            System.out.print("Ingrese correo: ");
                            usuario.setEmail(scanner.next());
                            repositorio.guardar(usuario);
                            JOptionPane.showMessageDialog(null, "Usuario registrado correctamente", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                        }
                        catch (Exception e){
                            System.err.println("Error: " + e.getMessage());
                        }
                    }
                    case 3 -> { // actualizar
                        Usuario usuario;
                        Scanner scanner = new Scanner(System.in);
                        String tmpUsuario, tmpPassword, tmpCorreo;
                        long id = 0;
                        try{
                            System.out.print("Ingrese ID del usuario: ");
                            id = scanner.nextLong();
                            usuario = repositorio.porId(id);
                            if(usuario != null) {
                                System.out.println("Encontrado, ID: " + id);
                                usuario.setId(id);
                                System.out.print("Ingrese nuevo usuario (dejar en blanco si desea mantener el valor): ");
                                tmpUsuario = scanner.nextLine();
                                usuario.setUsername(tmpUsuario.length() > 0 ? tmpUsuario : usuario.getUsername());
                                System.out.print("Ingrese clave (dejar en blanco si desea mantener el valor): ");
                                tmpPassword = scanner.nextLine();
                                usuario.setPassword(tmpPassword.length() > 0 ? tmpPassword : usuario.getPassword());
                                System.out.print("Ingrese correo (dejar en blanco si desea mantener el valor): ");
                                tmpCorreo = scanner.nextLine();
                                usuario.setEmail(tmpCorreo.length() > 0 ? tmpCorreo : usuario.getEmail());
                                repositorio.guardar(usuario);
                                JOptionPane.showMessageDialog(null, "Usuario registrado correctamente", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                            }
                            else {
                                System.out.println("No existe el usuario con ID: " + id);
                            }
                        }
                        catch (Exception e){
                            System.err.println("Error: " + e.getMessage());
                        }
                    }
                    case 4 -> { // eliminar
                        Usuario usuario;
                        Scanner scanner = new Scanner(System.in);
                        long id = 0;
                        try{
                            System.out.print("Ingrese ID del usuario: ");
                            id = scanner.nextLong();
                            usuario = repositorio.porId(id);
                            if(usuario != null) {
                                //System.out.println("Encontrado, ID: " + id);
                                repositorio.eliminar(id);
                                JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                            }
                            else {
                                System.out.println("No existe el usuario con ID: " + id);
                            }
                        }
                        catch (Exception e){
                            System.err.println("Error: " + e.getMessage());
                        }
                    }
                    case 5 -> System.exit(0);
                }
            }
        } while (opcionIndice != 5);

    }
}