import javax.swing.JOptionPane;

public class Exemplo {
    public static void main(String[] args) {
        String valor;
        String valor1;
        String valor2;
        int n1;
        int n2;
        int n3;
        valor = JOptionPane.showInputDialog("Digite um valor");
        valor1 = JOptionPane.showInputDialog("Digite um valor");
        valor2 = JOptionPane.showInputDialog("Digite um valor");
        n1 = Integer.parseInt(valor);
        n2 = Integer.parseInt(valor1);
        n3 = Integer.parseInt(valor2);

        JOptionPane.showMessageDialog(null, n1 + " + " + n2 +" + " + n3 + " . 3 = " + (n1 + n2 + n3) /3);

    }
}
