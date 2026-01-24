#  App Móvil de Ventas 

Este es el cliente móvil para un sistema de gestión de pedidos de cuadernos. La aplicación permite interactuar con un servidor externo para gestionar el flujo de ventas en tiempo real.

## Tecnologías Utilizadas
*   **IDE:** Android Studio
*   **Lenguaje:** Java / Android Nativo
*   **Networking:** [Volley](https://developer.android.com) (Gestión de peticiones HTTP/JSON)
*   **Interfaz:** XML con Material Design y Componentes de Carousel.
*   **Arquitectura:** Cliente-Servidor (REST API).

##Conexión con el Backend (API)
La aplicación consume una API desarrollada en **ExpressJS** y **MySQL** de forma colaborativa.

- **Endpoints principales:** 
* `POST /login` - Autenticación de cuentas.
* `GET /pedidos` - Registro de pedidos.
* `POST /registro` - Registro de nuevos clientes en la DB MySQL.
*   Carga dinámica de imágenes desde el servidor.

*   **Frontend:** App nativa Android que consume dicha API para la gestión de pedidos.

## Estado del Proyecto: [70%] - En pausa
Este repositorio es una muestra de mis habilidades en el desarrollo de aplicaciones android (frontend). Actualmente me encuentro trabajando en:
*   [ ] Gestion y administracion de productos(parte del administrador).
*   [ ] Refactorizacion de componentes(RecyclerView).
*   [ ] Mejora de la experiencia de usuario.


Créditos
*   **Desarrollo Android (Frontend):** Alieth7
*   **Desarrollo API (Backend):** [@Sergio Garcia](https://github.com/Sega1A)

> **Nota:** Este cliente móvil se conecta a una **API REST** desarollada colaborativamente.
> **Nota:** Este proyecto es parte de mi portafolio y no está destinado a su distribución o instalación por terceros en esta fase.
