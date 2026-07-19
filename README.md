# ChandraHari-Portfolio

# 🌐 Personal Portfolio Website

A full-stack personal portfolio website developed to showcase my skills, projects, experience, and contact information. The application includes a responsive frontend design and a Spring Boot backend with MySQL database integration to handle contact form submissions.

## 🚀 Features

✨ **Responsive Portfolio Design**
- Modern and clean user interface
- Mobile-friendly layout
- Separate sections for About, Skills, Projects, and Contact

📌 **Portfolio Sections**
- Home page with introduction
- About Me section
- Work Experience
- Technical Skills showcase
- Projects display
- Contact form

📩 **Contact Management**
- Users can send messages through the contact form
- Form data is stored securely in MySQL database
- Backend developed using Spring Boot REST API

## 🛠️ Technologies Used

### Frontend
- HTML5
- CSS3
- JavaScript
- Bootstrap

### Backend
- Java
- Spring Boot
- Spring Data JPA
- REST API

### Database
- MySQL

### Tools
- Eclipise IDE
- Maven
- Git & GitHub
- Postman

## 🏗️ Project Structure

```
Portfolio-Website
│
├── src/main/java
│   └── Controller
│   └── Entity
│   └── Repository
│   └── Service
│
├── src/main/resources
│   ├── static
│   │   ├── css
│   │   ├── images
│   │   └── javascript
│   │
│   └── application.properties
│
├── pom.xml
└── README.md
```

## ⚙️ Backend Configuration

Update your MySQL database details in:

```
application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/portfolio
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## ▶️ How to Run the Project

### Clone Repository

```bash
git clone https://github.com/your-username/your-repository-name.git
```

### Navigate to Project Folder

```bash
cd Portfolio-Website
```

### Run Spring Boot Application

Using Maven:

```bash
mvn spring-boot:run
```

or run the application from IntelliJ IDEA.

The application will start at:

```
http://localhost:8080
```

## 📸 Screenshots

(Add your website screenshots here)

Example:

```
![Home Page](screenshots/home.png)
![Projects Page](screenshots/projects.png)
```

## 📚 Learning Outcomes

- Developed a full-stack web application using Spring Boot
- Implemented REST APIs for backend communication
- Connected application with MySQL database using JPA
- Built responsive frontend using HTML, CSS, and JavaScript
- Managed project using Git and GitHub

## 👨‍💻 Author

**Chandra Hari**

- GitHub: https://github.com/ChandraHari05
- LinkedIn: Add your LinkedIn profile link

---

⭐ If you like this project, consider giving it a star!
