package br.edu.fafic.classes;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import br.edu.fafic.telas.TelaPrincipal;

public class Chooser{

    JFileChooser filechooser = new JFileChooser();
    TelaPrincipal tela = new TelaPrincipal();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagem", "jpg", "png");
    File file = null;

    public File buscarImagem(){
        filechooser.setDialogTitle("Procurar Arquivo");
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setFileFilter(filter);
        
        
        int retorno = filechooser.showOpenDialog(filechooser);
        if(retorno == JFileChooser.APPROVE_OPTION){
            file = filechooser.getSelectedFile();           
            
        }
        return file;
    }


    
}
