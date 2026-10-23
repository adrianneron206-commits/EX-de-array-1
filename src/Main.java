void main() {
        int[] dades = new int[5];
        int i;

        for (i = 0; i <= 4; i++) {
            System.out.println("Introdueix un número");
            dades[i] = Integer.parseInt(System.console().readLine());
        }

        for (i = 0; i <= 4; i++) {
            System.out.println(i + ": " + dades[i]);
        }

        System.out.println("Longitud: " + dades.length);
        System.out.println("Primer valor: " + dades[0]);
        System.out.println("Últim valor: " + dades[4]);
    }