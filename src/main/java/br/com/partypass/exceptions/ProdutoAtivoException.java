package br.com.partypass.exceptions;

public class ProdutoAtivoException extends Exception {

    private static final long serialVersionUID = -2346384470483785588L;

    public ProdutoAtivoException() {
        super("Já existe um produto para esse código!");
    }

}
