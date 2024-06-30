package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Autor;


public class PrincipalAutor {

	private static final String Autor = null;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
        AutorDAO autorDAO = context.getBean("autorDAOImpl", AutorDAO.class);
        LibroDAO libroDAO = context.getBean("libroDAOImpl", LibroDAO.class);


     // CRUD

     //add
        Autor autor = new Autor();
        autor.setNombre("Gabriel García Márquez");
        autorDAO.save(Autor);

     // Actualizar un autor existente
        Autor autorExistente = autorDAO.findOne(1);
        if (autorExistente != null) {
            autorExistente.setNombre("J.K. Rowling");
            autorDAO.up(autorExistente);
        }

        // Eliminar un autor por su ID
        autorDAO.del(2);

        // Encontrar y mostrar un autor por su ID
        try {
            Autor autorEncontrado = autorDAO.findOne(1);
            System.out.println("Autor encontrado: " + autorEncontrado);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Encontrar y mostrar todos los autores
        autorDAO.findAll().forEach(item -> {System.out.println(autor.toString());
        });

        // Cerrar el contexto de Spring
        context.close();
    }
}