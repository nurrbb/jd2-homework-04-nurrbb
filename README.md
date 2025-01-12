# JD2-Homework-04

## Music Store Application

This project implements a music store system where users can search, purchase albums and songs. The application consists of various classes that represent albums, songs, users, and the shopping cart.

---

## Requirements

1. **Album Class**:
   - Represents a music album with the following attributes:
     - `name`: The name of the album.
     - `artist`: The artist of the album.
     - `releaseDate`: The release date of the album.
     - `songs`: A list of songs contained in the album.

2. **Song Class**:
   - Represents a song with the following attributes:
     - `name`: The name of the song.
     - `artist`: The artist of the song.
     - `album`: The album the song belongs to.
     - `duration`: The length of the song.

3. **User Class**:
   - Represents a user with the following attributes:
     - `id`: Unique identifier for the user.
     - `name`: The name of the user.
     - `email`: The email address of the user.
     - `password`: The password for the user account.

4. **Shopping Cart Class**:
   - Represents the shopping cart with the following attributes:
     - `items`: A list of items (albums or songs) added to the cart.
     - `totalPrice`: The total price of the items in the cart.

5. **Main Program Class**:
   - Provides the user interface and interactions, such as:
     - User account creation.
     - Searching for albums and songs.
     - Adding items to the shopping cart.
     - Proceeding with the purchase process.

---

## Design Guidelines

- **Naming Conventions**: Follow standard naming conventions (camelCase for variables and methods, PascalCase for classes).
- **Code Formatting**: Ensure that the code is properly formatted by using IDE code formatting tools.
- **Avoiding Redundancies**: Minimize unnecessary object references and reuse objects wherever possible.

---

## Prerequisites

- **Java 17 or later**
- An IDE such as IntelliJ IDEA or Eclipse

---

## Project Setup and Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-repository-link.git
   cd music-store-application
