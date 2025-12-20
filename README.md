# 🏦 Système de Gestion de Compte Bancaire – Java (POO)

## 📌 Description

Ce projet est une application Java développée dans le cadre du module **Programmation Orientée Objet (POO)**.  
Il s’agit d’un **système de gestion de comptes bancaires** permettant de simuler les opérations bancaires de base tout en appliquant les principes fondamentaux de la programmation orientée objet.

Le projet met en pratique les notions d’encapsulation, d’héritage, de polymorphisme, d’interfaces, de collections et de gestion des exceptions.

---

## 🎯 Objectifs du projet

- Comprendre et appliquer les concepts clés de la POO en Java  
- Concevoir une architecture claire et modulaire  
- Modéliser différents types de comptes bancaires  
- Gérer correctement les opérations et les erreurs  
- Produire un code lisible, maintenable et extensible  

---

## ⚙️ Fonctionnalités

- Création de comptes bancaires  
  - Compte courant (avec découvert autorisé)  
  - Compte épargne (sans découvert)  
- Dépôt d’argent  
- Retrait d’argent avec gestion des règles spécifiques  
- Virement entre comptes  
- Historique des transactions  
- Gestion des erreurs via des exceptions personnalisées  

---

## 🧱 Architecture du projet

Le projet est organisé en plusieurs packages afin de séparer les responsabilités :

```text
src/
 ├─ app/         → Classe principale (tests du système)
 ├─ model/       → Classes métier (comptes, transactions, interface, enum)
 ├─ service/     → Logique de gestion des comptes
 └─ exception/   → Exceptions personnalisées
