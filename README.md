# Pizzeria Pai-Pai

Pizzeria Pai-Pai is a Java Swing desktop application for managing the day-to-day
operations of a pizzeria. It provides a single desktop workspace for clients,
products, ingredients, tables, reservations, and invoices, with JSON files used
for local persistence.

## Features

- **Clients:** create, search, update, list, and delete customer records.
- **Products:** manage pizzas, starters, and desserts, including ingredient
  associations and availability checks.
- **Ingredients:** create, search, update, delete, and list stock ingredients.
- **Tables and reservations:** manage tables and reservations, including queries
  by client and table.
- **Invoices:** open a sale, add products, close the sale, and search or list
  invoices.

## Technology

- Java desktop application
- Swing user interface
- JSON persistence through the bundled `ProyectoPizzeria/lib/json.jar`
- Layered design with presentation, business, and integration packages
- Eclipse project metadata is included in `.project` and `.classpath`

No external database or network service is required. The application reads and
writes the JSON files in `ProyectoPizzeria/resources`.

## Requirements

- A Java Development Kit (JDK) that supports the source code
- Eclipse IDE with Java support (recommended), or a shell with `javac` and
  `java`
- A graphical desktop environment for the Swing interface

The repository does not currently include Maven or Gradle metadata. The
instructions below use the checked-in Eclipse configuration and bundled JSON
library.

## Run with Eclipse

1. Clone the repository and import it into Eclipse as an **Existing Projects
   into Workspace** project.
2. Ensure the project is configured with a compatible JDK under
   **Project > Properties > Java Build Path**. The checked-in classpath already
   points to `ProyectoPizzeria/src` and `ProyectoPizzeria/lib/json.jar`.
3. Run `launcher.Main` as a **Java Application**.
4. Keep the repository root as the working directory. The integration layer
   uses paths such as `ProyectoPizzeria/resources/Platos.json`, so launching
   from another directory will prevent the application from finding its data.

## Build and run from a shell

From the repository root:

```bash
rm -rf /tmp/pizzeria-pai-pai-classes
mkdir -p /tmp/pizzeria-pai-pai-classes

javac \
  -cp ProyectoPizzeria/lib/json.jar \
  -d /tmp/pizzeria-pai-pai-classes \
  $(find ProyectoPizzeria/src -name '*.java')

java \
  -cp /tmp/pizzeria-pai-pai-classes:ProyectoPizzeria/lib/json.jar \
  launcher.Main
```

On Windows, replace the classpath separator `:` with `;` and use the
equivalent PowerShell or Command Prompt source-file expansion.

The application stores changes directly in the JSON files under
`ProyectoPizzeria/resources`. Back up those files before experimenting with
mutating operations if you want to preserve the sample data.

## Architecture

The source is organized into three main layers:

```text
ProyectoPizzeria/src/
├── presentacion/   Swing views, events, factories, and controller
├── negocio/       business services and domain transfer objects
├── integracion/   JSON-backed data access objects (DAOs)
└── launcher/      application entry point
```

`launcher.Main` starts the application by dispatching the `MAIN_WINDOW` event
to the presentation controller. The controller coordinates views from the
presentation factory and delegates operations to business services. Business
services obtain persistence implementations from the integration factory,
keeping the UI independent from the JSON storage details.

Design and data-flow diagrams are available in `ProyectoPizzeria/UML`, and
sample data is available in `ProyectoPizzeria/resources`.

## Project status and limitations

- Persistence is file-based JSON rather than a transactional database.
- Runtime paths currently assume the repository root is the working directory.
- The project is configured for Eclipse and manual JDK compilation; automated
  packaging and test tooling are not yet included.
- Swing UI validation requires a graphical desktop session.

## License

See [LICENSE](LICENSE).
