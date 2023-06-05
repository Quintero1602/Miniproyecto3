package bliblotecau;

/**
 *
 * @author john alejandro regino solis
 * @author sebastian quintero ramirez
 */

/*que es Row:proporciona una forma de mantener y manipular el valor de una variable de fila estática. 
Los métodos estáticos "getRow()" y "setRow()" permiten obtener y modificar ese valor, respectivamente.
*/

// La clase Row representa una fila y proporciona métodos para obtener y modificar el valor de la variable estática "row".
class Row {
    private static int row;     //La variable estática "row" almacena el valor actual de la fila.
    public static int getRow(){ //Obtiene el valor actual de la fila. 
        return row;             //  @return El valor actual de la fila.
    }
    public static void setRow(){ //Incrementa el valor de la fila en 1.
        row++;
    }
    public static void setRow( int temp){  //Establece el valor de la fila con el valor proporcionado. 
        row= temp;                         // @param temp El nuevo valor para la fila.
    }


}

   
