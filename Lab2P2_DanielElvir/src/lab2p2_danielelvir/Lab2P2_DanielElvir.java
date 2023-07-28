/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_danielelvir;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Lab2P2_DanielElvir {

    static ArrayList<Chefs> chefs = new ArrayList();
    static ArrayList<Meseros> meseros = new ArrayList();
    static ArrayList<Bartenders> bartenders = new ArrayList();
    static ArrayList<Mesas> mesas = new ArrayList();
        static Scanner leer = new Scanner(System.in);
    static Scanner read = new Scanner(System.in);
    static String mat = "Matutino";
    static String vesp = "Vespertino";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean seguir = true;

        while (seguir) {
            System.out.println("BIENVENIDO AL RESTAURANTE SEÑOR GERENTE");
            System.out.println("1. Inicio de sesion");
            System.out.println("2. Salir");
            System.out.println("Ingrese una opcion");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1: {
                    String usuario = "gerente";
                    String contraseña = "g3r$nt0";
                    System.out.println("Ingrese su usuario");
                    String usu = read.nextLine();
                    System.out.println("Ingrese su contraseña");
                    String con = read.nextLine();

                    boolean valido = true;

                    while (valido) {
                        if (usuario.equals(usu) && contraseña.equals(con)) {
                            System.out.println("Bienvenido señor Gerente");
                            valido = true;
                        } else {
                            System.out.println("Usuario y/o contraseña incorrectos");
                            valido = false;
                            break;

                        }
                        System.out.println("Que desea agregar?");
                        System.out.println("1. Chefs");
                        System.out.println("2. Meseros");
                        System.out.println("3. Bartenders");
                        System.out.println("4. Mesas");
                        System.out.println("5. Salir del sistema");
                        int opcion1 = leer.nextInt();

                        boolean dentro = true;
                        while (dentro) {
                            int contmat = 0;
                            int contvesp = 0;
                            switch (opcion1) {

                                case 1: {

                                    System.out.println("Bienvenido a a opcion de chefs");
                                    System.out.println("1. Crear chefs");
                                    System.out.println("2. Modificar chefs");
                                    System.out.println("3. Eliminar chefs");
                                    System.out.println("4. Listar chefs");
                                    System.out.println("5. Volver al menu principal");
                                    int opcion2 = leer.nextInt();

                                    switch (opcion2) {
                                        case 1: {
                                            if (chefs.size() < 14) {
                                                System.out.println("Ingrese el nombre del chef");
                                                String nom = read.nextLine();
                                                System.out.println("Ingrese la edad del chef");
                                                int edad = leer.nextInt();
                                                boolean mayor = true;
                                                while (mayor) {
                                                    if (edad > 0) {
                                                        mayor = false;
                                                    } else {
                                                        mayor = true;
                                                        System.out.println("Ingrese la edad del chef");
                                                        edad = leer.nextInt();
                                                    }
                                                }
                                                System.out.println("De que turno es? (Matutino/Despertino)");
                                                String turno = read.nextLine();

                                                if (turno.equalsIgnoreCase(mat) && contarChef(turno) >= 7) {
                                                    System.out.println("No se pueden agregar más chefs matutinos");
                                                    break;
                                                }

                                                if (turno.equalsIgnoreCase(vesp) && contarChef(turno) >= 7) {
                                                    System.out.println("No se pueden agregar más chefs vespertinos");
                                                    break;
                                                }

                                                System.out.println("Cuantas estrellas Michelin tiene?");
                                                int estrellas = leer.nextInt();
                                                System.out.println("Cual es el sueldo del chef?");
                                                double sueldo = leer.nextDouble();

                                                chefs.add(new Chefs(nom, edad, turno, estrellas, sueldo));
                                                System.out.println("Chef agregado exitosamente");
                                            } else {
                                                System.out.println("Ya no puede agregar más chefs, alcanzó el limite");
                                            }

                                            break;
                                        }

                                        case 2: {
                                            if (!chefs.isEmpty()) {
                                                System.out.println(listaChef(chefs) + "\n" + "Cual chef desea modificar?");
                                                int index = leer.nextInt();
                                                if (index >= 0 && index < chefs.size()) {
                                                    System.out.println("Ingrese el nombre del chef");
                                                    String nomN = read.nextLine();
                                                    ((Chefs) chefs.get(index)).setNombre(nomN);
                                                    System.out.println("Ingrese la edad del chef");
                                                    int edadN = leer.nextInt();

                                                    boolean mayor = true;
                                                    while (mayor) {
                                                        if (edadN > 0) {
                                                            mayor = false;
                                                        } else {
                                                            mayor = true;
                                                            System.out.println("Ingrese la edad del chef");
                                                            edadN = leer.nextInt();

                                                        }
                                                    }
                                                    ((Chefs) chefs.get(index)).setEdad(edadN);
                                                    System.out.println("De que turno es? (Matutino/Despertino)");
                                                    String turnoN = read.nextLine();

                                                    if (turnoN.equalsIgnoreCase(mat) && contarChef(turnoN) >= 7) {
                                                        System.out.println("No se pueden agregar más chefs matutinos");
                                                        break;
                                                    }

                                                    if (turnoN.equalsIgnoreCase(vesp) && contarChef(turnoN) >= 7) {
                                                        System.out.println("No se pueden agregar más chefs vespertinos");
                                                        break;
                                                    }
                                                    ((Chefs) chefs.get(index)).setTurno(turnoN);
                                                    System.out.println("Cuantas estrellas Michelin tiene?");
                                                    int estrellasN = leer.nextInt();
                                                    ((Chefs) chefs.get(index)).setEstrellas(estrellasN);
                                                    System.out.println("Cual es el sueldo del chef?");
                                                    double sueldoN = leer.nextDouble();
                                                    ((Chefs) chefs.get(index)).setSueldo(sueldoN);

                                                    System.out.println("Chef modificado exitosamente");
                                                } else {
                                                    System.out.println("Ese chef no existe");
                                                }
                                            } else {
                                                System.out.println("No puede modificar una lista vacia :/");
                                            }
                                            break;
                                        }

                                        case 3: {
                                            if (!chefs.isEmpty()) {
                                                System.out.println(listaChef(chefs) + "\n" + "Cual chef desea eliminar?");
                                                int index = leer.nextInt();
                                                if (index >= 0 && index < chefs.size()) {
                                                    chefs.remove(index);
                                                    System.out.println("Chef eliminado exitosamente");
                                                } else {
                                                    System.out.println("Ese chef no está dentro de los parametros");
                                                }
                                            } else {
                                                System.out.println("No puede eliminar si una lista está vacia");
                                            }
                                            break;
                                        }

                                        case 4: {
                                            if (!chefs.isEmpty()) {
                                                System.out.println("Estos son los chefs actuales" + "\n" + listaChef(chefs));
                                            } else {
                                                System.out.println("No puede listar algo que no tiene nada");
                                            }

                                            break;
                                        }

                                        case 5: {
                                            System.out.println("Volviendo al menu principal");
                                            System.out.println("");
                                            dentro = false;
                                            break;
                                        }

                                    }
                                    break;
                                }

                                case 2: {
                                    System.out.println("Bienvenido a a opcion de meseros");
                                    System.out.println("1. Crear meseros");
                                    System.out.println("2. Modificar meseros");
                                    System.out.println("3. Eliminar meseros");
                                    System.out.println("4. Listar meseros");
                                    System.out.println("5. Volver al menu principal");
                                    int opcion2 = leer.nextInt();

                                    switch (opcion2) {
                                        case 1: {
                                            if (meseros.size() < 8) {
                                                System.out.println("Ingrese el nombre del mesero");
                                                String nom = read.nextLine();
                                                System.out.println("Ingrese la edad del mesero");
                                                int edad = leer.nextInt();
                                                boolean mayor = true;
                                                while (mayor) {
                                                    if (edad > 0) {
                                                        mayor = false;
                                                    } else {
                                                        mayor = true;
                                                        System.out.println("Ingrese la edad del mesero");
                                                        edad = leer.nextInt();
                                                    }
                                                }
                                                System.out.println("De que turno es? (Matutino/Despertino)");
                                                String turno = read.nextLine();
                                                if (turno.equalsIgnoreCase(mat) && contarMeseros(turno) >= 4) {
                                                    System.out.println("No se pueden agregar más meseros matutinos");
                                                    break;
                                                }

                                                if (turno.equalsIgnoreCase(vesp) && contarMeseros(turno) >= 4) {
                                                    System.out.println("No se pueden agregar más meseros vespertinos");
                                                    break;
                                                }
                                                System.out.println("Cual es el sueldo del mesero?");
                                                double sueldo = leer.nextDouble();
                                                System.out.println("Cual la propina del mesero?");
                                                double propina = leer.nextDouble();

                                                meseros.add(new Meseros(nom, edad, turno, propina, sueldo));
                                                System.out.println("Mesero agregado exitosamente");
                                            } else {
                                                System.out.println("Ya no puede agregar más meseros, alcanzó el limite");
                                            }
                                            break;
                                        }

                                        case 2: {
                                            if (!meseros.isEmpty()) {
                                                System.out.println(listaMeseros(meseros) + "\n" + "Cual Mesero desea modificar?");
                                                int index = leer.nextInt();
                                                if (index >= 0 && index < meseros.size()) {
                                                    System.out.println("Ingrese el nombre del mesero");
                                                    String nomN = read.nextLine();
                                                    ((Meseros) meseros.get(index)).setNombre(nomN);
                                                    System.out.println("Ingrese la edad del mesero");
                                                    int edadN = leer.nextInt();

                                                    boolean mayor = true;
                                                    while (mayor) {
                                                        if (edadN > 0) {
                                                            mayor = false;
                                                        } else {
                                                            mayor = true;
                                                            System.out.println("Ingrese la edad del mesero");
                                                            edadN = leer.nextInt();
                                                        }
                                                    }
                                                    ((Meseros) meseros.get(index)).setEdad(edadN);
                                                    System.out.println("De que turno es? (Matutino/Despertino)");
                                                    String turnoN = read.nextLine();
                                                    if (turnoN.equalsIgnoreCase(mat) && contarMeseros(turnoN) >= 4) {
                                                        System.out.println("No se pueden agregar más meseros matutinos");
                                                        break;
                                                    }

                                                    if (turnoN.equalsIgnoreCase(vesp) && contarMeseros(turnoN) >= 4) {
                                                        System.out.println("No se pueden agregar más meseros vespertinos");
                                                        break;
                                                    }
                                                    ((Meseros) meseros.get(index)).setTurno(turnoN);
                                                    System.out.println("Cual es el sueldo del mesero?");
                                                    double sueldoN = leer.nextDouble();
                                                    ((Meseros) meseros.get(index)).setSueldo(sueldoN);
                                                    System.out.println("Cual la propina del mesero?");
                                                    double propinaN = leer.nextDouble();
                                                    ((Meseros) meseros.get(index)).setPropina(propinaN);

                                                    System.out.println("Mesero modificado exitosamente");
                                                } else {
                                                    System.out.println("Ese mesero está fuera de los parametros");
                                                }
                                            } else {
                                                System.out.println("No puede modificar una lista vacia :/");
                                            }
                                            break;
                                        }

                                        case 3: {
                                            if (!meseros.isEmpty()) {
                                                System.out.println(listaMeseros(meseros) + "\n" + "Cual chef desea eliminar?");
                                                int index = leer.nextInt();
                                                if (index >= 0 && index < meseros.size()) {
                                                    meseros.remove(index);
                                                    System.out.println("Mesero eliminado exitosamente");
                                                } else {
                                                    System.out.println("Ese mesero no está dentro de los parametros");
                                                }
                                            } else {
                                                System.out.println("No puede eliminar si una lista está vacia");
                                            }
                                            break;
                                        }

                                        case 4: {
                                            if (!meseros.isEmpty()) {
                                                System.out.println("Estos son los meseros actuales" + "\n" + listaMeseros(meseros));
                                            } else {
                                                System.out.println("No puede listar algo que no tiene nada");
                                            }
                                            break;
                                        }

                                        case 5: {
                                            System.out.println("Volviendo al menu principal");
                                            System.out.println("");
                                            dentro = false;
                                            break;
                                        }

                                    }
                                    break;
                                }

                                case 3: {
                                    System.out.println("Bienvenido a a opcion de Bartenders");
                                    System.out.println("1. Crear Bartenders");
                                    System.out.println("2. Modificar Bartenders");
                                    System.out.println("3. Eliminar Bartenders");
                                    System.out.println("4. Listar Bartenders");
                                    System.out.println("5. Volver al menu principal");
                                    int opcion2 = leer.nextInt();

                                    switch (opcion2) {
                                        case 1: {
                                            if (bartenders.size() < 4) {
                                                System.out.println("Ingrese el nombre del bartender");
                                                String nom = read.nextLine();
                                                System.out.println("Ingrese la edad del bartender");
                                                int edad = leer.nextInt();
                                                boolean mayor = true;
                                                while (mayor) {
                                                    if (edad > 0) {
                                                        mayor = false;
                                                    } else {
                                                        mayor = true;
                                                        System.out.println("Ingrese la edad del bartender");
                                                        edad = leer.nextInt();
                                                    }
                                                }
                                                System.out.println("De que turno es? (Matutino/Despertino)");                                                
                                                String turno = read.nextLine();
                                                if (turno.equalsIgnoreCase(mat) && contarBartender(turno) >= 2) {
                                                        System.out.println("No se pueden agregar más bartender matutinos");
                                                        break;
                                                    }

                                                    if (turno.equalsIgnoreCase(vesp) && contarBartender(turno) >= 2) {
                                                        System.out.println("No se pueden agregar más bartender vespertinos");
                                                        break;
                                                    }
                                                System.out.println("Cuantos licores tiene?");
                                                int licor = leer.nextInt();
                                                System.out.println("Cual es el sueldo del bartender?");
                                                double sueldo = leer.nextDouble();

                                                bartenders.add(new Bartenders(nom, edad, turno, licor, sueldo));
                                                System.out.println("Bartender agregado exitosamente");
                                            } else {
                                                System.out.println("Ya no puede agregar más bartenders, alcanzó el limite");
                                            }
                                            break;
                                        }

                                        case 2: {
                                            if (!bartenders.isEmpty()) {
                                                System.out.println(listaBartenders(bartenders) + "\n" + "Cual Mesero desea modificar?");
                                                int index = leer.nextInt();
                                                if (index >= 0 && index < bartenders.size()) {
                                                    System.out.println("Ingrese el nombre del bartender");
                                                    String nomN = read.nextLine();
                                                    ((Bartenders) bartenders.get(index)).setNombre(nomN);
                                                    System.out.println("Ingrese la edad del bartender");
                                                    int edadN = leer.nextInt();
                                                    boolean mayor = true;
                                                    while (mayor) {
                                                        if (edadN > 0) {
                                                            mayor = false;
                                                        } else {
                                                            mayor = true;
                                                            System.out.println("Ingrese la edad del bartender");
                                                            edadN = leer.nextInt();
                                                        }
                                                    }
                                                    ((Bartenders) bartenders.get(index)).setEdad(edadN);
                                                    System.out.println("De que turno es? (Matutino/Despertino)");
                                                    String turnoN = read.nextLine();
                                                    if (turnoN.equalsIgnoreCase(mat) && contarBartender(turnoN) >= 2) {
                                                        System.out.println("No se pueden agregar más bartender matutinos");
                                                        break;
                                                    }

                                                    if (turnoN.equalsIgnoreCase(vesp) && contarBartender(turnoN) >= 2) {
                                                        System.out.println("No se pueden agregar más bartender vespertinos");
                                                        break;
                                                    }
                                                    ((Bartenders) bartenders.get(index)).setTurno(turnoN);
                                                    System.out.println("Cuantos licores tiene?");
                                                    int licorN = leer.nextInt();
                                                    ((Bartenders) bartenders.get(index)).setNumLicores(licorN);
                                                    System.out.println("Cual es el sueldo del bartender?");
                                                    double sueldoN = leer.nextDouble();
                                                    ((Bartenders) bartenders.get(index)).setSueldo(sueldoN);
                                                    System.out.println("Bartender modificado exitosamente");
                                                } else {
                                                    System.out.println("Ese bartender está fuera de los parametros");
                                                }

                                            } else {
                                                System.out.println("No puede modificar una lista vacia :/");
                                            }
                                            break;
                                        }

                                        case 3: {
                                            if (!bartenders.isEmpty()) {
                                                System.out.println(listaBartenders(bartenders) + "\n" + "Cual bartender desea eliminar?");
                                                int index = leer.nextInt();
                                                if (index >= 0 && index < bartenders.size()) {
                                                    bartenders.remove(index);
                                                    System.out.println("Bartender eliminado exitosamente");
                                                } else {
                                                    System.out.println("Ese bartender no está dentro de los parametros");
                                                }
                                            } else {
                                                System.out.println("No puede eliminar si una lista está vacia");
                                            }
                                            break;
                                        }

                                        case 4: {
                                            if (!bartenders.isEmpty()) {
                                                System.out.println("Estos son los bartenders actuales" + "\n" + listaBartenders(bartenders));
                                            } else {
                                                System.out.println("No puede listar algo que no tiene nada");
                                            }
                                            break;
                                        }

                                        case 5: {
                                            System.out.println("Volviendo al menu principal");
                                            System.out.println("");
                                            dentro = false;
                                            break;
                                        }

                                    }
                                    break;
                                }

                                case 4: {
                                    System.out.println("Bienvenido a a opcion de Mesas");
                                    System.out.println("1. Crear Mesas");
                                    System.out.println("2. Modificar Mesas");
                                    System.out.println("3. Eliminar Mesas");
                                    System.out.println("4. Listar Mesas");
                                    System.out.println("5. Dar el precio total de las mesas");
                                    System.out.println("6. Volver al menu principal");
                                    int opcion2 = leer.nextInt();

                                    switch (opcion2) {
                                        case 1: {
                                            if (mesas.size() < 10) {
                                                System.out.println("Ingrese el numero de platos");
                                                int platos = leer.nextInt();
                                                System.out.println("Ingrese el numero de utensilios");
                                                int utensilios = leer.nextInt();

                                                System.out.println("Cual es el precio de la mesa?");
                                                double precio = leer.nextDouble();

                                                mesas.add(new Mesas(platos, utensilios, precio));
                                                System.out.println("Mesa agregada exitosamente");
                                            } else {
                                                System.out.println("Ya no puede agregar más chefs, alcanzó el limite");
                                            }
                                            break;
                                        }

                                        case 2: {
                                            if (chefs.isEmpty()) {
                                                System.out.println("Cual mesa desea modificar?" + "\n" + listaMesas(mesas));
                                                int index = leer.nextInt();
                                                if (index >= 0 && index < mesas.size()) {
                                                    System.out.println("Ingrese el numero de platos");
                                                    int platos = leer.nextInt();
                                                    ((Mesas) mesas.get(index)).setPlatos(platos);
                                                    System.out.println("Ingrese el numero de utensilios");
                                                    int utensilios = leer.nextInt();
                                                    ((Mesas) mesas.get(index)).setUtensilios(utensilios);
                                                    System.out.println("Cual es el precio de la mesa?");
                                                    double precio = leer.nextDouble();
                                                    ((Mesas) mesas.get(index)).setPrecio(precio);

                                                    System.out.println("Mesa modificada exitosamente");
                                                } else {
                                                    System.out.println("La mesa está fuera de parametros");
                                                }
                                            } else {
                                                System.out.println("No puede modificar una lista vacia :/");
                                            }
                                            break;
                                        }

                                        case 3: {
                                            if (!mesas.isEmpty()) {
                                                System.out.println(listaMesas(mesas) + "\n" + "Cual mesa desea eliminar?");
                                                int index = leer.nextInt();
                                                if (index >= 0 && index < mesas.size()) {
                                                    mesas.remove(index);
                                                    System.out.println("Bartender eliminado exitosamente");
                                                } else {
                                                    System.out.println("Esa mesa no está dentro de los parametros");
                                                }
                                            } else {
                                                System.out.println("No puede eliminar si una lista está vacia");
                                            }
                                            break;
                                        }

                                        case 4: {
                                            if (!mesas.isEmpty()) {
                                                System.out.println("Estos son los bartenders actuales" + "\n" + listaMesas(mesas));
                                            } else {
                                                System.out.println("No puede listar algo que no tiene nada");
                                            }
                                            break;
                                        }

                                        case 5: {
                                            System.out.println("El precio total de las mesas es " + PrecioFinal());
                                            break;
                                        }

                                        case 6: {
                                            System.out.println("Volviendo al menu principal");
                                            System.out.println("");
                                            dentro = false;
                                            break;
                                        }

                                    }
                                    break;
                                }

                                case 5: {
                                    System.out.println("Volviendo al menu principal...");
                                    System.out.println("");
                                    dentro = false;
                                    valido = false;
                                    break;
                                }
                            }
                        }

                    }
                    break;
                }

                case 2: {
                    System.out.println("Tenga un buen dia Gerente");
                    seguir = false;
                    break;
                }
            }
        }
    }

    public static String listaChef(ArrayList cosas) {
        String salida = "";
        for (Object cosa : cosas) {
            if (cosa instanceof Chefs) {
                salida += cosas.indexOf(cosa) + " - Chef " + cosa + "\n";
            }

        }
        return salida;
    }

    public static String listaMeseros(ArrayList cosas) {
        String salida = "";
        for (Object cosa : cosas) {
            if (cosa instanceof Meseros) {
                salida += cosas.indexOf(cosa) + " - Mesero "+"\n" + cosa + "\n";
            }

        }
        return salida;
    }

    public static String listaBartenders(ArrayList cosas) {
        String salida = "";
        for (Object cosa : cosas) {
            if (cosa instanceof Bartenders) {
                salida += cosas.indexOf(cosa) + " - Bartender "+"\n" + cosa + "\n";
            }

        }
        return salida;
    }

    public static String listaMesas(ArrayList cosas) {
        String salida = "";
        for (Object cosa : cosas) {
            if (cosa instanceof Mesas) {
                salida += cosas.indexOf(cosa) + " - Mesa " +"\n"+ cosa + "\n";
            }

        }
        return salida;
    }

    public static int contarChef(String turno) {
        int cont = 0;
        for (Chefs chef : chefs) {
            if (chef.getTurno().equalsIgnoreCase(turno)) {
                cont++;
            }
        }
        return cont;
    }

    public static int contarMeseros(String turno) {
        int cont = 0;
        for (Meseros mesero : meseros) {
            if (mesero.getTurno().equalsIgnoreCase(turno)) {
                cont++;
            }
        }
        return cont;
    }

    public static int contarBartender(String turno) {
        int cont = 0;
        for (Bartenders bartender : bartenders) {
            if (bartender.getTurno().equalsIgnoreCase(turno)) {
                cont++;
            }
        }
        return cont;
    }

    public static double PrecioFinal(){
        double precioF=0.0;
        for (Mesas mesa : mesas) {
            precioF+=mesa.getPrecio();
        }
        return precioF;
    }
}
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA