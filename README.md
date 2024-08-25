NovelNest - Android Application
NovelNest is an Android application designed to fetch and display web novels from various sources. It provides a seamless reading experience with a modern and light UI, making it easy for users to browse and read their favorite novels.

Table of Contents
Features
Tech Stack
Installation
Project Structure
Usage
APIs
Contributing
License
Contact
Features
Fetches web novels from multiple sources.
Displays novels in a clean, modern interface with a light color scheme.
Allows users to browse chapters and read them directly within the app.
Responsive design optimized for both phones and tablets.
Supports multiple languages for international audiences.
Tech Stack
Programming Language: Java
UI Design: Android XML, Material3 Themes
Networking: Retrofit, Jsoup
Image Loading: Glide
Database: Firebase Realtime Database, Firestore
Deployment: Railway.app for backend APIs
Installation
Prerequisites
Android Studio (latest version)
JDK 8 or higher
Android SDK
Clone the Repository
bash
Copy code
git clone https://github.com/yourusername/novelnest.git
cd novelnest
Open the Project
Open Android Studio.
Click on Open an existing project.
Navigate to the cloned repository folder and select it.
Let Android Studio configure the project.
Build the Project
Ensure that all dependencies are downloaded by syncing Gradle.
Connect your Android device or start an emulator.
Click on the Run button in Android Studio to build and run the application.
Project Structure

novelnest/
│
├── app/                    # Main application code
│   ├── src/                # Source files
│   │   ├── main/           # Main source files
│   │   │   ├── java/       # Java source code
│   │   │   └── res/        # Resource files (layouts, drawables, etc.)
│   │   └── test/           # Unit tests
│   └── build.gradle        # App-level Gradle file
│
├── build.gradle            # Project-level Gradle file
├── settings.gradle         # Settings for Gradle
└── README.md               # Project documentation
Usage
Fetching Novels
Open the application.
Browse or search for novels using the search bar.
Select a novel to view its chapters.
Click on a chapter to start reading.
APIs
This app interacts with APIs to fetch novel data and chapters. Below is a summary of the primary API interactions:

Get Novels: Fetches a list of novels from the backend.
Get Chapters: Fetches a list of chapters for a selected novel.
Get Chapter Content: Fetches the content of a selected chapter.
Example API Endpoint:

http
Copy code
GET /api/novels
Adding a New Source
To add a new novel source:

Define the base URL in the application code.
Create a parser using Jsoup to extract the required data.
Integrate the new source into the existing novel fetching flow.
Contributing
Contributions are welcome! To contribute:

Fork the repository.
Create a new branch (git checkout -b feature-branch).
Commit your changes (git commit -m 'Add new feature').
Push to the branch (git push origin feature-branch).
Open a Pull Request.
Please make sure to update tests as appropriate.

License
This project is licensed under the MIT License - see the LICENSE file for details.

Contact
If you have any questions or feedback, feel free to reach out:

Email: tinkesh509@gmail.com
GitHub: Tinkesh Bhoyar
