package com.livro;

import com.livro.model.Livro;
import com.livro.repositories.LivroRepository;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LivroRepository livroRepository = new LivroRepository();
        Livro livro1 = new Livro();
        livro1.setNome("Meia Noite");
        livro1.setAutor("Paulo Oliveira Silva");
        livro1.setEdicao("1");
        livro1.setCategoria("Suspense");
        livro1.setValor(50.0);
        livroRepository.save(livro1);


        Livro livro = livroRepository.findById(1);
        if(livro != null){
            System.out.println(livro.getNome());
            System.out.println(livro);
        }

        List<Livro> livros = livroRepository.findAll();
            for(Livro l : livros) {
                System.out.println(l);
            }
    }
}
