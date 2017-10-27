/* 
 * Copyright 2016 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Referencias
        final double IMPORTE_MULTA = 60.0;
        final int TIPO_DESCUENTO = 20;
        final int DIAS_DESCUENTO = 30;

        // Variables auxiliares
        double importeFinal;
        double importeDecto = 0.0;
        int diasDemora;
        boolean testOK;

        // Instancia el objeto Scanner
        Scanner scn = new Scanner(System.in, "ISO-8859-1");

        try {
            // Introducir los dias de demora
            System.out.print("Dias de demora ...........: ");
            diasDemora = scn.nextInt();
            scn.nextLine();
            
            // Separador
            System.out.println("---");

            // Comparación
            testOK = diasDemora <= DIAS_DESCUENTO;

            // Calcula el descuento 
            if (testOK) {
                importeDecto = IMPORTE_MULTA * TIPO_DESCUENTO / 100;
            }

            // Calcula el importe final
            importeFinal = IMPORTE_MULTA - importeDecto;

            // Muestra el importe de la multa
            System.out.printf(Locale.ENGLISH, "Importe inicial multa ....: %.2f €\n", IMPORTE_MULTA);
            System.out.printf("Plazo con descuento ......: %d dias\n", DIAS_DESCUENTO);
            System.out.printf("Tipo descuento ...........: %d %%\n", TIPO_DESCUENTO);
            System.out.printf(Locale.ENGLISH, "Importe descuento ........: %.2f €\n", importeDecto);
            System.out.printf(Locale.ENGLISH, "Importe final multa ......: %.2f €\n", importeFinal);
        } catch (Exception e) {
            System.out.println("---");
            System.out.println("Error de entrada");
        }
    }
}
