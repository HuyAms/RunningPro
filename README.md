# IRun - Grow forest while running

If you’re like us, your smartphone is your go-to for just about everything. Capturing memories, getting directions, keeping up with loved ones – the list goes on and on. It goes everywhere with us, and that includes our workouts.

Apps make it easier than ever to stay motivated and stick to your routine. When it comes to running, they can track your pace, distance, calories, running routes and more, all to help you reach your fitness goals.

Set your goal and run. Whenever you run, plant a tree. You tree will grow while you are running!!

We introduce you the **IRun** app

## Features
- **Kotlin**
- **Step tracking sensor:** Track running step and calculate calories based on distance and weight
- **4 Fragments:** Settings, Setup, Traciking, Statistics
- **3 Android components:** Activity, Service, Content provider
- **Persistence (Room):** Save user info and running history data
- **GPS:** Track user's location on map
- **Map:** Show user's running route
- **Camera**: Set avatar and checkpoint
- **MPAndroid Chart:** Visualize running data
- **Dagger Hilt:** Inject dependencies
- **Retrofit:** Networking, fetch weather data from Open weather API
- **ViewModel, LiveData:** MVVM Architecture for clean code
- **UI/UX:** Follow android material design

## Upcomming features
- **Running gamification:** When user starts his/her run, the game will begin. There will be multiple checkpoints which user needs to reach out in time which depends on the level. At each checkpoint, user has to use **AR feature** to look for a hint which leads to the next checkpoint. The length of the game will depend on user's current health and body indices such as weight or height.

- **Ranking and rewarding:** User will be ranked based on their statistics in a seasonal ranking system. After season ends, user will get an achievement badge. If we can get some income/funding, the reward can be some vouchers for gym/yoga class.  

## Architecture: MVVM

**MVVM** stands for Model, View, ViewModel.

**Model:** This holds the data of the application. It cannot directly talk to the View. Generally, it’s recommended to expose the data to the ViewModel through Observables.

**View:** It represents the UI of the application devoid of any Application Logic. It observes the ViewModel.

**ViewModel:** It acts as a link between the Model and the View. It’s responsible for transforming the data from the Model. It provides data streams to the View. It also uses hooks or callbacks to update the View. It’ll ask for the data from the Model

![Login](https://miro.medium.com/max/638/1*sdOtTrxrOVQzYRygaB1qqw.jpeg)
