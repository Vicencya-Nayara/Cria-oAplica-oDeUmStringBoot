package br.com.vicencyanayara.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller é um componente, utliza para de ser a camada de requisição, e ademais camadas.


@RestController
@RequestMapping("/primeiraRota")
//http://localhost:8080/ ----- -> isso se chama rota
public class MinhaPrimeiraController {
    /* Métodos de acesso do HTTP
     * GET - Buscar informação
     * POST - Adicionar um dado/informação
     * PUT - Alterar um dado/info
     * DELETE - Remover um dado
     * PATCH - Alterar somente uma parte da informação
     */

    // Método (Funcionalidade) de uma classe
    @GetMapping("/primeiroMetodo")
    
    public String primeiraMensagem(){
        return "Funcionou";
    }
    
}
