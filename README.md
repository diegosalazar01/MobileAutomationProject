# Mobile Automation Project 📱🤖

This project contains automated tests for a mobile application using **Appium**, **Java**, and **TestNG**, following best practices with **POM (Page Object Model)** and **Page Factory**.

---

## 📌 Technologies Used
- [Java 17+](https://adoptium.net/)  
- [Appium](https://appium.io/)  
- [Selenium WebDriver](https://www.selenium.dev/)  
- [TestNG](https://testng.org/)  
- [JavaFaker](https://github.com/DiUS/java-faker) – for dynamic test data generation  
- [Maven](https://maven.apache.org/) – dependency management  

---

## 📂 Project Structure
MobileAutomationProject/<br>
│── src/<br>
│ ├── main/java/com/automation/screens/ # Page Object classes (app screens)<br>
│ ├── main/java/com/automation/utils/ # Utilities (BaseTest, TestData, etc.)<br>
│ └── test/java/com/automation/tests/ # Automated test cases<br>
│<br>
│── pom.xml # Maven dependencies configuration<br>
│── README.md # Project documentation<br>



---

## 🧪 Implemented Test Cases
### ✅ Navigation
- Validate navigation through the **bottom menu bar** and check the visibility of each section.  

### ✅ Authentication
- **User Sign Up**  
  - Generates dynamic test data (email/password) using **JavaFaker**.  
  - Validates that the success message is displayed after sign up.  

- **Successful Login**  
  - Uses previously registered credentials.  
  - Validates that the login process completes successfully.  

### ✅ Swipe
- Swipe horizontally through cards and validate that the previous card is hidden.  
- Swipe right to the last card and ensure it is the only visible one.  
- Swipe vertically until `"You found me!!!"` is displayed and validate the text.  

---

## ▶️ Running the Tests
### Prerequisites
1. Install and start the **Appium Server**.  
2. Set up an **Android emulator** or connect a physical device.  
3. Verify that your device is detected with:  
   ```bash
   adb devices

---

## ▶️ Running the Test Suite

You can run **all tests at once** using the `TestSuite.xml` file.

### 🔹 From IntelliJ IDEA / Eclipse
1. Locate the `TestSuite.xml` file in the project explorer.  
2. **Right-click** on the file.  
3. Select **Run 'TestSuite.xml'**.  
4. The suite will execute all test classes defined inside the XML.  

### 🔹 From the terminal (alternative)
```bash
mvn clean test -DsuiteXmlFile=TestSuite.xml
