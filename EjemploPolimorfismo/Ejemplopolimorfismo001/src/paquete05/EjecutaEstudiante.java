package paquete05;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Se declaran variables
        Se Declarar Variables
        
        */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        int contador;
        
        // creacion de una variable tipo boolean llamada bandera que sera utlizada 
        // en las condicionales del programa, inciando su valor con verdadero
        
        boolean bandera = true;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        
        // inicio de solución
        
        /*
        Antes de empezar indicando lo que se ira realizanbdo en el programa 
        creo conveniente informar que este codigo ha sido reutlizado  del paquete03,
        ya que me parecio muy util su utlizacion en este main, asi que veremos 
        muchos mensajes ya antes colocados por el Ing. Rene, ademas de mensajes 
        colocados por mi persona para indicar los cambios que realize 
        */
        
        // Incio del ciclo repetitivo que permite generar objetos de tipo
        // EstudiantePresencial y EstudianteDistancia hasta que el usaurio
        // decida salir del proceso.
        
        do{
            
            // Se imprime mensaje en pantalla para solicitar
            // Pedimos al usuario que  elija el tipo de estudiante que se desea ingresar
            System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial"
                    + "Ingrese (2) para Estudiante Distancia");
            // se captura el valor ingresado por el usuario en 
            // la variable tipoEstudiante
            tipoEstudiante = entrada.nextInt();
            entrada.nextLine();
            // Solicitar el ingreso de valores para las variables

            // Solicitar nombresEst, apellidosEst, identificacionEst, edadEst
            // Leer nombresEst, apellidosEst, identificacionEst, edadEst
            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();
            
            //ya capturado el valor de la variabe tipoEstudinate, el cual deberia
            //ser 1 0 2,  comenzaremos con las condicionales, donde segun la opcion
            // del usuaario es lo que se mostrara en pantalla, si selecciona 1  entrara
            // en la condicional para Estudiante Presencial

            if (tipoEstudiante == 1) {

                // Declarar,crear e iniciar objeto tipo EstudiantePresencial
                EstudiantePresencial estudianteP = new EstudiantePresencial();
                // Solicitar ingreso de valores para variables 
                // Solicitar numeroCreds, costoCred
                // Leer numeroCreds, costoCred
                System.out.println("Ingrese el número de créditos");
                numeroCreds = entrada.nextInt();
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = entrada.nextDouble();
                // se hace uso de los métodos establecer para asignar valores
                // a los datos (atributos) del objeto
                estudianteP.establecerNombresEstudiante(nombresEst);
                estudianteP.establecerApellidoEstudiante(apellidosEst);
                estudianteP.establecerIdentificacionEstudiante(identificacionEst);
                estudianteP.establecerEdadEstudiante(edadEst);
                estudianteP.establecerNumeroCreditos(numeroCreds);
                estudianteP.establecerCostoCredito(costoCred);
                                
                /*
                Lo que hemos realiazdo es el uso de los métodos establecer para 
                asignar valores a los datos (atributos) del objeto de tipo Estudinate Presencial,
                */
                  estudiantes.add(estudianteP);
                  /*
                  
                  Seguidamente en el programa llamamos al Array List de Tipo SubClases 
                  de Estudinate Presencial y Estudinate Distancia llamado estudiantes, 
                  donde utilizamos el .add, el mismo que es un metodo de la ArrayList 
                  donde con la ayuda de este podemos agregar objetos en este caso 
                  de estudinatesP,es decir guardar lo que se tengan ingresado 
                  hasta el momento.
                  
                 
                */
                               
              
                
                /*
                En esta parte lo que hacemos es pedir al usuario ingresar un 
                dato de tipo cadena que tomara el valor de continuar, este es utilizado
                para preguntar al usuario si desea continuar con el progrma 
                o a su contrario finalizarlo
                */
                
                entrada.nextLine();
                System.out.println("Desea ingresar más estudiante. Digite la "
                    + "letra  S para salir o digite la letra N para continuar "
                    + "el proceso");

            // se captura el valor ingresado por el usuario para la variable 
            // continuar
            continuar = entrada.nextLine();
                /*
            Segun  leccion del usuario seleccionado con la Letra S para salir 
            o la letra N para continuar, tenemos a continuacion una condicional, 
            donde compara el dato que fue ingresado con el usuario con la letra S, 
            si la opcion fue S, entrara a la condicional y la variable bandera se 
            volvera falsarompiendo el ciclo y finalizando el programa, pero si la 
            opcion fue la N 
            la variable bandera continuara con el valor de true, continuando con 
            el programa, cabe mencionar que este mensaje se mostrara en las 2 opciones, 
            cuando el usuario seleccione 1 para Estudinate Presencial o 2 para 
            Estudinate Distancia

                */
                
                if (continuar.equals("S")) {
                    bandera = false;
                }
                
             //ya capturado el valor de la variabe tipoEstudinate, el cual deberia
            //ser 1 0 2,  seguiremos con las condicionales, donde segun la opcion
            // del usuaario es lo que se mostrara en pantalla, si selecciona la opcion 2  
            //entrara en la condicional para Estudiante Distancia
            
            } else {
                

                
                    // Declarar,crear e iniciar objeto tipo EstudianteDistancia
                    EstudianteDistancia estudianteD = new EstudianteDistancia();
                    // Solicitar ingreso de valores para variables 
                    // Solicitar numeroAsigs, costoAsig 
                    // Leer numeroAsigs, costoAsig
                    System.out.println("Ingrese el número de asignaturas");
                    numeroAsigs = entrada.nextInt();
                    System.out.println("Ingrese el costo de cada cada asignatura");
                    costoAsig = entrada.nextDouble();

                    // se hace uso de los métodos establecer para asignar valores
                    // a los datos (atributos) del objeto
                    estudianteD.establecerNombresEstudiante(nombresEst);
                    estudianteD.establecerApellidoEstudiante(apellidosEst);
                    estudianteD.establecerIdentificacionEstudiante(identificacionEst);
                    estudianteD.establecerEdadEstudiante(edadEst);
                    estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                    estudianteD.establecerCostoAsignatura(costoAsig);
                    
                /*
                Lo que hemos realiazdo es el uso de los métodos establecer para 
                asignar valores a los datos (atributos) del objeto de tipo Estudinate Distancia,
                */
                    estudiantes.add(estudianteD);
                    
                  /*  
                  Seguidamente en el programa llamamos al Array List de Tipo SubClases 
                  de Estudinate Presencial y Estudinate Distancia llamado estudiantes, 
                  donde utilizamos el .add, el mismo que es un metodo de la ArrayList 
                  donde con la ayuda de este podemos agregar objetos en este caso 
                  de estudinatesP,es decir guardar lo que se tengan ingresado 
                  hasta el momento
                  */ 
                  
                /*
                En esta parte lo que hacemos es pedir al usuario ingresar un 
                dato de tipo cadena que tomara el valor de continuar, este es utilizado
                para preguntar al usuario si desea continuar con el progrma 
                o a su contrario finalizarlo
                */
                    entrada.nextLine();
                    System.out.println("Desea ingresar más estudiante. Digite la "
                    + "letra S para salir o digite la letra N para continuar "
                    + "el proceso");

            // se captura el valor ingresado por el usuario para la variable 
            // continuar
            /*
            Segun  leccion del usuario seleccionado con la Letra S para salir 
            o la letra N para continuar, tenemos a continuacion una condicional, 
            donde compara el dato que fue ingresado con el usuario con la letra S, 
            si la opcion fue S, entrara a la condicional y la variable bandera se 
            volvera falsarompiendo el ciclo y finalizando el programa, pero si la 
            opcion fue la N 
            la variable bandera continuara con el valor de true, continuando con 
            el programa, cabe mencionar que este mensaje se mostrara en las 2 opciones, 
            cuando el usuario seleccione 1 para Estudinate Presencial o 2 para 
            Estudinate Distancia
            */
            
            continuar = entrada.nextLine();
                if (continuar.equals("S")) {
                    bandera = false;
                }
                                                      
            }
            
        }while (bandera);
        
        
        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        
        /*
        Para que el programa funcione correctamente se debe crear metodos toString 
        en las demas clases, en caso de no hacerlo unicamente imprimira la direccion 
        de la clase.
        
        */
        for (int i = 0; i < estudiantes.size(); i++) {
            // creamos un ciclo for que comenzara en 0, va a hacer menor al tamaño 
            //de estudinates y incrementara en 1 
            estudiantes.get(i).calcularMatricula();
            /*
            Se llama al metodo calcularMatricula de la clase del objeto que este almacenada 
            dentro del arrayList ese momento,si tenemos un objeto de Estudinate 
            Presencial se llamara al metodo calcularMatricula de la clase Estudiante 
            Presencial,y si tenemos un objeto de tipo Estudinate Distancia en cambio 
            se llamara al metodo calcularMatricula de la clase Estuidnate 
            Distancia, 
          
            */
            System.out.printf("Datos Estudiante\n"
                        + "%s\n",                        
                  estudiantes.get(i));
            
        }
    }

}