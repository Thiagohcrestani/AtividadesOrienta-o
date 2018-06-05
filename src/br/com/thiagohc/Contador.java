/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thiagohc;

public class Contador {
     public static boolean isNumeric(String numeroStringado) {
        boolean isIt = true;
        if (numeroStringado == null) {
            isIt = false;
        } else {
            try {
                Double.parseDouble(numeroStringado);
            } catch (NumberFormatException nf) {
                isIt = false;
            }
        }
        return isIt;
    }

    public static boolean isInt(String numeroStringado) {
        boolean isIt = true;
        if (numeroStringado == null) {
            isIt = false;
        } else {
            try {
                Integer.parseInt(numeroStringado);
            } catch (NumberFormatException nf) {
                isIt = false;
            }
        }
        return isIt;
    }

    public static boolean isAlreadyListed(int numeroConcedido, Integer[] numerosConcedidos) {
        for (int i = 0; i < numerosConcedidos.length; i++) {
            if (numerosConcedidos[i] != null) {
                if (numeroConcedido == numerosConcedidos[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isAlreadyListed(int numeroConcedido, String[] numerosConcedidos) {
        for (int i = 0; i < numerosConcedidos.length; i++) {
            if (numerosConcedidos[i] != null) {
                if (numeroConcedido == Integer.parseInt(numerosConcedidos[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isAlreadyListed(String numeroConcedido, String[] numerosConcedidos) {
        for (int i = 0; i < numerosConcedidos.length; i++) {
            if (numerosConcedidos[i] != null) {
                if (numeroConcedido.equals(numerosConcedidos[i])) {
                    return true;
                }
            }
        }
        return false;
    }

}
