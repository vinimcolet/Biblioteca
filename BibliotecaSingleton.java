package com.company;

import java.util.*;

public final class BibliotecaSingleton {

    ArrayList<Material> materiais = new ArrayList<>();
    ArrayList<Usuario> usuarios = new ArrayList<>();
    ArrayList<Reserva> reservas = new ArrayList<>();
    ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    private static BibliotecaSingleton instance = null;

    private BibliotecaSingleton() {

    }

    public static BibliotecaSingleton getInstance() {
        if (instance==null) {
        instance = new BibliotecaSingleton();
        }
        return instance;
    }

    public void TelaP(){
        //Criando um material
        //Artigo
        Artigo artigo1 = new Artigo("jose", "agua", "agua agua agua");

        //Revista
        Revista revista1 = new Revista(1, 1234567890, 1);
        revista1.publica(artigo1);

        //Livro
        Livro livro1 = new Livro(12345, "joao");

        //Criando Material
        Material material = new Material(1,"sla","testes", "alguma", livro1, revista1, null);
        materiais.add(material);
        //Criando usuario
        Usuario usuario1 = new Usuario("vinicius", "vini1111", 48999999);
        usuarios.add(usuario1);

        int aux;

        do {
            aux=0;
            System.out.println("       Bem Vindo        ");
            System.out.println();
            System.out.println("Escolha uma das opções");
            System.out.println("Opções do usuario: 1");
            System.out.println("reservar material: 2");
            System.out.println("Opções de emprestimo: 3");
            System.out.println("Sair: 4");
            Scanner sc = new Scanner(System.in);
            try {
                aux = sc.nextInt();
            }catch (Exception e){
                System.out.println("informe um dos números da lista");
                TelaP();
            }
            switch (aux){
                case 1:
                    opcUsuario();
                    break;
                case 2:
                    reservaMaterial();
                case 3:
                    opcEmprestimo();
                    break;
                case 4:
                    return;
            }
        }while (aux != 4);

    }

    //opções de tela do usuario
    private void opcUsuario(){
        int aux;
        do {
            aux=0;
            System.out.println();
            System.out.println("Novo usuario: 1");
            System.out.println("Atualizar usuario: 2");
            System.out.println("Consultar usuario: 3");
            System.out.println("Sair: 4");
            Scanner sc = new Scanner(System.in);
            try {
                aux = sc.nextInt();
            }catch (Exception e){
                System.out.println("informe um dos números da lista");
                opcUsuario();
            }
            switch (aux){
                case 1:
                    novoUsuario();
                    break;
                case 2:
                    String str;
                    System.out.println("nome do usuario a ser modificado: ");
                    Scanner sc1 = new Scanner(System.in);
                    str = sc1.next();
                    for (int i = 0; i<usuarios.size(); i++){
                        if (usuarios.get(i).getNome().equals(str)){
                            atualizarUsuario(usuarios.get(i));
                        }
                    }
                    return;
                case 3:
                    String str1;
                    System.out.println("nome do usuario a ser consultado: ");
                    Scanner sc2 = new Scanner(System.in);
                    str1 = sc2.next();
                    for (int i = 0; i<usuarios.size(); i++){
                        if (usuarios.get(i).getNome().equals(str1)){
                            consultarUsuario(usuarios.get(i));
                            return;
                        }
                    }
                    System.out.println("usuario não existe");
                case 4:
                    return;
            }
        }while (aux != 4);
    }

    //cria novo usuario
    private void novoUsuario(){
        String nome;
        String senha;
        int telefone;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nome do usuario: ");
        nome = sc.next();
        System.out.println("Senha do usuario: ");
        senha = sc.next();
        System.out.println("Telefone do usuario: ");
        telefone = sc1.nextInt();

        Usuario usuario = new Usuario(nome,senha,telefone);
        usuarios.add(usuario);
    }

    //atualiza usuario
    private void atualizarUsuario(Usuario usuario){
        String str;
        String str2;
        int num;
        System.out.println("--Atualizar usuario--");
        System.out.println("Nome do usuario: ");
        Scanner sc = new Scanner(System.in);
        Scanner scn= new Scanner(System.in);
        str = sc.next();
        System.out.println("Nova senha: ");
        str2 = sc.next();
        System.out.println("Numero telefone: ");
        num = scn.nextInt();
        usuario.setNome(str);
        usuario.setSenha(str2);
        usuario.setTelefone(num);
    }

    private void consultarUsuario(Usuario usuario){
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Senha: " + usuario.getSenha());
        System.out.println("Telefone: " + usuario.getTelefone());
    }

    //opções de tela do emprestimo
    private void opcEmprestimo(){
        int aux;
        do {
            aux=0;
            System.out.println();
            System.out.println("Novo emprestimo: 1");
            System.out.println("Devolução de emprestimo: 2");
            System.out.println("Sair: 4");
            Scanner sc = new Scanner(System.in);
            try {
                aux = sc.nextInt();
            }catch (Exception e){
                System.out.println("informe um dos números da lista");
                opcEmprestimo();
            }
            switch (aux){
                case 1:
                    novoEmprestimo();
                    break;
                case 2:
                    devolucao();
                    break;
                case 4:
                    return;
            }
        }while (aux != 4);

    }

    private void devolucao(){
        int cod1;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("devolução");
        System.out.println("Codigo do material emprestado: ");
        cod1 = sc2.nextInt();
        Date date2 = new Date();
        for (int i =0 ; i < emprestimos.size(); i++){
            if (cod1 == emprestimos.get(i).getMaterial().getCodigo()){
                emprestimos.get(i).setDataDevolucao(date2);
                System.out.println("material devolvido");
            }
        }
    }
    private void novoEmprestimo(){
        int cod;
        String nome;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("novo emprestimo");
        System.out.println("Codigo do material a ser emprestado: ");
        cod = sc.nextInt();
        temReserva(cod);
        System.out.println("Deseja continuar o emprestimo?");
        System.out.println("1 sim, 2 não");
        int opc;
        opc = sc.nextInt();
        int aux = 0;
        int aux2 = 0;
        switch (opc) {

            case 1:
                for (int i = 0; i < materiais.size(); i++){
                    if (materiais.get(i).getCodigo() == cod){
                        aux = i;
                        break;
                    }
                }

                System.out.println("Nome do usuario solicitando emprestimo: ");
                nome = sc1.next();
                GregorianCalendar gc=new GregorianCalendar();
                Date date = new Date();
                gc.setTime(date);
                gc.add(gc.MONTH, 1);
                Date date1 = gc.getTime();

                for (int i = 0; i < usuarios.size(); i++){
                    if (usuarios.get(i).getNome().equals(nome)){
                        aux2 = i;
                        break;
                    }
                }

                Emprestimo emprestimo = new Emprestimo(date, date1, false, usuarios.get(aux2), materiais.get(aux));
                emprestimos.add(emprestimo);
                System.out.println("emprestimo efetuado");
                return;
            case 2:

                return;
        }
    }

    private void temReserva(int cod){
        System.out.println("possui reservas para os dias: ");
        if (reservas!= null) {
            for (int i = 0; i < reservas.size(); i++) {
                if (reservas.get(i).getMaterial().getCodigo() == cod) {
                    System.out.println(reservas.get(i).getDataReserva());
                }
            }
        }

    }

    private void reservaMaterial(){
        int num;
        int cod = 0;
        String nome;
        System.out.println("Reserva Material");
        System.out.println("Código do Material a ser reservado:");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("nome do usuario");
        nome = sc1.next();

        for (int i = 0; i <= usuarios.size(); i++){
            if (usuarios.get(i).getNome().equals(nome)){
                cod = i;
                break;
            }
            if (i == usuarios.size()){
                System.out.println("Usuario não existe");
                return;
            }
        }

        Date date = new Date();
        for (int i = 0; i <= materiais.size(); i++ ){
            if (materiais.get(i).getCodigo() == num){
                Reserva reserva =  new Reserva(date,usuarios.get(cod),materiais.get(i));
                System.out.println("material reservado");
                break;
            }
            if (i == usuarios.size()){
                System.out.println("Material não existe");
                return;
            }
        }

    }


}
