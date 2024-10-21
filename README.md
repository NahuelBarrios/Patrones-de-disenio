# Patrones Creacionales en Java

Este proyecto incluye la implementación de todos los patrones creacionales usando **Java 15**. Cada patrón está explicado con ejemplos prácticos y acompañados de sus respectivas clases y diagramas, con el objetivo de entender cómo funcionan y cómo aplicarlos en diferentes contextos de desarrollo.

## Tabla de Contenidos
1. [Introducción](#introducción)
2. [Patrones Creacionales](#patrones-creacionales)
   - [Singleton](#singleton)
   - [Factory Method](#factory-method)
   - [Abstract Factory](#abstract-factory)
   - [Builder](#builder)
   - [Prototype](#prototype)
3. [Requisitos](#requisitos)
4. [Instalación](#instalación)
5. [Uso](#uso)

## 1- Introducción

Los patrones creacionales son una categoría dentro de los patrones de diseño que se centran en el proceso de creación de objetos. Estos patrones ofrecen soluciones para controlar cómo y cuándo se instancian los objetos, ayudando a resolver problemas comunes como la reutilización de objetos, la creación de instancias únicas, o la construcción de objetos complejos de manera eficiente.

Este proyecto aborda los siguientes patrones creacionales:

- Singleton
- Factory Method
- Abstract Factory
- Builder
- Prototype

## 2- Patrones Creacionales

### Singleton
Singleton es un patrón de diseño creacional que nos permite asegurarnos de que una clase tenga una única instancia, a la vez que proporciona un punto de acceso global a dicha instancia.
#### Como implementarlo: [Describir el ejemplo]
#### Diagrama Singleton [Agregar]

### Factory Method
Factory Method es un patrón de diseño creacional que proporciona una interfaz para crear objetos en una superclase, mientras permite a las subclases alterar el tipo de objetos que se crearán.

#### Como implementarlo: [Describir el ejemplo]
#### Diagrama Factory Method [Agregar]

### Abstract Factory
Abstract Factory es un patrón de diseño creacional que nos permite producir familias de objetos relacionados sin especificar sus clases concretas.

#### Como implementarlo: [Describir el ejemplo]
#### Diagrama Abstract Factory [Agregar]

### Builder
Builder es un patrón de diseño creacional que nos permite construir objetos complejos paso a paso. El patrón nos permite producir distintos tipos y representaciones de un objeto empleando el mismo código de construcción.

#### Como implementarlo: [Describir el ejemplo]
#### Diagrama Builder [Agregar]

### Prototype
Prototype es un patrón de diseño creacional que nos permite copiar objetos existentes sin que el código dependa de sus clases.

#### Como implementarlo: [Describir el ejemplo]
#### Diagrama Prototype [Agregar]

## 3- Requisitos

- **Java 15** o superior.
- Maven para la gestión de dependencias.

## 4- Instalación

1. Clona este repositorio:
    ```bash
    git clone https://github.com/NahuelBarrios/Patrones-de-disenio-creacionales.git
    ```
2. Navega al directorio del proyecto:
    ```bash
    cd nombre-del-proyecto
    ```
3. Compila el proyecto:
    ```bash
    mvn clean install
    ```

## Uso

Incluye una breve descripción de cómo ejecutar los ejemplos o cómo cada patrón puede ser probado.

## Más informacion

https://refactoring.guru/es/design-patterns/creational-patterns
