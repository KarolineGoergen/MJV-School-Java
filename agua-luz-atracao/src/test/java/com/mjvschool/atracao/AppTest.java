package com.mjvschool.atracao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.mjvschool.atracao.util.TextoUtil;

public class AppTest {
    
    //verifica se o método para delimitar o nome a 30 caracteres está funcionando
    @Test
    public void testeTamanhoMaximoNome(){

        TextoUtil nome = new TextoUtil();

        String tamanho = nome.cortar("Karoline Goergen Aparecida Vanzela ", 30);

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

        TextoUtil data = new TextoUtil();

        String dataFormatoUS = data.dataNova("07/05/2022");

        Assertions.assertEquals("2022/05/07", dataFormatoUS);

    }

    //verifica se o método retorna apenas a inicial do serviço
    @Test
    public void inicialServico(){

        TextoUtil servico = new TextoUtil();

        char inicial = servico.primeiraLetra("Luz");

        Assertions.assertEquals('L', inicial);


    }

    //verifica se o protocolo possui 10 digitos, e caso possua menos, adiciona zeros a esquerda
    @Test
    public void TestProtocolo(){

        TextoUtil protocolo = new TextoUtil();

        String num = protocolo.converterValorProtocolo(123);

        Assertions.assertEquals(10, num.length());
        

    }


}
