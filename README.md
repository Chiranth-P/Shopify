# 🛒 Shopify - Full Stack E-Commerce Application

A fully functional e-commerce web application built with **React.js**, **Spring Boot**, **MySQL**, and integrated with **Razorpay** for secure payments.

### 🚀 Live Demo

⚠️(Please note that only the Women's section is active now due to Railways Free Trial sql storage shortage....Follow the instructions given below for the setup)

Website: https://shopify-seven-sand.vercel.app  

---

## 🧑‍💻 Tech Stack

### 🔹 Frontend
- React.js
- Tailwind CSS
- Headless UI + Material UI (MUI)
- Axios for API calls
- React Router DOM
- Razorpay Checkout Integration

### 🔸 Backend
- Spring Boot
- Java 15
- RESTful APIs
- Razorpay Java SDK
- MySQL (Database)
- JPA + Hibernate
- Railway (Backend Deployment)

---

## ⚙️ Features

✅ User can browse products  
✅ Add to cart functionality  
✅ Checkout and place order  
✅ Razorpay Payment Gateway Integration  
✅ Order details saved in MySQL  
✅ Status-based order management  
✅ Fully responsive UI

---

## 📷 Screenshots



---

## 📦 Installation

### 🚧 Prerequisites
- Node.js & npm
- Java 21
- MySQL database
- Razorpay account (for API keys)

---

### 🖥️ Frontend Setup

In terminal--->

cd client
npm install
npm start

---

### 🛠️ Backend Setup

cd backend
./mvnw spring-boot:run

⚠️🛑 Make sure to update the following in application.properties:

spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
razorpay.api.key=your_razorpay_key
razorpay.api.secret=your_razorpay_secret



### 💳 Razorpay Integration
Payment link created using Razorpay SDK in backend

Callback URL set to hosted frontend (/payment/:orderId)

Payment status verified using Razorpay API

Order saved with OrderStatus.PLACED upon successful payment

### 🌐 Deployment

Frontend deployed on Vercel
Backend deployed on Railway

🙌 Acknowledgements: 
Ecommerce application built using Spring Boot + React + Tailwind CSS + Razorpay + Vercel(For Frontend Deployment) + Railway (For Backend Deployment)

## 🙏 Thank You! And Enjoy Exploring!
