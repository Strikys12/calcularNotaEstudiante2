import java.util.Scanner;

/*
Desarrollo: Lógica, metodologías, introducción.
Diseño: Tipografia, iconografia y semántica.
Gastronomía: Costos, panadería dulce, Cocina internacional. */
public class App {
    public static void main(String[] args) throws Exception {
        double porcentaje1 = 0.2;
        double porcentaje2 = 0.3;
        double porcentaje3 = 0.5;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre completo");
        String nombreEstudiante = sc.nextLine();

        System.out.println("Ingrese su número de Documento");
        String numeroDocumento = sc.nextLine();

        System.out.println("Indique el programa académico al cual pertenece");
        System.out.println("1 - Desarrollo de Software \n2 - Diseño Gráfico \n3 - Gastronomía");
        String programa = sc.nextLine();
        switch (programa) {
            case "1":
                System.out.println("Indique la asignatura");
                System.out.println(
                        "1 - Lógica de programación \n2 - Metodologías Agiles \n3 - Introducción a la programación");
                String materia = sc.nextLine();
                switch (materia) {
                    case "1":
                        System.out.println("Lógica de Programación");
                        double nota1 = 2.1 * porcentaje1;
                        double nota2 = 4.5 * porcentaje2;
                        double nota3 = 3.5 * porcentaje3;
                        double notaFinal = nota1 + nota2 + nota3;
                        if (notaFinal >= 0 && notaFinal <= 2) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nPerdiste la materia");
                        }
                        if (notaFinal >= 2.1 && notaFinal <= 2.9) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nTienes derecho a hacer un examen de nivelaciòn");
                        }
                        if (notaFinal >= 3) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nFelicidades, ganaste la materia");
                        }
                        break;
                    case "2":
                        System.out.println("Metodologías Agiles");
                        nota1 = 1.1 * porcentaje1;
                        nota2 = 0.5 * porcentaje2;
                        nota3 = 0.5 * porcentaje3;
                        notaFinal = nota1 + nota2 + nota3;
                        if (notaFinal >= 0 && notaFinal <= 2) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nPerdiste la materia");
                        }
                        if (notaFinal >= 2.1 && notaFinal <= 2.9) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nTienes derecho a hacer un examen de nivelaciòn");
                        }
                        if (notaFinal >= 3) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nFelicidades, ganaste la materia");
                        }
                        break;
                    case "3":
                        System.out.println("Introducción a la programación");
                        nota1 = 4.0 * porcentaje1;
                        nota2 = 4.5 * porcentaje2;
                        nota3 = 5.0 * porcentaje3;
                        notaFinal = nota1 + nota2 + nota3;
                        if (notaFinal >= 0 && notaFinal <= 2) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nPerdiste la materia");
                        }
                        if (notaFinal >= 2.1 && notaFinal <= 2.9) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nTienes derecho a hacer un examen de nivelaciòn");
                        }
                        if (notaFinal >= 3) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nFelicidades, ganaste la materia");
                        }
                        break;
                }
                break;
            case "2":
                System.out.println("Indique la asignatura");
                System.out.println("1 - Tipografía \n2 - Iconografría \n3 - Semántica");
                materia = sc.nextLine();
                switch (materia) {
                    case "1":
                        System.out.println("Tipografía");
                        double nota1 = 2.1 * porcentaje1;
                        double nota2 = 4.5 * porcentaje2;
                        double nota3 = 3.5 * porcentaje3;
                        double notaFinal = nota1 + nota2 + nota3;
                        if (notaFinal >= 0 && notaFinal <= 2) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nPerdiste la materia");
                        }
                        if (notaFinal >= 2.1 && notaFinal <= 2.9) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nTienes derecho a hacer un examen de nivelaciòn");
                        }
                        if (notaFinal >= 3) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nFelicidades, ganaste la materia");
                        }
                        break;
                    case "2":
                        System.out.println("Iconografía");
                        nota1 = 1.1 * porcentaje1;
                        nota2 = 0.5 * porcentaje2;
                        nota3 = 0.5 * porcentaje3;
                        notaFinal = nota1 + nota2 + nota3;
                        if (notaFinal >= 0 && notaFinal <= 2) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nPerdiste la materia");
                        }
                        if (notaFinal >= 2.1 && notaFinal <= 2.9) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nTienes derecho a hacer un examen de nivelaciòn");
                        }
                        if (notaFinal >= 3) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nFelicidades, ganaste la materia");
                        }
                        break;
                    case "3":
                        System.out.println("Semántica");
                        nota1 = 4.0 * porcentaje1;
                        nota2 = 4.5 * porcentaje2;
                        nota3 = 5.0 * porcentaje3;
                        notaFinal = nota1 + nota2 + nota3;
                        if (notaFinal >= 0 && notaFinal <= 2) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nPerdiste la materia");
                        }
                        if (notaFinal >= 2.1 && notaFinal <= 2.9) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nTienes derecho a hacer un examen de nivelaciòn");
                        }
                        if (notaFinal >= 3) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nFelicidades, ganaste la materia");
                        }
                        break;
                }
                break;
            case "3":
                System.out.println("Indique la asignatura");
                System.out.println("1 - Costos \n2 - Panaderia Dulce \n3 - Cocina Internacional");
                materia = sc.nextLine();
                switch (materia) {
                    case "1":
                        System.out.println("Costos");
                        double nota1 = 2.1 * porcentaje1;
                        double nota2 = 4.5 * porcentaje2;
                        double nota3 = 3.5 * porcentaje3;
                        double notaFinal = nota1 + nota2 + nota3;
                        if (notaFinal >= 0 && notaFinal <= 2) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nPerdiste la materia");
                        }
                        if (notaFinal >= 2.1 && notaFinal <= 2.9) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nTienes derecho a hacer un examen de nivelaciòn");
                        }
                        if (notaFinal >= 3) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nFelicidades, ganaste la materia");
                        }
                        break;
                    case "2":
                        System.out.println("Panaderia Dulce");
                        nota1 = 1.1 * porcentaje1;
                        nota2 = 0.5 * porcentaje2;
                        nota3 = 0.5 * porcentaje3;
                        notaFinal = nota1 + nota2 + nota3;
                        if (notaFinal >= 0 && notaFinal <= 2) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nPerdiste la materia");
                        }
                        if (notaFinal >= 2.1 && notaFinal <= 2.9) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nTienes derecho a hacer un examen de nivelaciòn");
                        }
                        if (notaFinal >= 3) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nFelicidades, ganaste la materia");
                        }
                        break;
                    case "3":
                        System.out.println("Cocina Internacional");
                        nota1 = 4.0 * porcentaje1;
                        nota2 = 4.5 * porcentaje2;
                        nota3 = 5.0 * porcentaje3;
                        notaFinal = nota1 + nota2 + nota3;
                        if (notaFinal >= 0 && notaFinal <= 2) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nPerdiste la materia");
                        }
                        if (notaFinal >= 2.1 && notaFinal <= 2.9) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nTienes derecho a hacer un examen de nivelaciòn");
                        }
                        if (notaFinal >= 3) {
                            System.out.println(nombreEstudiante + "\n" + numeroDocumento + "\n" + notaFinal
                                    + "\nFelicidades, ganaste la materia");
                        }
                        break;
            }
        }
    }
}