package day38_CustomClass;

import java.util.Scanner;

public class PerdidaPeso {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kCal = 0;
        int totalKcal = 0;

        System.out.println("Por favor, escriba su peso en Kg:");
        double peso = in.nextDouble();
        System.out.println();


        System.out.println("Nivel de Actividad:\n========================================\na) Poco ejercicio\nb) Ligero (1-3 días / Semana)\nc) Moderado (3-5 días / Semana)\nd) Fuerte\ne) Muy fuerte (Rutinas dobles diarias)\nSelecciones su nivel de actividad:");
        String actividad = in.next();
        switch (actividad){
            case "a":
            double calculo1 = 22*peso*1.2;
            kCal = (int)calculo1;
            break;

            case "b":
                double calculo2 = 22*peso*1.4;
                kCal = (int)calculo2;
                break;

            case "c":
                double calculo3 = 22*peso*1.6;
                kCal = (int)calculo3;
                break;

            case "d":
                double calculo4 = 22*peso*1.8;
                kCal = (int)calculo4;
                break;

            case "6":
                double calculo5 = 22*peso*2;
                kCal = (int)calculo5;
                break;

            default:
                System.out.println("¡Valor erróneo!");
                System.exit(0);
        }
        System.out.println();


        System.out.println("Escriba \"G\",si desea ganar de peso o \"P\", si desea perder de peso");
        String ganarPerder = in.next();
        if (ganarPerder.equals("G") || ganarPerder.equals("g")){
            System.out.println();
            System.out.println("Escriba el porcentaje deseado. << Porcetaje Sano: \"10% al 20%\" >>, del 20% en adelante exceso de grasa:");
            String porcentaje = in.next();
            int porcentajeNum = 0;

            if (!porcentaje.contains("%")){
                porcentajeNum = Integer.parseInt(porcentaje);
            } else {
                porcentajeNum = Integer.parseInt(porcentaje.substring(0,porcentaje.indexOf("%")));
            }

            int incrementoKcal = kCal * porcentajeNum / 100;
            totalKcal += kCal+incrementoKcal;
            double proteinas = 1.8 * peso * 4;
            double grasa = 1.5 * peso * 9;

            System.out.println();
            System.out.println("Ficha de recomendaciones:");
            System.out.println("==================================================================");
            System.out.println("Kcal Diarias: " + kCal + "Kcal, Porcentaje de aumento: " + porcentaje + "%");
            System.out.println("Calorías recomendadas: " + kCal + "Kcal + " + incrementoKcal + "Kcal >> Total: " + totalKcal + "Kcal/ día");
            System.out.println("==================================================================");
            System.out.println("Macronutrientes Diarios:");
            System.out.println("------------------------------------------------------------------");
            System.out.println("Proteinas: " + (int)proteinas + "gr || " + "Grasas: " + (int)grasa + "gr || " + "Hidratos: " + (int)(totalKcal - (grasa + proteinas)) + "gr");

        } else if (ganarPerder.equals("P") || ganarPerder.equals("p")){
            System.out.println();
            System.out.println("Escriba el porcentaje deseado. << Porcetaje Sano: \"10% al 20%\" >>, a partir del 30% se perderá músculo:");
            String porcentaje = in.next();
            int porcentajeNum = 0;

            if (!porcentaje.contains("%")){
                porcentajeNum = Integer.parseInt(porcentaje);
            } else {
                porcentajeNum = Integer.parseInt(porcentaje.substring(0,porcentaje.indexOf("%")));
            }

            int decrementoKcal = kCal * porcentajeNum / 100;
            totalKcal += kCal-decrementoKcal;
            double proteinas = 2.5 * peso * 4;
            double grasa = 0.5 * peso * 9;

            System.out.println();
            System.out.println("Ficha de recomendaciones:");
            System.out.println("==================================================================");
            System.out.println("Kcal Diarias: " + kCal + "Kcal, Porcentaje de decremento: " + porcentaje + "%");
            System.out.println("Calorías recomendadas: " + kCal + "Kcal - " + decrementoKcal + "Kcal >> Total: " + totalKcal + "Kcal/ día");
            System.out.println("==================================================================");
            System.out.println("Macronutrientes Diarios:");
            System.out.println("------------------------------------------------------------------");
            System.out.println("Proteinas: " + (int)proteinas + "gr || " + "Grasas: " + (int)grasa + "gr || " + "Hidratos: " + (int)(totalKcal - (grasa + proteinas)) + "gr");

        } else {
            System.out.println("¡Valor erróneo!");
            System.exit(0);
        }


    }
}
