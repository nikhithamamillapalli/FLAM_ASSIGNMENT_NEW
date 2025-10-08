# 🔥 Flam R&D Assignment — Android + Web Prototype

## 📖 Project Overview
This project demonstrates a simple prototype of **Flam’s GenAI-powered immersive infrastructure**, focusing on real-time image processing using **C++ (NDK)**, **OpenCV**, and **Android JNI bridge**.  
It represents the foundational step towards creating high-fidelity AR/MR experiences without requiring an app download — aligning with Flam’s vision of *“The Immersive & Interactive Layer for Every Screen & Surface.”*

The assignment consists of two main modules:
- **Android App (C++ + Kotlin + OpenCV)** — performs real-time image processing (grayscale conversion / brightness enhancement) using JNI.
- **Web App (TypeScript + HTML + CSS)** — lightweight demo showing similar image manipulation in-browser.

---

##  Architecture Diagram (Optional)
```text
            +----------------------+
            |     MainActivity     |
            | (Android / Kotlin)   |
            +----------+-----------+
                       |
                       | JNI Bridge
                       v
            +----------------------+
            |   native-lib.cpp     |
            |  (C++ OpenCV logic)  |
            +----------+-----------+
                       |
                       v
            +----------------------+
            |  image_processor.cpp |
            |  (Filter Operations) |
            +----------------------+
# FLAM_ASSIGNMENT_NEW
