/*
 * Copyright 2020 Pablo Claramunt Hernandis - pablo.claramunt.alum@iescamp.es.
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
package org.japo.java.app;

import java.util.Calendar;
import org.japo.java.fecha.UtilesFecha;
import org.japo.java.hydroponics.UtilesHidroponicos;
import org.japo.java.libraries.UtilesAleatorios;

/**
 *
 * @author Pablo Claramunt Hernandis - pablo.claramunt.alum@iescamp.es
 */
public class App {

    //Calendar
    public static final Calendar CAL = Calendar.getInstance();

    //Min y Max
    public static final int H_MIN = 70;
    public static final int H_MAX = 90;
    public static final int T_MIN = 15;
    public static final int T_MAX = 25;
    public static final int I_MIN = 5;
    public static final int I_MAX = 15;

    //Constantes 
    public static final int HUMEDAD_MIN = 71;
    public static final int HUMEDAD_MAX = 86;
    public static final int TEMPERATURA_MIN = 19;
    public static final int TEMPERATURA_MAX = 22;
    public static final int ILUMINACION_MIN = 8;
    public static final int ILUMINACION_MAX = 13;

    //Constantes Hora
    public static final int M_MIN = 6;
    public static final int M_MAX = 14;
    public static final int TARDE_MIN = 14;
    public static final int TARDE_MAX = 22;

    // Mensajes
    public static final String VAL_SI = "NOMINAL";
    public static final String VAL_NO = "ALARMA";
    public static final String VAL_M = "MAÑANA";
    public static final String VAL_T = "TARDE";
    public static final String VAL_N = "NOCHE";

    public void LaunchApp() {
        //Fecha Sistema        
        int aa = CAL.get(Calendar.YEAR);
        int ma = CAL.get(Calendar.MONTH) + 1;
        int da = CAL.get(Calendar.DAY_OF_MONTH);

        //Instante Temporal obtenido del Reloj del Sistema
        int hClk = CAL.get(Calendar.HOUR_OF_DAY);
        int mClk = CAL.get(Calendar.MINUTE);

        //Condicion
        String msgT;
        if (hClk >= M_MIN && hClk < M_MAX) {
            msgT = VAL_M;
        } else if (hClk >= TARDE_MIN && hClk < TARDE_MAX) {
            msgT = VAL_T;
        } else {
            msgT = VAL_N;
        }

        //Llamada Humedad
        int numH = UtilesAleatorios.generar(H_MIN, H_MAX);
        boolean valorH = UtilesHidroponicos.analizar(numH, HUMEDAD_MIN,
                HUMEDAD_MAX);

        //Llamada Temperatura
        int numT = UtilesAleatorios.generar(T_MIN, T_MAX);
        boolean valorT = UtilesHidroponicos.analizar(numT, TEMPERATURA_MIN,
                TEMPERATURA_MAX);

        //Llamada Iluminación
        int numI = UtilesAleatorios.generar(I_MIN, I_MAX);
        boolean valorI = UtilesHidroponicos.analizar(numI, ILUMINACION_MIN,
                ILUMINACION_MAX);

        //Llamada Fecha
        String nomMes = UtilesFecha.month(ma);

        //Salida por pantalla
        System.out.println("Die Farben der Blumen GmbH - Hydroponics Sagunto");
        System.out.println("================================================");
        System.out.println("Registro de Parámetros Operativos");
        System.out.println("---------------------------------");
        System.out.printf("Fecha ........: %02d de %s de %d%n", da,
                nomMes, aa);
        System.out.printf("Hora .........: %02d:%02dh     - %s%n", hClk, mClk,
                msgT);
        System.out.printf("Humedad ......: %2d %%       - %s%n", numH,
                valorH ? VAL_SI : VAL_NO);
        System.out.printf("Temperatura ..: %2d ºC      - %s%n", numT,
                valorT ? VAL_SI : VAL_NO);
        System.out.printf("Iluminación ..: %2d kLux    - %s%n", numI,
                valorI ? VAL_SI : VAL_NO);

    }


}
