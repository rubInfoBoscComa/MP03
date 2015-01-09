/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.*;
import Model.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ruben∫
 */
public class Controller {

    private FrmPrincipal view;
    private LlistaPersones model;
    private WindowListener iniciTancament;
    private static final String PATH = "persones.csv";
    private boolean nouRegistre;

    public Controller(FrmPrincipal view, LlistaPersones model) {
        this.view = view;
        this.model = model;
        this.nouRegistre = false;
    }
    
    /**
     * Funció que  estableix els events dels botons  i els events inicials/finals (carregar dades/guardar dades)
     */
    public void control() {

        //Establint a cada boto el seu Event
        view.getBtnNou().addActionListener(actionEvent
                -> accioBotoNou());
        view.getBtnEdita().addActionListener(actionEvent
                -> accioBotoEdita());
        view.getBtnEsborra().addActionListener(actionEvent
                -> accioBotoEsborra());
        view.getBtnPrimer().addActionListener(actionEvent
                -> accioBotoPrimer());
        view.getBtnDarrer().addActionListener(actionEvent
                -> accioBotoDarrer());
        view.getBtnSeguent().addActionListener(actionEvent
                -> accioBotoSeguent());
        view.getBtnAnterior().addActionListener(actionEvent
                -> accioBotoAnterior());
        view.getBtnDesa().addActionListener(actionEvent
                -> accioDesa());
        view.getBtnCancela().addActionListener(actionEvent
                -> accioCancela());

        // Escoltador d'iniciar i tancar el programa
        iniciTancament = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent actionEvent) {
                guardarDades();
            }

            public void windowOpened(WindowEvent actionEvent) {
                inicial();
            }
        };
        view.addWindowListener(iniciTancament);
    }

    /**
     * Carrega les dades inicials i Mostra el primer registre que hi ha
     */
    public void inicial() {
        llegirFitxer();
        if (model.size() > 0) {
            view.posarInformacio(model.get(0));
            view.actualitzarNumRegistre(model.getPosicioActual(), model.size());
        } else {
            view.desactivarBotonsIn();
        }

    }

    /**
     * Funcio que mira si hi ha registres, si no n'hi han, crida a la funció de
     * botons desactivats
     */
    public void mirarSiRegistres() {
        if (model.size() == 0) {
            view.desactivarBotonsIn();
        } else {
            view.activarBotonsN();
            accioBotoPrimer();
        }
    }

    /**
     * Funcio que permet fer un nou registre
     */
    public void accioBotoNou() {
        view.activarTxtFieldsButtons();
        view.esborrarTextFields();
        nouRegistre = true;
    }

    /**
     * Funcio que esborra el registre
     */
    public void accioBotoEsborra() {
        if (view.confirmacioEsborra() == 0) {
            model.remove(model.getPosicioActual()-1);
            if (model.size() > 0) {
                accioBotoPrimer();
            } else {
                accioBotoNou();
            }
        } else {
            view.mostrarMissatge("Has escollit no esborrar el registre", "Informació");
        }
    }

    /**
     * Funcio que permet editar el registre
     */
    public void accioBotoEdita() {
        view.activarTxtFieldsButtons();
        view.actualitzarNumRegistre(model.getPosicioActual(), model.size());
    }

    /**
     * Funció que posa el primer registre en pantalla
     */
    public void accioBotoPrimer() {
        view.posarInformacio(model.get(0));
        view.actualitzarNumRegistre(model.getPosicioActual(), model.size());
    }

    /**
     * Funcio que posa l'ultim registre en pantalla
     */
    public void accioBotoDarrer() {
        view.posarInformacio(model.get(model.size()-1));
        view.actualitzarNumRegistre(model.size(), model.size());
    }

    /**
     * Funcio que passa un registre endavant
     */
    public void accioBotoSeguent() {
        model.incRegistre();
        view.posarInformacio(model.get(model.getPosicioActual()-1));
        view.actualitzarNumRegistre(model.getPosicioActual(), model.size());
    }


/**
 * Funcio que passa un registre endarrere
 */
public void accioBotoAnterior() {
        model.decRegistre();
        view.posarInformacio(model.get(model.getPosicioActual()-1));
        view.actualitzarNumRegistre(model.getPosicioActual(), model.size());
    }

    /**
     * Funcio que desa una persona o els canvis realitzats en una
     */
    public void accioDesa() {
        if (view.comprovarDades()) {
            String[] dades = {view.getTxtDNI1().getText(), view.getTxtNom().getText(), view.getTxtPrimerCognom().getText(), view.getTxtSegonCognom().getText(), view.getTxtEdat().getText()};
            if (!nouRegistre) {
               
                view.actualitzarNumRegistre(model.getPosicioActual(), model.size());
            } else {
                model.add(new Persona(dades[0], dades[1], dades[2], dades[3], Integer.parseInt(dades[4])));
                model.incRegistre();
                view.actualitzarNumRegistre(model.size(), model.size());
                nouRegistre = false;
            }
            view.actDesacButtonsFields();
        }
    }

    /**
     * Funcio que cancela els canvis o la creació d'un nou registre
     */
    public void accioCancela() {
        mirarSiRegistres();
        view.actDesacButtonsFields();
    }

    
    /**
     * Funcio que llegeix el fitxer a l'iniciar l'aplicació per tal de poder
     * accedir a les dades En cas de que no el trobi, en crea un automaticament
     * al path de l'aplicació.
     */
    public void llegirFitxer() {

        BufferedReader br = null;
        FileReader fr = null;
        String line = "";
        String csvSplit = ";";

        File fitxer = new File(PATH);

        if (fitxer.exists()) {
            try {

                fr = new FileReader(fitxer);
                br = new BufferedReader(fr);

                while ((line = br.readLine()) != null) {
                    String[] dades = line.split(csvSplit);
                    model.add(new Persona(dades[0], dades[1], dades[2], dades[3], Integer.parseInt(dades[4])));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /**
     * Guardar dades en el fitxer
     */
    public void guardarDades() {
        OutputStreamWriter out = null;
        OutputStream fout;
        try {
            fout = new FileOutputStream(PATH);

            out = new OutputStreamWriter(fout, "UTF8");
            for (int bucle = 0; bucle < model.size(); bucle++) {
                Persona persona = model.get(bucle);
                out.write(persona.toString());
                out.write("\n");
            }
            out.close();
            fout.close();
        

} catch (FileNotFoundException ex) {
            Logger.getLogger(Controller.class  

.getName()).log(Level.SEVERE, null, ex);
        } 

catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Controller.class  

.getName()).log(Level.SEVERE, null, ex);
        } 

catch (IOException ex) {
            Logger.getLogger(Controller.class  

.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                out.close();
            

} catch (IOException ex) {
                Logger.getLogger(Controller.class  

.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

  

}
