import java.util.Scanner;
public class ProgPeso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas deseja registrar?");

        int j = sc.nextInt();
        Peso[] pessoas = new Peso[j];
        sc.nextLine();

        for(int i=0;i<j;i++){
            System.out.print("Insira o nome da "  + (i + 1) + "ª pessoa: ");
            String nome = sc.nextLine();
            System.out.print("Insira o peso da " + (i+1) + "ª pessoa: ");
            double peso = sc.nextDouble();
            System.out.print("Insira a altura da " + (i + 1) + "ª pessoa: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            Peso ps = new Peso(nome,peso,altura);
            pessoas[i] = ps;
        }
        double totalPeso=0;
        double totalAltura=0;
        double mediaPeso=0;
        double mediaAltura=0;
        double PesoMax=0;
        double AlturaMax=0;

        for(int i=0;i<j;i++)
        {
            totalPeso+=pessoas[i].getPeso();
            totalAltura+=pessoas[i].getAltura();

            if(pessoas[i].getPeso()>PesoMax)
                PesoMax=pessoas[i].getPeso();
            if(pessoas[i].getAltura()>AlturaMax)
                AlturaMax=pessoas[i].getAltura();
        }
        mediaPeso=totalPeso/j;
        mediaAltura=totalAltura/j;
        for(int i=0;i<j;i++)
        {
            System.out.println("A " + (i+1) + "ª pessoa: " + pessoas[i].Nome + ", com peso " + pessoas[i].Peso +
                    " e com a altura " + pessoas[i].Altura);
        }
        System.out.printf("O peso medio é de: %.2f%n",mediaPeso);
        System.out.printf("A altura media é de: %.2f%n",mediaAltura);
        System.out.println("O maior peso inserido é de: " + PesoMax);
        System.out.println("A maior altura inserido: " + AlturaMax);
    }
}
