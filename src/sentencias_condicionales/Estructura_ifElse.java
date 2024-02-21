
package sentencias_condicionales;


public class Estructura_ifElse {

   /*Vamos a realizar el cÃ¡lculo de la nota de un examen 
     * de tipo test. Para ello, tendremos en cuenta el nÃºmero
     * total de pregunta, los aciertos y los errores. Dos errores
     * anulan una respuesta correcta.
     * 
     * Finalmente, se muestra por pantalla la nota obtenida, asÃ­
     * como su calificaciÃ³n no numÃ©rica. 
     * 
     * La obtenciÃ³n de la calificaciÃ³n no numÃ©rica se ha realizado
     * combinando varias estructuras condicionales, mostrando expresiones 
     * lÃ³gicas compuestas, asÃ­ como anidamiento. 
     * 
     */
    public static void main(String[] args) {
         // DeclaraciÃ³n e inicializaciÃ³n de variables
        double num_aciertos = 12;
        double num_errores = 3;
        double num_preguntas = 20;
        double nota = 0;
        String calificacion="";
    
        //Procesamiento de datos
        nota = ((num_aciertos - (num_errores/2))*10)/num_preguntas;
    
        if (nota < 5)
        {
           calificacion="INSUFICIENTE";
        }
        else
        {
           /* Cada expresiÃ³n lÃ³gica de estos if estÃ¡ compuesta por dos
            * expresiones lÃ³gicas combinadas a travÃ©s del operador Y o AND
            * que se representa con el sÃ­mbolo &&. De tal manera, que para 
            * que la expresiÃ³n lÃ³gica se cumpla (sea verdadera) la variable
            * nota debe satisfacer ambas condiciones simultÃ¡neamente
            */
            if (nota >= 5 && nota <6)
               calificacion="SUFICIENTE";       
            if (nota >= 6 && nota <7)
               calificacion="BIEN"; 
            if (nota >= 7 && nota <9) 
               calificacion="NOTABLE";
            if (nota >= 9 && nota <=10)
               calificacion="SOBRESALIENTE";
        }
        
        //Salida de informaciÃ³n
        System.out.println ("La nota obtenida es: " + nota);
        System.out.println ("y la calificaciÃ³n obtenida es: " + calificacion);
    }
    
}
