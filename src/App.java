import java.util.Scanner;

/*
Desarrollo: Lógica, metodologías, introducción.
Diseño: Tipografia, iconografia y semántica.
Gastronomía: Costos, panadería dulce, Cocina internacional. */
public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        double notaParcial = 0, notaTaller = 0, notaExamenFinal =0;
        double notaFinal = (notaParcial * 0.2) + (notaTaller * 0.3) + (notaExamenFinal * 0.5);

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
                        System.out.println("Nota lógica de programación");
                        System.out.println("Ingrese la nota parcial");
                        notaParcial = sc.nextDouble();
                        System.out.println("Ingrese la nota del taller");
                        notaTaller = sc.nextDouble();
                        System.out.println("Ingrese la nota del Examen Final");
                        notaExamenFinal = sc.nextDouble();
                        notaFinal = (notaParcial * 0.2) + (notaTaller * 0.3) + (notaExamenFinal * 0.5);
                        if (notaFinal <= 2) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nPerdiste la materia");
                        }
                        if (notaFinal >= 2.1 && notaFinal <= 2.9) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nTienes derecho a hacer un examen de nivelaciòn");
                        }
                        if (notaFinal >= 3) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nFelicidades, ganaste la materia");
                        }
                        break;
                    case "2":
                        System.out.println("Metodologías Agiles");
                        System.out.println("Ingrese la nota parcial");
                        notaParcial = sc.nextDouble();
                        System.out.println("Ingrese la nota del taller");
                        notaTaller = sc.nextDouble();
                        System.out.println("Ingrese la nota del Examen Final");
                        notaExamenFinal = sc.nextDouble();
                        notaFinal = (notaParcial * 0.2) + (notaTaller * 0.3) + (notaExamenFinal * 0.5);
                        if (notaFinal >= 0 && notaFinal <= 2) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nPerdiste la materia");
                        }
                        if (notaFinal >= 2.1 && notaFinal <= 2.9) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nTienes derecho a hacer un examen de nivelaciòn");
                        }
                        if (notaFinal >= 3) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nFelicidades, ganaste la materia");
                        }
                        break;
                    case "3":
                        System.out.println("Introducción a la programación");
                        System.out.println("Ingrese la nota parcial");
                        notaParcial = sc.nextDouble();
                        System.out.println("Ingrese la nota del taller");
                        notaTaller = sc.nextDouble();
                        System.out.println("Ingrese la nota del Examen Final");
                        notaExamenFinal = sc.nextDouble();
                        notaFinal = (notaParcial * 0.2) + (notaTaller * 0.3) + (notaExamenFinal * 0.5);
                        if (notaFinal >= 0 && notaFinal <= 2) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nPerdiste la materia");
                        }
                        if (notaFinal >= 2.1 && notaFinal <= 2.9) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nTienes derecho a hacer un examen de nivelaciòn");
                        }
                        if (notaFinal >= 3) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
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
                        System.out.println("Ingrese la nota parcial");
                        notaParcial = sc.nextDouble();
                        System.out.println("Ingrese la nota del taller");
                        notaTaller = sc.nextDouble();
                        System.out.println("Ingrese la nota del Examen Final");
                        notaExamenFinal = sc.nextDouble();
                        notaFinal = (notaParcial * 0.2) + (notaTaller * 0.3) + (notaExamenFinal * 0.5);
                        if (notaFinal <= 2) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nPerdiste la materia");
                        }
                        if (notaFinal >= 2.1 && notaFinal <= 2.9) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nTienes derecho a hacer un examen de nivelaciòn");
                        }
                        if (notaFinal >= 3) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nFelicidades, ganaste la materia");
                        }
                        break;
                    case "2":
                        System.out.println("Iconografía");
                        System.out.println("Ingrese la nota parcial");
                        notaParcial = sc.nextDouble();
                        System.out.println("Ingrese la nota del taller");
                        notaTaller = sc.nextDouble();
                        System.out.println("Ingrese la nota del Examen Final");
                        notaExamenFinal = sc.nextDouble();
                        notaFinal = (notaParcial * 0.2) + (notaTaller * 0.3) + (notaExamenFinal * 0.5);
                        if (notaFinal <= 2) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nPerdiste la materia");
                        }
                        if (notaFinal >= 2.1 && notaFinal <= 2.9) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nTienes derecho a hacer un examen de nivelaciòn");
                        }
                        if (notaFinal >= 3) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nFelicidades, ganaste la materia");
                        }
                        break;
                    case "3":
                        System.out.println("Semántica");
                        System.out.println("Ingrese la nota parcial");
                        notaParcial = sc.nextDouble();
                        System.out.println("Ingrese la nota del taller");
                        notaTaller = sc.nextDouble();
                        System.out.println("Ingrese la nota del Examen Final");
                        notaExamenFinal = sc.nextDouble();
                        notaFinal = (notaParcial * 0.2) + (notaTaller * 0.3) + (notaExamenFinal * 0.5);
                        if (notaFinal <= 2) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nPerdiste la materia");
                        }
                        if (notaFinal >= 2.1 && notaFinal <= 2.9) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nTienes derecho a hacer un examen de nivelaciòn");
                        }
                        if (notaFinal >= 3) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
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
                        System.out.println("Ingrese la nota parcial");
                        notaParcial = sc.nextDouble();
                        System.out.println("Ingrese la nota del taller");
                        notaTaller = sc.nextDouble();
                        System.out.println("Ingrese la nota del Examen Final");
                        notaExamenFinal = sc.nextDouble();
                        notaFinal = (notaParcial * 0.2) + (notaTaller * 0.3) + (notaExamenFinal * 0.5);
                        if (notaFinal <= 2) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nPerdiste la materia");
                        }
                        if (notaFinal >= 2.1 && notaFinal <= 2.9) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nTienes derecho a hacer un examen de nivelaciòn");
                        }
                        if (notaFinal >= 3) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nFelicidades, ganaste la materia");
                        }
                        break;
                    case "2":
                        System.out.println("Panaderia Dulce");
                        System.out.println("Ingrese la nota parcial");
                        notaParcial = sc.nextDouble();
                        System.out.println("Ingrese la nota del taller");
                        notaTaller = sc.nextDouble();
                        System.out.println("Ingrese la nota del Examen Final");
                        notaExamenFinal = sc.nextDouble();
                        notaFinal = (notaParcial * 0.2) + (notaTaller * 0.3) + (notaExamenFinal * 0.5);
                        if (notaFinal <= 2) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nPerdiste la materia");
                        }
                        if (notaFinal >= 2.1 && notaFinal <= 2.9) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nTienes derecho a hacer un examen de nivelaciòn");
                        }
                        if (notaFinal >= 3) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nFelicidades, ganaste la materia");
                        }
                        break;
                    case "3":
                        System.out.println("Cocina Internacional");
                        System.out.println("Ingrese la nota parcial");
                        notaParcial = sc.nextDouble();
                        System.out.println("Ingrese la nota del taller");
                        notaTaller = sc.nextDouble();
                        System.out.println("Ingrese la nota del Examen Final");
                        notaExamenFinal = sc.nextDouble();
                        notaFinal = (notaParcial * 0.2) + (notaTaller * 0.3) + (notaExamenFinal * 0.5);
                        if (notaFinal <= 2) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nPerdiste la materia");
                        }
                        if (notaFinal >= 2.1 && notaFinal <= 2.9) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nTienes derecho a hacer un examen de nivelaciòn");
                        }
                        if (notaFinal >= 3) {
                            System.out.println("Nombre de estudiante:" + nombreEstudiante + "\nNúmero de Documento: " + numeroDocumento + "\nNota Final: " + notaFinal
                                    + "\nFelicidades, ganaste la materia");
                        }
                        break;
            }
        }
    }
}