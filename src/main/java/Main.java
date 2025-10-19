import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        INSTRUCCIONES:
        Crear un arraylist con al menos 5 discos, con los datos: Artista, título, año, duración (pueden ser otros).
            - Mostrar todos los discos, con todos los datos
            - Mostrar uno determinado: por ejemplo el año del tercer disco (esto lo podría pedir el cliente, o no)
            - Cambiar ese mismo año (esto lo podría pedir el cliente, o no) y mostrar ese cambio. A ver si lo encontráis!
            - Etc hacer pruebas

        EXTRA: buscador con contains() o con equals(). Que el usuario escriba nombre de artista y me diga si está, y en qué posición está.

        NIVEL 2
        Que todos estos datos los entre el cliente: usuario entra Artista, título, año y duración (no hace falta hacer un CRUD entero).
        */
        Scanner sc = new Scanner(System.in);

        // Creamos la lista con 5 discos
        List<Disco> discos = new ArrayList<>();
        discos.add(new Disco("Daft Punk", "Random Access Memories", 2013, "74:24"));
        discos.add(new Disco("Radiohead", "OK Computer", 1997, "53:27"));
        discos.add(new Disco("Beyoncé", "Renaissance", 2022, "62:14"));
        discos.add(new Disco("Kendrick Lamar", "DAMN.", 2017, "54:54"));
        discos.add(new Disco("Adele", "21", 2011, "48:12"));

        System.out.println("LISTADO INICIAL DE DISCOS:");
        imprimirDiscos(discos);

        // Mostramos el año del tercer disco
        if (discos.size() >= 3) {
            Disco tercero = discos.get(2);
            System.out.println("\nAño del tercer disco (" + tercero.getTitulo() + "): " + tercero.getAno());

            // Cambiamos el año y lo mostramos
            tercero.setAno(2023);
            System.out.println("Nuevo año del tercer disco: " + tercero.getAno());
        }

        // Mostrar la lista actualizada
        System.out.println("\nLISTA ACTUALIZADA:");
        imprimirDiscos(discos);

        // EXTRA: Buscamos por artista
        System.out.print("\nEscribe el nombre del artista a buscar: ");
        String busqueda = sc.nextLine().trim().toLowerCase();

        boolean encontrado = false;
        for (int i = 0; i < discos.size(); i++) {
            if (discos.get(i).getArtista().toLowerCase().contains(busqueda)) {
                System.out.println("Coincidencia en posición " + (i + 1) + ": " + discos.get(i).getArtista());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron coincidencias.");
        }

        // NIVEL 2: El usuario añade un nuevo disco
        System.out.println("\nAÑADIR NUEVO DISCO:");

        System.out.print("Artista: ");
        String artista = sc.nextLine();

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Año: ");
        int ano = Integer.parseInt(sc.nextLine());

        System.out.print("Duración: ");
        String duracion = sc.nextLine();

        discos.add(new Disco(artista, titulo, ano, duracion));

        System.out.println("\n✅ Disco añadido correctamente.\nLISTA FINAL:");
        imprimirDiscos(discos);

        sc.close();
    }

    private static void imprimirDiscos(List<Disco> discos) {
        for (int i = 0; i < discos.size(); i++) {
            System.out.println("Disco " + (i + 1) + ": " + discos.get(i));
        }
    }
}
