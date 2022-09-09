package Pila;
//Programa permite almacenar texto en una pila

// ABRIR EN LA CARPETA PILA
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// import org.apache.logging.log4j.Marker;

public class Main {
    //creacion de logger
    private static Logger logger = LogManager.getLogger();

    public static void main(String args[]) throws IOException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy-HH.mm.ss");
        LocalDateTime now = LocalDateTime.now();
        String nombre = "LOGS_" + dtf.format(now) + ".txt";
        File file=new File(nombre);
        FileWriter fw=new FileWriter(file);
        PrintWriter pw=new PrintWriter(fw);
        logger.info("Hola");
        dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        // logger.info("Inicio del programa");
        pw.println(dtf.format(now) + ": Inicio del programa");
        System.out.println("Stack Underflow!!!\n");
        
        Scanner in = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        Scanner p1 = new Scanner(System.in);
        Scanner p2 = new Scanner(System.in);
        boolean flag=true;
        int tamano, opcionMenu, opcionPos, top, pos1, pos2;
        String texto;
        pw.println(dtf.format(now) + ": Se solicita ingresar tamano de la pila");
        System.out.print("Ingrese n° de elementos a almacenar: ");
        tamano = in.nextInt();
        while (tamano <=0) {
            now = LocalDateTime.now();
            pw.println(dtf.format(now) + ": Se ingresa un tamano no valido para la pila (tamano " + tamano + "). Se solicita ingresar otro tamano");
            System.out.print("No se puede crear una pila con el tamaño especificado. Ingrese un tamaño válido: ");
            tamano = in.nextInt();
        }
        Pila pila = new Pila(tamano);
        pw.println(dtf.format(now) + ": Se crea pila de " + tamano + " elementos");

        while (flag) {
            now = LocalDateTime.now();
            top = pila.getTop();
            System.out.println("\t\t\t  --MENU--");
            System.out.println("1. Agregar texto a la pila\t 2. Ver texto más largo y más corto");
            System.out.println("3. Imprimir texto de la pila\t 4. Comparar tamaños ");
            System.out.println("5. Salir");
            System.out.print("\nIngrese una opción: ");
            opcionMenu=in.nextInt();
            pw.println(dtf.format(now) + ": Se elige opcion " + opcionMenu);

            switch (opcionMenu) {
                case 1:
                    if (top == tamano) {
                        System.out.println("La pila está llena");
                        now = LocalDateTime.now();
                        pw.println(dtf.format(now) + ": La pila esta llena");
                    } else{
                        System.out.print("Ingrese texto: ");
                        texto=st.nextLine();
                        pila.push(texto);
                        now = LocalDateTime.now();
                        pw.println(dtf.format(now) + ": Se agrega texto '" + texto + "' a la pila");
                    }
                    break;

                case 2:
                    if (pila.vacio()) {
                        System.out.println("La pila está vacía");
                        now = LocalDateTime.now();
                        pw.println(dtf.format(now) + ": La pila se encuentra vacia");
                    } else{
                        System.out.format("El texto más largo es: '%s'\n", pila.getTextoMasLargo());
                        System.out.format("El texto más corto es: '%s'\n", pila.getTextoMasCorto());
                        now = LocalDateTime.now();
                        pw.println(dtf.format(now) + ": El texto de mayor largo es '" + pila.getTextoMasLargo() + "'");
                        pw.println(dtf.format(now) + ": El texto de menor largo es '" + pila.getTextoMasCorto() + "'");
                    }
                    break;

                case 3:
                    if (pila.vacio()) {
                        System.out.println("La pila está vacía");
                        now = LocalDateTime.now();
                        pw.println(dtf.format(now) + ": La pila se encuentra vacia");
                    } else{
                        System.out.format("En la pila hay %d elementos (posiciones válidas desde el 0 al %d)\n", top, top-1);
                        System.out.print("Seleccione la posición de la pila que quiere ver: ");
                        opcionPos=in.nextInt();
                        // verifica que la posicion sea valida
                        while (opcionPos<0 || opcionPos>=top) {
                            now = LocalDateTime.now();
                            pw.println(dtf.format(now) + ": Se selecciona posicion no valida (posicion " + opcionPos + "). Se solicita ingresar otra posicion");
                            System.out.print("La posición seleccionada no es válida. Ingresa otra posición: ");
                            opcionPos = in.nextInt();
                        }

                        System.out.println("\nTexto impreso: " + pila.imprimirTexto(opcionPos));
                        now = LocalDateTime.now();
                        pw.println(dtf.format(now) + ": Se imprime texto '" + pila.imprimirTexto(opcionPos) + "'");
                    }                    
                    break;

                case 4:
                    if (pila.vacio()) {
                        System.out.println("La pila está vacía");
                        now = LocalDateTime.now();
                        pw.println(dtf.format(now) + ": La pila se encuentra vacia");
                    } else{
                        System.out.format("En la pila hay %d elementos (posiciones válidas desde el 0 al %d)\n", top, top - 1);
                        System.out.print("Ingrese la posición del primer texto a comparar: ");
                        pos1=p1.nextInt();
                        while (pos1<0 || pos1>=top) {
                            System.out.print("La posición seleccionada no es válida. Ingresa otra posición: ");
                            now = LocalDateTime.now();
                            pw.println(dtf.format(now) + ": Se selecciona posicion no valida para primer texto (posición " + pos1 + "). Se solicita ingresar otra posicion");
                            pos1 = p1.nextInt();
                        }

                        System.out.print("Ingrese la posición del segundo texto a comparar: ");
                        pos2=p2.nextInt();
                        while (pos2< 0 || pos2 >=top) {
                            System.out.print("La posición seleccionada no es válida. Ingresa otra posición: ");
                            now = LocalDateTime.now();
                            pw.println(dtf.format(now) + ": Se selecciona posicion no valida para segundo texto (posición " + pos2 + "). Se solicita ingresar otra posicion");
                            pos2 = p2.nextInt();
                        }

                        System.out.println();
                        pila.compararTamanos(pos1, pos2);
                        now = LocalDateTime.now();
                        pw.println(dtf.format(now) + ": Se comparan los textos en las posiciones " + pos1 + " y " + pos2);
                    }                    
                    break;

                case 5:
                    flag=false;
                    System.out.println("Fin del programa");
                    now = LocalDateTime.now();
                    pw.println(dtf.format(now) + ": Fin del programa");
                    break;
                    
                default:
                System.out.println("Opción no válida, ingrese una opción valida");
                now = LocalDateTime.now();
                pw.println(dtf.format(now) + ": Se selecciona opcion no valida (opcion " + opcionMenu + "). Se solicita ingresar otra opcion");
                    break;
            }
        }
        
        in.close();
        st.close();
        p1.close();
        p2.close();
        fw.close();
        pw.close();
    }
}
