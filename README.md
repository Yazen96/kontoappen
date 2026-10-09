# kontoappen

Det här är en enkel kontoapp som jag har gjort i Java. I appen kan man skapa konton, se alla konton, sätta in pengar och ta ut pengar.

## Muntlig redovisning

Länk till videon: https://funet-my.sharepoint.com/:v:/g/personal/3kdyhapp26_alnsya_folkuniversitetet_nu/IQArQjhPzKHJS7n3aZJ9gqEtAZnrNLZ3zIsvPqfB0VoPoLQ

## Inkapsling

I "Account.java" har jag gjort "owner" och "balance" private. Det betyder att man inte kan ändra dem direkt från "Main". Saldot ändras istället med "deposit" och "withdraw", så att man till exempel inte kan ta ut mer pengar än vad som finns.

## Factory

Jag skapar kontona med "createAccount" i "AccountRegister.java". Där finns "new Account" och sedan läggs kontot till i listan. Jag har inte lagt "new Account" i "Main" eftersom "Main" ska sköta menyn och registret ska sköta kontona.

## Flöde

När man väljer 4 i menyn skriver man kontots ägare och hur mycket man vill ta ut. Programmet använder "findAccount" för att hitta rätt konto och kör sedan "withdraw". Om pengarna inte räcker stoppas uttaget och saldot är samma som innan.

## Reflektion

När jag fastnade försökte jag göra en sak i taget och köra programmet efter varje del. Jag använde AI för att få hjälp och för att få koden förklarad på ett enklare sätt. Till exempel förstod jag först inte varför "findAccount" returnerar "null". Jag testade då med ett namn som fanns och ett som inte fanns och såg hur kontrollen fungerade i "Main".