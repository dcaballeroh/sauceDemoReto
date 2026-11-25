# Automatización E2E - SauceDemo (Screenplay & Serenity BDD)

Proyecto de automatización de pruebas End-to-End (E2E) sobre la plataforma **SauceDemo**, desarrollado bajo el patrón de diseño **Screenplay**, utilizando **Serenity BDD**, **Cucumber** y **Gradle**.

## 📋 Escenarios Automatizados

El archivo `sauceDemon.feature` contempla un flujo común de autenticación (`Background`) y dos escenarios principales:

1. **Successful product purchase end to end:** El usuario inicia sesión, agrega un producto al carrito, completa el formulario de checkout y valida el mensaje de confirmación de la orden (`Thank you for your order!`).
2. **Remove product from cart and logout end to end:** El usuario inicia sesión, agrega un producto al carrito, lo elimina, cierra sesión y verifica el retorno a la pantalla de inicio de sesión.

## 🛠️ Tecnologías y Herramientas

* **Java** (JDK 11 o superior)
* **Gradle** - Gestor de dependencias y construcción
* **Serenity BDD** - Framework de automatización y generación de reportes vivos
* **Cucumber** - Definición de pruebas bajo enfoque BDD (Gherkin)
* **Patrón Screenplay** - Arquitectura modular centrada en el usuario

## 📂 Estructura del Proyecto

La arquitectura sigue las buenas prácticas del patrón Screenplay bajo el paquete base `com.co.choucair`:

```text
ProyectoBaseSPCandidato
├── src
│   ├── main
│   │   └── java/com/co/choucair
│   │       ├── interactions      # Acciones de bajo nivel sobre la interfaz
│   │       ├── models            # Modelos de datos (ej. credenciales, datos de envío)
│   │       ├── questions         # Validaciones y aserciones del estado de la UI
│   │       ├── tasks             # Tareas de negocio de alto nivel (Login, Compra, etc.)
│   │       ├── userinterfaces    # Mapeo de elementos y localizadores de las páginas
│   │       └── utils             # Utilidades y constantes generales
│   └── test
│       ├── java/com/co/choucair
│       │   ├── runners           # Clases ejecutoras (sauceDemonRunner)
│       │   └── stepdefinitions   # Definición de pasos y Hooks de Cucumber
│       └── resources
│           ├── features          # Archivos .feature con escenarios en Gherkin (sauceDemon.feature)
│           └── serenity.conf     # Configuración de drivers, URLs y propiedades de Serenity
└── build.gradle                  # Dependencias y configuración de tareas de Gradle
```

## ⚙️ Prerrequisitos

Antes de ejecutar el proyecto, asegúrate de contar con:

* **Java JDK** (11 o 17 recomendado) configurado en las variables de entorno (`JAVA_HOME`).
* **Gradle** (o utilizar el wrapper `./gradlew` incluido en el proyecto).
* Navegador web actualizado (**Google Chrome** o **Microsoft Edge**).

## 🚀 Ejecución de las Pruebas

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/dcaballeroh/sauceDemoReto.git
   cd ProyectoBaseSPCandidato
   ```

2. **Ejecutar todos los escenarios y generar el reporte:**
    * En Windows:
      ```bash
      gradle clean test aggregate 
      ```
    * En Linux / macOS:
      ```bash
      ./gradle clean test aggregate 
      ```

3. **Ejecutar desde el Runner en IntelliJ IDEA:**
   Dirígete a `src/test/java/com/co/choucair/runners/sauceDemonRunner.java` y ejecuta la clase directamente.

## 📊 Reportes de Serenity BDD

Una vez finalizada la ejecución de las pruebas, Serenity BDD genera un reporte detallado con evidencias paso a paso y capturas de pantalla.

Puedes visualizarlo abriendo el siguiente archivo en tu navegador:
```text
target/site/serenity/index.html
```
*(Nota: Si utilizas la configuración estándar de Gradle sin cambiar el directorio de salida, también puede ubicarse en `build/reports/tests/` o `target/site/serenity/index.html`).*

## ✍️ Autor

* **David Caballero**
