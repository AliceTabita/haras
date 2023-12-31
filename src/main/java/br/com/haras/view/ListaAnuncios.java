/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.com.haras.view;

import br.com.haras.model.Anuncio;
import br.com.haras.model.Cliente;
import br.com.haras.model.Equino;
import br.com.haras.view.component.CardAnuncio;
import java.awt.GridLayout;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;

public class ListaAnuncios extends JFrame {

    private JPanel content;
    private JScrollPane scrollPane;

    private List<Anuncio> anuncios;

    public ListaAnuncios() {
        initComponents();

        this.anuncios = new ArrayList<>();

        this.anuncios.add(new Anuncio(123, BigDecimal.valueOf(100.00), LocalDate.MIN, LocalDate.MIN, 1,
                new Cliente("123", "2134", "123", "123", "234"),
                new Equino()));
        this.anuncios.add(new Anuncio(123, BigDecimal.valueOf(100.00), LocalDate.MIN, LocalDate.MIN, 1,
                new Cliente("123", "2134", "123", "123", "234"),
                new Equino()));

        this.anuncios.add(new Anuncio(123, BigDecimal.valueOf(100.00), LocalDate.MIN, LocalDate.MIN, 1,
                new Cliente("123", "2134", "123", "123", "234"),
                new Equino()));
        this.anuncios.add(new Anuncio(123, BigDecimal.valueOf(100.00), LocalDate.MIN, LocalDate.MIN, 1,
                new Cliente("123", "2134", "123", "123", "234"),
                new Equino()));
        this.anuncios.add(new Anuncio(123, BigDecimal.valueOf(100.00), LocalDate.MIN, LocalDate.MIN, 1,
                new Cliente("123", "2134", "123", "123", "234"),
                new Equino()));
        this.anuncios.add(new Anuncio(123, BigDecimal.valueOf(100.00), LocalDate.MIN, LocalDate.MIN, 1,
                new Cliente("123", "2134", "123", "123", "234"),
                new Equino()));
        this.anuncios.add(new Anuncio(123, BigDecimal.valueOf(100.00), LocalDate.MIN, LocalDate.MIN, 1,
                new Cliente("123", "2134", "123", "123", "234"),
                new Equino()));
        this.anuncios.add(new Anuncio(123, BigDecimal.valueOf(100.00), LocalDate.MIN, LocalDate.MIN, 1,
                new Cliente("123", "2134", "123", "123", "234"),
                new Equino()));
        this.anuncios.add(new Anuncio(123, BigDecimal.valueOf(100.00), LocalDate.MIN, LocalDate.MIN, 1,
                new Cliente("123", "2134", "123", "123", "234"),
                new Equino()));
        this.anuncios.add(new Anuncio(123, BigDecimal.valueOf(100.00), LocalDate.MIN, LocalDate.MIN, 1,
                new Cliente("123", "2134", "123", "123", "234"),
                new Equino()));
        this.anuncios.add(new Anuncio(123, BigDecimal.valueOf(100.00), LocalDate.MIN, LocalDate.MIN, 1,
                new Cliente("123", "2134", "123", "123", "234"),
                new Equino()));
        this.anuncios.add(new Anuncio(123, BigDecimal.valueOf(100.00), LocalDate.MIN, LocalDate.MIN, 1,
                new Cliente("123", "2134", "123", "123", "234"),
                new Equino()));
        this.anuncios.add(new Anuncio(123, BigDecimal.valueOf(100.00), LocalDate.MIN, LocalDate.MIN, 1,
                new Cliente("123", "2134", "123", "123", "234"),
                new Equino()));
        this.anuncios.add(new Anuncio(123, BigDecimal.valueOf(100.00), LocalDate.MIN, LocalDate.MIN, 1,
                new Cliente("123", "2134", "123", "123", "234"),
                new Equino()));
        this.anuncios.add(new Anuncio(123, BigDecimal.valueOf(100.00), LocalDate.MIN, LocalDate.MIN, 1,
                new Cliente("123", "2134", "123", "123", "234"),
                new Equino()));

        this.setSize(1080, 720);

        this.content = new JPanel(new GridLayout(0, 3, 10, 10));

        // TODO criar metodo para chamada da controler e buscar a lista de anuncios
        this.renderAnuncios();

        this.scrollPane = new JScrollPane(this.content);

        this.scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        this.add(this.scrollPane, "w 100%, h 100%");
        this.setLocationRelativeTo(null);
        
    }

    private CardAnuncio fabricNewCard(Anuncio anuncio) {
        return new CardAnuncio(anuncio);
    }

    private void renderAnuncios() {
        for (Anuncio anuncio : this.anuncios) {
            this.content.add(this.fabricNewCard(anuncio));
        }
        this.content.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE));
    }// </editor-fold>

    // Variables declaration - do not modify
    // End of variables declaration
}
