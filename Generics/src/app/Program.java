package app;

/*
Crie uma aplicação que atenda ao MENU:

1- Inserir elemento na lista;
2- Mostrar Lista;
3- SAIR;

*/
import util.List;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List list = new List();
        int op;

        do {
            showMenu();                      //Mostra Menu em seguida ler entrada;
            op = sc.nextInt();

            switch (op){
                case 1 : {
                    System.out.println("Digite um número: ");
                    double value = sc.nextDouble();
                    list.add(value);
                    break;
                }
                case 2 : {
                    System.out.println("Lista: " + list.toString());
                    break;
                }
                case 3 : {
                    System.out.println("Fim do programa!");
                    break;
                }
                default:
                    System.out.println("***Opção inválida***");
            }


        }while (op != 3);



        sc.close();
    }

    public static void showMenu(){
        System.out.println("1-Insira um numero: ");
        System.out.println("2-Mostrar Lista: ");
        System.out.println("3- SAIR ");

    }
}
