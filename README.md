# GhostBusters in Asturias

## Project Description

Something strange is happening in Asturias!

Residents of various areas have started noticing paranormal phenomena: feudal ghosts, invisible sailors, levitating nuns, and terrifying shadows. As part of the new **GhostBusters** team, your mission is to investigate these phenomena, capture ghosts, and maintain peace in the region.

The operations base is located in an old industrial warehouse in Avilés, equipped with ectoplasmic storage traps and advanced paranormal detection equipment. Every corner of Asturias may hold unsolved mysteries. Can you keep the region safe and face the most dangerous specters?

## Technologies Used

- **Java 21**
- **JUnit for TDD (Test-Driven Development)**

## Installation and Execution

1. Clone this repository:
   ```bash
   git clone https://github.com/youruser/ghostbusters-asturias.git
   ```
2. Navigate to the project directory:
   ```bash
   cd ghostbusters-asturias
   ```
3. Compile the project:
   ```bash
   javac -d bin src/**/*.java
   ```
4. Run the tests to verify functionality:
   ```bash
   java -cp bin:lib/junit-5.jar org.junit.runner.JUnitCore TestSuite
   ```
5. Start the application:
   ```bash
   java -cp bin Main
   ```

## Test-Driven Development (TDD)

This project follows the **Test-Driven Development (TDD)** methodology, ensuring code quality and reliability. Each feature is implemented through these steps:
1. Write a unit test in **JUnit** based on acceptance criteria.
2. Run the test and ensure it fails.
3. Implement the functionality until the test passes.
4. Refactor the code while keeping the test green.

## Main Features

### 1. Capture Ghosts
**User Story:**
> AS a user, I WANT to capture a new ghost SO THAT I can expand my collection and protect iconic locations in Asturias.

### 3. Release Ghosts
**User Story:**
> AS a user, I WANT to release less dangerous or harmless ghosts SO THAT I can make space in my ectoplasmic container.

### 4. Filter Ghosts by Class
**User Story:**
> AS a user, I WANT to filter ghosts by class SO THAT I can prioritize which ones to study or use in my investigations.

### 5. View Ghosts Captured in a Specific Month
**User Story:**
> AS a user, I WANT to get a list of ghosts captured in a specific month SO THAT I can study paranormal activity patterns in Asturias.


## Contributions

If you want to contribute to the project, follow these steps:
1. Fork the repository.
2. Create a new branch for your feature:
   ```bash
   git checkout -b new-feature
   ```
3. Make the changes and test the code.
4. Commit with a descriptive message:
   ```bash
   git commit -m "Added ghost filtering functionality"
   ```
5. Push the changes to your repository:
   ```bash
   git push origin new-feature
   ```
6. Create a Pull Request on GitHub.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.

