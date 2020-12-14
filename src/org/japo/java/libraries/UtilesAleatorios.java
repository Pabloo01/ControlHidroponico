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
package org.japo.java.libraries;

import java.util.Random;

/**
 *
 * @author Pablo Claramunt Hernandis - pablo.claramunt.alum@iescamp.es
 */
public class UtilesAleatorios {

    public static final Random RND = new Random();

    public static final int generar(int min, int max) {
        int rnd = RND.nextInt(max - min + 1) + min;

        return rnd;
    }

}
