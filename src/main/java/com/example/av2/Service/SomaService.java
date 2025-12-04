package com.example.av2.Service;
import com.example.av2.dto.ListaNumerosDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SomaService {

    private static final String QUEUE_NAME = "provac2NomeLaura";

    @RabbitListener(queues = QUEUE_NAME)
    private void receberListaESomar(ListaNumerosDTO listaDTO){
        List<Integer> numeros = listaDTO.getNumeros();

        int soma = 0;
        String listaString = "[]";

        if (numeros != null && !numeros.isEmpty()) {
            for (int numero : numeros) {
                soma += numero;
            }
            listaString = numeros.toString();
        }

        System.out.println("\n projetinho B");
        System.out.println("lista de tds os numeros recebidos da fila '" + QUEUE_NAME + "': " + listaString);
        System.out.println("aq ta o resultado da soma: " + soma);
        System.out.println("-\n");
    }
}