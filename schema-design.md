# Smart Clinic Management System - Database Schema

## MySQL Database Design

### Doctor Table

| Field | Type | Description |
|------|------|-------------|
| doctor_id | BIGINT (PK) | Unique doctor ID |
| name | VARCHAR(100) | Doctor name |
| email | VARCHAR(100) | Doctor email |
| speciality | VARCHAR(100) | Doctor specialization |
| phone | VARCHAR(20) | Contact number |

---

### Patient Table

| Field | Type | Description |
|------|------|-------------|
| patient_id | BIGINT (PK) | Unique patient ID |
| name | VARCHAR(100) | Patient name |
| email | VARCHAR(100) | Patient email |
| phone | VARCHAR(20) | Contact number |
| date_of_birth | DATE | Date of birth |

---

### Appointment Table

| Field | Type | Description |
|------|------|-------------|
| appointment_id | BIGINT (PK) | Appointment ID |
| doctor_id | BIGINT (FK) | References Doctor |
| patient_id | BIGINT (FK) | References Patient |
| appointment_time | DATETIME | Appointment time |
| status | VARCHAR(50) | Appointment status |

---

### Admin Table

| Field | Type | Description |
|------|------|-------------|
| admin_id | BIGINT (PK) | Admin ID |
| username | VARCHAR(100) | Admin username |
| email | VARCHAR(100) | Admin email |
| password | VARCHAR(255) | Encrypted password |

---

## Relationships

- Appointment.doctor_id → Doctor.doctor_id
- Appointment.patient_id → Patient.patient_id
