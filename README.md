# CryptoTracker 📈

A robust cryptocurrency tracking Android application built using **Kotlin**, **Jetpack Compose**, and **MVI Architecture** with **Clean Architecture** principles. CryptoTracker offers real-time cryptocurrency prices, historical data, and an intuitive UI, making it perfect for crypto enthusiasts.

---

## Features 🚀

- 📊 **Live Cryptocurrency Prices**: Real-time updates for leading cryptocurrencies using the [CoinCap API](https://docs.coincap.io/).
- 📈 **Market Insights**: Historical price trends with interactive charts.
- 🌙 **Night Mode**: User-friendly dark mode for a seamless experience in low-light conditions.
- 🎨 **Material 3 Design**: Custom themes created using the [Material 3 Theme Generator](https://material-foundation.github.io/material-theme-builder/).
- 🔄 **Clean Architecture**: Modular structure with clear separation of concerns (Data, Domain, and Presentation layers).
- 🌐 **Networking with Ktor**: Fast and efficient API calls using Ktor.
- 🗂️ **Dependency Injection with Koin**: Lightweight and easy-to-configure dependency injection framework.

---

## Architecture 🏗️

CryptoTracker follows **Clean Architecture** principles:

### Data Layer
- **Data Sources**: Handles data sources (e.g., API calls, local database).
- **Networking**: Utilizes **Ktor** for network communication.
- **Mappers**: Transforms data models into domain models.

### Domain Layer
- **Business Logic**: Contains the core business logic.

### Presentation Layer
- **MVI Architecture**: Implements MVI (Model-View-Intent) Architecture using Jetpack Compose for a modern UI.
- **State Management**: Manages state and user interactions.

---

## Screenshots 📸

> *Add screenshots to showcase the UI, including Day and Dark Mode and the Material 3 theme.*
>[Dark Mode Screenshot
> https://github.com/kyodgorbek/CryptoTracker/blob/master/assets/images/1screen.png
> 


---

## Tech Stack 🛠️

- **Language**: Kotlin
- **Architecture**: MVI with Clean Architecture
- **UI**: Jetpack Compose
- **Networking**: Ktor
- **Dependency Injection**: Koin
- **Local Storage**: Room Database
- **Asynchronous Programming**: Coroutines, StateFlow
- **Design System**: Material 3 with themes generated via [Material 3 Theme Generator](https://material-foundation.github.io/material-theme-builder/)


