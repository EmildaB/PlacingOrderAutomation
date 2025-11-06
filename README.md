# PlacingOrderAutomation
Selenium TestNG Maven project for automated order placement.

### 📖 Project Overview
**PlacingOrderAutomation** is a Selenium TestNG automation project developed by **Emilda B** to automate the end-to-end flow of placing an order on [OMR Branch](https://omrbranch.com/).  
The script performs a complete user journey — from login to checkout — demonstrating strong test automation, modular design, and reusable code practices.

---

### 🧩 Tech Stack
- **Language:** Java  
- **Automation Tool:** Selenium WebDriver  
- **Test Framework:** TestNG  
- **Build Tool:** Maven  
- **Browser:** Google Chrome  
- **Dependency Management:** WebDriverManager  

---

### ⚙️ Project Structure
```
PlacingOrderAutomation
│
├── src
│   └── test
│       └── java
│           └── ecommerce
│               ├── BaseClass.java
│               └── PlacingOrder.java
│
├── PlacingOrderSuite.xml
├── pom.xml
└── test-output/
```

---

### 🚀 How to Run the Test
1. **Clone the repository**
   ```bash
   git clone https://github.com/EmildaB/PlacingOrderAutomation.git
   cd PlacingOrderAutomation
   ```

2. **Run the Test Suite**
   ```bash
   mvn clean test -DsuiteXmlFile=PlacingOrderSuite.xml
   ```

3. **View Reports**
   - Navigate to `test-output/`
   - Open `emailable-report.html` or `index.html` in your browser.

---

### 🧠 Key Features
✅ Browser initialization and teardown handled by `BaseClass`  
✅ Automated login and order placement on OMR Branch website  
✅ TestNG suite configuration for structured test execution  
✅ WebDriverManager for automatic driver setup  
✅ Generates detailed **TestNG HTML reports**

---

### 📊 Sample Console Output
```
Order Number: #ORD123456
✅ Order placed successfully.
Test completed by Emilda B.
```

---

### 🏆 Author
**👩‍💻 Emilda B**  
🔗 [LinkedIn](https://linkedin.com/in/b-emilda/)  
💬 Passionate about software testing, automation frameworks, and continuous learning.
