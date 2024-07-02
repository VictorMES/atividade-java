public class TesteClasse {
      
    public static void main(String[] args) {
        Triangulo t = new Triangulo(2.5f,3f);
        float area = (t.base * t.altura)/2;
        System.out.println("Área: " + area);

        Data d1 = new Data(11, 9, 2001);
        Data d2 = new Data();
        System.out.println(d1.dia+"/"+d1.mes+"/"+d1.ano);
        System.out.println(d2.dia+"/"+d2.mes+"/"+d2.ano);
    }
}
