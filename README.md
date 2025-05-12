**Forge-Budget Tracking Application**

The Budget Tracking App is a comprehensive and intuitive mobile application designed to help users take control of their personal finances. Whether you are looking to manage your monthly expenses or save for a big goal, this app offers a clean, user-friendly experience that simplifies budgeting. Upon launching the app, users are prompted to either register a new account or log in if they already have existing credentials. For new users, registration is quick and easy, requiring basic account information. Once signed in, users are welcomed to the Home page, the starting point of the app experience.

Navigation within the app is made seamless with a bottom navigation bar, allowing users to easily switch between key sections such as Home, Category Management, and their Profile or Settings page. The app provides the tools needed to create custom budget categories, allocate funds, and keep track of spending habits. Importantly, the app also supports persistent login functionality — meaning that once users log in and choose to save their credentials, they won't have to enter them again even after logging out, enhancing convenience and usability.

**Features**
The Budget Tracking App provides secure and reliable user authentication. New users are required to register by providing their credentials, which are stored securely using best practices to ensure privacy and safety. Once registered, users can simply log in during future visits, with their credentials retained for convenience unless they manually choose to clear their saved data.

Upon logging in, users are immediately taken to the Home page, which displays a summary of their current budgets, recent transactions, and overall financial health. From there, users can easily explore other parts of the application through the bottom navigation bar. This design allows users to fluidly transition between managing categories, reviewing their spending, or adjusting account settings.

One of the core functionalities of the app is Category Creation and Management. Users can define custom categories, such as "Groceries," "Rent," "Entertainment," or any other spending type that suits their lifestyle. Each category can have a designated budget limit, helping users track how much they spend in each area and ensuring they stay within their financial goals.

Furthermore, the persistent login system ensures that user credentials are safely saved locally on the device. This means users will not need to re-enter their username and password each time they open the app, providing a smooth and efficient user experience while maintaining security standards.

**User Flow**
When a user first opens the app, they are presented with the option to Register or Sign In. After successful authentication, they land on the Home page, which serves as the dashboard displaying financial summaries. Using the bottom navigation bar, users can switch to the Categories screen to create and organize budgets or access the Profile/Settings screen to manage account details or logout if desired. Logging out will not delete saved credentials unless explicitly chosen, allowing quick access during future sessions.

**Technology Stack**
The application is developed using Android Studio and programmed in Kotlin, leveraging modern Android development practices. User authentication and credential storage are managed using a combination of Firebase Authentication and/or Secure Local Storage, depending on user settings and device capabilities. The app architecture follows best practices with a focus on security, reliability, and user-centered design.

**Installation Instructions**
To run the Budget Tracking App locally on your device:

Clone the repository to your local machine using:

git clone https://github.com/your-repository/budget-tracking-app.git
Open the project in Android Studio.

Connect your Android device or start an emulator.

Build and run the project.

Ensure that you have an active Firebase project if you are using Firebase Authentication services, and configure the app accordingly by adding your google-services.json file.

**Future Enhancements**
Looking ahead, several enhancements are planned to further improve the user experience. These include adding visual spending analytics and charts to better understand spending patterns, introducing notification reminders for bill due dates or budget alerts, and expanding to support multiple currencies for international users. Additional features such as dark mode, data backup to cloud services, and collaborative budgeting for households are also being considered.
