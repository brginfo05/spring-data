package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RepositoryRestController
public class TesteController {

    private DuplicataPagamentoApi duplicataPagamentoApi;
    private PagedResourcesAssembler<DuplicataPagamento> assembler;

    @Autowired
    public TesteController(DuplicataPagamentoApi duplicataPagamentoApi,
                           PagedResourcesAssembler<DuplicataPagamento> assembler) {
        this.duplicataPagamentoApi = duplicataPagamentoApi;
        this.assembler = assembler;
    }

    @RequestMapping(method = GET, value = "/duplicatas-pagamento/search/listProducers")
    @ResponseBody
    public ResponseEntity<?> getProducers() {
        Page<DuplicataPagamento> producers = duplicataPagamentoApi.search(6457, false, PageRequest.of(1, 20));

        // add other links as needed

        return ResponseEntity.ok(assembler.toResource(producers));
    }
}
