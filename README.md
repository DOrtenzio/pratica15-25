# Registro Automobilistico

Vogliamo realizzare un sistema di registrazione auto che tenga traccia del proprietario associato a ciascuna targa.

- **La targa** è univoca per ogni veicolo e sarà usata come chiave.
- **Il proprietario** sarà usato come valore nella mappa.

---

## Specifiche Tecniche

### 1. Classe `Targa`
Crea la classe `Targa` con i seguenti attributi:
- `String numero`

**Implementa:**
- Costruttore
- Metodi getter e setter
- Override di `equals()` e `hashCode()` basati su `numero`
- Override di `toString()`

> ⚠️ È essenziale che `equals()` e `hashCode()` siano coerenti per permettere il funzionamento corretto della mappa.

---

### 2. Classe `Proprietario`
Crea la classe `Proprietario` con i seguenti attributi:
- `String nome`
- `String cognome`
- `String codiceFiscale`

**Implementa:**
- Costruttore
- Override di `toString()` per mostrare nome completo e codice fiscale

---

### 3. Classe `Main`
Nel metodo `main`, esegui i seguenti passi:

a) Crea una `HashMap<Targa, Proprietario>`  
b) Inserisci almeno **3 coppie** targa → proprietario  
c) Inserisci una **quarta coppia** con una targa già esistente ma con un nuovo proprietario  
   - Questo dimostra che la mappa non accetta chiavi duplicate: il nuovo valore sovrascriverà quello precedente  
d) Stampa il contenuto della mappa  
e) Inserisci una stampa o messaggio che spieghi cosa è successo quando è stata usata una chiave duplicata

---

## Estensioni

1. Aggiungi un controllo per evitare la sovrascrittura, stampando un messaggio se la targa esiste già
2. Inverti la mappa usando una `HashMap<Proprietario, List<Targa>>`
3. Aggiungi input da tastiera per inserire targhe e proprietari in modo interattivo
