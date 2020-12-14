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
package org.japo.java.fecha;

import java.util.Calendar;

/**
 *
 * @author Pablo Claramunt Hernandis - pablo.claramunt.alum@iescamp.es
 */
public class UtilesFecha {

    //Calendar
    public static final Calendar CAL = Calendar.getInstance();

    //Año
    public static final int year(int aa) {
        return CAL.get(Calendar.YEAR);
    }

    //Mes
    public static final String month(int ma) {

        String msg;
        int mes = CAL.get(Calendar.MONTH) + 1;

        switch (mes) {
            case 1:
                msg = "Enero";
                break;
            case 2:
                msg = "Febrero";
                break;
            case 3:
                msg = "Marzo";
                break;
            case 4:
                msg = "Abril";
                break;
            case 5:
                msg = "Mayo";
                break;
            case 6:
                msg = "Junio";
                break;
            case 7:
                msg = "Julio";
                break;
            case 8:
                msg = "Agosto";
                break;
            case 9:
                msg = "Septiembre";
                break;
            case 10:
                msg = "Octubre";
                break;
            case 11:
                msg = "Noviembre";
                break;
            default:
                msg = "Diciembre";
        }

        return msg;
    }
    
    //Dia
    public static final int day(int da){
        return CAL.get(Calendar.DAY_OF_MONTH);
    }

}
