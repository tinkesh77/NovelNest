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

Novel API : 

Get All Novels   Endpoint: GET /api/novels
Get Novel Details  Endpoint: GET /api/novels/{id}
Search Novels GET /api/novels/search


Chapter Management
Get Chapters of a Novel

Endpoint: GET /api/novels/{id}/chapters
Description: Fetches a list of chapters for a specific novel.
Get Chapter Details

Endpoint: GET /api/novels/{id}/chapters/{chapterId}
Description: Fetches detailed content of a specific chapter by its ID.
3. User Management
Register User

Endpoint: POST /api/users/register
Description: Registers a new user.
Login User

Endpoint: POST /api/users/login
Description: Authenticates a user and provides a token.
Get User Profile

Endpoint: GET /api/users/{userId}
Description: Fetches user profile details.
4. Reading Progress
Get User Reading Progress

Endpoint: GET /api/users/{userId}/progress
Description: Fetches the reading progress of a user.
Update Reading Progress

Endpoint: POST /api/users/{userId}/progress
Description: Updates the reading progress for a user.
5. Favorites and Bookmarks
Add Novel to Favorites

Endpoint: POST /api/users/{userId}/favorites
Description: Adds a novel to the user’s favorites list.
Remove Novel from Favorites

Endpoint: DELETE /api/users/{userId}/favorites/{novelId}
Description: Removes a novel from the user’s favorites list.
Get User Favorites

Endpoint: GET /api/users/{userId}/favorites
Description: Fetches the list of favorite novels for a user.
6. Ratings and Reviews
Add Review for a Novel

Endpoint: POST /api/novels/{id}/reviews
Description: Adds a review for a specific novel.
Get Reviews for a Novel

Endpoint: GET /api/novels/{id}/reviews
Description: Fetches reviews for a specific novel.
7. Admin and Management
Add New Novel

Endpoint: POST /api/admin/novels
Description: Adds a new novel to the system.
Update Novel Details

Endpoint: PUT /api/admin/novels/{id}
Description: Updates details of a specific novel.
Delete Novel

Endpoint: DELETE /api/admin/novels/{id}
Description: Deletes a specific novel from the system.
8. Miscellaneous
Get Genres

Endpoint: GET /api/genres
Description: Fetches a list of available genres.
Get Authors

Endpoint: GET /api/authors
Description: Fetches a list of authors.





Contact
If you have any questions or feedback, feel free to reach out:

Email: tinkesh509@gmail.com
GitHub: Tinkesh Bhoyar
