package appfiguracomclasseabstrata;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String tipoFigura[] = {"Retângulo", "Circulo"};

        String opUsr = (String) JOptionPane.showInputDialog(null, "Selecione o tipo de figura:", "Exemplo Classe Abstrata",
                3, null, tipoFigura, tipoFigura[0]);
         
        Figura figura=null;
        
        
        
        switch (opUsr) {
            case "Retângulo":
                float base = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a base do retângulo",
                        "Exemplo Classe Abstrata", 3));
                float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a altura do retângulo",
                        "Exemplo Classe Abstrata", 3));
                figura = new Retangulo(base, altura);
                
                break;

            case "Circulo":
                double raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o raio",
                        "Exemplo Classe Abstrata", 3));
                figura = new Circulo(raio);
         }
        JOptionPane.showMessageDialog(null, figura.dadosFigura(), "Exemplo Classe Abstrata", 1);
        System.exit(0);
    }

}
