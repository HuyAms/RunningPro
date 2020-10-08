# RunningPro

If you’re like us, your smartphone is your go-to for just about everything. Capturing memories, getting directions, keeping up with loved ones – the list goes on and on. It goes everywhere with us, and that includes our workouts.

Apps make it easier than ever to stay motivated and stick to your routine. When it comes to running, they can track your pace, distance, calories, running routes and more, all to help you reach your fitness goals.

We introduce you the **Running Pro** app

## Features
- Kotlin 
- **Step tracking sensor:** Track running step and calculate calories based on distance and weight
- **4 Fragments:** Settings, Setup, Traciking, Statistics
- **3 Android components:** Activity, Service, Content provider
- **Persistence (Room):** Save user info and running history data
- **GPS:** Track user's location on map
- **Map:** Show user's running route
- **Retrofit:** Networking, fetch weather data from Open weather API
- **ViewModel, LiveData:** MVVM Architecture for clean code
- **UI/UX:** Follow android material design

## Architecture: MVVM

**MVVM** stands for Model, View, ViewModel.

**Model:** This holds the data of the application. It cannot directly talk to the View. Generally, it’s recommended to expose the data to the ViewModel through Observables.

**View:** It represents the UI of the application devoid of any Application Logic. It observes the ViewModel.

**ViewModel:** It acts as a link between the Model and the View. It’s responsible for transforming the data from the Model. It provides data streams to the View. It also uses hooks or callbacks to update the View. It’ll ask for the data from the Model

![Login](https://miro.medium.com/max/638/1*sdOtTrxrOVQzYRygaB1qqw.jpeg)
