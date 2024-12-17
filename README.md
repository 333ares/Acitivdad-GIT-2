# **Actividad 2: Gestión de repositorios en GitHub y desarrollo de una aplicación en Java**

## **Índice**
1. Objetivos
2. Propósito del proyecto
3. Estructura del programa

---

### **Objetivos**
- Aprender a usar ramas en un repositorio GitHub.
- Trabajar en equipo para desarrollar un programa en Java.
- Implementar lógica básica con arrays, strings y números aleatorios.
  
---

### **Propósito del proyecto**
El propósito de este proyecto es desarrollar un programa en Java que implemente lógica básica con arrays, números aleatorios y operaciones de búsqueda. El programa realiza las siguientes tareas:
1. Crear una matriz de **5x5** con números **aleatorios entre 1 y 100**.
2. **Mostrar la matriz** generada en la consola.
3. Permitir al usuario **buscar un número** en la matriz.
4. Calcular y mostrar la **suma** de todos los números de la matriz.

---

### **Estructura del programa**
Este programa esta hecho a partir de **tres ramas**:
- `matriz-inicial`: Para generar y mostrar la matriz de números aleatorios.
- `busqueda-numero`: Para implementar la búsqueda de un número.
- `suma-matriz`: Para calcular y mostrar la suma de los números.

El programa contiene el siguiente código inicial (Esqueleto):
```java
public class MatrizApp {
    public static void main(String[] args) {
        // TODO: Implementar las funciones según las ramas asignadas
    }
}
```

---

### **Funcionamiento**
#### 1. Generación de la matriz
Se utiliza la clase Random para llenar una matriz de tamaño 5x5 con números aleatorios entre 1 y 100.

#### 2. Visualización de la matriz
La matriz se muestra en formato tabular en la consola.

#### 3. Búsqueda de un número
- El programa solicita al usuario un número a buscar en la matriz.
    - Si el número existe, se muestra su posición (fila y columna).
    - Si no existe, se informa al usuario.
   
#### 4. Cálculo de la suma de la matriz
Se recorre toda la matriz para calcular y mostrar la suma total de sus elementos.
