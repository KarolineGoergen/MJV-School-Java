package com.mjvschool.atracao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.mjvschool.atracao.util.TextoUtil;

public class AppTest {
    
    //verifica se o método para delimitar o nome a 30 caracteres está funcionando
    @Test
    public void testeTamanhoMaximoNome(){

        String parametro = "Karoline Goergen Aparecida Vanzela ";

        TextoUtil nome = new TextoUtil();

        String tamanho = nome.cortar(parametro, 30);

        boolean flag = true;

        if(tamanho.length() <= 30){

            flag = true;
        }
        else{
            flag = false;
        }

        Assertions.assertTrue(flag);
    }

    //testa se o método altera a data em padrão BR para US
    @Test
    public void testeFormatoData(){

        String parametro = "07/05/2022";

        TextoUtil data = new TextoUtil();

        String dataFormatoUS = data.dataNova(parametro);

        Assertions.assertEquals("2022/05/07", dataFormatoUS);

    }

    //verifica se o método retorna apenas a inicial do serviço
    @Test
    public void inicialServico(){

        String parametro = "Luz";

        TextoUtil servico = new TextoUtil();

        char inicial = servico.primeiraLetra(parametro);

        Assertions.assertEquals('L', inicial);


    }

    //verifica se o protocolo possui 10 digitos, e caso possua menos, adiciona zeros a esquerda
    @Test
    public void TestProtocolo(){

        int parametro = 123;

        TextoUtil protocolo = new TextoUtil();

        String num = protocolo.converterValorProtocolo(123);

        Assertions.assertEquals(10, num.length());
        

    }


}
