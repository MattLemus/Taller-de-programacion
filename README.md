# Ejercicios Capítulo 3 - Programación II

Este proyecto contiene la resolución de ejercicios de **Programación Orientada a Objetos en Java**, usando clases, objetos, constructores, métodos `get` y `set`, validaciones, `Scanner` y `JOptionPane`.

Inicialmente se desarrollaron 5 ejercicios del capítulo 3 del libro **Cómo programar en Java** de **Deitel y Deitel**.  
Además, se añadieron 5 ejercicios de recuperación indicados para reforzar los mismos temas.

## Ejercicios originales incluidos

- **3.12** - La clase `Factura`
- **3.13** - La clase `Empleado`
- **3.14** - La clase `Fecha`
- **3.16** - `FrecuenciasCardiacas`
- **3.17** - `PerfilMedico`

## Ejercicios de recuperación añadidos

- **Producto** - clase `Producto`, usando `Scanner`
- **Rectangulo** - clase `Rectangulo`, usando `Scanner`
- **Cuenta** - clase `Cuenta`, usando `JOptionPane`
- **Estudiante** - clase `Estudiante`, usando `JOptionPane`
- **ReservaHotel** - clase `ReservaHotel`, usando `JOptionPane`

## Estructura del proyecto

```text
src
 ├─ facturas
 │   ├─ interfaz
 │   │   └─ Main.java
 │   └─ negocio
 │       └─ Factura.java
 │
 ├─ empleados
 │   ├─ interfaz
 │   │   └─ Main.java
 │   └─ negocio
 │       └─ Empleado.java
 │
 ├─ fechas
 │   ├─ interfaz
 │   │   └─ MainFecha.java
 │   └─ negocio
 │       └─ Fecha.java
 │
 ├─ frecuencias
 │   ├─ interfaz
 │   │   └─ MainFrecuencias.java
 │   └─ negocio
 │       └─ FrecuenciasCardiacas.java
 │
 ├─ perfilmedico
 │   ├─ interfaz
 │   │   └─ MainPerfilMedico.java
 │   └─ negocio
 │       └─ PerfilMedico.java
 │
 ├─ productos
 │   ├─ modelo
 │   │   └─ Producto.java
 │   └─ vista
 │       └─ ProductoMain.java
 │
 ├─ rectangulos
 │   ├─ modelo
 │   │   └─ Rectangulo.java
 │   └─ visual
 │       └─ RectanguloMain.java
 │
 ├─ Cuentas
 │   ├─ modelo
 │   │   └─ Cuenta.java
 │   └─ vista
 │       └─ CuentaMain.java
 │
 ├─ estudiantes
 │   ├─ modelo
 │   │   └─ Estudiante.java
 │   └─ vista
 │       └─ EstudianteMain.java
 │
 └─ reservas
     ├─ modelo
     │   └─ ReservaHotel.java
     └─ vista
         └─ ReservaHotelMain.java
