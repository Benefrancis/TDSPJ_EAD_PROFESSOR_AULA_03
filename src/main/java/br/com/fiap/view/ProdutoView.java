package br.com.fiap.view;

import br.com.fiap.model.Produto;

import javax.swing.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class ProdutoView {

    public static Produto form() {
        String nome = JOptionPane.showInputDialog("Nome do produto", "DELL");
        String descricao = JOptionPane.showInputDialog("Descrição", "Computador bom");
        BigDecimal preco = new BigDecimal(JOptionPane.showInputDialog("Preço", "4000"));

        return new Produto()
                .setNome(nome)
                .setDescricao(descricao)
                .setPreco(preco)
                .setFabricacao(LocalDateTime.now());

    }

}
