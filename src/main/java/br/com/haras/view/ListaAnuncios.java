/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.com.haras.view;

import br.com.haras.model.Anuncio;
import br.com.haras.view.component.CardAnuncio;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class ListaAnuncios extends javax.swing.JScrollPane {

    /**
     * Creates new form ListaAnuncios
     */
    private Anuncio[] anuncios;
    public ListaAnuncios() {
        initComponents();
        this.setLayout(new MigLayout("wrap","push[center]20[center]20[center]push"));
        //TODO criar metodo para chamada da controler e buscar a lista de anuncios
        this.renderAnuncios();
    }
    
    
    private CardAnuncio fabricNewCard(Anuncio anuncio){
        return new CardAnuncio(anuncio);
    }
    
    private void renderAnuncios(){
       for (Anuncio anuncio : this.anuncios){
           this.add(this.fabricNewCard(anuncio));
       }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
