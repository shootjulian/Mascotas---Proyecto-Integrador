# Sistema de Mascotas - Proyecto Integrador

## 1. Información general

**Asignatura:** Programación de Computadores  
**Lenguaje:** Java  
**Interfaz gráfica:** Swing  
**Tipo de aplicación:** CRUD básico de mascotas  

Este proyecto permite registrar, consultar, actualizar, eliminar y listar mascotas mediante una interfaz gráfica desarrollada en Java Swing.

---

## 2. Funcionalidades principales

El sistema implementa un CRUD básico:

| Operación | Botón | Descripción |
|---|---|---|
| Crear | Registrar | Registra una nueva mascota. |
| Leer | Mostrar | Muestra todas las mascotas registradas. |
| Leer individual | Buscar | Busca una mascota por su ID. |
| Actualizar | Actualizar | Modifica los datos de una mascota existente. |
| Eliminar | Eliminar | Elimina una mascota por su ID. |
| Adicional | Categorías | Muestra una tabla sencilla de categorías usando arreglo bidimensional. |
| Adicional | Limpiar | Limpia los campos y el área de resultado. |

---

## 3. Requisitos técnicos cumplidos

| Requisito de la guía para Java | Cumplimiento en el proyecto |
|---|---|
| Aplicación con interfaz gráfica Swing | Sí. Se usa `JFrame`, `JPanel`, `JButton`, `JTextField`, `JTextArea` y `JOptionPane`. |
| Tres o más métodos propios con paso de parámetros | Sí. Ejemplos: `registrarMascota(String...)`, `actualizarMascota(String...)`, `buscarMascota(String id)`, `eliminarMascota(String id)`. |
| Uso de arreglo 1D o lista | Sí. Se usa `ArrayList<Mascota>` para almacenar las mascotas. |
| Manejo de eventos | Sí. La clase `InterfazMascotas` implementa `ActionListener` y usa `actionPerformed`. |
| Validaciones en la interfaz | Sí. Se validan campos vacíos, ID obligatorio y edad numérica. |
| README con guía de uso | Sí. Este documento contiene instrucciones y pruebas. |
| Captura de pantalla o imagen de referencia | Sí. Ver archivo `docs/captura_referencia.png`. |

---

## 4. Estructura del proyecto

```text
Mascotas_Proyecto_Integrador/
│
├── README.md
├── docs/
│   └── captura_referencia.png
│
└── src/
    ├── interfaz/
    │   ├── InterfazMascotas.java
    │   ├── PanelBotones.java
    │   ├── PanelDatos.java
    │   └── PanelResultado.java
    │
    └── mundo/
        ├── GestorMascotas.java
        └── Mascota.java
```

---

## 5. Cómo ejecutar el proyecto

### Opción 1: Desde un IDE

1. Abrir el proyecto en NetBeans, Eclipse, IntelliJ IDEA o Visual Studio Code.
2. Verificar que la carpeta `src` esté configurada como carpeta de código fuente.
3. Ejecutar la clase:

```text
interfaz.InterfazMascotas
```

### Opción 2: Desde consola

Ubicarse en la carpeta raíz del proyecto y ejecutar:

```bash
javac -d out src/interfaz/*.java src/mundo/*.java
java -cp out interfaz.InterfazMascotas
```

---

## 6. Guía de uso

### Registrar mascota

1. Digitar ID, nombre, especie, edad y dueño.
2. Presionar el botón **Registrar**.
3. El sistema mostrará un mensaje confirmando el registro.

### Mostrar mascotas

1. Presionar el botón **Mostrar**.
2. El sistema listará las mascotas registradas en el área de resultado.

### Buscar mascota

1. Digitar el ID de la mascota.
2. Presionar **Buscar**.
3. Si existe, se mostrará la información de la mascota.

### Actualizar mascota

1. Digitar el ID de una mascota existente.
2. Escribir los nuevos datos.
3. Presionar **Actualizar**.

### Eliminar mascota

1. Digitar el ID de la mascota.
2. Presionar **Eliminar**.
3. Si existe, la mascota será eliminada.

---

## 7. Casos de prueba sugeridos

| Caso | Acción | Resultado esperado |
|---|---|---|
| 1 | Registrar mascota con todos los campos completos | Mensaje: "Mascota registrada correctamente." |
| 2 | Registrar con edad no numérica | Mensaje: "La edad debe ser un número entero." |
| 3 | Registrar con campos vacíos | Mensaje: "Todos los campos son obligatorios." |
| 4 | Buscar una mascota existente por ID | Se muestra la mascota. |
| 5 | Buscar una mascota inexistente | Mensaje: "No existe una mascota con ese ID." |
| 6 | Actualizar mascota existente | Mensaje: "Mascota actualizada correctamente." |
| 7 | Eliminar mascota existente | Mensaje: "Mascota eliminada correctamente." |
| 8 | Mostrar sin mascotas registradas | Texto: "No hay mascotas registradas." |

---

## 8. Contenidos vistos en clase aplicados

- Variables y tipos de datos.
- Condicionales `if`.
- Ciclos `for`.
- Métodos propios.
- Paso de parámetros.
- Lista unidimensional `ArrayList`.
- Arreglo bidimensional `String[][]`.
- Clases y objetos.
- Interfaz gráfica con Swing.
- Manejo de eventos con `ActionListener`.
- Validaciones básicas.
- Organización por paquetes.
- Comentarios y documentación básica.

---

## 9. Integrantes

- Estudiante 1: ___________________________
- Estudiante 2: ___________________________

---

## 10. Declaración de compromiso

Entendemos que el Proyecto Integrador se computa con la nota del parcial práctico del tercer corte y aceptamos cumplir con los hitos, las normas de integridad académica y los requisitos técnicos aquí descritos.
